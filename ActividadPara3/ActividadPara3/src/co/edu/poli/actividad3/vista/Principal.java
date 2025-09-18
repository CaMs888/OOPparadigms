package co.edu.poli.actividad3.vista;
import co.edu.poli.actividad3.modelo.*;

public class Principal {
    public static void main(String[] args) {
        
        Pais paisColombia = new Pais("CO", "Colombia");
        Autor autorPerez = new Autor("1980-05-12", "Carlos Perez", "123456789", paisColombia);
        Objeto miObra = new Objeto("El Silencio", "1990-01-01", "Madera", "Abstracto", autorPerez, 1990);
        Pintura miPintura = new Pintura("El Grito", "Edvard Munch", "oleo sobre carton", 1893);
        Escultura miEscultura = new Escultura("El Pensador", 1.8, "Bronce", "Metal", "Fundicion", "ESC1234",autorPerez, 2000);              
        Exposicion miExposicion = new Exposicion("Maestros Modernos", 3, "2025-03-01", "2025-06-30", true, miPintura, miEscultura);
        Sala miSala = new Sala(miExposicion, "Sala de Arte Contemporaneo", "S-205");
        SalaInteractiva miSalaInteractiva = new SalaInteractiva(miExposicion, "Sala de Experiencias", "S-301");


        System.out.println("--- Resumen de los objetos ---");
        System.out.println("Pintura: " + miPintura.getTitulo() + ", Autor: " + miPintura.getAutor() + ", Anio: " + miPintura.getAnioCreacion());
        System.out.println("Escultura: " + miEscultura.getNombre() + ", Autor: " + miEscultura.getAutor().getNombre() + ", Anio: " + miEscultura.getAnioCreacion());
        System.out.println("Exposicion: " + miExposicion.getNombre() + ", Salas: " + miExposicion.getNumeroSalas() + ", Abierta: " + miExposicion.isAbiertaAlPublico());
        System.out.println("Sala: " + miSala.getNombre() + ", Exposicion: " + miSala.getExposicion().getNombre());
        System.out.println("Objeto: " + miObra.getNombre() + ", Anio: " + miObra.getAnioCreacion());
        
        System.out.println("\n--- Sobrecarga (Clase Sala) ---");
        System.out.println(miSala.acceso()); 
        System.out.println(miSala.acceso("Visitante Premium")); 

        System.out.println("\n--- Sobreescritura (Clase SalaInteractiva) ---");
        
        System.out.println(miSalaInteractiva.acceso("Estudiante"));
    }
}