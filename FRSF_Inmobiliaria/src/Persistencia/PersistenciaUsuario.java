
package Persistencia;

import Clases.Usuario;
import Conexion.Conexion;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class PersistenciaUsuario {
    private static PersistenciaUsuario instancia;
    private Session sesion;
    
    private PersistenciaUsuario(){
        super();
        sesion = Conexion.getInstance().getSession(); //cargar la sesi�n para ahorrar c�digo
    }
    
    public static PersistenciaUsuario getInstance(){
        if(instancia == null) instancia = new PersistenciaUsuario();
        return instancia;
    }

    public boolean login(String vendedor, String contrasenia){
        if(!sesion.isOpen()) Conexion.getInstance().openSession();
        Criteria criteria = sesion.createCriteria(Usuario.class, "usuario");
        criteria.add(Restrictions.eq("nombre", vendedor));
        criteria.add(Restrictions.eq("contrasenia", contrasenia));
        return !criteria.list().isEmpty();
    }
}
