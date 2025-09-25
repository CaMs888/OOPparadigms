// ImplementacionOperacionCRUD.java
package co.edu.poli.actividad3.servicios;

public class ImplementacionOperacionCRUD implements OperacionCRUD {

    public ImplementacionOperacionCRUD(int i) {
		// TODO Auto-generated constructor stub
	}

	public ImplementacionOperacionCRUD() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public void create(Object obj) {
        System.out.println("Objeto creado: " + obj);
    }

    @Override
    public Object read(String id) {
        System.out.println("Leyendo objeto con id: " + id);
        return null;
    }

    @Override
    public void update(Object obj) {
        System.out.println("Objeto actualizado: " + obj);
    }

    @Override
    public void delete(String id) {
        System.out.println("Objeto eliminado con id: " + id);
    }

	public void listarTodo() {
		// TODO Auto-generated method stub
		
	}
}
