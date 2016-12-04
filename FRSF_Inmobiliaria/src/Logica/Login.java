
package Logica;
import Persistencia.PersistenciaVendedor;
public class Login {
    public boolean login(String vendedor, String contrasenia){
        return PersistenciaVendedor.getInstance().login(vendedor, contrasenia);
    }
}
