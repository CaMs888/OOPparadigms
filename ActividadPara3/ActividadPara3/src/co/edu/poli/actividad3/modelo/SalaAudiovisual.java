// ====================================================================================
// CLASE: SalaAudiovisual (Extiende SalaCine)
// ====================================================================================

package co.edu.poli.actividad3.modelo;


/**
 * Clase que representa una sala audiovisual del museo.
 * Extiende SalaCine.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024
 */
public class SalaAudiovisual extends SalaCine {
    
    /** Indica si tiene proyector */
    private boolean tieneProyector;
    
    /** Indica si tiene sistema de sonido */
    private boolean tieneSistemaSonido;
    
    /** Capacidad de butacas */
    private int capacidadButacas;
    
    /** Tipo de contenido */
    private String tipoContenido;

    /**
     * Constructor por defecto
     */
    public SalaAudiovisual() {
        super();
    }

    /**
     * Constructor completo
     * @param exposicion Exposición asociada
     * @param nombre Nombre de la sala
     * @param num_int Número interno
     * @param tipoPantalla Tipo de pantalla
     * @param formatoProyeccion Formato de proyección
     * @param tienePeliculasAdultos Si tiene películas para adultos
     * @param duracionPromedioProyeccion Duración promedio
     * @param tieneProyector Si tiene proyector
     * @param tieneSistemaSonido Si tiene sistema de sonido
     * @param capacidadButacas Capacidad de butacas
     * @param tipoContenido Tipo de contenido
     */
    public SalaAudiovisual(Exposicion exposicion, String nombre, String num_int, String tipoPantalla, String formatoProyeccion, boolean tienePeliculasAdultos, int duracionPromedioProyeccion, boolean tieneProyector, boolean tieneSistemaSonido, int capacidadButacas, String tipoContenido) {
        super(exposicion, nombre, num_int, tipoPantalla, formatoProyeccion, tienePeliculasAdultos, duracionPromedioProyeccion);
        this.tieneProyector = tieneProyector;
        this.tieneSistemaSonido = tieneSistemaSonido;
        this.capacidadButacas = capacidadButacas;
        this.tipoContenido = tipoContenido;
    }

    // Getters y Setters
    public boolean isTieneProyector() { return tieneProyector; }
    public void setTieneProyector(boolean tieneProyector) { this.tieneProyector = tieneProyector; }

    public boolean isTieneSistemaSonido() { return tieneSistemaSonido; }
    public void setTieneSistemaSonido(boolean tieneSistemaSonido) { this.tieneSistemaSonido = tieneSistemaSonido; }

    public int getCapacidadButacas() { return capacidadButacas; }
    public void setCapacidadButacas(int capacidadButacas) { this.capacidadButacas = capacidadButacas; }

    public String getTipoContenido() { return tipoContenido; }
    public void setTipoContenido(String tipoContenido) { this.tipoContenido = tipoContenido; }

    @Override
    public String toString() {
        return "SalaAudiovisual: " + super.toString() + " - Capacidad: " + capacidadButacas + " butacas - Contenido: " + tipoContenido;
    }
}