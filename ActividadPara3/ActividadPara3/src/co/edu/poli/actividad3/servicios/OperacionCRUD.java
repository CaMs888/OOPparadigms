// ====================================================================================
// INTERFACE: OperacionCRUD
// ====================================================================================

package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Sala;

/**
 * Interface que define las operaciones CRUD para Salas.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024
 */
public interface OperacionCRUD {
    
    /**
     * Crea una nueva sala en el sistema
     * @param sala La sala a crear
     * @return true si la creación fue exitosa, false en caso contrario
     */
    boolean create(Sala sala);
    
    /**
     * Lee/consulta una sala por su ID
     * @param num_int Número interno de la sala
     * @return La sala encontrada o null si no existe
     */
    Sala read(String num_int);
    
    /**
     * Actualiza una sala existente
     * @param num_int Número interno de la sala a actualizar
     * @param sala Nuevos datos de la sala
     * @return true si la actualización fue exitosa, false en caso contrario
     */
    boolean actualizar(Sala sala);
    
    /**
     * Elimina una sala del sistema
     * @param num_int Número interno de la sala a eliminar
     * @return true si la eliminación fue exitosa, false en caso contrario
     */
    boolean eliminar(String num_int);
    
    /**
     * Lista todas las salas
     * @return Arreglo con todas las salas
     */
    Sala[] listar();
}