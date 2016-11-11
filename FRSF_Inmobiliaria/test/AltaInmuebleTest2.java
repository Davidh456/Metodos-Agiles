/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Clases.Inmueble;
import Logica.ABMInmueble;
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
public class AltaInmuebleTest2 {
    
    public AltaInmuebleTest2() {
    }
    
    private static ABMInmueble ABMIn = new ABMInmueble();
    private static Inmueble in1;
    
    
    @BeforeClass
    public static void setUpClass() {
        in1 = ABMIn.BuscarInmuebles().get(0);
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

   @Test
   public void altaInmuebleNoRepetido(){
       
       //Modificamos los datos del inmueble seleccionado para que no sea repetido. 
       in1.setCalle("9 de Julio");
       in1.setDormitorio(in1.getDormitorio()+1);
       in1.setNumero(in1.getNumero()+100);
       in1.setPiso("1");
       in1.setDepto("");
       int antiguedad;
       if(in1.getAntiguedad()==-1) antiguedad = -1;
       else antiguedad=2016-in1.getAntiguedad();
       System.out.println("Antiguedad " + antiguedad);
       
       //Verificamos que el in1 no se encuentra en la BD
       assertFalse(ABMIn.existeInmueble(in1));
       Vector<String> ListaFotos = new Vector<String>();
       assertTrue(ABMIn.AltaInmueble(in1.getSupInmueble(), in1.getSupTerreno(), in1.getAc(), antiguedad, in1.getBano(), in1.getBarrio(), in1.getCp(), in1.getCalle(), in1.getDepto(), in1.getDormitorio(), in1.getFondo(), in1.getFrente(), in1.getGarage(), in1.getGn(), in1.getLavadero(), ListaFotos, in1.getLocalidadIndice(), in1.getLocalidadNombre(), in1.getNumero(), in1.getObservaciones(), in1.getOrientacion(), in1.getPatio(), in1.getPavimento(), in1.getPiso(), in1.getPrecio(), in1.getCliente(), in1.getProvinciaNombre(), in1.getProvinciaIndice(), in1.getTelefono(), in1.getTipoInmueble()));  
   
       ABMIn.EliminarInmueble(in1);
   }
}
