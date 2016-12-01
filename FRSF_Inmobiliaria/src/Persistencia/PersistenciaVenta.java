/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Clases.Cliente;
import Clases.Factura;
import Clases.Historiaventa;
import Clases.Reserva;
import Clases.Vendedor;
import Conexion.NewHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author maria
 */
public class PersistenciaVenta {

    public void GuardarFactura(Factura factura) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session=sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(factura);
        tx.commit();
        session.close();
    }

    public void GuardarHistoria(Historiaventa historial) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session=sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(historial);
        tx.commit();
        session.close();
    }

    public List<Factura> TieneFacturas(Cliente cliente) {
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Criteria criteria = session.createCriteria(Factura.class, "factura");
        criteria.createAlias("factura.cliente", "cliente");
        criteria.add(Restrictions.eq("cliente.idCliente",cliente.getIdCliente()));
        return criteria.list();
    }

    public List<Historiaventa> TieneHistVenta(Vendedor vendedor) {
        List<Historiaventa> resultado;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        
        Criteria criteria = session.createCriteria(Historiaventa.class, "historiaventa");
        criteria.createAlias("historiaventa.vendedor", "vendedor");
        criteria.add(Restrictions.eq("vendedor",vendedor));
        resultado =criteria.list();
        session.close();
        return resultado;
    }
    
}
