package co.edu.poli.actividad3.modelo;

import java.io.Serializable;

public class Escultura implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private double tamaño;
    private String color;
    private String material;
    private String peso;
    private String tecnica;
    private String serial;
    private Autor autor;
    private String añoCreacion;

    public Escultura() {
    }

    public Escultura(String nombre, double tamaño, String color, String material,
                     String peso, String tecnica, String serial, String añoCreacion) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.color = color;
        this.material = material;
        this.peso = peso;
        this.tecnica = tecnica;
        this.serial = serial;
        this.añoCreacion = añoCreacion;
    }

    public int calcularEdadActual() {
        try {
            int añoActual = 2024;
            int añoCreacionInt = Integer.parseInt(this.añoCreacion);
            return añoActual - añoCreacionInt;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getTamaño() { return tamaño; }
    public void setTamaño(double tamaño) { this.tamaño = tamaño; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public String getPeso() { return peso; }
    public void setPeso(String peso) { this.peso = peso; }

    public String getTecnica() { return tecnica; }
    public void setTecnica(String tecnica) { this.tecnica = tecnica; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }

    public String getAñoCreacion() { return añoCreacion; }
    public void setAñoCreacion(String añoCreacion) { this.añoCreacion = añoCreacion; }

    @Override
    public String toString() {
        return "Escultura: " + nombre + " - Tamaño: " + tamaño + "m - Color: " + color;
    }
}