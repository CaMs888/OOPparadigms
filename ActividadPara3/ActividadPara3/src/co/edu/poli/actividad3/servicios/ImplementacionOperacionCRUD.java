package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Sala;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ImplementacionOperacionCRUD implements OperacionCRUD {
    
    private List<Sala> almacenamiento;
    private static final String ARCHIVO_PREDETERMINADO = "salas_museo.dat";

    public ImplementacionOperacionCRUD() {
        this.almacenamiento = new ArrayList<>();
        deserializar(ARCHIVO_PREDETERMINADO);
    }

    @Override
    public boolean create(Sala sala) {
        if (sala == null) {
            System.err.println("Error: La sala no puede ser nula");
            return false;
        }
        
        if (sala.getNum_int() == null || sala.getNum_int().trim().isEmpty()) {
            System.err.println("Error: La sala debe tener un numero interno valido");
            return false;
        }
        
        if (read(sala.getNum_int()) != null) {
            System.err.println("Error: Ya existe una sala con el numero: " + sala.getNum_int());
            return false;
        }
        
        almacenamiento.add(sala);
        System.out.println("Sala creada exitosamente: " + sala.getNombre());
        return true;
    }

    @Override
    public Sala read(String num_int) {
        if (num_int == null || num_int.trim().isEmpty()) {
            return null;
        }
        
        for (Sala sala : almacenamiento) {
            if (sala.getNum_int().equals(num_int)) {
                return sala;
            }
        }
        return null;
    }

    @Override
    public boolean actualizar(Sala sala) {
        if (sala == null || sala.getNum_int() == null) {
            System.err.println("Error: Datos de sala invalidos");
            return false;
        }
        
        for (int i = 0; i < almacenamiento.size(); i++) {
            if (almacenamiento.get(i).getNum_int().equals(sala.getNum_int())) {
                almacenamiento.set(i, sala);
                System.out.println("Sala actualizada exitosamente: " + sala.getNombre());
                return true;
            }
        }
        
        System.err.println("Error: No se encontro sala con numero: " + sala.getNum_int());
        return false;
    }

    @Override
    public boolean eliminar(String num_int) {
        if (num_int == null || num_int.trim().isEmpty()) {
            System.err.println("Error: Numero interno invalido");
            return false;
        }
        
        for (int i = 0; i < almacenamiento.size(); i++) {
            if (almacenamiento.get(i).getNum_int().equals(num_int)) {
                Sala eliminada = almacenamiento.remove(i);
                System.out.println("Sala eliminada: " + eliminada.getNombre());
                return true;
            }
        }
        
        System.err.println("Error: No se encontro sala con numero: " + num_int);
        return false;
    }

    @Override
    public Sala[] listar() {
        // Convertir List<Sala> a Sala[]
        return almacenamiento.toArray(new Sala[0]);
    }

    public boolean serializar(String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
             new FileOutputStream(nombreArchivo))) {
            
            oos.writeObject(almacenamiento);
            System.out.println("Datos serializados exitosamente en: " + nombreArchivo);
            System.out.println("Total de salas guardadas: " + almacenamiento.size());
            return true;
            
        } catch (IOException e) {
            System.err.println("Error al serializar: " + e.getMessage());
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    public boolean deserializar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            System.out.println("Archivo no existe, se creara uno nuevo: " + nombreArchivo);
            return false;
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(
             new FileInputStream(nombreArchivo))) {
            
            almacenamiento = (List<Sala>) ois.readObject();
            System.out.println("Datos deserializados exitosamente desde: " + nombreArchivo);
            System.out.println("Total de salas cargadas: " + almacenamiento.size());
            return true;
            
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al deserializar: " + e.getMessage());
            return false;
        }
    }

    public String obtenerEstadisticas() {
        return String.format("Salas guardadas: %d salas en memoria", almacenamiento.size());
    }
    
    public boolean serializar() {
        return serializar(ARCHIVO_PREDETERMINADO);
    }
    
    public boolean deserializar() {
        return deserializar(ARCHIVO_PREDETERMINADO);
    }
}