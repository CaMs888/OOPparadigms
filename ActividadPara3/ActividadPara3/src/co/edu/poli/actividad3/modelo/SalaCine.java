// ==================================================================================== 
// PAQUETE: co.edu.poli.actividad3.servicios
// ====================================================================================

// ====================================================================================
// CLASE: SalaCine (Extiende Sala)
// ====================================================================================

package co.edu.poli.actividad3.modelo;


/**
 * Clase que representa una sala de cine del museo.
 * Extiende la clase abstracta Sala.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024
 */
public class SalaCine extends Sala {
    
    /** Tipo de pantalla */
    private String tipoPantalla;
    
    /** Formato de proyección */
    private String formatoProyeccion;
    
    /** Indica si tiene películas para adultos */
    private boolean tieneButacasReclinables;
    
    /** Duración promedio de proyección */
    private int duracionPromedioProyeccion;

    /**
     * Constructor por defecto
     */
    public SalaCine() {
        super();
    }

    /**
     * Constructor completo
     * @param exposicion Exposición asociada
     * @param nombre Nombre de la sala
     * @param num_int Número interno
     * @param tipoPantalla Tipo de pantalla
     * @param formatoProyeccion Formato de proyección
     * @param tieneButacasReclinables Si tiene películas para adultos
     * @param duracionPromedioProyeccion Duración promedio
     */
    public SalaCine(Exposicion exposicion, String nombre, String num_int,
                    String tipoPantalla, String formatoProyeccion, 
                    boolean tieneButacasReclinables, int duracionPromedioProyeccion) {
        super(exposicion, nombre, num_int);
        this.tipoPantalla = tipoPantalla;
        this.formatoProyeccion = formatoProyeccion;
        this.tieneButacasReclinables = tieneButacasReclinables;
        this.duracionPromedioProyeccion = duracionPromedioProyeccion;
    }

    // Getters y Setters
    public String getTipoPantalla() { return tipoPantalla; }
    public void setTipoPantalla(String tipoPantalla) { this.tipoPantalla = tipoPantalla; }

    public String getFormatoProyeccion() { return formatoProyeccion; }
    public void setFormatoProyeccion(String formatoProyeccion) { this.formatoProyeccion = formatoProyeccion; }

    public boolean isTienePeliculasAdultos() { return tieneButacasReclinables; }
    public void setTienePeliculasAdultos(boolean tienePeliculasAdultos) { this.tieneButacasReclinables = tienePeliculasAdultos; }

    public int getDuracionPromedioProyeccion() { return duracionPromedioProyeccion; }
    public void setDuracionPromedioProyeccion(int duracionPromedioProyeccion) { this.duracionPromedioProyeccion = duracionPromedioProyeccion; }

    @Override
    public String toString() {
        return "SalaCine: " + super.toString() + " - Pantalla: " + tipoPantalla + 
               " - Duración: " + duracionPromedioProyeccion + " min";
    }
}