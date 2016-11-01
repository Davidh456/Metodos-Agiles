
package Logica;

import Clases.*;
import Conexion.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ABMCliente {

    public ABMCliente() {
    }
    
    public static boolean usuarioExistente(String numeroDocumento, int tipoDocumento) {
        
        return false;
    }

    public static void altaCliente(String nombre,String apellido,int tipoDoc, int numeroDoc,Provincia provincia, Localidad localidad, String domicilio, int alturaDomicilio, int telefono, String correo){
        Cliente cliente = new Cliente(localidad, provincia, nombre, apellido, 
                                        tipoDoc, numeroDoc, domicilio, alturaDomicilio, telefono, correo);
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cliente);
        tx.commit();
        session.close();
    }
    
}
