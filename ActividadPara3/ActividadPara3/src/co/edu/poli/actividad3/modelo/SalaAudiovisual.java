// SalaAudiovisual.java
package co.edu.poli.actividad3.modelo;

public class SalaAudiovisual extends Sala {

    private String equipoProyeccion;

    public SalaAudiovisual(Exposicion exposicion, String nombre, String numInt, String equipoProyeccion) {
        super(exposicion, nombre, numInt);
        this.equipoProyeccion = equipoProyeccion;
    }

    @Override
    protected String acceso() {
        return "Acceso general a la sala audiovisual " + getNombre() +
               " con equipo " + equipoProyeccion;
    }

    @Override
    protected String acceso(String tipoUsuario) {
        return "Acceso especial audiovisual para " + tipoUsuario +
               " en la sala " + getNombre() +
               " con equipo " + equipoProyeccion;
    }
}
