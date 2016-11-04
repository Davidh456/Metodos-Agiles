
package Persistencia;

import Clases.Cliente;
import Clases.Inmueble;
import Clases.Propietario;
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
    
    public boolean getRepetido(String ProvinciaNombre, String LocalidadNombre, String Calle, int numero, String piso, String Depto) {
        boolean resultado;
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
        resultado=!criteria.list().isEmpty();
       session.close();
        return resultado;
    }
  
    public List<Inmueble> ListarInmuebles(String apellido, String barrioNombre, int cantDormitorios, String correo, String localidadNombre, String nombre, int nroDoc, float precioDesde, float precioHasta, int tipoDoc, int tipoInmueble, int provinciaIndice) {
        
        List<Inmueble> prueba;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Criteria criteria = session.createCriteria(Inmueble.class, "inmueble");
        /*
        criteria.add(Restrictions.eq("barrio",barrioNombre));
        criteria.add(Restrictions.eq("dormitorio",cantDormitorios));
        criteria.add(Restrictions.eq("localidadNombre",localidadNombre));   //andaba
        //criteria.add(Restrictions.eq("precioDesde",precioDesde));
        //criteria.add(Restrictions.eq("precioHasta",precioHasta));
        criteria.add(Restrictions.eq("tipoInmueble",tipoInmueble));
        criteria.add(Restrictions.eq("provinciaIndice",provinciaIndice));
        
        criteria.createAlias("inmueble.propietario", "propietario");    //andaba
        criteria.add(Restrictions.eq("propietario.nombre",nombre));  //andaba
        criteria.add(Restrictions.eq("propietario.numeroDoc",nroDoc));
        criteria.add(Restrictions.eq("propietario.tipoDoc",tipoDoc));
        criteria.add(Restrictions.eqProperty("propietario.correo",correo));
        criteria.add(Restrictions.eqProperty("propietario.apellido",apellido));
        
         */
        prueba =criteria.list();
        session.close();
        return prueba;
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

}
