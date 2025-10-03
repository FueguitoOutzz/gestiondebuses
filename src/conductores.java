public class conductores {
    private String nombre;
    private String licencia;
    private autobus busAsignado;

/*constructors, getters, and setters*/

public conductores(String nombre, String licencia, autobus busAsignado) {
    this.nombre = nombre;
    this.licencia = licencia;
    this.busAsignado = busAsignado;
}

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
    if (nombre == null || nombre.isEmpty()) {
        throw new IllegalArgumentException("El nombre no puede estar vacío");
    }
}
public String getLicencia() {
    return this.licencia;
}
public void setLicencia(String licencia) {
    this.licencia = licencia;
    if (licencia.equals("Clase A1") || licencia.equals("Clase B") || licencia.equals("Clase A1") || licencia.equals("Clase A3")) {
        // Licencia válida
    } else {    
        throw new IllegalArgumentException("Licencia inválida");
    }
}
public autobus getBusAsignado() {
    return busAsignado;
}
public void setBusAsignado(autobus busAsignado) {
    this.busAsignado = busAsignado;
}
}