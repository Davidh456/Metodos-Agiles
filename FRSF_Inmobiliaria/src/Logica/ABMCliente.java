
package Logica;

import Clases.*;
import Persistencia.PersistenciaCliente;
import java.util.List;

public class ABMCliente {

    public ABMCliente() {
    }
    
    public static boolean clienteExistente(int numeroDocumento, int tipoDocumento) {
        return (new PersistenciaCliente()).clienteExistente(numeroDocumento,tipoDocumento);
    }
    public static void altaCliente(String nombre,String apellido,int tipoDoc, int numeroDoc,Provincia provincia, Localidad localidad, String domicilio, int alturaDomicilio, int telefono, String correo){
        Cliente cliente = new Cliente(localidad, provincia, nombre, apellido, 
                                        tipoDoc, numeroDoc, domicilio, alturaDomicilio, telefono, correo);
        (new PersistenciaCliente()).altaCliente(cliente);
    }
    public static void bajaCliente(Cliente cliente){
        (new PersistenciaCliente()).borrarCliente(cliente);
    }
    public static void modificarCliente(Cliente cliente){
        (new PersistenciaCliente()).modificarCliente(cliente);
    }
    public List<Cliente> listarClientes(){
        return new PersistenciaCliente().listarClientes();
    }
    
}
