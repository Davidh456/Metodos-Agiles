package Clases;
// Generated 08-nov-2016 20:43:30 by Hibernate Tools 4.3.1


import java.util.Formatter;
import java.util.HashSet;
import java.util.Set;

/**
 * Inmueble generated by hbm2java
 */
public class Inmueble  implements java.io.Serializable {


     private Integer id;
     private Cliente cliente;
     private double supInmueble;
     private double supTerreno;
     private Boolean ac;
     private Integer antiguedad;
     private Integer bano;
     private String barrio;
     private Integer cp;
     private String calle;
     private String depto;
     private Integer dormitorio;
     private double fondo;
     private double frente;
     private Boolean garage;
     private Boolean gn;
     private Boolean lavadero;
     private Integer localidadIndice;
     private String localidadNombre;
     private Integer numero;
     private String observaciones;
     private Integer orientacion;
     private Boolean patio;
     private Boolean pavimento;
     private String piso;
     private double precio;
     private String provinciaNombre;
     private Integer provinciaIndice;
     private Boolean telefono;
     private Integer tipoInmueble;
     private Set fotos = new HashSet(0);
     private Set reservas = new HashSet(0);

    public Inmueble() {
    }
    
    public Inmueble(Cliente cliente, double supInmueble, double supTerreno, boolean Ac, int Antiguedad, int Bano, String Barrio, int CP, String Calle, String Depto, int Dormitorio, double Fondo, double Frente, boolean Garage, boolean Gn, boolean Lavadero, int LocalidadIndice, String LocalidadNombre, int Numero, String Observaciones, int Orientacion, boolean Patio, boolean Pavimento, String Piso, double Precio, String ProvinciaNombre, int ProvinciaIndice, boolean Telefono, int TipoInmueble) {
       this.cliente = cliente;
       this.supInmueble = supInmueble;
       this.supTerreno = supTerreno;
       this.ac = Ac;
       this.antiguedad = Antiguedad;
       this.bano = Bano;
       this.barrio = Barrio;
       this.cp = CP;
       this.calle = Calle;
       this.depto = Depto;
       this.dormitorio = Dormitorio;
       this.fondo = Fondo;
       this.frente = Frente;
       this.garage = Garage;
       this.gn = Gn;
       this.lavadero = Lavadero;
       this.localidadIndice = LocalidadIndice;
       this.localidadNombre = LocalidadNombre;
       this.numero = Numero;
       this.observaciones = Observaciones;
       this.orientacion = Orientacion;
       this.patio = Patio;
       this.pavimento = Pavimento;
       this.piso = Piso;
       this.precio = Precio;
       this.provinciaNombre = ProvinciaNombre;
       this.provinciaIndice = ProvinciaIndice;
       this.telefono = Telefono;
       this.tipoInmueble = TipoInmueble;
    }
    
    public Inmueble(Cliente cliente, double supInmueble, double supTerreno, Boolean ac, Integer antiguedad, 
                    Integer bano, String barrio, Integer cp, String calle, String depto, Integer dormitorio, 
                    double fondo, double frente, Boolean garage, Boolean gn, Boolean lavadero, Integer localidadIndice, 
                    String localidadNombre, Integer numero, String observaciones, Integer orientacion, Boolean patio, 
                    Boolean pavimento, String piso, double precio, String provinciaNombre, Integer provinciaIndice, 
                    Boolean telefono, Integer tipoInmueble/*, Set fotos*/) {
       this.cliente = cliente;
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
       this.localidadIndice = localidadIndice;
       this.localidadNombre = localidadNombre;
       this.numero = numero;
       this.observaciones = observaciones;
       this.orientacion = orientacion;
       this.patio = patio;
       this.pavimento = pavimento;
       this.piso = piso;
       this.precio = precio;
       this.provinciaNombre = provinciaNombre;
       this.provinciaIndice = provinciaIndice;
       this.telefono = telefono;
       this.tipoInmueble = tipoInmueble;
   //    this.fotos = fotos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getSupInmueble() {
        return this.supInmueble;
    }
    
    public void setSupInmueble(double supInmueble) {
        this.supInmueble = supInmueble;
    }
    public double getSupTerreno() {
        return this.supTerreno;
    }
    
    public void setSupTerreno(double supTerreno) {
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
    public double getFondo() {
        return this.fondo;
    }
    
    public void setFondo(double fondo) {
        this.fondo = fondo;
    }
    public double getFrente() {
        return this.frente;
    }
    
    public void setFrente(double frente) {
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
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
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
    
    public String getIdDescritivo(){
        String IdDescriptivo="";
        IdDescriptivo=IdDescriptivo+ String.valueOf(cp);
        switch (tipoInmueble) {
           case 0:
                IdDescriptivo=IdDescriptivo+"C";
                break;
           case 1: 
                IdDescriptivo=IdDescriptivo+"D";
                break;
           case 2:    
                IdDescriptivo=IdDescriptivo+"G";
                break;
           case 3:     
                IdDescriptivo=IdDescriptivo+"L";
                break;
           case 4:     
                IdDescriptivo=IdDescriptivo+"Q";
                break;
           case 5:     
                IdDescriptivo=IdDescriptivo+"T";
                break;
       }
       Formatter fmt = new Formatter();
       fmt.format("%08d",id);
       IdDescriptivo=IdDescriptivo+fmt;
        return IdDescriptivo;    
    }
 /*   public Set getFotos() {
        return this.fotos;
    }
    
    public void setFotos(Set fotos) {
        this.fotos = fotos;
    }
*/



}


