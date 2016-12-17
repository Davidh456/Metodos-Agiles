
package Persistencia;

import Clases.Cliente;
import Clases.Foto;
import Clases.Inmueble;
import Clases.Reserva;
import Conexion.Conexion;
import Conexion.NewHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class PersistenciaInmueble {
    
    public boolean AltaInmueble(Inmueble casa){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session=sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(casa);
        tx.commit();
        session.close();
        return true;
    }
    
    public int getRepetido(String ProvinciaNombre, String LocalidadNombre, String Calle, int numero, String piso, String Depto) {
        int resultado;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Criteria criteria = session.createCriteria(Inmueble.class);
        criteria.add(Restrictions.eq("provinciaNombre",ProvinciaNombre));
        criteria.add(Restrictions.eq("localidadNombre",LocalidadNombre));
        criteria.add(Restrictions.eq("calle",Calle));
        criteria.add(Restrictions.eq("numero",numero));
        criteria.add(Restrictions.eq("piso",piso));
        criteria.add(Restrictions.eq("depto",Depto));
        criteria.setProjection(Projections.projectionList().add(Projections.property("id")));
        if (!criteria.list().isEmpty()){
            resultado=(int) criteria.list().get(0);
            return resultado;
        }
        else{
            session.close();
            return -1;
        }
    }
    
    public List<Inmueble> ListarInmuebles( ){
        List<Inmueble> resultado;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        //criterios para el inmueble
        Criteria criteria = session.createCriteria(Inmueble.class, "inmueble");
        resultado =criteria.list();
        session.close();
        return resultado;
    }
    
    public List<Inmueble>   existeInmueble(Inmueble in)
    {
        List<Inmueble> resultado;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        //criterios para el inmueble
        Criteria criteria = session.createCriteria(Inmueble.class, "inmueble");
        criteria.add(Restrictions.eq("id", in.getId()));
        criteria.add(Restrictions.eq("supInmueble", in.getSupInmueble()));
        criteria.add(Restrictions.eq("supTerreno", in.getSupTerreno()));
        criteria.add(Restrictions.eq("ac", in.getAc()));
        criteria.add(Restrictions.eq("antiguedad", in.getAntiguedad()));
        criteria.add(Restrictions.eq("bano", in.getBano()));
        criteria.add(Restrictions.eq("barrio", in.getBarrio()));
        criteria.add(Restrictions.eq("cp", in.getCp()));
        criteria.add(Restrictions.eq("calle", in.getCalle()));
        criteria.add(Restrictions.eq("depto", in.getDepto()));
        criteria.add(Restrictions.eq("dormitorio", in.getDormitorio()));
        criteria.add(Restrictions.eq("fondo", in.getFondo()));
        criteria.add(Restrictions.eq("frente", in.getFrente()));
        criteria.add(Restrictions.eq("garage", in.getGarage()));
        criteria.add(Restrictions.eq("gn", in.getGn()));
        criteria.add(Restrictions.eq("lavadero", in.getLavadero()));
        criteria.add(Restrictions.eq("localidadIndice", in.getLocalidadIndice()));
        criteria.add(Restrictions.eq("localidadNombre", in.getLocalidadNombre()));
        criteria.add(Restrictions.eq("numero", in.getNumero()));
        criteria.add(Restrictions.eq("observaciones", in.getObservaciones()));
        criteria.add(Restrictions.eq("orientacion", in.getOrientacion()));
        criteria.add(Restrictions.eq("patio", in.getPatio()));
        criteria.add(Restrictions.eq("pavimento", in.getPavimento()));
        criteria.add(Restrictions.eq("piso", in.getPiso()));
        criteria.add(Restrictions.eq("precio", in.getPrecio()));
        criteria.add(Restrictions.eq("provinciaNombre", in.getProvinciaNombre()));
        criteria.add(Restrictions.eq("provinciaIndice", in.getProvinciaIndice()));
        criteria.add(Restrictions.eq("telefono", in.getTelefono()));
        criteria.add(Restrictions.eq("tipoInmueble", in.getTipoInmueble()));
        criteria.add(Restrictions.eq("cliente", in.getCliente()));
    
        session.update(in);
        resultado =criteria.list();
        
        session.close();
        return resultado;    
    }
    
    public List<Inmueble> ListarInmuebles(String apellido, String barrioNombre, int cantDormitorios, String correo, String localidadNombre, String nombre, int nroDoc, double precioDesde, double precioHasta, int tipoDoc, int tipoInmueble, int provinciaIndice){
        List<Inmueble> resultado;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        //criterios para el inmueble
        Criteria criteria = session.createCriteria(Inmueble.class, "inmueble");
        criteria.add(Restrictions.eq("provinciaIndice",provinciaIndice));
        criteria.add(Restrictions.eq("localidadNombre",localidadNombre)); 
        if(!barrioNombre.equals("")){
             criteria.add(Restrictions.eq("barrio",barrioNombre));
        }
        criteria.add(Restrictions.between("precio", precioDesde, precioHasta));
        
        if(tipoInmueble!=0){
           criteria.add(Restrictions.eq("tipoInmueble",tipoInmueble-1)); 
        }
        if(!(tipoInmueble==3 || tipoInmueble==6)){
            if(cantDormitorios!=0){
               criteria.add(Restrictions.eq("dormitorio",cantDormitorios)); 
            }
        }
        
        // criterios para el propietario
        criteria.createAlias("inmueble.cliente", "idpropietario"); 
        if(!correo.equals("")){
          criteria.add(Restrictions.eq("idpropietario.correo",correo));  
        }
        if(!apellido.equals("")){
            criteria.add(Restrictions.eq("idpropietario.apellido",apellido));
        }
        if(!nombre.equals("")){
            criteria.add(Restrictions.eq("idpropietario.nombre",nombre)); 
        }
        if(nroDoc!=-1){
          criteria.add(Restrictions.eq("idpropietario.numeroDoc",nroDoc));  
        }
        if(tipoDoc!=0){
            criteria.add(Restrictions.eq("idpropietario.tipoDoc",tipoDoc-1));  
        }
        
        resultado =criteria.list();
        session.close();
        return resultado;
    }

    public boolean ModificarInmueble(Inmueble inmuebleModificado) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session=sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.update(inmuebleModificado);
        tx.commit();
        session.close();
        return true;
    }

    public boolean EliminarInmueble(Inmueble eliminarInmueble) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session=sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(eliminarInmueble);
        tx.commit();
        session.close();
        return true;
    }

    public void AltaFoto(Foto imagen) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session=sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(imagen);
        tx.commit();
        session.close();
         }
    
    public void guardarReserva(Reserva nuevaReserva){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session=sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(nuevaReserva);
        tx.commit();
        session.close();
    }

    public List<Reserva> existenReservas(Inmueble inmSeleccionado) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Criteria criteria = session.createCriteria(Reserva.class, "reserva");
        criteria.createAlias("reserva.inmueble", "inmueble");
        criteria.add(Restrictions.eq("inmueble.id",inmSeleccionado.getId()));
        return criteria.list();
    }
    
    public List<Reserva> todasLasReservas() {
        List<Reserva> resultado;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Criteria criteria = session.createCriteria(Reserva.class, "reserva");
        resultado =criteria.list();
        session.close();
        return resultado;
    }
    
    public boolean eliminarReservas(List<Reserva> reservasAEliminar) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        for(Reserva res: reservasAEliminar)
            session.delete(res);
        tx.commit();
        session.close();
        return true;
    }
    
    public boolean eliminarReservaPorID(int id) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Criteria criteria = session.createCriteria(Reserva.class, "reserva");
        criteria.createAlias("reserva.inmueble", "inmueble");
        criteria.add(Restrictions.eq("inmueble.id", id));
        session.delete(criteria.list().get(0));
        tx.commit();
        session.close();
        return true;
    }
    
    public List<Foto> existeFotoInmueble(Inmueble in, Foto imagen)
    {
        List<Foto> fotoInmueble;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        //criterios para las fotos
        Criteria criteria = session.createCriteria(Foto.class, "Foto");
        criteria.add(Restrictions.eq("inmueble", imagen.getInmueble()));
        criteria.add(Restrictions.eq("nombreFoto", imagen.getNombreFoto()));
        criteria.add(Restrictions.eq("direccion", imagen.getDireccion()));
        criteria.add(Restrictions.eq("imagen", imagen.getImagen()));  
        

        session.update(imagen);
        fotoInmueble =criteria.list();
        
        session.close();
        return fotoInmueble;    
    }
    

    public List<Foto> ListarFotos( ){
        List<Foto> resultado;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        //criterios para el inmueble
        Criteria criteria = session.createCriteria(Foto.class, "inmueble");
        resultado =criteria.list();
        session.close();
        return resultado;
    }

    public List<Inmueble> TieneInmueble(Cliente cliente) {
        List<Inmueble> resultado;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        
        Criteria criteria = session.createCriteria(Inmueble.class, "inmueble");
        criteria.createAlias("inmueble.cliente", "cliente"); 
        criteria.add(Restrictions.eq("cliente.idCliente",cliente.getIdCliente()));
        resultado =criteria.list();
        session.close();
        return resultado; 
    }

    public List<Reserva> TieneReserva(Cliente cliente) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Criteria criteria = session.createCriteria(Reserva.class, "reserva");
        criteria.createAlias("reserva.cliente", "cliente");
        criteria.add(Restrictions.eq("cliente.idCliente",cliente.getIdCliente()));
        return criteria.list();
    }

    public List<Foto> fotosInmueble(Inmueble inm) {
        List<Foto> fotosInmueble;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Criteria criteria = session.createCriteria(Foto.class, "Foto");
        criteria.add(Restrictions.eq("inmueble", inm)); 
        fotosInmueble =criteria.list();
        
        session.close();
        return fotosInmueble;    
    }

    public void eliminarFotoInmueble(Foto f) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session=sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(f);
        tx.commit();
        session.close();
    }

}
