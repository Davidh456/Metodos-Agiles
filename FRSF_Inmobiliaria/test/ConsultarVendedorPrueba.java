/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Clases.Vendedor;
import Logica.ABMVendedor;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class ConsultarVendedorPrueba {
    
    public ConsultarVendedorPrueba() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void cargarVendedores(){
        System.out.println("Esto anda");
        List<Vendedor> vendedores;
        int i = 1;
        vendedores = ABMVendedor.getInstance().listarVendedores();
        System.out.println("Tam " + vendedores.size());
        for(Vendedor v: vendedores)
        {
            System.out.println("Vendedor: " + i + " Apellido: " + v.getApellido());
            i++;
        }
    }
}
