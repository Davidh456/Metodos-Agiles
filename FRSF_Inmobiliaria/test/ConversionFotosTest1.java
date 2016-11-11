/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Interfaz.ABMInmuebleInterfaz;
import Clases.Cliente;
import Clases.Foto;
import Clases.Inmueble;
import Logica.ABMCliente;
import Logica.ABMInmueble;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
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
public class ConversionFotosTest1 {
    ABMInmueble test = new ABMInmueble();
    ABMCliente client = new ABMCliente();
    List<Inmueble> listInmueble;
    
    double supInmueble;
    double supTerreno;
    boolean Ac;
    int Antiguedad;
    int Bano;
    String Barrio;
    int CP;
    String Calle;
    String Depto;
    int Dormitorio;
    double Fondo; 
    double Frente;
    boolean Garage;
    boolean Gn;
    boolean Lavadero;
  
    Vector<String> ListaFotos;
    int LocalidadIndice;
    String LocalidadNombre;
    int Numero;
    String Observaciones;
    int Orientacion;
    boolean Patio;
    boolean Pavimento;
    String Piso;
    double Precio;
    Cliente propietario;
    String ProvinciaNombre;
    int ProvinciaIndice;
    boolean Telefono;
    int TipoInmueble;
    String correo;
    double precioDesde;
    double precioHasta;
    
    
    File archivo;
 
    
   
    
    @Before
    public void setUp() 
    {
    this.ListaFotos = new Vector<String>();
    supInmueble = 10.0;
    supTerreno = 10.0;
    Ac = false;
    Antiguedad = 10;
    Bano = 1;
    Barrio = "Candiotti";
    CP= 3000;
    Calle= "Castellanos";
    Depto= "la capital"; 
    Dormitorio= 2;
    Fondo=25.0;
    Frente=12.0;
    Garage=false;
    Gn=false;
    Lavadero= false;
    LocalidadIndice= 1;
    LocalidadNombre= "Rosario";
    Numero= 3;
    Observaciones="Excelente estado";
    Orientacion=2;
    Patio= false;
    Pavimento= false;
    Piso="setentaa";
    Precio=25000.0;
    propietario= client.listarPropietarios().get(2);
    ProvinciaNombre="Santa fe";
    ProvinciaIndice=15;
    Telefono=false;
    TipoInmueble=2;
    
    
    correo = "";
    precioDesde = 0.0;
    precioHasta = 50000.0;
    
    //Para probar método conversiónFotos
    archivo = new File("C:\\Users\\Hp\\Desktop\\descarga.jpg");
    ListaFotos.add("Descarga");
    ListaFotos.add(((File) archivo).getAbsolutePath());
    }
    
