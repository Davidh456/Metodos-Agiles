package Clases;
// Generated 08/11/2016 03:58:49 by Hibernate Tools 4.3.1



/**
 * Foto generated by hbm2java
 */
public class Foto  implements java.io.Serializable {


     private Integer idfoto;
     private Inmueble inmueble;
     private String nombreFoto;
     private String direccion;
     private byte[] imagen;

    public Foto() {
    }

    public Foto(Inmueble inmueble, String nombreFoto, String direccion, byte[] imagen) {
       this.inmueble = inmueble;
       this.nombreFoto = nombreFoto;
       this.direccion = direccion;
       this.imagen = imagen;
    }
   
    public Integer getIdfoto() {
        return this.idfoto;
    }
    
    public void setIdfoto(Integer idfoto) {
        this.idfoto = idfoto;
    }
    public Inmueble getInmueble() {
        return this.inmueble;
    }
    
    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }
    public String getNombreFoto() {
        return this.nombreFoto;
    }
    
    public void setNombreFoto(String nombreFoto) {
        this.nombreFoto = nombreFoto;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public byte[] getImagen() {
        return this.imagen;
    }
    
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }




}


