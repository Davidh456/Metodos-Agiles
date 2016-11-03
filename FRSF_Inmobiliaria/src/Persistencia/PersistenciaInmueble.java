
package Persistencia;

import Clases.Cliente;
import Clases.Inmueble;
import Conexion.NewHibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class PersistenciaInmueble {

    public PersistenciaInmueble() {
    }
    
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
        return !criteria.list().isEmpty();
    }
}
