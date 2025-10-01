// ====================================================================================
// CLASE: Pais
// ====================================================================================

package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa un país.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024
 */
public class Pais {
    
    /** Código del país */
    private String cod_pais;
    
    /** Nombre del país */
    private String nombre;

    /**
     * Constructor por defecto
     */
    public Pais() {
    }

    /**
     * Constructor completo
     * @param cod_pais Código del país
     * @param nombre Nombre del país
     */
    public Pais(String cod_pais, String nombre) {
        this.cod_pais = cod_pais;
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getCod_pais() { return cod_pais; }
    public void setCod_pais(String cod_pais) { this.cod_pais = cod_pais; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return "País: " + nombre + " (" + cod_pais + ")";
    }
}
