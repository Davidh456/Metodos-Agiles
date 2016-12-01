
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

    public boolean TieneTransacciones(Cliente cliente, Vendedor vendedor, int opcion) {
        ABMInmueble operador1 = new ABMInmueble();
        LogicaReserva operador2 = new LogicaReserva();
        LogicaVenta operador3 = new LogicaVenta();
        if (opcion==1) //si es para el caso de clientes
        {    if(operador1.TieneInmueble(cliente).isEmpty() && operador2.TieneReserva(cliente).isEmpty() && operador3.TieneFacturas(cliente).isEmpty())
                return false;
            return true;}
        if (opcion==2) //si es para el caso de propietarios
        {
            if(operador1.TieneInmueble(cliente).isEmpty())
                return false;
            return true;}
        if (opcion==3) //si es para el caso de vendedores
        {
            if(operador3.TieneVenta(vendedor).isEmpty())
                return false;
            return true;}
        return true;
    }
}
