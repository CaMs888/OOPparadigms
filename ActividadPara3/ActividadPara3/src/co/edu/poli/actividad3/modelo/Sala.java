package co.edu.poli.actividad3.modelo;

import java.io.Serializable;

public abstract class Sala implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected Exposicion exposicion;
    protected String nombre;
    protected String num_int;

    public Sala() {
    }

    public Sala(Exposicion exposicion, String nombre, String num_int) {
        this.exposicion = exposicion;
        this.nombre = nombre;
        this.num_int = num_int;
    }

    public String acceso(String tipoUsuario) {
        return "Acceso general permitido a la sala " + this.nombre;
    }

    public Exposicion getExposicion() { return exposicion; }
    public void setExposicion(Exposicion exposicion) { this.exposicion = exposicion; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNum_int() { return num_int; }
    public void setNum_int(String num_int) { this.num_int = num_int; }

    @Override
    public String toString() {
        return "Sala: " + nombre + " (Num: " + num_int + ")";
    }
}