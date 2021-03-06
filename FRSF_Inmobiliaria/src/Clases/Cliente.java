package Clases;
// Generated 08-nov-2016 20:43:30 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private Localidad localidad;
     private Provincia provincia;
     private String nombre;
     private String apellido;
     private int tipoDoc;
     private int numeroDoc;
     private String domicilio;
     private int alturaDomicilio;
     private int telefono;
     private String correo;
     private Boolean esPropietario;
//     private Set inmuebles = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(Localidad localidad, Provincia provincia, String nombre, String apellido, int tipoDoc, int numeroDoc, String domicilio, int alturaDomicilio, int telefono, String correo) {
        this.localidad = localidad;
        this.provincia = provincia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
        this.domicilio = domicilio;
        this.alturaDomicilio = alturaDomicilio;
        this.telefono = telefono;
        this.correo = correo;
        this.esPropietario = false;
    }/*
    public Cliente(Localidad localidad, Provincia provincia, String nombre, String apellido, int tipoDoc, int numeroDoc, String domicilio, int alturaDomicilio, int telefono, String correo, Boolean esPropietario, Set inmuebles) {
       this.localidad = localidad;
       this.provincia = provincia;
       this.nombre = nombre;
       this.apellido = apellido;
       this.tipoDoc = tipoDoc;
       this.numeroDoc = numeroDoc;
       this.domicilio = domicilio;
       this.alturaDomicilio = alturaDomicilio;
       this.telefono = telefono;
       this.correo = correo;
       this.esPropietario = false;
 //      this.inmuebles = inmuebles;
    }*/
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public Localidad getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
    public Provincia getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getTipoDoc() {
        return this.tipoDoc;
    }
    
    public void setTipoDoc(int tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getNumeroDoc() {
        return this.numeroDoc;
    }
    
    public void setNumeroDoc(int numeroDoc) {
        this.numeroDoc = numeroDoc;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public int getAlturaDomicilio() {
        return this.alturaDomicilio;
    }
    
    public void setAlturaDomicilio(int alturaDomicilio) {
        this.alturaDomicilio = alturaDomicilio;
    }
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Boolean getEsPropietario() {
        return this.esPropietario;
    }
    
    public void setEsPropietario(Boolean esPropietario) {
        this.esPropietario = esPropietario;
    }
 /*   public Set getInmuebles() {
        return this.inmuebles;
    }
    
    public void setInmuebles(Set inmuebles) {
        this.inmuebles = inmuebles;
    }
*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            System.out.println("Fallo 1");return false;
        }
        /*if(getClass() != obj.getClass()) {
            System.out.println(getClass());
            System.out.println(obj.getClass());
            System.out.println("Fallo 2");return false;
        }*/
        final Cliente other = (Cliente) obj;
        if (this.tipoDoc != other.tipoDoc) {
            System.out.println("Fallo 3");return false;
        }
        if (this.numeroDoc != other.getNumeroDoc() ) {
            System.out.println("Fallo NumDoc");return false;
        }
        if (this.alturaDomicilio != other.getAlturaDomicilio() ) {
            System.out.println("Fallo AltDom");return false;
        }
        if (this.telefono != other.getTelefono() ) {
            System.out.println("Fallo Tel");return false;
        }
        if (!Objects.equals(this.nombre, other.getNombre())) {
            System.out.println("Fallo Nombre");return false;
        }
        if (!Objects.equals(this.apellido, other.getApellido())) {
            System.out.println("Fallo Apell");return false;
        }
        if (!Objects.equals(this.domicilio, other.getDomicilio())) {
            System.out.println("Fallo Dom");return false;
        }
        if (!Objects.equals(this.correo, other.getCorreo())) {
            System.out.println("Fallo Correo");return false;
        }
        if (!Objects.equals(this.idCliente, other.getIdCliente() )) {
            System.out.println("Fallo ID");return false;
        }
        if (!this.localidad.equals(other.getLocalidad())) {
            System.out.println("Fallo Localidad");return false;
        }
        if (!this.provincia.equals(other.getProvincia())) {
            System.out.println("Fallo Provincia");return false;
        }
        if (!Objects.equals(this.esPropietario, other.getEsPropietario())) {
            System.out.println("Fallo Es Propietario");return false;
        }
        return true;
    }
    


}


