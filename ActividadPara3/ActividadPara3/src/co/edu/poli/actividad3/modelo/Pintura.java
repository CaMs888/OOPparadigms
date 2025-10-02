package co.edu.poli.actividad3.modelo;

import java.io.Serializable;

public class Pintura implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String titulo;
    private String tecnica;
    private int anio_produccion;
    private String tipo;
    private Autor autor;
    private String serial;
    private String anioCreacion;

    public Pintura() {
    }

    public Pintura(String titulo, String tecnica, int anio_produccion, String tipo, String serial, String anioCreacion) {
        this.titulo = titulo;
        this.tecnica = tecnica;
        this.anio_produccion = anio_produccion;
        this.tipo = tipo;
        this.serial = serial;
        this.anioCreacion = anioCreacion;
    }

    public int calcularEdadActual() {
        int anioActual = 2024;
        return anioActual - anio_produccion;
    }

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
        return "Pintura: " + titulo + " - Tecnica: " + tecnica + " (" + anio_produccion + ")";
    }
}