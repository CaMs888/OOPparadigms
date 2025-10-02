package co.edu.poli.actividad3.modelo;

import java.io.Serializable;

public class Objeto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private String cultura;
    private String fecha;
    private String descripcion;
    private String material;
    private String serial;
    private String añoCreacion;

    public Objeto() {
    }

    public Objeto(String nombre, String cultura, String fecha, String descripcion, String material, String serial, String añoCreacion) {
        this.nombre = nombre;
        this.cultura = cultura;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.material = material;
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

    public String getCultura() { return cultura; }
    public void setCultura(String cultura) { this.cultura = cultura; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getAñoCreacion() { return añoCreacion; }
    public void setAñoCreacion(String añoCreacion) { this.añoCreacion = añoCreacion; }

    @Override
    public String toString() {
        return "Objeto: " + nombre + " (" + cultura + ") - Serial: " + serial;
    }
}