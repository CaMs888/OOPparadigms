// OperacionCRUD.java
package co.edu.poli.actividad3.servicios;

public interface OperacionCRUD {
    void create(Object obj);
    Object read(String id);
    void update(Object obj);
    void delete(String id);
}
