// ====================================================================================
// CLASE: Pintura
// ====================================================================================

package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa una pintura del museo.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024
 */
public class Pintura {
    
    /** Título de la pintura */
    private String titulo;
    
    /** Técnica utilizada */
    private String tecnica;
    
    /** Año de producción */
    private int anio_produccion;
    
    /** Tipo de pintura */
    private String tipo;
    
    /** Autor de la pintura */
    private Autor autor;
    
    /** Serial de la pintura */
    private String serial;
    
    /** Año de creación */
    private String anioCreacion;

    /**
     * Constructor por defecto
     */
    public Pintura() {
    }

    /**
     * Constructor completo
     * @param titulo Título de la pintura
     * @param tecnica Técnica utilizada
     * @param anio_produccion Año de producción
     * @param tipo Tipo de pintura
     * @param serial Serial único
     * @param anioCreacion Año de creación
     */
    public Pintura(String titulo, String tecnica, int anio_produccion, String tipo, String serial, String anioCreacion) {
        this.titulo = titulo;
        this.tecnica = tecnica;
        this.anio_produccion = anio_produccion;
        this.tipo = tipo;
        this.serial = serial;
        this.anioCreacion = anioCreacion;
    }

    /**
     * Calcula la edad actual de la pintura
     * @return Edad en años
     */
    public int calcularEdadActual() {
        int anioActual = 2024;
        return anioActual - anio_produccion;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getTecnica() { return tecnica; }
    public void setTecnica(String tecnica) { this.tecnica = tecnica; }

    public int getAño_produccion() { return anio_produccion; }
    public void setAño_produccion(int año_produccion) { this.anio_produccion = año_produccion; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getAñoCreacion() { return anioCreacion; }
    public void setAñoCreacion(String añoCreacion) { this.anioCreacion = añoCreacion; }

    @Override
    public String toString() {
        return "Pintura: " + titulo + " - Técnica: " + tecnica + " (" + anio_produccion + ")";
    }
}