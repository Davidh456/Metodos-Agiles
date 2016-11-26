/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Cliente;
import Clases.Inmueble;
import Clases.Reserva;
import static Conexion.EnvioEmail.EnvioEmail;
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
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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

    public void GenerarReserva(Inmueble inmuebleReservado, Cliente clienteReserva, double montoReserva, Date tiempoValidez) throws IOException, DocumentException {
       Reserva nuevaReserva= new Reserva(clienteReserva,inmuebleReservado,tiempoValidez,montoReserva);
       GenerarDocumento(nuevaReserva);
       BDInmueble.guardarReserva(nuevaReserva);
    }

    private void GenerarDocumento(Reserva nuevaReserva) throws IOException, DocumentException {
        String dirPath = "C:\\";
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
                    
                //System.out.println(fieldName + " " + fieldValue);
            }
            stamper.setFormFlattening(true);
            stamper.close();
            reader.close();
            
            //Guardando cambios
            String nombre;
            DateFormat fecha = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
            nombre = fecha.format(nuevaReserva.getFechaHasta());
            String nombreydir="C:\\Documento Reserva -"+ nombre +"-.pdf";
            OutputStream pdf = new FileOutputStream(nombreydir);
            baosPDF.writeTo(pdf);
            pdf.close();
            //EnvioEmail(nombreydir, nuevaReserva.getCliente().getCorreo());
    }

    private HashMap crearHashMapReserva(Reserva reserva, Set keys) {
        HashMap datInmCli = new HashMap();
        Inmueble inmu = reserva.getInmueble();
        Cliente clie = reserva.getCliente();
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
        
        //DatosReserva
        datInmCli.put("MontoReserva", String.valueOf(String.format("%.2f", reserva.getImporte()).replace(',', '.')));
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
    
    public Reserva ObtenerReserva(Inmueble inmSeleccionado) {
        Date fechaHoy= new Date();
        List<Reserva> reservas;
        reservas=BDInmueble.existenReservas(inmSeleccionado);
        for(Reserva res: reservas){
            if(res.getFechaHasta().after(fechaHoy)){
                return res;
            }
        }
        return null;
    }
    
    public boolean reservasViejas(Inmueble in) {
        List<Reserva> reservas;
        reservas=BDInmueble.existenReservas(in);
        
        if(reservas.isEmpty()) return false; else return true; 
    }

    public void DescartarReservasViejas() {
        PersistenciaInmueble operador = new PersistenciaInmueble();
        List<Reserva> reservas;
        List<Reserva> reservasAEliminar = new ArrayList<>();
        reservas=BDInmueble.todasLasReservas();
        
        java.util.Date tempDate = new java.util.Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(tempDate);
        cal.set(Calendar.MILLISECOND, 0);
        Timestamp hoy = new java.sql.Timestamp(cal.getTimeInMillis());
        
        for (Iterator<Reserva> iter = reservas.listIterator(); iter.hasNext(); ) {
            Reserva item=iter.next();
            if (!item.getFechaHasta().after(hoy)){
                System.out.println("la fecha limite es:"+item.getFechaHasta()+" y la actual es:"+hoy);
                reservasAEliminar.add(item);}
        }           
        operador.eliminarReservas(reservasAEliminar);
        
        
    }     
}
    
