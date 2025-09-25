package co.edu.poli.actividad3.modelo;

/**
 * Sala interactiva que extiende la superclase Sala.
 */
public class SalaInteractiva extends Sala {

    /**
     * Constructor de SalaInteractiva.
     *
     * @param exposicion exposición asociada
     * @param nombre nombre de la sala
     * @param numInt identificador
     */
    public SalaInteractiva(Exposicion exposicion, String nombre, String numInt) {
        super(exposicion, nombre, numInt);
    }

    @Override
    public String acceso(String tipoUsuario) {
        return "Acceso permitido a la sala interactiva para " + tipoUsuario + ". Disfrute la experiencia.";
    }
}
