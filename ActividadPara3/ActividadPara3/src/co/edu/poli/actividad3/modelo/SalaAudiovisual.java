package co.edu.poli.actividad3.modelo;

public class SalaAudiovisual extends Sala {

    public SalaAudiovisual(Exposicion exposicion, String nombre, String numInt) {
        super(exposicion, nombre, numInt);
    }

    @Override
    public String acceso(String tipoUsuario) {
        return "Acceso permitido a la sala audiovisual para " + tipoUsuario + ". Disfrute la proyección.";
    }

    @Override
    public Sala getSalaEspecial() {
        // Retorna una nueva SalaAudiovisual especial
        return new SalaAudiovisual(getExposicion(), getNombre() + " - VIP", getNumInt());
    }
}
