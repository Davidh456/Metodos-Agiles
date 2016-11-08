
package Persistencia;

import Clases.Cliente;
import Clases.Foto;
import Clases.Inmueble;
import Clases.Propietario;
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
 /* //TODO problemas con mantener la sesion abierta, no perite eliminar
    public PersistenciaInmueble(){
        super();
        session = Conexion.getInstance().getSession(); //cargar la sesión para ahorrar código
    }
  */
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
  
    public List<Inmueble> ListarInmuebles(String apellido, String barrioNombre, int cantDormitorios, String correo, String localidadNombre, String nombre, int nroDoc, float precioDesde, float precioHasta, int tipoDoc, int tipoInmueble, int provinciaIndice) {
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
        criteria.createAlias("inmueble.propietario", "propietario"); 
        if(!nombre.equals("")){
            criteria.add(Restrictions.eq("propietario.nombre",nombre)); 
        }
        if(nroDoc!=-1){
          criteria.add(Restrictions.eq("propietario.numeroDoc",nroDoc));  
        }
        if(tipoDoc!=0){
            criteria.add(Restrictions.eq("propietario.tipoDoc",tipoDoc-1));  
        }
        if(!correo.equals("")){
          criteria.add(Restrictions.eqProperty("propietario.correo",correo));  
        }
        if(!apellido.equals("")){
            criteria.add(Restrictions.eqProperty("propietario.apellido",apellido));
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
         System.out.println(inmuebleModificado.getId());
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

}
