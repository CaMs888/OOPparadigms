package co.edu.poli.actividad3.vista;
import co.edu.poli.actividad3.modelo.*;
import co.edu.poli.actividad3.servicios.*;

public class Principal {

    public static void main(String[] args) {

        // --- Datos base ---
        Pais paisColombia = new Pais("CO", "Colombia");
        Autor autorPerez = new Autor("1980-05-12", "Carlos Perez", "123456789", paisColombia);

        Pintura miPintura = new Pintura("El Grito", "Edvard Munch", "óleo sobre cartón", 1893);
        Escultura miEscultura = new Escultura("El Pensador", 1.8, "Bronce", "Metal", "Fundición", "ESC1234", autorPerez, 2000);

        Exposicion miExposicion = new Exposicion("Maestros Modernos", 3, "2025-03-01", "2025-06-30", true, miPintura, miEscultura);

        SalaInteractiva salaInteractiva = new SalaInteractiva(miExposicion, "Sala de Experiencias", "S-301");
        SalaAudiovisual salaAudiovisual = new SalaAudiovisual(miExposicion, "Sala Audiovisual", "S-302");

        // --- CRUD ---
        ImplementacionOperacionCRUD crud = new ImplementacionOperacionCRUD();

        System.out.println("\n--- Pruebas CRUD ---");
        crud.create(salaInteractiva);   // Insertar SalaInteractiva
        crud.create(salaAudiovisual);   // Insertar SalaAudiovisual

        crud.read("S-301");             // Consultar por ID (numInt)
        crud.update(new SalaInteractiva(miExposicion, "Sala de Realidad Virtual", "S-301")); // Actualizar SalaInteractiva
        crud.delete("S-302");           // Eliminar SalaAudiovisual
        crud.listarTodo();
    }
}
