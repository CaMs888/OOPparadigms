package co.edu.poli.actividad3.modelo;

import java.io.Serializable;

public class Exposicion implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private String autor;
    private String tema;
    private String idioma;
    private String tipo;
    private String serial;
    private boolean esExtranjero;
    private Objeto objeto;
    private Pintura pintura;
    private Escultura escultura;

    public Exposicion() {
    }

    public Exposicion(String nombre, String autor, String tema, String idioma, String tipo, String serial, boolean esExtranjero) {
        this.nombre = nombre;
        this.autor = autor;
        this.tema = tema;
        this.idioma = idioma;
        this.tipo = tipo;
        this.serial = serial;
        this.esExtranjero = esExtranjero;
    }

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