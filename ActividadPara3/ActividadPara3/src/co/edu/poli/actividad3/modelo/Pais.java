package co.edu.poli.actividad3.modelo;

import java.io.Serializable;

public class Pais implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String cod_pais;
    private String nombre;

    public Pais() {
    }

    public Pais(String cod_pais, String nombre) {
        this.cod_pais = cod_pais;
        this.nombre = nombre;
    }

    public String getCod_pais() { return cod_pais; }
    public void setCod_pais(String cod_pais) { this.cod_pais = cod_pais; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return "Pais: " + nombre + " (" + cod_pais + ")";
    }
}