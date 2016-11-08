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
    
    public boolean AltaInmueble(float supInmueble, float supTerreno, boolean Ac, int Antiguedad, int Bano, String Barrio, int CP, String Calle, String Depto, int Dormitorio, float Fondo, float Frente, boolean Garage, boolean Gn, boolean Lavadero, int ListaFotos, int LocalidadIndice, String LocalidadNombre, int Numero, String Observaciones, int Orientacion,  boolean Patio, boolean Pavimento, String Piso, float Precio, Propietario propietario, String ProvinciaNombre, int ProvinciaIndice, boolean Telefono, int TipoInmueble) {
    int repetido = getRepetido(ProvinciaNombre,LocalidadNombre,Calle,Numero,Piso,Depto);
    if(Antiguedad!=-1)
        Antiguedad=2016-Antiguedad;
    if (repetido==-1){
        Inmueble casa = new Inmueble(propietario, supInmueble,  supTerreno,  Ac,  Antiguedad,  Bano,  Barrio,  CP,  Calle,  Depto,  Dormitorio,  Fondo,  Frente,  Garage,  Gn,  Lavadero,  ListaFotos,  LocalidadIndice,  LocalidadNombre,  Numero,  Observaciones,  Orientacion,  Patio,  Pavimento,  Piso,  Precio,  ProvinciaNombre, ProvinciaIndice, Telefono, TipoInmueble);
        BDInmueble.AltaInmueble(casa);
        return true;
    }
    return false;
    }
    
    private int getRepetido(String ProvinciaNombre, String LocalidadNombre, String Calle,int numero, String piso, String Depto ){
      int resultado;
      resultado=BDInmueble.getRepetido(ProvinciaNombre,LocalidadNombre,Calle,numero,piso,Depto);
      return resultado;
    };

    public List<Inmueble> BuscarInmuebles(String apellido, String barrioNombre, int cantDormitorios, String correo, String localidadNombre, String nombre, int nroDoc, float precioDesde, float precioHasta, int tipoDoc, int tipoInmueble, int provinciaIndice) {
        return BDInmueble.ListarInmuebles(apellido,barrioNombre,cantDormitorios,correo,localidadNombre,nombre,nroDoc,precioDesde,precioHasta,tipoDoc,tipoInmueble,provinciaIndice);
    }

    public boolean ModificarInmueble(int iDModif, float supInmueble, float supTerreno, boolean ac, int antiguedad, int bano, String barrio, int cp, String calle, String depto, int dormitorio, float fondo, float frente, boolean garage, boolean gn, boolean lavadero, int listaFotos, int localidadIndice, String localidadNombre, int numero, String observaciones, int orientacion,  boolean patio, boolean pavimento, String piso, float precio, Propietario propietario, String provinciaNombre, int provinciaIndice, boolean telefono, int tipoInmueble) {
        int repetido= getRepetido(provinciaNombre,localidadNombre,calle,numero,piso,depto);
        if (repetido==iDModif || repetido==-1){
            if(antiguedad!=-1)
                antiguedad=2016-antiguedad;
            Inmueble casa = new Inmueble(propietario, supInmueble,  supTerreno,  ac,  antiguedad,  bano,  barrio,  cp,  calle,  depto,  dormitorio,  fondo,  frente,  garage,  gn,  lavadero,  listaFotos,  localidadIndice,  localidadNombre,  numero,  observaciones,  orientacion,  patio,  pavimento,  piso,  precio,  provinciaNombre, provinciaIndice, telefono, tipoInmueble);
            casa.setId(iDModif);  
            return BDInmueble.ModificarInmueble(casa);
        }
    return false;
    }

    public boolean EliminarInmueble(Inmueble eliminarInmueble) {
 
        return BDInmueble.EliminarInmueble(eliminarInmueble); }
    
    
}
