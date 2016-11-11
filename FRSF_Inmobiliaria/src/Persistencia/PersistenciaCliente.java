package Persistencia;

import Clases.Cliente;
import Conexion.Conexion;
import Conexion.NewHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class PersistenciaCliente {
    private static PersistenciaCliente instance;
    private Session session;
    
    public PersistenciaCliente(){
        super();
        session = Conexion.getInstance().getSession(); //cargar la sesión para ahorrar código
    }
    public static PersistenciaCliente getInstance(){
        if(instance == null){
            instance = new PersistenciaCliente();
        }
        return instance;
    }
    public void altaCliente(Cliente cliente) {
        if(!session.isOpen()){
           Conexion.getInstance().openSession();
        }
        Transaction tx = session.beginTransaction();
        session.save(cliente);
        tx.commit();
    }
    public boolean clienteExistente(int numDoc, int tipoDoc) {
        if(!session.isOpen()){
           Conexion.getInstance().openSession();
        }
        Criteria criteria = session.createCriteria(Cliente.class);
        criteria.add(Restrictions.eq("numeroDoc",numDoc));
        criteria.add(Restrictions.eq("tipoDoc",tipoDoc));
        criteria.setProjection(Projections.projectionList()
        .add(Projections.property("idCliente")));
        return !criteria.list().isEmpty();
    }
    public void borrarCliente(Cliente cliente){
        if(!session.isOpen()){
           Conexion.getInstance().openSession();
        }
        Transaction tx = session.beginTransaction();
        session.delete(cliente);
        tx.commit();
    }
    public void modificarCliente(Cliente cliente){
        if(!session.isOpen()){
           Conexion.getInstance().openSession();
        }
        Transaction tx = session.beginTransaction();
        session.update(cliente);
        tx.commit();
    }
    public List<Cliente> listarClientes(){
        if(!session.isOpen()){
           Conexion.getInstance().openSession();
        }
        return session.createCriteria(Cliente.class).list();
    }
    public List<Cliente> listarPropietarios(){
        if(!session.isOpen()){
           Conexion.getInstance().openSession();
        }
        return session.createCriteria(Cliente.class).add(Restrictions.eq("esPropietario", true)).list();
    }

    public List<Cliente> listarNoPropietarios() {
        if(!session.isOpen()){
           Conexion.getInstance().openSession();
        }
        return session.createCriteria(Cliente.class).add(Restrictions.eq("esPropietario", false)).list();
    }
}
