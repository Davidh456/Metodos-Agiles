
package Persistencia;

import Clases.Propietario;
import Conexion.NewHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class PersistenciaPropietario {
    public void altaPropietario(Propietario propietario){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(propietario);
        tx.commit();
        session.close();
    }
    public boolean propietarioExistente(int numDoc, int tipoDoc) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Criteria criteria = session.createCriteria(Propietario.class);
        criteria.add(Restrictions.eq("numeroDoc",numDoc));
        criteria.add(Restrictions.eq("tipoDoc",tipoDoc));
        criteria.setProjection(Projections.projectionList()
        .add(Projections.property("idPropietario")));
        return !criteria.list().isEmpty();
    }
    public void borrarPropietario(Propietario propietario){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(propietario);
        tx.commit();
        session.close();
    }
    public void modificarPropietario(Propietario propietario){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.update(propietario);
        tx.commit();
        session.close();
    }
    public List<Propietario> listarPropietarios(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Criteria criteria = session.createCriteria(Propietario.class);
        return criteria.list();
    }
}
