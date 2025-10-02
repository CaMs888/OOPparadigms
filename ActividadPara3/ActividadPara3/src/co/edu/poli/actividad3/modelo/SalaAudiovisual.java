package co.edu.poli.actividad3.modelo;

import java.io.Serializable;

public class SalaAudiovisual extends SalaCine implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private boolean tieneProyector;
    private boolean tieneSistemaSonido;
    private int capacidadButacas;
    private String tipoContenido;

    public SalaAudiovisual() {
        super();
    }

    public SalaAudiovisual(Exposicion exposicion, String nombre, String num_int, String tipoPantalla, String formatoProyeccion, boolean tienePeliculasAdultos, int duracionPromedioProyeccion, boolean tieneProyector, boolean tieneSistemaSonido, int capacidadButacas, String tipoContenido) {
        super(exposicion, nombre, num_int, tipoPantalla, formatoProyeccion, tienePeliculasAdultos, duracionPromedioProyeccion);
        this.tieneProyector = tieneProyector;
        this.tieneSistemaSonido = tieneSistemaSonido;
        this.capacidadButacas = capacidadButacas;
        this.tipoContenido = tipoContenido;
    }

    public boolean isTieneProyector() { return tieneProyector; }
    public void setTieneProyector(boolean tieneProyector) { this.tieneProyector = tieneProyector; }

    public boolean isTieneSistemaSonido() { return tieneSistemaSonido; }
    public void setTieneSistemaSonido(boolean tieneSistemaSonido) { this.tieneSistemaSonido = tieneSistemaSonido; }

    public int getCapacidadButacas() { return capacidadButacas; }
    public void setCapacidadButacas(int capacidadButacas) { this.capacidadButacas = capacidadButacas; }

    public String getTipoContenido() { return tipoContenido; }
    public void setTipoContenido(String tipoContenido) { this.tipoContenido = tipoContenido; }

    @Override
    public String toString() {
        return "SalaAudiovisual: " + super.toString() + " - Capacidad: " + capacidadButacas + " butacas - Contenido: " + tipoContenido;
    }
}