package co.edu.poli.actividad3.modelo;

public abstract class Sala {
    private Exposicion exposicion;
    private String nombre;
    private String numInt; // Identificador único de la sala (ID)

    public Sala(Exposicion exposicion, String nombre, String numInt) {
        this.exposicion = exposicion;
        this.nombre = nombre;
        this.numInt = numInt;
    }

    // Métodos abstractos (sobrecarga)
    protected abstract String acceso();
    protected abstract String acceso(String tipoUsuario);

    public Exposicion getExposicion() { return exposicion; }
    public void setExposicion(Exposicion exposicion) { this.exposicion = exposicion; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNumInt() { return numInt; }
    public void setNumInt(String numInt) { this.numInt = numInt; }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{numInt='" + numInt + "', nombre='" + nombre + "'}";
    }

    public char[] infoBasica() {
        // Puedes definirlo como abstracto también si cada sala debe tener su propia info
        return null;
    }
}
