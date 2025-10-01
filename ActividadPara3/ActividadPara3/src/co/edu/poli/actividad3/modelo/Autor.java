// ====================================================================================
// CLASE: Autor
// ====================================================================================

package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa un autor de obras del museo.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024
 */
public class Autor {
    
    /** Fecha de nacimiento del autor */
    private String fecha_nac;
    
    /** Nombre del autor */
    private String nombre;
    
    /** Número de identificación */
    private String num_ID;
    
    /** País del autor */
    private Pais pais;

    /**
     * Constructor por defecto
     */
    public Autor() {
    }

    /**
     * Constructor completo
     * @param fecha_nac Fecha de nacimiento
     * @param nombre Nombre del autor
     * @param num_ID Número de identificación
     * @param pais País del autor
     */
    public Autor(String fecha_nac, String nombre, String num_ID, Pais pais) {
        this.fecha_nac = fecha_nac;
        this.nombre = nombre;
        this.num_ID = num_ID;
        this.pais = pais;
    }

    // Getters y Setters
    public String getFecha_nac() { return fecha_nac; }
    public void setFecha_nac(String fecha_nac) { this.fecha_nac = fecha_nac; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNum_ID() { return num_ID; }
    public void setNum_ID(String num_ID) { this.num_ID = num_ID; }

    public Pais getPais() { return pais; }
    public void setPais(Pais pais) { this.pais = pais; }

    @Override
    public String toString() {
        return "Autor: " + nombre + " (ID: " + num_ID + ") - Nacimiento: " + fecha_nac;
    }
}