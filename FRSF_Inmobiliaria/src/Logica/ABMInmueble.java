/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Foto;
import Clases.Inmueble;
import Clases.Cliente;
import Persistencia.PersistenciaInmueble;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author maria
 */
public class ABMInmueble {
    
    PersistenciaInmueble BDInmueble = new PersistenciaInmueble();
    
    public boolean AltaInmueble(double supInmueble, double supTerreno, boolean Ac, int Antiguedad, int Bano, String Barrio, int CP, String Calle, String Depto, int Dormitorio, double Fondo, double Frente, boolean Garage, boolean Gn, boolean Lavadero, Vector<String> ListaFotos, int LocalidadIndice, String LocalidadNombre, int Numero, String Observaciones, int Orientacion,  boolean Patio, boolean Pavimento, String Piso, double Precio, Cliente propietario, String ProvinciaNombre, int ProvinciaIndice, boolean Telefono, int TipoInmueble) {
    int repetido = getRepetido(ProvinciaNombre,LocalidadNombre,Calle,Numero,Piso,Depto);
    if(Antiguedad!=-1)
        Antiguedad=2016-Antiguedad;
    if (repetido==-1){
        Inmueble casa = new Inmueble(propietario, supInmueble,  supTerreno,  Ac,  Antiguedad,  
                Bano,  Barrio,  CP,  Calle,  Depto,  Dormitorio,  Fondo,  Frente,  Garage,  Gn,  
                Lavadero,  LocalidadIndice,  LocalidadNombre,  Numero,  Observaciones,  Orientacion,  
                Patio,  Pavimento,  Piso,  Precio,  ProvinciaNombre, ProvinciaIndice, Telefono, TipoInmueble);
        BDInmueble.AltaInmueble(casa);
        conversionFotos(ListaFotos, casa);
        
        return true;
    }
    return false;
    }
    
    private int getRepetido(String ProvinciaNombre, String LocalidadNombre, String Calle,int numero, String piso, String Depto ){
      int resultado;
      resultado=BDInmueble.getRepetido(ProvinciaNombre,LocalidadNombre,Calle,numero,piso,Depto);
      return resultado;
    };

    public List<Inmueble> BuscarInmuebles(String apellido, String barrioNombre, int cantDormitorios, String correo, String localidadNombre, String nombre, int nroDoc, double precioDesde, double precioHasta, int tipoDoc, int tipoInmueble, int provinciaIndice) {
        return BDInmueble.ListarInmuebles(apellido,barrioNombre,cantDormitorios,correo,localidadNombre,nombre,nroDoc,precioDesde,precioHasta,tipoDoc,tipoInmueble,provinciaIndice);
    }
    
    public List<Inmueble> BuscarInmuebles()
    {
        return BDInmueble.ListarInmuebles();
    }

    public boolean ModificarInmueble(int iDModif, double supInmueble, double supTerreno, boolean ac, int antiguedad, int bano, String barrio, int cp, String calle, String depto, int dormitorio, double fondo, double frente, boolean garage, boolean gn, boolean lavadero, Vector<String> listaFotos, int localidadIndice, String localidadNombre, int numero, String observaciones, int orientacion,  boolean patio, boolean pavimento, String piso, double precio, Cliente propietario, String provinciaNombre, int provinciaIndice, boolean telefono, int tipoInmueble) {
        int repetido= getRepetido(provinciaNombre,localidadNombre,calle,numero,piso,depto);
        //devuelve el id del inmueble que coincida con los parametros para verificar que no se este cambiando la direccion del inmueble a una ya existente
        if (repetido==iDModif || repetido==-1){
            if(antiguedad!=-1)
                antiguedad=2016-antiguedad;
            Inmueble casa = new Inmueble(propietario, supInmueble,  supTerreno,  ac,  antiguedad,  bano,  barrio,  cp,  calle,  depto,  dormitorio,  fondo,  frente,  garage,  gn,  lavadero,  localidadIndice,  localidadNombre,  numero,  observaciones,  orientacion,  patio,  pavimento,  piso,  precio,  provinciaNombre, provinciaIndice, telefono, tipoInmueble);
            casa.setId(iDModif);
            return BDInmueble.ModificarInmueble(casa);
        }
    return false;
    }
    
    public boolean ModificarInmuebleConObjeto(Inmueble inm){
        return BDInmueble.ModificarInmueble(inm);
    }

    public boolean EliminarInmueble(Inmueble eliminarInmueble) {
 
        return BDInmueble.EliminarInmueble(eliminarInmueble); 
    }

    private void conversionFotos(Vector<String> listaFotos, Inmueble inmueble) {
        int i;
        byte[] convertidas;
            for(i=0;i<listaFotos.size()/2;i++)
            {
                File file = new File(listaFotos.elementAt(i+1));
                convertidas = new byte[(int) file.length()];
                try {
                     FileInputStream fileInputStream = new FileInputStream(file);
                     //convert file into array of bytes
                     fileInputStream.read(convertidas);
                    fileInputStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                        }
                Foto imagen = new Foto(inmueble, listaFotos.elementAt(i),listaFotos.elementAt(i+1),convertidas);
                BDInmueble.AltaFoto(imagen);
            }
    }
    
    public boolean existeInmueble(Inmueble in){
        List<Inmueble> lista = BDInmueble.existeInmueble(in);
        
        if(lista.isEmpty()) return false;
        else if(lista.get(0).equals(in)){
            return true;
        }
        return false;
    }
    public boolean existeFoto(Inmueble inm, Foto imagen)
    {
        if(existeInmueble(inm))
        {
            List<Foto> fotos = BDInmueble.existeFotoInmueble(inm, imagen);
            if(fotos.isEmpty())
                return false;
            else if(fotos.get(0).equals(imagen))
                return true;
        }
        return false;
    }

    public Foto obtenerPrimeraFoto(Inmueble inm)
    {
        List<Foto> fotos = BDInmueble.fotosInmueble(inm);
        if(fotos.isEmpty())
            return null;
        else 
            return fotos.get(0);
    }
    
    public List<Foto> BuscaFotos()
    {
        return BDInmueble.ListarFotos();
    }

    public List<Inmueble>  TieneInmueble(Cliente cliente) {
        return BDInmueble.TieneInmueble(cliente);
    }
    
}
