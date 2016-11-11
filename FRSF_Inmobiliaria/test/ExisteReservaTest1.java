/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Clases.Cliente;
import Clases.Inmueble;
import Logica.ABMCliente;
import Logica.ABMInmueble;
import Logica.LogicaReserva;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
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
public class ExisteReservaTest1 {
    
    public ExisteReservaTest1() {
    }
    
    private static Inmueble in;
    private static final ABMInmueble ABMIn = new ABMInmueble();
    private LogicaReserva LogRes = new LogicaReserva();
    
    
    @BeforeClass
    public static void setUpClass() {
        Vector<String> listaFotos = new Vector<String>();
        Cliente propietario = ABMCliente.getInstance().listarPropietarios().get(0);
        ABMIn.AltaInmueble(75.0, 120.0, true, 3, 2, "Guadalupe", 3000, "Llerena", "", 4, 10.0, 10.0, true, true, false, listaFotos, 1885, "Capital", 550, "", 2, true, true, "2", 150000.0, propietario, "Santa Fe", 22, true, 1);
        in = ABMIn.BuscarInmuebles().get(ABMIn.BuscarInmuebles().size()-1);
    }
    
    @AfterClass
    public static void tearDownClass() {
        ABMIn.EliminarInmueble(in);
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void existeReservaCP1(){
        //Verifica si existe una reserva en un inmueble que no posee ninguna
        assertFalse(LogRes.ExisteReserva(in));
    }
    
}
