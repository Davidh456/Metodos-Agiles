package Persistencia;

import Clases.Cliente;
import Conexion.NewHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class PersistenciaCliente {

    public void altaCliente(Cliente cliente) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cliente);
        tx.commit();
        session.close();
    }

    public boolean clienteExistente(int numDoc, int tipoDoc) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Criteria criteria = session.createCriteria(Cliente.class);
        criteria.add(Restrictions.eq("numeroDoc",numDoc));
        criteria.add(Restrictions.eq("tipoDoc",tipoDoc));
        criteria.setProjection(Projections.projectionList()
        .add(Projections.property("idCliente")));
        return !criteria.list().isEmpty();
    }
    public void borrarCliente(Cliente cliente){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(cliente);
        tx.commit();
        session.close();
    }
    public void modificarCliente(Cliente cliente){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.update(cliente);
        tx.commit();
        session.close();
    }
    public List<Cliente> listarClientes(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Criteria criteria = session.createCriteria(Cliente.class);
        return criteria.list();
    }
}
