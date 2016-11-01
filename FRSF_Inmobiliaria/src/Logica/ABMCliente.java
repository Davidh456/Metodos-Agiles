
package Logica;

import Clases.*;
import Conexion.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ABMCliente {

    public static boolean usuarioExistente(String text, int selectedIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void altaCliente(String nombre,String apellido,int tipoDoc, int numeroDoc,Provincia provincia, Localidad localidad, String domicilio, int alturaDomicilio, int telefono, String correo){
        /*Cliente cliente = new Cliente(0, nombre, apellido, tipoDoc, numeroDoc, domicilio, alturaDomicilio, telefono, correo);
        cliente.setIdProvincia(provincia);
        cliente.setIdLocalidad(localidad);
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cliente);
        tx.commit();
        session.close();*/
    }
    public ABMCliente() {
    }
    
}
