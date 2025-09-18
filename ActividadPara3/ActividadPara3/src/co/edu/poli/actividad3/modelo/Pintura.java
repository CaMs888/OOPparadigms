package co.edu.poli.actividad3.modelo;

public class Pintura {
    private String titulo;
    private String autor;
    private String tecnica;
    private int anioCreacion;

    public Pintura(String titulo, String autor, String tecnica, int anioCreacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.tecnica = tecnica;
        this.anioCreacion = anioCreacion;
    }

    public int getEdadActual() {
        return 2025 - anioCreacion;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public String getTecnica() { return tecnica; }
    public void setTecnica(String tecnica) { this.tecnica = tecnica; }
    public int getAnioCreacion() { return anioCreacion; }
    public void setAnioCreacion(int anioCreacion) { this.anioCreacion = anioCreacion; }
}
