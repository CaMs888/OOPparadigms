package co.edu.poli.actividad3.modelo;

/**
 * Representa una escultura con atributos básicos.
 */
public class Escultura {
    private String nombre;
    private double tamanio;
    private String color;
    private String material;
    private String tecnica;
    private String serial;
    private Autor autor;
    private int anioCreacion;

    /**
     * Constructor completo de Escultura.
     */
    public Escultura(String nombre, double tamanio, String color, String material, String tecnica, String serial, Autor autor, int anioCreacion) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.color = color;
        this.material = material;
        this.tecnica = tecnica;
        this.serial = serial;
        this.autor = autor;
        this.anioCreacion = anioCreacion;
    }

    public int getEdadActual() { return 2025 - anioCreacion; }

    // Getters y Setters ...
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getTamanio() { return tamanio; }
    public void setTamanio(double tamanio) { this.tamanio = tamanio; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getTecnica() { return tecnica; }
    public void setTecnica(String tecnica) { this.tecnica = tecnica; }
    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }
    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }
    public int getAnioCreacion() { return anioCreacion; }
    public void setAnioCreacion(int anioCreacion) { this.anioCreacion = anioCreacion; }

    @Override
    public String toString() {
        return "Escultura{" + "nombre='" + nombre + '\'' + ", autor=" + (autor!=null?autor.getNombre():"null") + ", anio=" + anioCreacion + '}';
    }
}
