package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.modelo.*;
import co.edu.poli.actividad3.servicios.*;

public class Principal {
    public static void main(String[] args) {
        ImplementacionOperacionCRUD crud = new ImplementacionOperacionCRUD();

        Sala sala1 = new SalaInteractiva(null, "Sala Interactiva 1", "S1",
                true, true, 10, "VR");
        Sala sala2 = new SalaAudiovisual(null, "Sala Audiovisual 1", "S2",
                true, true, 50, "Películas");

        crud.crear(sala1);
        crud.crear(sala2);

        System.out.println("Listado inicial:");
        System.out.println(crud.leer("S1"));
        System.out.println(crud.leer("S2"));

        crud.eliminar("S1");
        System.out.println("Después de eliminar S1:");
        System.out.println(crud.leer("S1"));
    }
}
