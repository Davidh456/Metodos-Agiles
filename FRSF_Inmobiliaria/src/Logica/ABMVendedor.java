/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Localidad;
import Clases.Provincia;
import Clases.Vendedor;
import Persistencia.PersistenciaVendedor;
import java.util.List;

/**
 *
 * @author lucas
 */
public class ABMVendedor {
    private static ABMVendedor instancia; 

    public boolean existeVendedor(int numDoc, int tipoDoc) {
        return PersistenciaVendedor.getInstance().existeVendedor(numDoc,tipoDoc);
    }
    
    private ABMVendedor(){
        super();
    }
    
    public static ABMVendedor getInstance()
    {
        if (instancia==null){
            instancia = new ABMVendedor();
        }
        return instancia;
    }

    public List<Vendedor> listarVendedores() {
        return PersistenciaVendedor.getInstance().listarVendedores();
    }

    public void altaVendedor(int tipoDoc, int numDoc, String nombre, String apellido, Provincia prov, Localidad loc, String domicilio, String altura, String tel, String email, String contra) {
        Vendedor vendedor = new Vendedor(loc, prov, tipoDoc, numDoc, nombre, apellido, 
                email, domicilio, altura, tel, contra);
        PersistenciaVendedor.getInstance().altaVendedor(vendedor);
    }

    public boolean existeMismoDNI(Integer numDoc, Integer tipoDoc, Integer idVendedor) {
        return PersistenciaVendedor.getInstance().existeMismoDNI(numDoc,tipoDoc,idVendedor);
    }

    public void modificarVendedor(Vendedor vend) {
        PersistenciaVendedor.getInstance().modificarVendedor(vend);
    }

    public void bajaVendedor(Vendedor vend) {
        PersistenciaVendedor.getInstance().bajaVendedor(vend);
    }
}
