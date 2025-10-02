package co.edu.poli.actividad3.modelo;

import java.io.Serializable;

public class SalaCine extends Sala implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String tipoPantalla;
    private String formatoProyeccion;
    private boolean tieneButacasReclinables;
    private int duracionPromedioProyeccion;

    public SalaCine() {
        super();
    }

    public SalaCine(Exposicion exposicion, String nombre, String num_int,
                    String tipoPantalla, String formatoProyeccion, 
                    boolean tieneButacasReclinables, int duracionPromedioProyeccion) {
        super(exposicion, nombre, num_int);
        this.tipoPantalla = tipoPantalla;
        this.formatoProyeccion = formatoProyeccion;
        this.tieneButacasReclinables = tieneButacasReclinables;
        this.duracionPromedioProyeccion = duracionPromedioProyeccion;
    }

    public String getTipoPantalla() { return tipoPantalla; }
    public void setTipoPantalla(String tipoPantalla) { this.tipoPantalla = tipoPantalla; }

    public String getFormatoProyeccion() { return formatoProyeccion; }
    public void setFormatoProyeccion(String formatoProyeccion) { this.formatoProyeccion = formatoProyeccion; }

    public boolean isTienePeliculasAdultos() { return tieneButacasReclinables; }
    public void setTienePeliculasAdultos(boolean tienePeliculasAdultos) { this.tieneButacasReclinables = tienePeliculasAdultos; }

    public int getDuracionPromedioProyeccion() { return duracionPromedioProyeccion; }
    public void setDuracionPromedioProyeccion(int duracionPromedioProyeccion) { this.duracionPromedioProyeccion = duracionPromedioProyeccion; }

    @Override
    public String toString() {
        return "SalaCine: " + super.toString() + " - Pantalla: " + tipoPantalla + 
               " - Duracion: " + duracionPromedioProyeccion + " min";
    }
}