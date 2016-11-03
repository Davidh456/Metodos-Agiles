
package Logica;

import Clases.Localidad;
import Clases.Propietario;
import Clases.Provincia;
import Persistencia.PersistenciaPropietario;
import java.util.List;

public class ABMPropietario {
    
    public static boolean propietarioExistente(int numeroDocumento, int tipoDocumento) {
        return (new PersistenciaPropietario()).propietarioExistente(numeroDocumento,tipoDocumento);
    }
    public static void altaPropietario(String nombre,String apellido,int tipoDoc, int numeroDoc,Provincia provincia, Localidad localidad, String domicilio, int alturaDomicilio, int telefono, String correo){
        Propietario propietario = new Propietario(localidad, provincia, nombre, apellido, 
                                        tipoDoc, numeroDoc, domicilio, alturaDomicilio, telefono, correo);
        (new PersistenciaPropietario()).altaPropietario(propietario);
    }
    public static void bajaPropietario(Propietario propietario){
        (new PersistenciaPropietario()).borrarPropietario(propietario);
    }
    public static void modificarPropietario(Propietario cliente){
        (new PersistenciaPropietario()).modificarPropietario(cliente);
    }
    public List<Propietario> listarPropietarios(){
        return new PersistenciaPropietario().listarPropietarios();
    }    
}
