package Logica;

import Clases.Cliente;
import Clases.Foto;
import Clases.Inmueble;
import Clases.Reserva;
import Persistencia.PersistenciaInmueble;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfFormField;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfSmartCopy;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PushbuttonField;
import java.awt.Desktop;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

public class Catalogo {

    public void armarCatalogo(List<Inmueble> inmueblesSeleccionados) 
            throws IOException, DocumentException {
        int i=0;
        PdfReader reader;
        Document document = new Document();
        
        Date fechaHoy = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaHoy);
        DateFormat fecha = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        String nombreydir="Documentos\\Catalogo -"+ String.valueOf(fecha.format(calendar.getTime())) +"-.pdf";

        PdfCopy copy = new PdfSmartCopy(document, new FileOutputStream(nombreydir));
        document.open();
        for(Inmueble inm: inmueblesSeleccionados){
            i++;
            reader = new PdfReader(armarPagina(inm, i).toByteArray());
            copy.addDocument(reader);
            reader.close();
        }
        document.close();
        JOptionPane.showMessageDialog(null, "Catálogo generado y guardado "
                + "correctamente con el nombre: Catalogo -"
                + String.valueOf(fecha.format(calendar.getTime())) 
                +"-.pdf","Éxito",JOptionPane.INFORMATION_MESSAGE);  

        try {
        File archivo = new File(nombreydir);
        Desktop.getDesktop().open(archivo);
        } catch (IOException ex) {
        }
    }
    
    private ByteArrayOutputStream armarPagina(Inmueble inmueble,int c) throws IOException, DocumentException {
        //String dirPath = "C:\\";
        String fileName = "Base catalogo.pdf";
        HashMap fieldsWithValues = new HashMap();
        ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
        PdfReader reader = new PdfReader(fileName);
        PdfStamper stamper = new PdfStamper(reader, baosPDF);
        AcroFields form = stamper.getAcroFields();
        HashMap fields = (HashMap) form.getFields();
        Set keys = fields.keySet();
        
        //Metodo que retorna map de datos que queremos obtener de objeto para agregar a PDF    
        fieldsWithValues = crearHashMapReserva(inmueble, keys, c);
        
        //Iteracion sobre campos de pdf
        Iterator itr = keys.iterator();
            while (itr.hasNext()) {
                String fieldName = (String) itr.next();
                String fieldValue = fieldsWithValues.get(fieldName) != null ? (String)(fieldsWithValues.get(fieldName)) : "";
                form.setField(fieldName, fieldValue);
                form.setFieldProperty(fieldName, "setfflags", PdfFormField.FF_READ_ONLY, null);
                    
            }
            
            //Carga primera imagen de inmueble (obteniendo byte array del campo Blob de la tabla fotos base de datos))       
            
            Foto foto = (new ABMInmueble()).obtenerPrimeraFoto(inmueble);
            Image img;
            if (foto==null)
                img = Image.getInstance("noImagen.jpg");  //foto por defecto en caso de que no haya ninguna para el inmueble
            else
                img = Image.getInstance(foto.getImagen());

            PushbuttonField espacio = form.getNewPushbuttonFromField("foto");
            espacio.setLayout(PushbuttonField.LAYOUT_ICON_ONLY);
            espacio.setProportionalIcon(true);
            espacio.setImage(img);
            form.replacePushbuttonField("foto", espacio.getField());
            //
            
            stamper.setFormFlattening(true);
            stamper.close();
            reader.close();
            
            return baosPDF;
    }

    private HashMap crearHashMapReserva(Inmueble inmueble, Set keys, int c) {
        HashMap datInmCli = new HashMap();
        
        //DatosInmueble
        datInmCli.put("ProvinciaInm", inmueble.getProvinciaNombre());
        datInmCli.put("LocalidadInm", inmueble.getLocalidadNombre());
        datInmCli.put("Calle", inmueble.getCalle());
        datInmCli.put("Numero", String.valueOf(inmueble.getNumero()));
        if(inmueble.getBarrio().equals(""))
            datInmCli.put("Barrio", "N/A");
        else
            datInmCli.put("Barrio", inmueble.getBarrio());
        
        datInmCli.put("SupTerreno", String.valueOf(inmueble.getSupTerreno()));
        datInmCli.put("SupEdificada", String.valueOf(inmueble.getSupInmueble()));
               
        switch (inmueble.getTipoInmueble()) {
           case 0:
                datInmCli.put("TipoInm", "Casa");
                break;
           case 1: 
                datInmCli.put("TipoInm", "Departamento");
                break;
           case 2:    
                datInmCli.put("TipoInm", "Galpon");
                break;
           case 3:     
                datInmCli.put("TipoInm", "Local-Oficina");
                break;
           case 4:     
                datInmCli.put("TipoInm", "Quinta");
                break;
           case 5:     
                datInmCli.put("TipoInm", "Terreno");
                break;
       }
        
        datInmCli.put("Dormitorios", String.valueOf(inmueble.getDormitorio()));
        datInmCli.put("Banios", String.valueOf(inmueble.getBano()));
        
        if(inmueble.getGarage())
            datInmCli.put("Garage", "Si");
        else
            datInmCli.put("Garage", "No");
        
        if(inmueble.getPatio())
            datInmCli.put("Patio", "Si");
        else
            datInmCli.put("Patio", "No");
        
        datInmCli.put("PrecioInmueble", String.valueOf(String.format("%.2f", inmueble.getPrecio()).replace(',', '.')));
        datInmCli.put("NumInm", String.valueOf(c));
        datInmCli.put("CodigoInm", inmueble.getIdDescritivo());
        datInmCli.put("Pagina", String.valueOf(c));
        
        
        Date fechaHoy = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaHoy);
        DateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        datInmCli.put("FechaEm",String.valueOf(fecha.format(calendar.getTime())));
        
        return datInmCli;
    }
}
