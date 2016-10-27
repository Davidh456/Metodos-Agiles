
package Clases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Inmueble implements Serializable {
    
    final private float supInmueble;
    final private float supTerreno;
    final private boolean Ac;
    final private int Antiguedad;
    final private int Bano;
    final private String Barrio;
    final private int CP;
    final private String Calle;
    final private String Depto;
    final private int Dormitorio;
    final private float Fondo;
    final private float Frente;
    final private boolean Garage;
    final private boolean Gn;
    final private boolean Lavadero;
    final private int ListaFotos; // TODO ver como adjuntar fotos
    final private int LocalidadIndice;
    final private String LocalidadNombre;
    final private int Numero;
    final private String Observaciones;
    final private int Orientacion;
    final private String OtraLoc;
    final private boolean Patio;
    final private boolean Pavimento;
    final private String Piso;
    final private float Precio;
    final private int Propietario; //TODO ver relacion en base de datos con hibernate
    final private String ProvinciaNombre;
    final private int ProvinciaIndice;
    final private boolean Telefono;
    final private int TipoInmueble;

    public Inmueble(float supInmueble, float supTerreno, boolean Ac, int Antiguedad, int Bano, String Barrio, int CP, String Calle, String Depto, int Dormitorio, float Fondo, float Frente, boolean Garage, boolean Gn, boolean Lavadero, int ListaFotos, int LocalidadIndice, String LocalidadNombre, int Numero, String Observaciones, int Orientacion, String OtraLoc, boolean Patio, boolean Pavimento, String Piso, float Precio, int Propietario, String ProvinciaNombre, int ProvinciaIndice, boolean Telefono, int TipoInmueble) {
        this.supInmueble = supInmueble;
        this.supTerreno = supTerreno;
        this.Ac = Ac;
        this.Antiguedad = Antiguedad;
        this.Bano = Bano;
        this.Barrio = Barrio;
        this.CP = CP;
        this.Calle = Calle;
        this.Depto = Depto;
        this.Dormitorio = Dormitorio;
        this.Fondo = Fondo;
        this.Frente = Frente;
        this.Garage = Garage;
        this.Gn = Gn;
        this.Lavadero = Lavadero;
        this.ListaFotos = ListaFotos;
        this.LocalidadIndice = LocalidadIndice;
        this.LocalidadNombre = LocalidadNombre;
        this.Numero = Numero;
        this.Observaciones = Observaciones;
        this.Orientacion = Orientacion;
        this.OtraLoc = OtraLoc;
        this.Patio = Patio;
        this.Pavimento = Pavimento;
        this.Piso = Piso;
        this.Precio = Precio;
        this.Propietario = Propietario;
        this.ProvinciaNombre = ProvinciaNombre;
        this.ProvinciaIndice = ProvinciaIndice;
        this.Telefono = Telefono;
        this.TipoInmueble = TipoInmueble;
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
    
    public void Inmueble(){
    }
}
