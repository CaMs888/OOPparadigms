// ====================================================================================
// CLASE: Escultura
// ====================================================================================

package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa una escultura del museo.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024
 */
public class Escultura {
    
    /** Nombre de la escultura */
    private String nombre;
    
    /** Tamaño de la escultura */
    private double tamaño;
    
    /** Color de la escultura */
    private String color;
    
    /** Material de la escultura */
    private String material;
    
    /** Peso de la escultura */
    private String peso;
    
    /** Técnica utilizada */
    private String tecnica;
    
    /** Serial de la escultura */
    private String serial;
    
    /** Autor de la escultura */
    private Autor autor;
    
    /** Año de creación */
    private String añoCreacion;

    /**
     * Constructor por defecto
     */
    public Escultura() {
    }

    /**
     * Constructor completo
     * @param nombre Nombre de la escultura
     * @param tamaño Tamaño de la escultura
     * @param color Color de la escultura
     * @param material Material de la escultura
     * @param peso Peso de la escultura
     * @param tecnica Técnica utilizada
     * @param serial Serial único
     * @param añoCreacion Año de creación
     */
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

    /**
     * Calcula la edad actual de la escultura
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