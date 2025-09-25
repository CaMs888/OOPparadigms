package co.edu.poli.actividad3.modelo;

/**
 * Clase abstracta que representa la superclase Sala.
 * Todas las salas específicas deben extender esta clase.
 * El campo numInt funciona como identificador (ID) para CRUD.
 */
public abstract class Sala {
    private Exposicion exposicion;
    private String nombre;
    private String numInt; // Identificador único de la sala (ID)

    /**
     * Constructor de Sala.
     *
     * @param exposicion exposición asociada
     * @param nombre nombre de la sala
     * @param numInt identificador único (ID)
     */
    public Sala(Exposicion exposicion, String nombre, String numInt) {
        this.exposicion = exposicion;
        this.nombre = nombre;
        this.numInt = numInt;
    }

    /** Método de acceso sin parámetro (sobrecarga). */
    public String acceso() {
        return "Acceso general permitido a la sala " + this.nombre + ".";
    }

    /** Método de acceso con parámetro (sobrecarga). */
    public String acceso(String tipoUsuario) {
        return "Acceso de " + tipoUsuario + " permitido a la sala " + this.nombre + ".";
    }

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
		// TODO Auto-generated method stub
		return null;
	}
}
