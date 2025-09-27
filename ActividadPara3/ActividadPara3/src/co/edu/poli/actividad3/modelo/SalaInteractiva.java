// SalaInteractiva.java
package co.edu.poli.actividad3.modelo;

public class SalaInteractiva extends Sala {

    public SalaInteractiva(Exposicion exposicion, String nombre, String numInt) {
        super(exposicion, nombre, numInt);
    }

    @Override
    protected String acceso() {
        return "Acceso general a la sala interactiva " + getNombre();
    }

    @Override
    protected String acceso(String tipoUsuario) {
        return "Acceso especial interactivo para " + tipoUsuario + 
               " en la sala " + getNombre();
    }
}
