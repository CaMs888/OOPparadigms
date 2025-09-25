package co.edu.poli.actividad3.modelo;

/**
 * Representa un objeto de una exposición.
 */
public class Objeto {
    private String nombre;
    private String fechaCreacion;
    private String material;
    private String estilo;
    private Autor autor;
    private int anioCreacion;

    public Objeto(String nombre, String fechaCreacion, String material, String estilo, Autor autor, int anioCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.material = material;
        this.estilo = estilo;
        this.autor = autor;
        this.anioCreacion = anioCreacion;
    }

    public int getEdadActual() { return 2025 - anioCreacion; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(String fechaCreacion) { this.fechaCreacion = fechaCreacion; }
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getEstilo() { return estilo; }
    public void setEstilo(String estilo) { this.estilo = estilo; }
    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }
    public int getAnioCreacion() { return anioCreacion; }
    public void setAnioCreacion(int anioCreacion) { this.anioCreacion = anioCreacion; }

    @Override
    public String toString() {
        return "Objeto{" + "nombre='" + nombre + '\'' + ", anio=" + anioCreacion + '}';
    }
}
