/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Clases.Vendedor;
import Conexion.Conexion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author lucas
 */
public class PersistenciaVendedor {
    private static PersistenciaVendedor instancia;
    private Session sesion;
    
    private PersistenciaVendedor(){
        super();
        sesion = Conexion.getInstance().getSession(); //cargar la sesión para ahorrar código
    }
    
    public static PersistenciaVendedor getInstance(){
        if(instancia == null) instancia = new PersistenciaVendedor();
        return instancia;
    }

    public List<Vendedor> listarVendedores() {
        if(!sesion.isOpen()){
                   Conexion.getInstance().openSession();
        }
        return sesion.createCriteria(Vendedor.class).list();
    }

    public boolean existeVendedor(int numDoc, int tipoDoc) {
        List<Vendedor> resultado;
        
        if(!sesion.isOpen()){
                   Conexion.getInstance().openSession();
        }
        Criteria criteria = sesion.createCriteria(Vendedor.class, "vendedor");
        criteria.add(Restrictions.eq("tipoDoc", tipoDoc));
        criteria.add(Restrictions.eq("numDoc", numDoc));
        
        resultado =criteria.list();
        
        return !resultado.isEmpty();
    }

    public void altaVendedor(Vendedor vendedor) {
        if(!sesion.isOpen()){
           Conexion.getInstance().openSession();
        }
        Transaction tx = sesion.beginTransaction();
        sesion.save(vendedor);
        tx.commit();
    }

    public boolean existeMismoDNI(Integer numDoc, Integer tipoDoc, Integer idVendedor) {
        List<Vendedor> resultado;
        
        if(!sesion.isOpen()){
                   Conexion.getInstance().openSession();
        }
        Criteria criteria = sesion.createCriteria(Vendedor.class, "vendedor");
        criteria.add(Restrictions.eq("tipoDoc", tipoDoc));
        criteria.add(Restrictions.eq("numDoc", numDoc));
        criteria.add(Restrictions.ne("idVendedor", idVendedor));
        
        resultado =criteria.list();
        
        return !resultado.isEmpty();
    }

    public void modificarVendedor(Vendedor vend) {
            if(!sesion.isOpen()) Conexion.getInstance().openSession();
            
            Transaction tx = sesion.beginTransaction();
            sesion.update(vend);
            tx.commit();
    }

    public void bajaVendedor(Vendedor vend) {
        if(!sesion.isOpen()) Conexion.getInstance().openSession();
        
        Transaction tx = sesion.beginTransaction();
        sesion.delete(vend);
        tx.commit();
    }
    
    public boolean login(String vendedor, String contrasenia){
        if(!sesion.isOpen()) Conexion.getInstance().openSession();
        Criteria criteria = sesion.createCriteria(Vendedor.class, "vendedor");
        criteria.add(Restrictions.eq("email", vendedor));
        criteria.add(Restrictions.eq("contrasenia", contrasenia));
        return !criteria.list().isEmpty();
    }
    public Vendedor getVendedorLogeado(String vendedor, String contrasenia){
        if(!sesion.isOpen()) Conexion.getInstance().openSession();
        Criteria criteria = sesion.createCriteria(Vendedor.class, "vendedor");
        criteria.add(Restrictions.eq("email", vendedor));
        criteria.add(Restrictions.eq("contrasenia", contrasenia));
        return (Vendedor) criteria.list().get(0);
    }
    
}
