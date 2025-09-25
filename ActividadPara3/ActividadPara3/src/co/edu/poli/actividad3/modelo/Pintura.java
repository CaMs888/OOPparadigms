package co.edu.poli.actividad3.modelo;

/**
 * Representa una pintura simple.
 */
public class Pintura {
    private String titulo;
    private String autor; // en tu código anterior Pintura usa String autor
    private String tecnica;
    private int anioCreacion;

    /**
     * Constructor de Pintura.
     *
     * @param titulo título de la pintura
     * @param autor autor como String (puede adaptarse a Autor si se desea)
     * @param tecnica técnica usada
     * @param anioCreacion año de producción
     */
    public Pintura(String titulo, String autor, String tecnica, int anioCreacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.tecnica = tecnica;
        this.anioCreacion = anioCreacion;
    }

    public int getEdadActual() { return 2025 - anioCreacion; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public String getTecnica() { return tecnica; }
    public void setTecnica(String tecnica) { this.tecnica = tecnica; }
    public int getAnioCreacion() { return anioCreacion; }
    public void setAnioCreacion(int anioCreacion) { this.anioCreacion = anioCreacion; }

    @Override
    public String toString() {
        return "Pintura{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", anio=" + anioCreacion + '}';
    }
}
