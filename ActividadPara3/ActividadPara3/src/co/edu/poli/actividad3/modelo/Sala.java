package co.edu.poli.actividad3.modelo;

public class Sala {
    private Exposicion exposicion;
    private String nombre;
    private String numInt;

    public Sala(Exposicion exposicion, String nombre, String numInt) {
        this.exposicion = exposicion;
        this.nombre = nombre;
        this.numInt = numInt;
    }

    // Overloaded method without parameters
    public String acceso() {
        return "Acceso general permitido a la sala " + this.nombre + ".";
    }

    // Overloaded method with a String parameter
    public String acceso(String tipoUsuario) {
        return "Acceso de " + tipoUsuario + " permitido a la sala " + this.nombre + ".";
    }

    public Exposicion getExposicion() { return exposicion; }
    public void setExposicion(Exposicion exposicion) { this.exposicion = exposicion; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNumInt() { return numInt; }
    public void setNumInt(String numInt) { this.numInt = numInt; }
}