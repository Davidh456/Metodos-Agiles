package Clases;
// Generated 03/11/2016 05:23:01 by Hibernate Tools 4.3.1



/**
 * Inmueble generated by hbm2java
 */
public class Inmueble  implements java.io.Serializable {


     private Integer id;
     private Propietario propietario;
     private Float supInmueble;
     private Float supTerreno;
     private Boolean ac;
     private Integer antiguedad;
     private Integer bano;
     private String barrio;
     private Integer cp;
     private String calle;
     private String depto;
     private Integer dormitorio;
     private Float fondo;
     private Float frente;
     private Boolean garage;
     private Boolean gn;
     private Boolean lavadero;
     private Integer listaFotos;
     private Integer localidadIndice;
     private String localidadNombre;
     private Integer numero;
     private String observaciones;
     private Integer orientacion;
     private String otraLoc;
     private Boolean patio;
     private Boolean pavimento;
     private String piso;
     private Float precio;
     private String provinciaNombre;
     private Integer provinciaIndice;
     private Boolean telefono;
     private Integer tipoInmueble;

    public Inmueble() {
    }

    public Inmueble(Propietario propietario, Float supInmueble, Float supTerreno, Boolean ac, Integer antiguedad, Integer bano, String barrio, Integer cp, String calle, String depto, Integer dormitorio, Float fondo, Float frente, Boolean garage, Boolean gn, Boolean lavadero, Integer listaFotos, Integer localidadIndice, String localidadNombre, Integer numero, String observaciones, Integer orientacion, String otraLoc, Boolean patio, Boolean pavimento, String piso, Float precio, String provinciaNombre, Integer provinciaIndice, Boolean telefono, Integer tipoInmueble) {
       this.propietario = propietario;
       this.supInmueble = supInmueble;
       this.supTerreno = supTerreno;
       this.ac = ac;
       this.antiguedad = antiguedad;
       this.bano = bano;
       this.barrio = barrio;
       this.cp = cp;
       this.calle = calle;
       this.depto = depto;
       this.dormitorio = dormitorio;
       this.fondo = fondo;
       this.frente = frente;
       this.garage = garage;
       this.gn = gn;
       this.lavadero = lavadero;
       this.listaFotos = listaFotos;
       this.localidadIndice = localidadIndice;
       this.localidadNombre = localidadNombre;
       this.numero = numero;
       this.observaciones = observaciones;
       this.orientacion = orientacion;
       this.otraLoc = otraLoc;
       this.patio = patio;
       this.pavimento = pavimento;
       this.piso = piso;
       this.precio = precio;
       this.provinciaNombre = provinciaNombre;
       this.provinciaIndice = provinciaIndice;
       this.telefono = telefono;
       this.tipoInmueble = tipoInmueble;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Propietario getPropietario() {
        return this.propietario;
    }
    
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    public Float getSupInmueble() {
        return this.supInmueble;
    }
    
    public void setSupInmueble(Float supInmueble) {
        this.supInmueble = supInmueble;
    }
    public Float getSupTerreno() {
        return this.supTerreno;
    }
    
    public void setSupTerreno(Float supTerreno) {
        this.supTerreno = supTerreno;
    }
    public Boolean getAc() {
        return this.ac;
    }
    
    public void setAc(Boolean ac) {
        this.ac = ac;
    }
    public Integer getAntiguedad() {
        return this.antiguedad;
    }
    
    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }
    public Integer getBano() {
        return this.bano;
    }
    
    public void setBano(Integer bano) {
        this.bano = bano;
    }
    public String getBarrio() {
        return this.barrio;
    }
    
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    public Integer getCp() {
        return this.cp;
    }
    
    public void setCp(Integer cp) {
        this.cp = cp;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getDepto() {
        return this.depto;
    }
    
    public void setDepto(String depto) {
        this.depto = depto;
    }
    public Integer getDormitorio() {
        return this.dormitorio;
    }
    
    public void setDormitorio(Integer dormitorio) {
        this.dormitorio = dormitorio;
    }
    public Float getFondo() {
        return this.fondo;
    }
    
    public void setFondo(Float fondo) {
        this.fondo = fondo;
    }
    public Float getFrente() {
        return this.frente;
    }
    
    public void setFrente(Float frente) {
        this.frente = frente;
    }
    public Boolean getGarage() {
        return this.garage;
    }
    
    public void setGarage(Boolean garage) {
        this.garage = garage;
    }
    public Boolean getGn() {
        return this.gn;
    }
    
    public void setGn(Boolean gn) {
        this.gn = gn;
    }
    public Boolean getLavadero() {
        return this.lavadero;
    }
    
    public void setLavadero(Boolean lavadero) {
        this.lavadero = lavadero;
    }
    public Integer getListaFotos() {
        return this.listaFotos;
    }
    
    public void setListaFotos(Integer listaFotos) {
        this.listaFotos = listaFotos;
    }
    public Integer getLocalidadIndice() {
        return this.localidadIndice;
    }
    
    public void setLocalidadIndice(Integer localidadIndice) {
        this.localidadIndice = localidadIndice;
    }
    public String getLocalidadNombre() {
        return this.localidadNombre;
    }
    
    public void setLocalidadNombre(String localidadNombre) {
        this.localidadNombre = localidadNombre;
    }
    public Integer getNumero() {
        return this.numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Integer getOrientacion() {
        return this.orientacion;
    }
    
    public void setOrientacion(Integer orientacion) {
        this.orientacion = orientacion;
    }
    public String getOtraLoc() {
        return this.otraLoc;
    }
    
    public void setOtraLoc(String otraLoc) {
        this.otraLoc = otraLoc;
    }
    public Boolean getPatio() {
        return this.patio;
    }
    
    public void setPatio(Boolean patio) {
        this.patio = patio;
    }
    public Boolean getPavimento() {
        return this.pavimento;
    }
    
    public void setPavimento(Boolean pavimento) {
        this.pavimento = pavimento;
    }
    public String getPiso() {
        return this.piso;
    }
    
    public void setPiso(String piso) {
        this.piso = piso;
    }
    public Float getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    public String getProvinciaNombre() {
        return this.provinciaNombre;
    }
    
    public void setProvinciaNombre(String provinciaNombre) {
        this.provinciaNombre = provinciaNombre;
    }
    public Integer getProvinciaIndice() {
        return this.provinciaIndice;
    }
    
    public void setProvinciaIndice(Integer provinciaIndice) {
        this.provinciaIndice = provinciaIndice;
    }
    public Boolean getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Boolean telefono) {
        this.telefono = telefono;
    }
    public Integer getTipoInmueble() {
        return this.tipoInmueble;
    }
    
    public void setTipoInmueble(Integer tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }




}


