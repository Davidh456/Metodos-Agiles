/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Clases.Cliente;
import Clases.Foto;
import Clases.Inmueble;
import Logica.ABMCliente;
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
public class ModificarInmuebleTest1 {
    
    public ModificarInmuebleTest1() {
        this.ABMIn = new ABMInmueble();
    }

    private Inmueble otro;
    private final ABMInmueble ABMIn;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        otro = ABMIn.BuscarInmuebles().get(3);
    }
    
    @After
    public void tearDown() {
        
    }
    
    @Test
    public void modificarInmuebleCP1(){
        //Se modifican campos distintos de la direccion.
        
        Inmueble in1 = ABMIn.BuscarInmuebles().get(1);
        Inmueble in2 = ABMIn.BuscarInmuebles().get(1);

        //Comprobar que el inmueble existe en la BD antes de la modificación
        assertTrue(ABMIn.existeInmueble(in1));
        //Modificar el segundo inmueble, que era igual al primero. 
        in2.setAntiguedad(15);
        in2.setAc(!in1.getAc());
        in2.setGarage(!in1.getGarage());
        in2.setBano(in1.getBano()+2);
        in2.setDormitorio(in1.getDormitorio()-1);
        in2.setCp(33);
        //Acá se va a inicializar un vector vacio lista fotos. Si existían fotos, se van a perder, porque todavía no pudimos reconvertir las fotos a String.
        Vector<String> listaFotos = new Vector<String>();
        
        ABMIn.ModificarInmueble(in2.getId(), in2.getSupInmueble(), in2.getSupTerreno(), in2.getAc(), in2.getAntiguedad(), in2.getBano(), in2.getBarrio(), in2.getCp(), in2.getCalle(), in2.getDepto(), in2.getDormitorio(), in2.getFondo(), in2.getFrente(), in2.getGarage(), in2.getGn(), in2.getLavadero(), listaFotos, in2.getLocalidadIndice(), in2.getLocalidadNombre(), in2.getNumero(), in2.getObservaciones(), in2.getOrientacion(), in2.getPatio(), in2.getPavimento(), in2.getPiso(), in2.getPrecio(), in2.getCliente(), in2.getProvinciaNombre(), in2.getProvinciaIndice(),in2.getTelefono(), in2.getTipoInmueble());

        assertFalse(ABMIn.existeInmueble(in1));
        //Setear la antiguedad correcta, la que se encuentra en la BD.
        in2.setAntiguedad(2016-15);
        assertTrue(ABMIn.existeInmueble(in2));
    }
    
    @Test
    public void modificarInmuebleCP2(){
        //Se modifica la dir del inmueble por una que no existe en la BD
  
        Inmueble in1 = ABMIn.BuscarInmuebles().get(0);
        Inmueble in2 = ABMIn.BuscarInmuebles().get(0);
        
        //Comprobar que el inmueble existe en la BD antes de la modificación
        assertTrue(ABMIn.existeInmueble(in1));
        //Setear los nuevos valores
        in2.setCalle("Salta");
        in2.setPiso("Primero");
        in2.setProvinciaIndice(22);
        in2.setProvinciaNombre("Santa Fe");
        in2.setLocalidadIndice(2163);
        in2.setLocalidadNombre("Sunchales");
        in2.setNumero(23);
        in2.setAc(!in1.getAc()); //TODO Borrar antes de ejecutar la prueba final con la BD. 
        
        int antiguedad;
        if(in2.getAntiguedad()==-1) antiguedad = -1;
        else antiguedad = 2016-in2.getAntiguedad();
        
        //Acá se va a inicializar un vector vacio lista fotos. Si existían fotos, se van a perder, porque todavía no pudimos reconvertir las fotos a String.
        Vector<String> listaFotos = new Vector<String>();
        
        ABMIn.ModificarInmueble(in2.getId(), in2.getSupInmueble(), in2.getSupTerreno(), in2.getAc(), antiguedad, in2.getBano(), in2.getBarrio(), in2.getCp(), in2.getCalle(), in2.getDepto(), in2.getDormitorio(), in2.getFondo(), in2.getFrente(), in2.getGarage(), in2.getGn(), in2.getLavadero(), listaFotos, in2.getLocalidadIndice(), in2.getLocalidadNombre(), in2.getNumero(), in2.getObservaciones(), in2.getOrientacion(), in2.getPatio(), in2.getPavimento(), in2.getPiso(), in2.getPrecio(), in2.getCliente(), in2.getProvinciaNombre(), in2.getProvinciaIndice(),in2.getTelefono(), in2.getTipoInmueble());
        
        //Comprobar que el inmueble original no se encuentra, y el modificado si. 
        assertFalse(ABMIn.existeInmueble(in1));
        assertTrue(ABMIn.existeInmueble(in2));
        
    }
    
    @Test
    public void modificarInmuebleCP3(){
        //Modificar una dirección y seleccionar la dirección existente con el mismo ID de la BD.
        //También se modifican otros datos
        
        Inmueble in1 = ABMIn.BuscarInmuebles().get(0);
        Inmueble in2 = ABMIn.BuscarInmuebles().get(0);
        
        //Comprobar que el inmueble existe en la BD antes de la modificación
        assertTrue(ABMIn.existeInmueble(in1));
        //Setear los nuevos valores
        in2.setCalle("Salta");
        in2.setPiso("Primero");
        in2.setProvinciaIndice(22);
        in2.setProvinciaNombre("Santa Fe");
        in2.setLocalidadIndice(2163);
        in2.setLocalidadNombre("Sunchales");
        in2.setNumero(23);
        in2.setAc(!in1.getAc());
        in2.setGn(!in1.getGn());
        in2.setBarrio("Sancor");
        in2.setDormitorio(in1.getDormitorio()+3);
        in2.setAntiguedad(-1);
        
        int antiguedad;
        if(in2.getAntiguedad()==-1) antiguedad = -1;
        else antiguedad = 2016-in2.getAntiguedad();
        
        //Acá se va a inicializar un vector vacio lista fotos. Si existían fotos, se van a perder, porque todavía no pudimos reconvertir las fotos a String.
        Vector<String> listaFotos = new Vector<String>();
        
        ABMIn.ModificarInmueble(in2.getId(), in2.getSupInmueble(), in2.getSupTerreno(), in2.getAc(), antiguedad, in2.getBano(), in2.getBarrio(), in2.getCp(), in2.getCalle(), in2.getDepto(), in2.getDormitorio(), in2.getFondo(), in2.getFrente(), in2.getGarage(), in2.getGn(), in2.getLavadero(), listaFotos, in2.getLocalidadIndice(), in2.getLocalidadNombre(), in2.getNumero(), in2.getObservaciones(), in2.getOrientacion(), in2.getPatio(), in2.getPavimento(), in2.getPiso(), in2.getPrecio(), in2.getCliente(), in2.getProvinciaNombre(), in2.getProvinciaIndice(),in2.getTelefono(), in2.getTipoInmueble());
        
        //Comprobar que el inmueble original no se encuentra, y el modificado si. 
        assertFalse(ABMIn.existeInmueble(in1));
        assertTrue(ABMIn.existeInmueble(in2));
        
    }
    
    @Test
    public void modificarInmuebleCP4(){
        //Modificar una dirección y seleccionar una dirección inexistente con un id existente. 
        //También se modifican otros datos
        
        Inmueble in1 = ABMIn.BuscarInmuebles().get(0);
        Inmueble in2 = ABMIn.BuscarInmuebles().get(0);
        
        //Comprobar que el inmueble existe en la BD antes de la modificación
        assertTrue(ABMIn.existeInmueble(in1));
        //Setear los nuevos valores
        in2.setCalle("Salta");
        in2.setPiso("Primero");
        in2.setProvinciaIndice(22);
        in2.setProvinciaNombre("Santa Fe");
        in2.setLocalidadIndice(2163);
        in2.setLocalidadNombre("Sunchales");
        in2.setNumero(23);
        in2.setAc(!in1.getAc());
        in2.setGn(!in1.getGn());
        in2.setBarrio("Sancor");
        in2.setDormitorio(in1.getDormitorio()+3);
        in2.setAntiguedad(in1.getAntiguedad()-5);
        in2.setId(ABMIn.BuscarInmuebles().get(2).getId());
        
        int antiguedad;
        if(in2.getAntiguedad()==-1) antiguedad = -1;
        else antiguedad = 2016-in2.getAntiguedad();
        
        //Acá se va a inicializar un vector vacio lista fotos. Si existían fotos, se van a perder, porque todavía no pudimos reconvertir las fotos a String.
        Vector<String> listaFotos = new Vector<String>();
        
        ABMIn.ModificarInmueble(in2.getId(), in2.getSupInmueble(), in2.getSupTerreno(), in2.getAc(), antiguedad, in2.getBano(), in2.getBarrio(), in2.getCp(), in2.getCalle(), in2.getDepto(), in2.getDormitorio(), in2.getFondo(), in2.getFrente(), in2.getGarage(), in2.getGn(), in2.getLavadero(), listaFotos, in2.getLocalidadIndice(), in2.getLocalidadNombre(), in2.getNumero(), in2.getObservaciones(), in2.getOrientacion(), in2.getPatio(), in2.getPavimento(), in2.getPiso(), in2.getPrecio(), in2.getCliente(), in2.getProvinciaNombre(), in2.getProvinciaIndice(),in2.getTelefono(), in2.getTipoInmueble());
        
        //Comprobar que el inmueble original no se encuentra, y el modificado si.
        in2.setAntiguedad(2016-antiguedad);
        assertTrue(ABMIn.existeInmueble(in2));
        
    }
}
