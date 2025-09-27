package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Sala;

public class ImplementacionOperacionCRUD implements OperacionCRUD {

    private static final int CAPACIDAD = 100;
    private static final Sala[] almacenamiento = new Sala[CAPACIDAD];
    private static int cantidad = 0;

    @Override
    public boolean crear(Sala sala) {
        if (cantidad >= CAPACIDAD) return false;
        almacenamiento[cantidad++] = sala;
        return true;
    }

    @Override
    public boolean eliminar(String numInt) {
        for (int i = 0; i < cantidad; i++) {
            if (almacenamiento[i].getNumInt().equals(numInt)) {
                for (int j = i; j < cantidad - 1; j++) {
                    almacenamiento[j] = almacenamiento[j + 1];
                }
                almacenamiento[--cantidad] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizar(Sala sala) {
        for (int i = 0; i < cantidad; i++) {
            if (almacenamiento[i].getNumInt().equals(sala.getNumInt())) {
                almacenamiento[i] = sala;
                return true;
            }
        }
        return false;
    }

    @Override
    public Sala leer(String numInt) {
        for (int i = 0; i < cantidad; i++) {
            if (almacenamiento[i].getNumInt().equals(numInt)) {
                return almacenamiento[i];
            }
        }
        return null;
    }
}
