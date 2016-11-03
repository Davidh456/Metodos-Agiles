
package Logica;

import Clases.*;
import Persistencia.PersistenciaCliente;
import java.util.List;

public class ABMCliente {

    public ABMCliente() {
    }
    
    public static boolean clienteExistente(int numeroDocumento, int tipoDocumento) {
        return PersistenciaCliente.getInstance().clienteExistente(numeroDocumento,tipoDocumento);
    }
    public static void altaCliente(String nombre,String apellido,int tipoDoc, int numeroDoc,Provincia provincia, Localidad localidad, String domicilio, int alturaDomicilio, int telefono, String correo){
        Cliente cliente = new Cliente(localidad, provincia, nombre, apellido, 
                                        tipoDoc, numeroDoc, domicilio, alturaDomicilio, telefono, correo);
        PersistenciaCliente.getInstance().altaCliente(cliente);
    }
    public static void bajaCliente(Cliente cliente){
        PersistenciaCliente.getInstance().borrarCliente(cliente);
    }
    public static void modificarCliente(Cliente cliente){
        PersistenciaCliente.getInstance().modificarCliente(cliente);
    }
    public List<Cliente> listarClientes(){
        return PersistenciaCliente.getInstance().listarClientes();
    }
    
}
