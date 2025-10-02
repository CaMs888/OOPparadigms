package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Sala;

public interface OperacionCRUD {
    
    boolean create(Sala sala);
    
    Sala read(String num_int);
    
    boolean actualizar(Sala sala);
    
    boolean eliminar(String num_int);
    
    Sala[] listar(); // Cambiado de List<Sala> a Sala[]
    
    boolean serializar(String nombreArchivo);
    
    boolean deserializar(String nombreArchivo);
}