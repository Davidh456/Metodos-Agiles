/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Conexion {
        private static Conexion instancia;
        private SessionFactory sesion;
        private Session session;
        
        public Conexion(){
            super();
            this.startSesion();
            this.startSession();
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
        public void startSession(){
            session = sesion.openSession();
        }
        public Session getSession(){
            if(session == null){
                startSession();
            }
            return session;
        }
        public void coseSession(){
            session.close();
        }
}
