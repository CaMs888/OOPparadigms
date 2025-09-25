package co.edu.poli.actividad3.modelo;

/**
 * Representa una exposición que puede contener una pintura y/o una escultura.
 */
public class Exposicion {
    private String nombre;
    private int numeroSalas;
    private String fechaInicio;
    private String fechaFin;
    private boolean abiertaAlPublico;
    private Pintura pintura;
    private Escultura escultura;

    public Exposicion(String nombre, int numeroSalas, String fechaInicio, String fechaFin, boolean abiertaAlPublico, Pintura pintura, Escultura escultura) {
        this.nombre = nombre;
        this.numeroSalas = numeroSalas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.abiertaAlPublico = abiertaAlPublico;
        this.pintura = pintura;
        this.escultura = escultura;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getNumeroSalas() { return numeroSalas; }
    public void setNumeroSalas(int numeroSalas) { this.numeroSalas = numeroSalas; }
    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }
    public String getFechaFin() { return fechaFin; }
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }
    public boolean isAbiertaAlPublico() { return abiertaAlPublico; }
    public void setAbiertaAlPublico(boolean abiertaAlPublico) { this.abiertaAlPublico = abiertaAlPublico; }
    public Pintura getPintura() { return pintura; }
    public void setPintura(Pintura pintura) { this.pintura = pintura; }
    public Escultura getEscultura() { return escultura; }
    public void setEscultura(Escultura escultura) { this.escultura = escultura; }

    @Override
    public String toString() {
        return "Exposicion{" + "nombre='" + nombre + '\'' + ", numeroSalas=" + numeroSalas + ", abierta=" + abiertaAlPublico + '}';
    }
}
