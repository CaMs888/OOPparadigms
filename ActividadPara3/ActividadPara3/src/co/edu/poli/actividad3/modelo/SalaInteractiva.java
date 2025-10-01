// ====================================================================================
// CLASE: SalaInteractiva (Extends directamente, no de Sala según diagrama)
// ====================================================================================

package co.edu.poli.actividad3.modelo;

/**
 * Clase que representa una sala interactiva del museo.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024
 */
public class SalaInteractiva {
    
    /** Indica si tiene familias tácticas */
    private boolean tieneFamiliasTacticas;
    
    /** Indica si tiene realidad aumentada */
    private boolean tieneRealidadAumentada;
    
    /** Número de dispositivos */
    private int numeroDispositivos;
    
    /** Tipo de interactividad */
    private String tipoInteractividad;

    /**
     * Constructor por defecto
     */
    public SalaInteractiva() {
    }

    /**
     * Constructor completo
     * @param tieneFamiliasTacticas Si tiene familias tácticas
     * @param tieneRealidadAumentada Si tiene realidad aumentada
     * @param numeroDispositivos Número de dispositivos
     * @param tipoInteractividad Tipo de interactividad
     */
    public SalaInteractiva(boolean tieneFamiliasTacticas, boolean tieneRealidadAumentada, int numeroDispositivos, String tipoInteractividad) {
        this.tieneFamiliasTacticas = tieneFamiliasTacticas;
        this.tieneRealidadAumentada = tieneRealidadAumentada;
        this.numeroDispositivos = numeroDispositivos;
        this.tipoInteractividad = tipoInteractividad;
    }

    /**
     * Método de acceso con Override
     * @param tipoUsuario Tipo de usuario
     * @return Mensaje de acceso
     */
    public String acceso(String tipoUsuario) {
        return "Acceso permitido a la sala interactiva para " + tipoUsuario + ". Disfrute la experiencia.";
    }

    // Getters y Setters
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
        return "SalaInteractiva - Dispositivos: " + numeroDispositivos + " - Tipo: " + tipoInteractividad + " - RA: " + (tieneRealidadAumentada ? "Sí" : "No");
    }
}
