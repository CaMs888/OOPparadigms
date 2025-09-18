package co.edu.poli.actividad3.modelo;

public class Pais {

    private final String cod_pais;  // Atributo que no se puede cambiar (final)
    private String nombre;

    public Pais(String cod_pais, String nombre) {
        this.cod_pais = cod_pais;
        this.nombre = nombre;
    }

    public String getCod_pais() { return cod_pais; }

    // No hay setter para cod_pais porque es final y no se puede cambiar

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
