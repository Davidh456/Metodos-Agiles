package Clases;
// Generated 03/11/2016 05:23:01 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Localidad generated by hbm2java
 */
public class Localidad  implements java.io.Serializable {


     private Integer idLocalidad;
//     private Provincia provincia;
     private String localidad;
//     private Set clientes = new HashSet(0);
//     private Set propietarios = new HashSet(0);

    public Localidad() {
    }

	
    public Localidad(/*Provincia provincia,*/ String localidad) {
  //      this.provincia = provincia;
        this.localidad = localidad;
    }
    public Localidad(Provincia provincia, String localidad, Set clientes, Set propietarios) {
//       this.provincia = provincia;
       this.localidad = localidad;
//       this.clientes = clientes;
//       this.propietarios = propietarios;
    }
   
    public Integer getIdLocalidad() {
        return this.idLocalidad;
    }
    
    public void setIdLocalidad(Integer idLocalidad) {
        this.idLocalidad = idLocalidad;
    }
/*    public Provincia getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }*/
    public String getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }/*
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }
    public Set getPropietarios() {
        return this.propietarios;
    }
    
    public void setPropietarios(Set propietarios) {
        this.propietarios = propietarios;
    }
*/



}


