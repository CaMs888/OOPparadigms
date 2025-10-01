// ====================================================================================
// CLASE: ImplementacionOperacionCRUD
// ====================================================================================

package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Sala;

/**
 * Implementación de las operaciones CRUD para Salas.
 * Utiliza un arreglo estático de tipo Sala[] para almacenar los datos.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024
 */
public class ImplementacionOperacionCRUD implements OperacionCRUD {
    
    /** Arreglo estático para almacenar las salas */
    private Sala[] almacenamiento;
    
    /** Tamaño máximo del arreglo */
    private int cantidad;

    /**
     * Constructor por defecto que inicializa el arreglo con capacidad de 100
     */
    public ImplementacionOperacionCRUD() {
        this.cantidad = 100;
        this.almacenamiento = new Sala[cantidad];
    }

    /**
     * Constructor con tamaño personalizado
     * @param cantidad Tamaño del arreglo
     */
    public ImplementacionOperacionCRUD(int cantidad) {
        this.cantidad = cantidad;
        this.almacenamiento = new Sala[cantidad];
    }

    /**
     * Crea una nueva sala en el primer espacio libre (null) del arreglo
     * @param sala La sala a crear
     * @return true si se creó exitosamente, false en caso contrario
     */
    @Override
    public boolean create(Sala sala) {
        // Validaciones
        if (sala == null) {
            System.err.println("Error: La sala no puede ser nula");
            return false;
        }
        
        if (sala.getNum_int() == null || sala.getNum_int().trim().isEmpty()) {
            System.err.println("Error: La sala debe tener un número interno válido");
            return false;
        }
        
        // Verificar si ya existe una sala con el mismo número interno
        if (read(sala.getNum_int()) != null) {
            System.err.println("Error: Ya existe una sala con el número: " + sala.getNum_int());
            return false;
        }
        
        // Buscar primer espacio null de izquierda a derecha
        for (int i = 0; i < almacenamiento.length; i++) {
            if (almacenamiento[i] == null) {
                almacenamiento[i] = sala;
                System.out.println("Sala creada exitosamente en posición " + i);
                return true;
            }
        }
        
        System.err.println("Error: No hay espacio disponible en el arreglo");
        return false;
    }

    /**
     * Lee/consulta una sala por su número interno (ID)
     * @param num_int Número interno de la sala
     * @return La sala encontrada o null si no existe
     */
    @Override
    public Sala read(String num_int) {
        // Validación
        if (num_int == null || num_int.trim().isEmpty()) {
            System.err.println("Error: El número interno no puede ser nulo o vacío");
            return null;
        }
        
        // Buscar sala por número interno
        for (int i = 0; i < almacenamiento.length; i++) {
            if (almacenamiento[i] != null && 
                almacenamiento[i].getNum_int().equals(num_int)) {
                return almacenamiento[i];
            }
        }
        
        return null;
    }

    /**
     * Actualiza una sala existente identificada por su número interno
     * @param sala Sala con los datos actualizados (debe contener el num_int)
     * @return true si se actualizó exitosamente, false en caso contrario
     */
    @Override
    public boolean actualizar(Sala sala) {
        // Validaciones
        if (sala == null) {
            System.err.println("Error: La sala no puede ser nula");
            return false;
        }
        
        if (sala.getNum_int() == null || sala.getNum_int().trim().isEmpty()) {
            System.err.println("Error: La sala debe tener un número interno válido");
            return false;
        }
        
        // Buscar y actualizar
        for (int i = 0; i < almacenamiento.length; i++) {
            if (almacenamiento[i] != null && 
                almacenamiento[i].getNum_int().equals(sala.getNum_int())) {
                almacenamiento[i] = sala;
                System.out.println("Sala actualizada exitosamente");
                return true;
            }
        }
        
        System.err.println("Error: No se encontró sala con número: " + sala.getNum_int());
        return false;
    }

    /**
     * Elimina una sala del sistema (la establece como null)
     * @param num_int Número interno de la sala a eliminar
     * @return true si se eliminó exitosamente, false en caso contrario
     */
    @Override
    public boolean eliminar(String num_int) {
        // Validación
        if (num_int == null || num_int.trim().isEmpty()) {
            System.err.println("Error: El número interno no puede ser nulo o vacío");
            return false;
        }
        
        // Buscar y eliminar
        for (int i = 0; i < almacenamiento.length; i++) {
            if (almacenamiento[i] != null && 
                almacenamiento[i].getNum_int().equals(num_int)) {
                almacenamiento[i] = null;
                System.out.println("Sala eliminada exitosamente");
                return true;
            }
        }
        
        System.err.println("Error: No se encontró sala con número: " + num_int);
        return false;
    }

    /**
     * Lista todas las salas almacenadas (no nulas)
     * @return Arreglo con todas las salas no nulas
     */
    @Override
    public Sala[] listar() {
        // Contar salas no nulas
        int contador = 0;
        for (int i = 0; i < almacenamiento.length; i++) {
            if (almacenamiento[i] != null) {
                contador++;
            }
        }
        
        // Crear arreglo del tamaño exacto
        Sala[] resultado = new Sala[contador];
        int indice = 0;
        
        // Copiar salas no nulas
        for (int i = 0; i < almacenamiento.length; i++) {
            if (almacenamiento[i] != null) {
                resultado[indice] = almacenamiento[i];
                indice++;
            }
        }
        
        return resultado;
    }

    /**
     * Obtiene estadísticas del almacenamiento
     * @return String con información de ocupación
     */
    public String obtenerEstadisticas() {
        int ocupados = 0;
        for (int i = 0; i < almacenamiento.length; i++) {
            if (almacenamiento[i] != null) {
                ocupados++;
            }
        }
        
        double porcentaje = (ocupados * 100.0) / cantidad;
        return String.format("📊 Estadísticas: %d/%d salas ocupadas (%.1f%%)", 
                           ocupados, cantidad, porcentaje);
    }
}