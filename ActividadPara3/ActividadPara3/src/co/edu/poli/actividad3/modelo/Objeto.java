// ====================================================================================
// CLASE: Objeto
// ====================================================================================

package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa un objeto genérico del museo.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024
 */
public class Objeto {
    
    /** Nombre del objeto */
    private String nombre;
    
    /** Cultura del objeto */
    private String cultura;
    
    /** Fecha del objeto */
    private String fecha;
    
    /** Descripción del objeto */
    private String descripcion;
    
    /** Material del objeto */
    private String material;
    
    /** Serial del objeto */
    private String serial;
    
    /** Año de creación */
    private String añoCreacion;

    /**
     * Constructor por defecto
     */
    public Objeto() {
    }

    /**
     * Constructor completo
     * @param nombre Nombre del objeto
     * @param cultura Cultura del objeto
     * @param fecha Fecha del objeto
     * @param descripcion Descripción del objeto
     * @param material Material del objeto
     * @param serial Serial único
     * @param añoCreacion Año de creación
     */
    public Objeto(String nombre, String cultura, String fecha, String descripcion, String material, String serial, String añoCreacion) {
        this.nombre = nombre;
        this.cultura = cultura;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.material = material;
        this.serial = serial;
        this.añoCreacion = añoCreacion;
    }

    /**
     * Calcula la edad actual del objeto
     * @return Edad en años
     */
    public int calcularEdadActual() {
        try {
            int añoActual = 2024;
            int añoCreacionInt = Integer.parseInt(this.añoCreacion);
            return añoActual - añoCreacionInt;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // Getters y Setters
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