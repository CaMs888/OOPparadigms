package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.modelo.*;
import co.edu.poli.actividad3.servicios.ImplementacionOperacionCRUD;
import java.util.Scanner;

public class Principal {
    
    private static ImplementacionOperacionCRUD crudService;
    private static Scanner scanner;
    private static boolean salir;

    public static void main(String[] args) {
        crudService = new ImplementacionOperacionCRUD();
        scanner = new Scanner(System.in);
        salir = false;
        
        System.out.println("Iniciando Sistema de Gestion del Museo...");
        System.out.println("Cargando datos existentes...");
        
        mostrarMenu();
    }

    public static void mostrarMenu() {
        while (!salir) {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("       SISTEMA DE GESTION DEL MUSEO");
            System.out.println("=".repeat(50));
            System.out.println("1. Crear Sala (maximo 5 atributos)");
            System.out.println("2. Listar todas las salas");
            System.out.println("3. Buscar sala por ID");
            System.out.println("4. Modificar sala");
            System.out.println("5. Eliminar sala");
            System.out.println("6. Guardar datos en archivo");
            System.out.println("7. Cargar datos desde archivo");
            System.out.println("8. Detalles de salas guardadas");
            System.out.println("9. Salir");
            System.out.println("=".repeat(50));
            System.out.print("Seleccione una opcion: ");

            int opcion = leerEntero();
            
            switch (opcion) {
                case 1:
                    crearSala();
                    break;
                case 2:
                    listarSalas();
                    break;
                case 3:
                    buscarSala();
                    break;
                case 4:
                    modificarSala();
                    break;
                case 5:
                    eliminarSala();
                    break;
                case 6:
                    guardarArchivo();
                    break;
                case 7:
                    cargarArchivo();
                    break;
                case 8:
                    mostrarEstadisticas();
                    break;
                case 9:
                    salir = true;
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        }
        scanner.close();
    }

    private static void crearSala() {
        System.out.println("\n" + "-".repeat(40));
        System.out.println("        CREAR NUEVA SALA");
        System.out.println("-".repeat(40));
        
        System.out.print("Ingrese numero interno: ");
        String numInt = scanner.nextLine();
        
        System.out.print("Ingrese nombre de la sala: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese tipo de pantalla: ");
        String tipoPantalla = scanner.nextLine();
        
        System.out.print("Ingrese formato de proyeccion: ");
        String formatoProyeccion = scanner.nextLine();
        
        System.out.print("Ingrese duracion promedio (minutos): ");
        int duracion = leerEntero();
        
        Exposicion exposicion = new Exposicion();
        exposicion.setNombre("Exposicion para " + nombre);
        exposicion.setTema("General");
        
        SalaCine nuevaSala = new SalaCine(
            exposicion, nombre, numInt, 
            tipoPantalla, formatoProyeccion, 
            false, duracion
        );
        
        if (crudService.create(nuevaSala)) {
            System.out.println("Sala creada exitosamente!");
        } else {
            System.out.println("Error al crear la sala.");
        }
    }

    private static void listarSalas() {
        System.out.println("\n" + "-".repeat(40));
        System.out.println("        LISTA DE SALAS");
        System.out.println("-".repeat(40));
        
        Sala[] salas = crudService.listar(); // Ahora usa Sala[] en lugar de List<Sala>
        
        if (salas.length == 0) {
            System.out.println("No hay salas registradas.");
        } else {
            for (int i = 0; i < salas.length; i++) {
                Sala sala = salas[i];
                System.out.printf("%d. %s (ID: %s)%n", 
                    i + 1, sala.getNombre(), sala.getNum_int());
                System.out.println("   Tipo: " + sala.getClass().getSimpleName());
                System.out.println("   " + sala.acceso("visitante"));
                System.out.println();
            }
            System.out.printf("Total: %d salas%n", salas.length);
        }
    }

    private static void buscarSala() {
        System.out.println("\n" + "-".repeat(40));
        System.out.println("        BUSCAR SALA");
        System.out.println("-".repeat(40));
        
        System.out.print("Ingrese el numero interno de la sala: ");
        String numInt = scanner.nextLine();
        
        Sala sala = crudService.read(numInt);
        
        if (sala != null) {
            System.out.println("Sala encontrada:");
            System.out.println("   Nombre: " + sala.getNombre());
            System.out.println("   ID: " + sala.getNum_int());
            System.out.println("   Tipo: " + sala.getClass().getSimpleName());
            System.out.println("   Acceso: " + sala.acceso("visitante"));
        } else {
            System.out.println("No se encontro ninguna sala con ese ID.");
        }
    }

    private static void modificarSala() {
        System.out.println("\n" + "-".repeat(40));
        System.out.println("        MODIFICAR SALA");
        System.out.println("-".repeat(40));
        
        System.out.print("Ingrese el numero interno de la sala a modificar: ");
        String numInt = scanner.nextLine();
        
        Sala salaExistente = crudService.read(numInt);
        
        if (salaExistente == null) {
            System.out.println("No se encontro la sala.");
            return;
        }
        
        System.out.println("Sala actual: " + salaExistente.getNombre());
        System.out.print("Nuevo nombre (Enter para mantener actual): ");
        String nuevoNombre = scanner.nextLine();
        
        if (!nuevoNombre.trim().isEmpty()) {
            salaExistente.setNombre(nuevoNombre);
        }
        
        if (crudService.actualizar(salaExistente)) {
            System.out.println("Sala modificada exitosamente!");
        } else {
            System.out.println("Error al modificar la sala.");
        }
    }

    private static void eliminarSala() {
        System.out.println("\n" + "-".repeat(40));
        System.out.println("        ELIMINAR SALA");
        System.out.println("-".repeat(40));
        
        System.out.print("Ingrese el numero interno de la sala a eliminar: ");
        String numInt = scanner.nextLine();
        
        System.out.print("¿Esta seguro de eliminar esta sala? (s/n): ");
        String confirmacion = scanner.nextLine();
        
        if (confirmacion.equalsIgnoreCase("s")) {
            if (crudService.eliminar(numInt)) {
                System.out.println("Sala eliminada exitosamente!");
            } else {
                System.out.println("Error al eliminar la sala.");
            }
        } else {
            System.out.println("Eliminacion cancelada.");
        }
    }

    private static void guardarArchivo() {
        System.out.println("\n" + "-".repeat(40));
        System.out.println("        GUARDAR EN ARCHIVO");
        System.out.println("-".repeat(40));
        
        if (crudService.serializar()) {
            System.out.println("Datos guardados exitosamente en archivo binario.");
        } else {
            System.out.println("Error al guardar los datos.");
        }
    }

    private static void cargarArchivo() {
        System.out.println("\n" + "-".repeat(40));
        System.out.println("        CARGAR DESDE ARCHIVO");
        System.out.println("-".repeat(40));
        
        if (crudService.deserializar()) {
            System.out.println("Datos cargados exitosamente desde archivo.");
        } else {
            System.out.println("Error al cargar los datos.");
        }
    }

    private static void mostrarEstadisticas() {
        System.out.println("\n" + "-".repeat(40));
        System.out.println("        DETALLES GUARDADOS");
        System.out.println("-".repeat(40));
        
        System.out.println(crudService.obtenerEstadisticas());
        
        Sala[] salas = crudService.listar();
        if (salas.length > 0) {
            System.out.println("\nDetalle de salas:");
            for (Sala sala : salas) {
                System.out.println(" - " + sala.getNombre() + " (" + sala.getNum_int() + ")");
            }
        }
    }

    private static int leerEntero() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada invalida. Ingrese un numero: ");
            }
        }
    }
}