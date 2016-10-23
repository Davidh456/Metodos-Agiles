package Clases;

public class Cliente {
    String nombre;
    String apellido;
    int tipoDNI; //0 = DNI, 1 = Pasaporte, 2 = LC, 3 = LE.
    Integer numDocumento;
    String localidad;
    String provincia;
    String correo;
    String domicilio;
    Integer alturaCalle;
    String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int tipoDNI, Integer numDocumento, 
            String localidad, String provincia, String correo, String domicilio, 
            Integer alturaCalle, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDNI = tipoDNI;
        this.numDocumento = numDocumento;
        this.localidad = localidad;
        this.provincia = provincia;
        this.correo = correo;
        this.domicilio = domicilio;
        this.alturaCalle = alturaCalle;
        this.telefono = telefono;
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

    public int getTipoDNI() {
        return tipoDNI;
    }

    public void setTipoDNI(int tipoDNI) {
        this.tipoDNI = tipoDNI;
    }

    public Integer getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(Integer numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getAlturaCalle() {
        return alturaCalle;
    }

    public void setAlturaCalle(Integer alturaCalle) {
        this.alturaCalle = alturaCalle;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

