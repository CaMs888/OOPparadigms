package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.modelo.*;

public class Principal {

    public static void main(String[] args) {

        // --- Cambios realizados ---
        // 1. Pais.cod_pais es final (atributo inmutable)
        Pais paisColombia = new Pais("CO", "Colombia");

        Autor autorPerez = new Autor("1980-05-12", "Carlos Perez", "123456789", paisColombia);
        Objeto miObra = new Objeto("El Silencio", "1990-01-01", "Madera", "Abstracto", autorPerez, 1990);

        // 3. Pintura es clase final, no se puede heredar
        Pintura miPintura = new Pintura("El Grito", "Edvard Munch", "oleo sobre carton", 1893);

        Escultura miEscultura = new Escultura("El Pensador", 1.8, "Bronce", "Metal", "Fundicion", "ESC1234", autorPerez, 2000);
        Exposicion miExposicion = new Exposicion("Maestros Modernos", 3, "2025-03-01", "2025-06-30", true, miPintura, miEscultura);

        Sala miSala = new Sala(miExposicion, "Sala de Arte Contemporaneo", "S-205");
        SalaInteractiva miSalaInteractiva = new SalaInteractiva(miExposicion, "Sala de Experiencias", "S-301");
        SalaAudiovisual miSalaAudiovisual = new SalaAudiovisual(miExposicion, "Sala Audiovisual", "S-302");

        System.out.println("--- Resumen de los objetos ---");
        System.out.println("Pintura: " + miPintura.getTitulo() + ", Autor: " + miPintura.getAutor() + ", Anio: " + miPintura.getAnioCreacion());
        System.out.println("Escultura: " + miEscultura.getNombre() + ", Autor: " + miEscultura.getAutor().getNombre() + ", Anio: " + miEscultura.getAnioCreacion());
        System.out.println("Exposicion: " + miExposicion.getNombre() + ", Salas: " + miExposicion.getNumeroSalas() + ", Abierta: " + miExposicion.isAbiertaAlPublico());
        System.out.println("Sala: " + miSala.getNombre() + ", Exposicion: " + miSala.getExposicion().getNombre());
        System.out.println("Objeto: " + miObra.getNombre() + ", Anio: " + miObra.getAnioCreacion());

        System.out.println("\n--- Uso del método final infoBasica() en Sala ---");
        System.out.println(miSala.infoBasica());
        System.out.println(miSalaInteractiva.infoBasica());
        System.out.println(miSalaAudiovisual.infoBasica());

        // Intentar cambiar cod_pais no es posible porque es final
        // paisColombia.setCod_pais("US"); // Esto daría error de compilación

        // --- Arreglo y polimorfismo (del punto anterior) ---
        Sala[] salas = new Sala[5];
        salas[0] = miSala;
        salas[1] = miSalaInteractiva;
        salas[2] = miSalaAudiovisual;
        salas[3] = new Sala(miExposicion, "Sala Extra 1", "S-303");
        salas[4] = new SalaInteractiva(miExposicion, "Sala Extra 2", "S-304");

        System.out.println("\n--- Sobrescritura de métodos con arreglo de Sala ---");
        for (int i = 1; i < salas.length; i++) {
            Sala s = salas[i];
            System.out.println("Sala en posición " + i + ": " + s.acceso("Visitante"));
        }
    }
}
