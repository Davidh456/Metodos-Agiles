package Persistencia;

import Clases.Cliente;
import Conexion.NewHibernateUtil;
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
    
}
