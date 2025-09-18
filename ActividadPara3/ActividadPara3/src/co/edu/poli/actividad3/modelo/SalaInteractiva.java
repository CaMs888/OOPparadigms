package co.edu.poli.actividad3.modelo;

public class SalaInteractiva extends Sala {

    public SalaInteractiva(Exposicion exposicion, String nombre, String numInt) {
        super(exposicion, nombre, numInt);
    }

    @Override
    public String acceso(String tipoUsuario) {
        return "Acceso permitido a la sala interactiva para " + tipoUsuario + ". Disfrute la experiencia.";
    }

    @Override
    public Sala getSalaEspecial() {
        // Retorna una nueva SalaInteractiva especial
        return new SalaInteractiva(getExposicion(), getNombre() + " - Especial", getNumInt());
    }
}
