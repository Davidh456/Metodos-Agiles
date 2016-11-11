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
import java.util.Calendar;
import java.util.Date;
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
public class ExisteReservaTest4 {
    
    public ExisteReservaTest4() {
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
    public void setUp() throws IOException, DocumentException {
        //Genera una reserva para un inmueble para el cual no existe reserva activa
        Cliente cli = ABMCliente.getInstance().listarClientes().get(0);
        Calendar myCal = Calendar.getInstance();
        myCal.set(Calendar.YEAR, 2016);
        myCal.set(Calendar.MONTH, 10);
        myCal.set(Calendar.DAY_OF_MONTH, 10);
        Date hasta = myCal.getTime();
        double monto = 15000.0;
        LogRes.GenerarReserva(in, cli, monto, hasta);
        
        Cliente cli2 = ABMCliente.getInstance().listarClientes().get(1);
        myCal.set(Calendar.YEAR, 2016);
        myCal.set(Calendar.MONTH, 8);
        myCal.set(Calendar.DAY_OF_MONTH, 7);
        Date hasta2 = myCal.getTime();
        double monto2 = 11000.0;
        LogRes.GenerarReserva(in, cli2, monto2, hasta2);
        
        Cliente cli3 = ABMCliente.getInstance().listarClientes().get(2);
        myCal.set(Calendar.YEAR, 2016);
        myCal.set(Calendar.MONTH, 12);
        myCal.set(Calendar.DAY_OF_MONTH, 25);
        Date hasta3 = myCal.getTime();
        double monto3 = 25000.0;
        LogRes.GenerarReserva(in, cli3, monto3, hasta3);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void existeReservaCP4(){
        //Verificar si existe reserva para un inmueble con reservas viejas y una reserva activa
        assertTrue(LogRes.ExisteReserva(in));
    }
}
