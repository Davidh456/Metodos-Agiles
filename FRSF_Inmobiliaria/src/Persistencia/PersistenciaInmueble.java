
package Persistencia;

import Clases.Inmueble;
import Conexion.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
}
