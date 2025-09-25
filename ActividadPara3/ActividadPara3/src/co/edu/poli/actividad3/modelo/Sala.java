package co.edu.poli.actividad3.modelo;

public abstract class Sala {

    private Exposicion exposicion;
    private String nombre;
    private String numInt;

    public Sala(Exposicion exposicion, String nombre, String numInt) {
        this.exposicion = exposicion;
        this.nombre = nombre;
        this.numInt = numInt;
    }

    public String acceso() {
        return "Acceso general permitido a la sala " + this.nombre + ".";
    }

    public String acceso(String tipoUsuario) {
        return "Acceso de " + tipoUsuario + " permitido a la sala " + this.nombre + ".";
    }

    public final String infoBasica() {
        return "Sala: " + nombre + ", Número interno: " + numInt;
    }

    public Sala getSalaEspecial() {
        return this;
    }

    public Exposicion getExposicion() { return exposicion; }
    public void setExposicion(Exposicion exposicion) { this.exposicion = exposicion; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNumInt() { return numInt; }
    public void setNumInt(String numInt) { this.numInt = numInt; }

    @Override
    public String toString() {
        return "Sala{" +
                "nombre='" + nombre + '\'' +
                ", numInt='" + numInt + '\'' +
                ", exposicion=" + (exposicion != null ? exposicion.getNombre() : "null") +
                '}';
    }
}


