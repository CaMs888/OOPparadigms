package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.modelo.*;
import co.edu.poli.actividad3.servicios.*;

public class Principal {

    public static void main(String[] args) {

        // --- Datos base mínimos ---
        Pais paisColombia = new Pais("CO", "Colombia");
        Autor autorPerez = new Autor("1980-05-12", "Carlos Perez", "123456789", paisColombia);

        Pintura miPintura = new Pintura("El Grito", "óleo sobre cartón", 1893, "Expresionismo", autorPerez, "P123", 1893);
        Escultura miEscultura = new Escultura("El Pensador", 1.8, "Marrón", "Bronce", "Fundición", "ESC123", autorPerez, 1902);

        Exposicion miExposicion = new Exposicion("Maestros Modernos", "Carlos Perez", "Arte Moderno", "Español", "Pintura/Escultura", "EXP001", true, miEscultura, miPintura, new Escultura[]{miEscultura});

        // --- Crear salas ---
        SalaInteractiva salaInteractiva = new SalaInteractiva(miExposicion, "Sala de Experiencias", "S-301",
                true, true, 15, "VR");
        SalaAudiovisual salaAudiovisual = new SalaAudiovisual(miExposicion, "Sala Audiovisual", "S-302",
                true, true, 80, "Documentales");

        // --- CRUD ---
        ImplementacionOperacionCRUD crud = new ImplementacionOperacionCRUD();

        System.out.println("\n--- Pruebas CRUD ---");
        crud.crear(salaInteractiva);   // Insertar SalaInteractiva
        crud.crear(salaAudiovisual);   // Insertar SalaAudiovisual

        crud.leer("S-301");             // Consultar por ID (numInt)
        crud.actualizar(new SalaInteractiva(miExposicion, "Sala de Realidad Virtual", "S-301",
                true, true, 20, "VR avanzada")); // Actualizar SalaInteractiva
        crud.eliminar("S-302");         // Eliminar SalaAudiovisual

        // --- Imprimir todas las salas después de CRUD ---
        System.out.println("\n--- Estado final del arreglo de Salas ---");
        crud.listarTodo();
    }
}
