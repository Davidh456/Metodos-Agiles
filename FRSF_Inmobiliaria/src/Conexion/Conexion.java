/*
 Esta clase nos ahorra una banda de código en las persistencias,
lo único q hay q hacer es llamar a este singleton para tener la sesión con
Conexion.getInstance().getSession();
 */
package Conexion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Conexion {
    private static Conexion instancia;
    private SessionFactory sesion;
    private Session session;

    public Conexion(){
        super();
        this.startSesion();
        this.openSession();
    }
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    public void startSesion(){
        sesion = NewHibernateUtil.getSessionFactory();
    }
    public SessionFactory getSesion(){
        if(sesion == null){
            startSesion();
        }
        return sesion;
    }
    public Session getSession(){
        if(session == null){
            openSession();
        }
        return session;
    }
    public void closeSession(){
        session.close();
    }

    public void openSession() {
        session = sesion.openSession();
    }

}
