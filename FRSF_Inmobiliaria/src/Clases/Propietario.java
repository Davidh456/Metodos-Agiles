/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gonzo
 */
@Entity
@Table(name = "propietario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Propietario.findAll", query = "SELECT p FROM Propietario p")
    , @NamedQuery(name = "Propietario.findByIdPropietario", query = "SELECT p FROM Propietario p WHERE p.idPropietario = :idPropietario")
    , @NamedQuery(name = "Propietario.findByNombre", query = "SELECT p FROM Propietario p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Propietario.findByApellido", query = "SELECT p FROM Propietario p WHERE p.apellido = :apellido")
    , @NamedQuery(name = "Propietario.findByTipoDoc", query = "SELECT p FROM Propietario p WHERE p.tipoDoc = :tipoDoc")
    , @NamedQuery(name = "Propietario.findByNumeroDoc", query = "SELECT p FROM Propietario p WHERE p.numeroDoc = :numeroDoc")
    , @NamedQuery(name = "Propietario.findByProvincia", query = "SELECT p FROM Propietario p WHERE p.provincia = :provincia")
    , @NamedQuery(name = "Propietario.findByLocalidad", query = "SELECT p FROM Propietario p WHERE p.localidad = :localidad")
    , @NamedQuery(name = "Propietario.findByDomicilio", query = "SELECT p FROM Propietario p WHERE p.domicilio = :domicilio")
    , @NamedQuery(name = "Propietario.findByAlturaDomicilio", query = "SELECT p FROM Propietario p WHERE p.alturaDomicilio = :alturaDomicilio")
    , @NamedQuery(name = "Propietario.findByTelefono", query = "SELECT p FROM Propietario p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Propietario.findByCorreo", query = "SELECT p FROM Propietario p WHERE p.correo = :correo")})
public class Propietario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idPropietario")
    private Integer idPropietario;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "tipoDoc")
    private int tipoDoc;
    @Basic(optional = false)
    @Column(name = "numeroDoc")
    private int numeroDoc;
    @Basic(optional = false)
    @Column(name = "provincia")
    private String provincia;
    @Basic(optional = false)
    @Column(name = "localidad")
    private String localidad;
    @Basic(optional = false)
    @Column(name = "domicilio")
    private String domicilio;
    @Basic(optional = false)
    @Column(name = "alturaDomicilio")
    private int alturaDomicilio;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;

    public Propietario() {
    }

    public Propietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public Propietario(Integer idPropietario, String nombre, String apellido, int tipoDoc, int numeroDoc, String provincia, String localidad, String domicilio, int alturaDomicilio, String telefono, String correo) {
        this.idPropietario = idPropietario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
        this.provincia = provincia;
        this.localidad = localidad;
        this.domicilio = domicilio;
        this.alturaDomicilio = alturaDomicilio;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(int tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(int numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getAlturaDomicilio() {
        return alturaDomicilio;
    }

    public void setAlturaDomicilio(int alturaDomicilio) {
        this.alturaDomicilio = alturaDomicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPropietario != null ? idPropietario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propietario)) {
            return false;
        }
        Propietario other = (Propietario) object;
        if ((this.idPropietario == null && other.idPropietario != null) || (this.idPropietario != null && !this.idPropietario.equals(other.idPropietario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clases.Propietario[ idPropietario=" + idPropietario + " ]";
    }

    
}
