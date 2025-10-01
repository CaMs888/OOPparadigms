// ==================================================================================== 
// PAQUETE: co.edu.poli.actividad3.vista
// ====================================================================================

// ====================================================================================
// CLASE: Principal
// ====================================================================================

package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.modelo.*;
import co.edu.poli.actividad3.servicios.*;

/**
 * Clase Principal para probar las operaciones CRUD del sistema.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024
 */
public class Principal {
    
    /**
     * Método main - Punto de entrada del programa
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║      SISTEMA DE GESTIÓN DE MUSEO - OPERACIONES CRUD      ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝\n");
        
        // Crear instancia del servicio CRUD
        ImplementacionOperacionCRUD crudService = new ImplementacionOperacionCRUD();
        
        // Crear objetos auxiliares
        Pais colombia = new Pais("CO", "Colombia");
        Pais italia = new Pais("IT", "Italia");
        Pais españa = new Pais("ES", "España");
        
        Autor autorPerez = new Autor("1980-05-12", "Carlos Perez", "12345678", colombia);
        Autor autorDaVinci = new Autor("1452-04-15", "Leonardo da Vinci", "IT001", italia);
        Autor autorPicasso = new Autor("1881-10-25", "Pablo Picasso", "ES001", españa);
        
        // Crear objetos de arte
        Pintura pintura1 = new Pintura("Mona Lisa", "Óleo sobre tabla", 1503, "Retrato", "PIN001", "1503");
        pintura1.setAutor(autorDaVinci);
        
        Pintura pintura2 = new Pintura("Guernica", "Óleo sobre lienzo", 1937, "Cubismo", "PIN002", "1937");
        pintura2.setAutor(autorPicasso);
        
        Escultura escultura1 = new Escultura("David", 5.17, "Blanco", "Mármol", "6000 kg", "Tallado", "ESC001", "1504");
        escultura1.setAutor(autorDaVinci);
        
        Objeto objeto1 = new Objeto("Vasija Precolombina", "Muisca", "800 d.C.", "Vasija ceremonial", "Cerámica", "OBJ001", "800");
        
        // Crear exposiciones
        Exposicion expo1 = new Exposicion("Arte Renacentista", "Leonardo da Vinci", "Renacimiento", "Italiano", "Permanente", "EXP001", false);
        expo1.setPintura(pintura1);
        
        Exposicion expo2 = new Exposicion("Arte del Siglo XX", "Pablo Picasso", "Cubismo", "Español", "Temporal", "EXP002", false);
        expo2.setPintura(pintura2);
        
        Exposicion expo3 = new Exposicion("Culturas Precolombinas", "Anónimo", "Historia", "Español", "Permanente", "EXP003", false);
        expo3.setObjeto(objeto1);
        
        // ═══════════════════════════════════════════════════════════
        // OPERACIÓN CREATE - Crear Salas
        // ═══════════════════════════════════════════════════════════
        
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│      OPERACIÓN CREATE - Crear Salas         │");
        System.out.println("└─────────────────────────────────────────────┘");
        
        // Crear SalaCine 1
        SalaCine salaCine1 = new SalaCine(expo1, "Sala de Cine Principal", "SC001", "IMAX", "4K", false, 120);
        crudService.create(salaCine1);
        
        // Crear SalaAudiovisual 1
        SalaAudiovisual salaAud1 = new SalaAudiovisual(expo2, "Auditorio Moderno", "SA001", "LED", "Full HD", false, 90, true, true, 150, "Documentales");
        crudService.create(salaAud1);
        
        // Crear SalaCine 2
        SalaCine salaCine2 = new SalaCine(expo3, "Sala de Proyecciones", "SC002", "Estándar", "HD", false, 60);
        crudService.create(salaCine2);
        
        // Intentar crear sala duplicada (debe fallar)
        System.out.println("\n  Probando crear sala con ID duplicado...");
        SalaCine salaDuplicada = new SalaCine(expo1, "Sala Duplicada", "SC001", "Test", "Test", false, 30);
        crudService.create(salaDuplicada);
        
        System.out.println("\n" + crudService.obtenerEstadisticas() + "\n");
        
        // ═══════════════════════════════════════════════════════════
        // OPERACIÓN READ - Consultar Salas por ID
        // ═══════════════════════════════════════════════════════════
        
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│      OPERACIÓN READ - Consultar por ID      │");
        System.out.println("└─────────────────────────────────────────────┘\n");
        
        System.out.println(" Buscando sala con ID 'SC001'...");
        Sala salaEncontrada = crudService.read("SC001");
        if (salaEncontrada != null) {
            System.out.println(" Encontrada: " + salaEncontrada);
            System.out.println("   Exposición: " + salaEncontrada.getExposicion());
        } else {
            System.out.println(" No encontrada");
        }
        
        System.out.println("\n Buscando sala con ID 'SA001'...");
        Sala salaEncontrada2 = crudService.read("SA001");
        if (salaEncontrada2 != null) {
            System.out.println(" Encontrada: " + salaEncontrada2);
            System.out.println("   Exposición: " + salaEncontrada2.getExposicion());
        } else {
            System.out.println(" No encontrada");
        }
        
        System.out.println("\n Buscando sala con ID inexistente 'XXX999'...");
        Sala salaInexistente = crudService.read("XXX999");
        if (salaInexistente == null) {
            System.out.println(" No encontrada (comportamiento esperado)");
        }
        
        // ═══════════════════════════════════════════════════════════
        // LISTAR TODAS - Mostrar todas las salas
        // ═══════════════════════════════════════════════════════════
        
        System.out.println("\n┌─────────────────────────────────────────────┐");
        System.out.println("│      LISTAR TODAS - Mostrar todas las salas │");
        System.out.println("└─────────────────────────────────────────────┘\n");
        
        Sala[] todasLasSalas = crudService.listar();
        System.out.println("Total de salas almacenadas: " + todasLasSalas.length + "\n");
        
        for (int i = 0; i < todasLasSalas.length; i++) {
            System.out.printf("  %d. %s%n", (i + 1), todasLasSalas[i]);
            System.out.printf("     Tipo: %s%n", todasLasSalas[i].getClass().getSimpleName());
            System.out.println("     " + todasLasSalas[i].acceso("visitante"));
            System.out.println();
        }
        
        // ═══════════════════════════════════════════════════════════
        // OPERACIÓN UPDATE - Actualizar Sala
        // ═══════════════════════════════════════════════════════════
        
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.println("│     OPERACIÓN UPDATE - Actualizar Sala      │");
        System.out.println("└─────────────────────────────────────────────┘\n");
        
        System.out.println(" Actualizando sala con ID 'SC001'...");
        SalaCine salaActualizada = new SalaCine(expo1, "Sala de Cine Principal RENOVADA", 
                                                "SC001", "IMAX 3D", "8K", false, 150);
        
        boolean actualizado = crudService.actualizar(salaActualizada);
        
        if (actualizado) {
            System.out.println("\n Verificando actualización...");
            Sala salaVerificacion = crudService.read("SC001");
            System.out.println("Sala después de actualizar: " + salaVerificacion);
        }
        
        System.out.println("\n  Intentando actualizar sala inexistente 'XXX999'...");
        SalaCine salaInexistenteUpd = new SalaCine(expo1, "No existe", "XXX999",
                                                   "Test", "Test", false, 30);
        crudService.actualizar(salaInexistenteUpd);
        
        // ═══════════════════════════════════════════════════════════
        // OPERACIÓN DELETE - Eliminar Sala
        // ═══════════════════════════════════════════════════════════
        
        System.out.println("\n┌─────────────────────────────────────────────┐");
        System.out.println("│      OPERACIÓN DELETE - Eliminar Sala       │");
        System.out.println("└─────────────────────────────────────────────┘\n");
        
        System.out.println(" Estado antes de eliminar:");
        System.out.println(crudService.obtenerEstadisticas());
        
        System.out.println("\n  Eliminando sala con ID 'SC002'...");
        boolean eliminado = crudService.eliminar("SC002");
        
        if (eliminado) {
            System.out.println("\n Verificando eliminación...");
            Sala salaEliminada = crudService.read("SC002");
            if (salaEliminada == null) {
                System.out.println(" Confirmado: Sala eliminada correctamente");
            }
        }
        
        System.out.println("\n  Intentando eliminar sala inexistente 'XXX999'...");
        crudService.eliminar("XXX999");
        
        // ═══════════════════════════════════════════════════════════
        // ESTADO FINAL DEL SISTEMA
        // ═══════════════════════════════════════════════════════════
        
        System.out.println("\n┌─────────────────────────────────────────────┐");
        System.out.println("│        ESTADO FINAL DEL SISTEMA             │");
        System.out.println("└─────────────────────────────────────────────┘\n");
        
        System.out.println(crudService.obtenerEstadisticas());
        
        System.out.println("\n  Salas restantes en el sistema:");
        Sala[] salasFinales = crudService.listar();
        
        for (int i = 0; i < salasFinales.length; i++) {
            System.out.printf("  %d. %s%n", (i + 1), salasFinales[i]);
        }
        
        // ═══════════════════════════════════════════════════════════
        // PRUEBA DE CAPACIDAD - Inserción masiva
        // ═══════════════════════════════════════════════════════════
        
        System.out.println("\n┌─────────────────────────────────────────────┐");
        System.out.println("│      PRUEBA DE CAPACIDAD                    │");
        System.out.println("└─────────────────────────────────────────────┘\n");
        
        System.out.println("Agregando múltiples salas para probar inserción automática...\n");
        
        for (int i = 3; i <= 10; i++) {
            SalaCine nuevaSala = new SalaCine(
                expo1, 
                "Sala de Prueba " + i, 
                "SP" + String.format("%03d", i),
                "Digital", 
                "HD", 
                false, 
                60
            );
            crudService.create(nuevaSala);
        }
        
        System.out.println("\n" + crudService.obtenerEstadisticas());
        
        System.out.println("\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║        ¡PRUEBAS CRUD COMPLETADAS EXITOSAMENTE!           ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}