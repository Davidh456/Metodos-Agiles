/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Cliente;
import Clases.Inmueble;
import Clases.Reserva;
import Persistencia.PersistenciaInmueble;
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
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



/**
 *
 * @author maria
 */
public class LogicaReserva {
    PersistenciaInmueble BDInmueble = new PersistenciaInmueble();

    public void GenerarReserva(Inmueble inmuebleReservado, Cliente clienteReserva, Float montoReserva, Date tiempoValidez) throws IOException, DocumentException {
       Reserva nuevaReserva= new Reserva(clienteReserva,inmuebleReservado,tiempoValidez,montoReserva);
       GenerarDocumento(nuevaReserva);
       BDInmueble.guardarReserva(nuevaReserva);
    }

    private void GenerarDocumento(Reserva nuevaReserva) throws IOException, DocumentException {
        String dirPath = "C:\\Users\\maria\\Desktop";
        String fileName = "Base reserva.pdf";
        HashMap fieldsWithValues = new HashMap();
        ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
        PdfReader reader = new PdfReader(dirPath + "\\" + fileName);
        PdfStamper stamper = new PdfStamper(reader, baosPDF);
        AcroFields form = stamper.getAcroFields();
        HashMap fields = (HashMap) form.getFields();
        Set keys = fields.keySet();
        
        //Metodo que retorna map de datos que queremos obtener de objeto para agregar a PDF    
        fieldsWithValues = crearHashMapReserva(nuevaReserva, keys);
        
        //Iteracion sobre campos de pdf
        Iterator itr = keys.iterator();
            while (itr.hasNext()) {
                String fieldName = (String) itr.next();
                String fieldValue = fieldsWithValues.get(fieldName) != null ? (String)(fieldsWithValues.get(fieldName)) : "";
                form.setField(fieldName, fieldValue);
                form.setFieldProperty(fieldName, "setfflags", PdfFormField.FF_READ_ONLY, null);
                    
                System.out.println(fieldName + " " + fieldValue);
            }
            stamper.setFormFlattening(true);
            stamper.close();
            reader.close();
            
            //Guardando cambios
            OutputStream pdf = new FileOutputStream("C:\\Users\\maria\\Desktop\\Documento Reserva.pdf");
            baosPDF.writeTo(pdf);
            pdf.close();
            
    }

    private HashMap crearHashMapReserva(Reserva reserva, Set keys) {
        HashMap datInmCli = new HashMap();
        Inmueble inmu = reserva.getInmueble();
        Cliente clie = reserva.getCliente();
        DateFormat fecha = new SimpleDateFormat("dd-MM-yyyy");
        
        //DatosInmueble
        datInmCli.put("ProvinciaInm", String.valueOf(inmu.getProvinciaNombre()));
        datInmCli.put("LocalidadInm", String.valueOf(inmu.getLocalidadNombre()));
        datInmCli.put("CP", String.valueOf(inmu.getCp()));
        datInmCli.put("Calle", String.valueOf(inmu.getCalle()));
        datInmCli.put("Numero", String.valueOf(inmu.getNumero()));
        datInmCli.put("Barrio", String.valueOf(inmu.getBarrio()));
        datInmCli.put("Piso", String.valueOf(inmu.getPiso()));
        datInmCli.put("Departamento", String.valueOf(inmu.getDepto()));
        datInmCli.put("LongFondo", String.valueOf(inmu.getFondo()));
        datInmCli.put("LongFrente", String.valueOf(inmu.getFrente()));
        datInmCli.put("SupTerreno", String.valueOf(inmu.getSupTerreno()));
        datInmCli.put("SupEdificada", String.valueOf(inmu.getSupInmueble()));
        datInmCli.put("Orientacion", String.valueOf(inmu.getOrientacion()));
        datInmCli.put("Antiguedad", String.valueOf(inmu.getAntiguedad()));
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
            datInmCli.put("Telefono", "Si");
        else
            datInmCli.put("Telefono", "No");
        
        if(inmu.getLavadero())
            datInmCli.put("Lavadero", "Si");
        else
            datInmCli.put("Lavadero", "No");
        
        if(inmu.getPavimento())
            datInmCli.put("Pavimento", "Si");
        else
            datInmCli.put("Pavimento", "No");
        
        datInmCli.put("Observaciones", String.valueOf(inmu.getObservaciones()));
        datInmCli.put("PracioInmueble", String.valueOf(inmu.getPrecio()));
        
        //DatosCliente
        datInmCli.put("Nombre", clie.getNombre());
        datInmCli.put("Apellido", clie.getApellido());
        datInmCli.put("TipoDoc", String.valueOf(clie.getTipoDoc()));
        datInmCli.put("NroDoc", String.valueOf(clie.getNumeroDoc()));
        datInmCli.put("Domicilio", String.valueOf(clie.getDomicilio()));
        datInmCli.put("NroDomicilio", String.valueOf(clie.getAlturaDomicilio()));
        datInmCli.put("Provincia", String.valueOf(clie.getProvincia().getProvincia()));
        datInmCli.put("Localidad", String.valueOf(clie.getLocalidad().getLocalidad()));
        datInmCli.put("Telefono", String.valueOf(clie.getTelefono()));
        datInmCli.put("Email", String.valueOf(clie.getCorreo()));
        
        //DatosReserva
        datInmCli.put("MontoReserva", String.valueOf(reserva.getImporte()));
        datInmCli.put("FechaReserva", fecha.format(reserva.getFechaHasta()));
        return datInmCli;
    }

    public boolean ExisteReserva(Inmueble inmSeleccionado) {
        Date fechaHoy= new Date();
        List<Reserva> reservas;
        reservas=BDInmueble.existenReservas(inmSeleccionado);
        for(Reserva res: reservas){
            if(res.getFechaHasta().after(fechaHoy)){
                return true;
            }
        }
        return false;
    }
}