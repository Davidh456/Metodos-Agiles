package Persistencia;

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

public class PersistenciaPropietario {
    private static PersistenciaPropietario instance;
    private Session session;
    
    public PersistenciaPropietario(){
        super();
        session = Conexion.getInstance().getSession();
    }
    public static PersistenciaPropietario getInstance(){
        if(instance == null){
            instance = new PersistenciaPropietario();
        }
        return instance;
    }
    public void altaPropietario(Propietario propietario){
        Transaction tx = session.beginTransaction();
        session.save(propietario);
        tx.commit();
    }
    public boolean propietarioExistente(int numDoc, int tipoDoc) {
        Criteria criteria = session.createCriteria(Propietario.class);
        criteria.add(Restrictions.eq("numeroDoc",numDoc));
        criteria.add(Restrictions.eq("tipoDoc",tipoDoc));
        criteria.setProjection(Projections.projectionList()
        .add(Projections.property("idPropietario")));
        return !criteria.list().isEmpty();
    }
    public void borrarPropietario(Propietario propietario){
        Transaction tx = session.beginTransaction();
        session.delete(propietario);
        tx.commit();
    }
    public void modificarPropietario(Propietario propietario){
        Transaction tx = session.beginTransaction();
        session.update(propietario);
        tx.commit();
    }
    public List<Propietario> listarPropietarios(){
        return session.createCriteria(Propietario.class).list();
    }
}
