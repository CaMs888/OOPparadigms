package co.edu.poli.actividad3.modelo;

import java.io.Serializable;

public class SalaInteractiva implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private boolean tieneFamiliasTacticas;
    private boolean tieneRealidadAumentada;
    private int numeroDispositivos;
    private String tipoInteractividad;

    public SalaInteractiva() {
    }

    public SalaInteractiva(boolean tieneFamiliasTacticas, boolean tieneRealidadAumentada, int numeroDispositivos, String tipoInteractividad) {
        this.tieneFamiliasTacticas = tieneFamiliasTacticas;
        this.tieneRealidadAumentada = tieneRealidadAumentada;
        this.numeroDispositivos = numeroDispositivos;
        this.tipoInteractividad = tipoInteractividad;
    }

    public String acceso(String tipoUsuario) {
        return "Acceso permitido a la sala interactiva para " + tipoUsuario + ". Disfrute la experiencia.";
    }

    public boolean isTieneFamiliasTacticas() { return tieneFamiliasTacticas; }
    public void setTieneFamiliasTacticas(boolean tieneFamiliasTacticas) { this.tieneFamiliasTacticas = tieneFamiliasTacticas; }

    public boolean isTieneRealidadAumentada() { return tieneRealidadAumentada; }
    public void setTieneRealidadAumentada(boolean tieneRealidadAumentada) { this.tieneRealidadAumentada = tieneRealidadAumentada; }

    public int getNumeroDispositivos() { return numeroDispositivos; }
    public void setNumeroDispositivos(int numeroDispositivos) { this.numeroDispositivos = numeroDispositivos; }

    public String getTipoInteractividad() { return tipoInteractividad; }
    public void setTipoInteractividad(String tipoInteractividad) { this.tipoInteractividad = tipoInteractividad; }

    @Override
    public String toString() {
        return "SalaInteractiva - Dispositivos: " + numeroDispositivos + " - Tipo: " + tipoInteractividad + " - RA: " + (tieneRealidadAumentada ? "Si" : "No");
    }
}