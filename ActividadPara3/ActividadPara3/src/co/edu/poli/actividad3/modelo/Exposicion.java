// ====================================================================================
// CLASE: Exposicion
// ====================================================================================

package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa una exposición en el museo.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024
 */
public class Exposicion {
    
    /** Nombre de la exposición */
    private String nombre;
    
    /** Autor de la exposición */
    private String autor;
    
    /** Tema de la exposición */
    private String tema;
    
    /** Idioma de la exposición */
    private String idioma;
    
    /** Tipo de exposición */
    private String tipo;
    
    /** Serial único de la exposición */
    private String serial;
    
    /** Indica si es extranjero */
    private boolean esExtranjero;
    
    /** Objeto asociado */
    private Objeto objeto;
    
    /** Pintura asociada */
    private Pintura pintura;
    
    /** Escultura asociada */
    private Escultura escultura;

    /**
     * Constructor por defecto
     */
    public Exposicion() {
    }

    /**
     * Constructor completo
     * @param nombre Nombre de la exposición
     * @param autor Autor de la exposición
     * @param tema Tema de la exposición
     * @param idioma Idioma de la exposición
     * @param tipo Tipo de exposición
     * @param serial Serial único
     * @param esExtranjero Indica si es extranjero
     */
    public Exposicion(String nombre, String autor, String tema, String idioma, String tipo, String serial, boolean esExtranjero) {
        this.nombre = nombre;
        this.autor = autor;
        this.tema = tema;
        this.idioma = idioma;
        this.tipo = tipo;
        this.serial = serial;
        this.esExtranjero = esExtranjero;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }

    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public boolean isEsExtranjero() { return esExtranjero; }
    public void setEsExtranjero(boolean esExtranjero) { this.esExtranjero = esExtranjero; }

    public Objeto getObjeto() { return objeto; }
    public void setObjeto(Objeto objeto) { this.objeto = objeto; }

    public Pintura getPintura() { return pintura; }
    public void setPintura(Pintura pintura) { this.pintura = pintura; }

    public Escultura getEscultura() { return escultura; }
    public void setEscultura(Escultura escultura) { this.escultura = escultura; }

    @Override
    public String toString() {
        return "Exposicion: " + nombre + " - Tema: " + tema + " (Serial: " + serial + ")";
    }
}