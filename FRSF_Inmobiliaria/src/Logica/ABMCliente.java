
package Logica;

import Clases.*;
import Persistencia.PersistenciaCliente;
import java.util.List;

public class ABMCliente {
    private static ABMCliente instance;

    public ABMCliente() {
        super();
    }
    public static ABMCliente getInstance(){
        if (instance == null){
            instance = new ABMCliente();
        }
        return instance;
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
    public List<Cliente> listarPropietarios(){
        return PersistenciaCliente.getInstance().listarPropietarios();
    }
    public List<Cliente> listarNoPropietarios(){
        return PersistenciaCliente.getInstance().listarNoPropietarios();
    }
    public static void hacerPropietario(Cliente cliente) {
        cliente.setEsPropietario(true);
        modificarCliente(cliente);
    }
     public static void noEsMasPropietario(Cliente cliente) {
        cliente.setEsPropietario(false);
        modificarCliente(cliente);
    }

    public boolean TieneTransacciones(Cliente cliente) {
        ABMInmueble operador1 = new ABMInmueble();
        LogicaReserva operador2 = new LogicaReserva();
        LogicaVenta operador3 = new LogicaVenta();
        if(operador1.TieneInmueble(cliente).isEmpty() && operador2.TieneReserva(cliente).isEmpty() && operador3.TieneFacturas(cliente).isEmpty())
            return false;
        return true;
    }
}
