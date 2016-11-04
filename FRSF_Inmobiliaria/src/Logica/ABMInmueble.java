/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Inmueble;
import Clases.Propietario;
import Persistencia.PersistenciaInmueble;
import Persistencia.PersistenciaPropietario;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author maria
 */
public class ABMInmueble {
    
    PersistenciaInmueble BDInmueble = new PersistenciaInmueble();
    
    public boolean AltaInmueble(float supInmueble, float supTerreno, boolean Ac, int Antiguedad, int Bano, String Barrio, int CP, String Calle, String Depto, int Dormitorio, float Fondo, float Frente, boolean Garage, boolean Gn, boolean Lavadero, int ListaFotos, int LocalidadIndice, String LocalidadNombre, int Numero, String Observaciones, int Orientacion, String OtraLoc, boolean Patio, boolean Pavimento, String Piso, float Precio, int Propietario, String ProvinciaNombre, int ProvinciaIndice, boolean Telefono, int TipoInmueble) {
    boolean repetido = getRepetido(ProvinciaNombre,LocalidadNombre,Calle,Numero,Piso,Depto);
    if (!repetido){
        //Inmueble casa = new Inmueble(supInmueble,  supTerreno,  Ac,  Antiguedad,  Bano,  Barrio,  CP,  Calle,  Depto,  Dormitorio,  Fondo,  Frente,  Garage,  Gn,  Lavadero,  ListaFotos,  LocalidadIndice,  LocalidadNombre,  Numero,  Observaciones,  Orientacion,  OtraLoc,  Patio,  Pavimento,  Piso,  Precio,  Propietario,  ProvinciaNombre, ProvinciaIndice, Telefono, TipoInmueble);
       //BDInmueble.AltaInmueble(casa);
        return true;
    }
    return false;
    }
    
    private boolean getRepetido(String ProvinciaNombre, String LocalidadNombre, String Calle,int numero, String piso, String Depto ){
      boolean resultado;
      resultado=BDInmueble.getRepetido(ProvinciaNombre,LocalidadNombre,Calle,numero,piso,Depto);
      return resultado;
    };

    public List<Inmueble> BuscarInmuebles(String apellido, String barrioNombre, int cantDormitorios, String correo, String localidadNombre, String nombre, int nroDoc, float precioDesde, float precioHasta, int tipoDoc, int tipoInmueble, int provinciaIndice) {
        return BDInmueble.ListarInmuebles(apellido,barrioNombre,cantDormitorios,correo,localidadNombre,nombre,nroDoc,precioDesde,precioHasta,tipoDoc,tipoInmueble,provinciaIndice);
    }

    public boolean ModificarInmueble(int iDModif, float supInmueble, float supTerreno, boolean ac, int antiguedad, int bano, String barrio, int cp, String calle, String depto, int dormitorio, float fondo, float frente, boolean garage, boolean gn, boolean lavadero, int listaFotos, int localidadIndice, String localidadNombre, int numero, String observaciones, int orientacion, String otraLoc, boolean patio, boolean pavimento, String piso, float precio, int propietario, String provinciaNombre, int provinciaIndice, boolean telefono, int tipoInmueble) {
        //TODO chequear que no haya coincidencia de datos
        boolean repetido= false;
        Propietario propprueba= PersistenciaPropietario.getInstance().listarPropietarios().get(0);
        if (!repetido){
            Inmueble casa = new Inmueble(propprueba, supInmueble,  supTerreno,  ac,  antiguedad,  bano,  barrio,  cp,  calle,  depto,  dormitorio,  fondo,  frente,  garage,  gn,  lavadero,  listaFotos,  localidadIndice,  localidadNombre,  numero,  observaciones,  orientacion,  otraLoc,  patio,  pavimento,  piso,  precio,  provinciaNombre, provinciaIndice, telefono, tipoInmueble);
            casa.setId(iDModif);
           
            return BDInmueble.ModificarInmueble(casa);
        }
    return false;
    }

    public boolean EliminarInmueble(Inmueble eliminarInmueble) {
 
        return BDInmueble.EliminarInmueble(eliminarInmueble); }
        
}