    //Si se quiere volver a probar el test, se deben borrar las cosas de la base de datos. No me deja borrarlos usando el After,
    //me dice que hay problemas con el correo y luego con el apellido.
  /*  @Test
    public void TestAltaInmueble() { //Preguntar como eliminar los datos creados en el test, y preguntar por qué no los puedo ver en la interfaz.
        assertTrue(test.AltaInmueble(supInmueble,  supTerreno,  Ac, Antiguedad,  Bano,  "ciudadela", CP,  "san lorenzo",  Depto,  Dormitorio, Fondo,Frente,  Garage,  Gn,  Lavadero, null,  LocalidadIndice, "Rosario",  Numero,  Observaciones,  Orientacion, Patio, Pavimento, Piso, Precio, propietario,"Santa Fe", ProvinciaIndice, Telefono, TipoInmueble));
    }
    
    @Test //Tiene que fallar porque la antiguedad no puede ser -1;
    public void TestAltaInmueble1() { //Preguntar como eliminar los datos creados en el test, y preguntar por qué no los puedo ver en la interfaz.
        assertFalse(test.AltaInmueble(supInmueble,  supTerreno,  Ac, -1,  Bano,  "San Jerónimo", CP,  "Lavaise",  Depto,  Dormitorio, Fondo,Frente,  Garage,  Gn,  Lavadero, null,  LocalidadIndice,  "La Plata",  Numero,  Observaciones,  Orientacion, Patio, Pavimento, Piso, Precio, propietario,"Buenos Aires", ProvinciaIndice, Telefono, TipoInmueble));
    }
  
    @Test //Probando diferentes valores de antiguedad
    public void TestAltaInmueble2() { //Preguntar como eliminar los datos creados en el test, y preguntar por qué no los puedo ver en la interfaz.
        assertTrue(test.AltaInmueble(supInmueble,  supTerreno,  Ac, 0,  Bano,  "San Jerónimo2", CP,  "Lavaise",  Depto,  Dormitorio, Fondo,Frente,  Garage,  Gn,  Lavadero, null,  LocalidadIndice,  "La Plata",  Numero,  Observaciones,  Orientacion, Patio, Pavimento, Piso, Precio, propietario,"Buenos Aires", ProvinciaIndice, Telefono, TipoInmueble));
    }
   
    @Test
    public void TestAltaInmueble3() { //Preguntar como eliminar los datos creados en el test, y preguntar por qué no los puedo ver en la interfaz.
        assertTrue(test.AltaInmueble(supInmueble,  supTerreno,  Ac, 200,  Bano,  "San Jerónimo3", CP,  "Lavaise2",  Depto,  Dormitorio, Fondo,Frente,  Garage,  Gn,  Lavadero, null,  LocalidadIndice,  "La Plata",  Numero,  Observaciones,  Orientacion, Patio, Pavimento, Piso, Precio, propietario,"Buenos Aires", ProvinciaIndice, Telefono, TipoInmueble));
    }
    
    @Test //Probando ingresar un inmueble que ya existe.
    public void TestAltaInmueble4() { //Preguntar como eliminar los datos creados en el test, y preguntar por qué no los puedo ver en la interfaz.
        assertFalse(test.AltaInmueble(supInmueble,  supTerreno,  Ac, Antiguedad,  Bano,  "ciudadela", CP,  "san lorenzo",  Depto,  Dormitorio, Fondo,Frente,  Garage,  Gn,  Lavadero, null,  LocalidadIndice, "Rosario",  Numero,  Observaciones,  Orientacion, Patio, Pavimento, Piso, Precio, propietario,"Santa Fe", ProvinciaIndice, Telefono, TipoInmueble));
    }
    */
    
    
    
    
    @Test
    public void listaConversionFotos() { //Preguntar como eliminar los datos creados en el test, y preguntar por qué no los puedo ver en la interfaz.
      byte[] convertidas;
      int i;
      test.AltaInmueble(supInmueble,  supTerreno,  Ac, Antiguedad,  Bano,  "San Juan", CP,  "San Martin",  Depto,  Dormitorio, Fondo,Frente,  Garage,  Gn,  Lavadero, ListaFotos,  LocalidadIndice, "Rosario",  Numero,  Observaciones,  Orientacion, Patio, Pavimento, Piso, Precio, propietario,"Santa Fe", ProvinciaIndice, Telefono, TipoInmueble);
      Inmueble inm = test.BuscarInmuebles().get(test.BuscarInmuebles().size()-1);
      Foto fot = test.BuscaFotos().get(test.BuscaFotos().size()-1);
      
           for(i=0;i<ListaFotos.size()/2;i++)
            {
                File file = new File(ListaFotos.elementAt(i+1));
                convertidas = new byte[(int) file.length()];
                try {
                     FileInputStream fileInputStream = new FileInputStream(file);
                     //convert file into array of bytes
                     fileInputStream.read(convertidas);
                    fileInputStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                        }
                Foto imagen = new Foto(inm, ListaFotos.elementAt(i),ListaFotos.elementAt(i+1),convertidas);
               
            }
                assertTrue(test.existeFoto(inm, fot));
        
       
    }
}
