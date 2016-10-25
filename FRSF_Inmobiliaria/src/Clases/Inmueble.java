
package Clases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Inmueble implements Serializable {
    
    private String calle;
    private int numero;
    private String piso;
    private String departamento;   
                                //Los atributos Localidad y Provincia se usan como int
    private int localidad;      //para facilitar el get y set de combobox en las diferentes interfaces sin
    private int provincia;      //tener que estar accediendo a la bd para ver textos equivalentes a posiciones
    private String barrio;
    private boolean propHoriz;
    private float supInmueble;
    private int antiguedad;
    private int dormitorios;
    private int banios;
    private boolean cochera;
    private boolean patio;
    private boolean piscina;
    private boolean aguaCorriente;
    private boolean cloacas;
    private boolean gasNatural;
    private boolean telefono;
    private boolean lavadero;
    private boolean pavimento;
    private String comentarios;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getLocalidad() {
        return localidad;
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }

    public int getProvincia() {
        return provincia;
    }

    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public boolean isPropHoriz() {
        return propHoriz;
    }

    public void setPropHoriz(boolean propHoriz) {
        this.propHoriz = propHoriz;
    }

    public float getSupInmueble() {
        return supInmueble;
    }

    public void setSupInmueble(float supInmueble) {
        this.supInmueble = supInmueble;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public boolean isCochera() {
        return cochera;
    }

    public void setCochera(boolean cochera) {
        this.cochera = cochera;
    }

    public boolean isPatio() {
        return patio;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isAguaCorriente() {
        return aguaCorriente;
    }

    public void setAguaCorriente(boolean aguaCorriente) {
        this.aguaCorriente = aguaCorriente;
    }

    public boolean isCloacas() {
        return cloacas;
    }

    public void setCloacas(boolean cloacas) {
        this.cloacas = cloacas;
    }

    public boolean isGasNatural() {
        return gasNatural;
    }

    public void setGasNatural(boolean gasNatural) {
        this.gasNatural = gasNatural;
    }

    public boolean isTelefono() {
        return telefono;
    }

    public void setTelefono(boolean telefono) {
        this.telefono = telefono;
    }

    public boolean isLavadero() {
        return lavadero;
    }

    public void setLavadero(boolean lavadero) {
        this.lavadero = lavadero;
    }

    public boolean isPavimento() {
        return pavimento;
    }

    public void setPavimento(boolean pavimento) {
        this.pavimento = pavimento;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Inmueble)) {
            return false;
        }
        Inmueble other = (Inmueble) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clases.Inmueble[ id=" + id + " ]";
    }
    
    public Inmueble(){
    }
}
