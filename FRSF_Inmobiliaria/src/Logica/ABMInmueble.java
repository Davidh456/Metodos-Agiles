/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Inmueble;
import Persistencia.PersistenciaInmueble;

/**
 *
 * @author maria
 */
public class ABMInmueble {
    
    PersistenciaInmueble BDInmueble = new PersistenciaInmueble();
    
    public boolean AltaInmueble(float supInmueble, float supTerreno, boolean Ac, int Antiguedad, int Bano, String Barrio, int CP, String Calle, String Depto, int Dormitorio, float Fondo, float Frente, boolean Garage, boolean Gn, boolean Lavadero, int ListaFotos, int LocalidadIndice, String LocalidadNombre, int Numero, String Observaciones, int Orientacion, String OtraLoc, boolean Patio, boolean Pavimento, String Piso, float Precio, int Propietario, String ProvinciaNombre, int ProvinciaIndice, boolean Telefono, int TipoInmueble) {
    boolean repetido = getRepetido(ProvinciaNombre,LocalidadNombre,Calle,Numero,Piso,Depto);
    if (!repetido){
        Inmueble casa = new Inmueble(supInmueble,  supTerreno,  Ac,  Antiguedad,  Bano,  Barrio,  CP,  Calle,  Depto,  Dormitorio,  Fondo,  Frente,  Garage,  Gn,  Lavadero,  ListaFotos,  LocalidadIndice,  LocalidadNombre,  Numero,  Observaciones,  Orientacion,  OtraLoc,  Patio,  Pavimento,  Piso,  Precio,  Propietario,  ProvinciaNombre, ProvinciaIndice, Telefono, TipoInmueble);
        BDInmueble.AltaInmueble(casa);
        return true;
    }
    return false;
    }
    
    private boolean getRepetido(String ProvinciaNombre, String LocalidadNombre, String Calle,int numero, String piso, String Depto ){
      boolean resultado;
      resultado=BDInmueble.getRepetido(ProvinciaNombre,LocalidadNombre,Calle,numero,piso,Depto);
      return resultado;
    };
    
    
}
