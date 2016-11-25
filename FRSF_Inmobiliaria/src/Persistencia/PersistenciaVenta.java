/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Clases.Factura;
import Clases.Historiaventa;
import Conexion.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
    
}
