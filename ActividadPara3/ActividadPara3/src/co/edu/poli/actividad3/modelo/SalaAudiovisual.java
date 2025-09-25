// SalaAudiovisual.java
package co.edu.poli.actividad3.modelo;

public class SalaAudiovisual extends Sala {

    public SalaAudiovisual(Exposicion exposicion, String nombre, String numInt) {
        super(exposicion, nombre, numInt);
    }

    @Override
    public String acceso(String tipoUsuario) {
        return "Acceso especial audiovisual para " + tipoUsuario + " en la sala " + getNombre();
    }
}
