
package Logica;
import Clases.Vendedor;
import Persistencia.PersistenciaVendedor;
import Persistencia.PersistenciaUsuario;
public class Login {
    public boolean login(String vendedor, String contrasenia){
        
        return PersistenciaVendedor.getInstance().login(vendedor, contrasenia);
    }
    public boolean AdminLogin(String usuario, String contrasenia) {
        return PersistenciaUsuario.getInstance().login(usuario,contrasenia);
    }

    public Vendedor getVendedorLogeado(String vendedor, String contrasenia) {
      return  PersistenciaVendedor.getInstance().getVendedorLogeado(vendedor, contrasenia);
    }
    
}
