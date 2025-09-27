package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Sala;

public interface OperacionCRUD {
    boolean crear(Sala sala);
    boolean eliminar(String numInt);
    boolean actualizar(Sala sala);
    Sala leer(String numInt);
}
