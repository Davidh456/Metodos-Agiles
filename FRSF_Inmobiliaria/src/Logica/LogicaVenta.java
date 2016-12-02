
package Logica;

import Clases.Cliente;
import Clases.Factura;
import Clases.Historiaventa;
import Clases.Inmueble;
import Clases.Reserva;
import Clases.Vendedor;
import Persistencia.PersistenciaInmueble;
import Persistencia.PersistenciaVenta;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfFormField;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LogicaVenta {

    public void GenerarVenta(Inmueble inmuebleVendido, Cliente cliente, Vendedor vendedor) throws IOException, DocumentException {
       PersistenciaVenta operador = new PersistenciaVenta();
       Factura factura = new Factura(inmuebleVendido,cliente);
       Historiaventa historial= new Historiaventa(factura, vendedor);
       GenerarDocumento(factura);
       operador.GuardarFactura(factura);
       operador.GuardarHistoria(historial);
    }
    
        private void GenerarDocumento(Factura factura) throws IOException, DocumentException {
        String dirPath = "C:\\";
        String fileName = "Base factura.pdf";
        HashMap fieldsWithValues = new HashMap();
        ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
        PdfReader reader = new PdfReader(dirPath + "\\" + fileName);
        PdfStamper stamper = new PdfStamper(reader, baosPDF);
        AcroFields form = stamper.getAcroFields();
        HashMap fields = (HashMap) form.getFields();
        Set keys = fields.keySet();
        
        //Metodo que retorna map de datos que queremos obtener de objeto para agregar a PDF    
        fieldsWithValues = crearHashMapReserva(factura, keys);
        
        //Iteracion sobre campos de pdf
        Iterator itr = keys.iterator();
            while (itr.hasNext()) {
                String fieldName = (String) itr.next();
                String fieldValue = fieldsWithValues.get(fieldName) != null ? (String)(fieldsWithValues.get(fieldName)) : "";
                form.setField(fieldName, fieldValue);
                form.setFieldProperty(fieldName, "setfflags", PdfFormField.FF_READ_ONLY, null);
                   
            }
            stamper.setFormFlattening(true);
            stamper.close();
            reader.close();
            
            //Armando nombre de archivo y Guardando cambios
            String nombre;
            
            Calendar tiempo = Calendar.getInstance();
            int mes = tiempo.get(Calendar.MONTH)+1;
            nombre = tiempo.get(Calendar.YEAR) + "_" + mes + "_" + tiempo.get(Calendar.DAY_OF_MONTH) + " ";
            nombre = nombre + tiempo.get(Calendar.HOUR_OF_DAY) + "_" + tiempo.get(Calendar.MINUTE)+ "_" + tiempo.get(Calendar.SECOND);

            String nombreydir="C:\\Documento Factura -"+ nombre +"-.pdf";
            OutputStream pdf = new FileOutputStream(nombreydir);
            baosPDF.writeTo(pdf);
            pdf.close();
    }

    private HashMap crearHashMapReserva(Factura factura, Set keys) {
        HashMap datInmCli = new HashMap();
        Inmueble inmu = factura.getInmueble();
        Cliente clie = factura.getCliente();
        DateFormat fecha = new SimpleDateFormat("dd-MM-yyyy");
        
        //DatosInmueble
        datInmCli.put("ProvinciaInm", inmu.getProvinciaNombre());
        datInmCli.put("LocalidadInm", inmu.getLocalidadNombre());
        datInmCli.put("CP", String.valueOf(inmu.getCp()));
        datInmCli.put("Calle", inmu.getCalle());
        datInmCli.put("Numero", String.valueOf(inmu.getNumero()));
        if(inmu.getBarrio().equals(""))
            datInmCli.put("Barrio", "N/A");
        else
            datInmCli.put("Barrio", inmu.getBarrio());
        if(inmu.getPiso().equals(""))
            datInmCli.put("Piso", "N/A");
        else
            datInmCli.put("Piso", inmu.getPiso());
        
        if(inmu.getDepto().equals(""))
            datInmCli.put("Departamento", "N/A");
        else
            datInmCli.put("Departamento", inmu.getDepto());
        
        
        datInmCli.put("LongFondo", String.valueOf(inmu.getFondo()));
        datInmCli.put("LongFrente", String.valueOf(inmu.getFrente()));
        datInmCli.put("SupTerreno", String.valueOf(inmu.getSupTerreno()));
        datInmCli.put("SupEdificada", String.valueOf(inmu.getSupInmueble()));
        
        
        switch (inmu.getOrientacion()) {
           case 0:
                datInmCli.put("Orientacion","Este");
                break;
           case 1: 
                datInmCli.put("Orientacion","Norte" );
                break;
           case 2:    
                datInmCli.put("Orientacion","Noreste" );
                break;
           case 3:     
                datInmCli.put("Orientacion","Noroeste" );
                break;
           case 4:     
                datInmCli.put("Orientacion","Oeste" );
                break;
           case 5:     
                datInmCli.put("Orientacion","Sur" );
                break;
           case 6:     
                datInmCli.put("Orientacion","Sureste" );
                break;
           case 7:     
                datInmCli.put("Orientacion","Suroeste" );
                break;
       }
        if(inmu.getAntiguedad()==-1)
            datInmCli.put("Antiguedad", "N/A");
        else
            datInmCli.put("Antiguedad", String.valueOf(2016-inmu.getAntiguedad()));
        
        switch (inmu.getTipoInmueble()) {
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
        
        datInmCli.put("Dormitorios", String.valueOf(inmu.getDormitorio()));
        datInmCli.put("Banios", String.valueOf(inmu.getBano()));
        
        if(inmu.getGarage())
            datInmCli.put("Garage", "Si");
        else
            datInmCli.put("Garage", "No");
        
        if(inmu.getPatio())
            datInmCli.put("Patio", "Si");
        else
            datInmCli.put("Patio", "No");
        
        if(inmu.getGn())
            datInmCli.put("GN", "Si");
        else
            datInmCli.put("GN", "No");
        
        if(inmu.getAc())
            datInmCli.put("AC", "Si");
        else
            datInmCli.put("AC", "No");
        
        if(inmu.getTelefono())
            datInmCli.put("TelefonoInm", "Si");
        else
            datInmCli.put("TelefonoInm", "No");
        
        if(inmu.getLavadero())
            datInmCli.put("Lavadero", "Si");
        else
            datInmCli.put("Lavadero", "No");
        
        if(inmu.getPavimento())
            datInmCli.put("Pavimento", "Si");
        else
            datInmCli.put("Pavimento", "No");
        
        datInmCli.put("Observaciones", inmu.getObservaciones());
        datInmCli.put("PrecioInmueble", String.valueOf(String.format("%.2f", inmu.getPrecio()).replace(',', '.')));
        
        //DatosCliente
        datInmCli.put("Nombre", clie.getNombre());
        datInmCli.put("Apellido", clie.getApellido());
        
        switch (clie.getTipoDoc()) {
           case 0:
                datInmCli.put("TipoDoc","DNI");
                break;
           case 1: 
                datInmCli.put("TipoDoc","Pasaporte" );
                break;
           case 2:    
                datInmCli.put("TipoDoc","LC" );
                break;
           case 3:     
                datInmCli.put("TipoDoc","LE" );
                break;
       }
        
        datInmCli.put("NroDoc", String.valueOf(clie.getNumeroDoc()));
        datInmCli.put("Domicilio", clie.getDomicilio());
        datInmCli.put("NroDomicilio", String.valueOf(clie.getAlturaDomicilio()));
        datInmCli.put("Provincia", clie.getProvincia().getProvincia());
        datInmCli.put("Localidad", clie.getLocalidad().getLocalidad());
        datInmCli.put("Telefono", String.valueOf(clie.getTelefono()));
        datInmCli.put("Email", String.valueOf(clie.getCorreo()));
        return datInmCli;
    }

    public void cambiarEstadoInmuebleVendido(Inmueble inmuebleVendido) {
        PersistenciaInmueble operador = new PersistenciaInmueble();
        inmuebleVendido.setEstado("Vendido");
        operador.ModificarInmueble(inmuebleVendido);
    }

    public List<Factura>  TieneFacturas(Cliente cliente) {
        return (new PersistenciaVenta()).TieneFacturas(cliente);
    }

    public List<Historiaventa>  TieneVenta(Vendedor vendedor) {
        PersistenciaVenta operador = new PersistenciaVenta();
        return operador.TieneHistVenta(vendedor);
    }
    
}
