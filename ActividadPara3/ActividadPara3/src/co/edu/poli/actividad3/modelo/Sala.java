// ==================================================================================== 
// PAQUETE: co.edu.poli.actividad3.modelo
// ====================================================================================

// ====================================================================================
// CLASE ABSTRACTA: Sala (Superclase de mayor jerarquía)
// ====================================================================================

package co.edu.poli.actividad3.modelo;

/**
 * Clase abstracta que representa una sala del museo.
 * Esta es la clase de mayor jerarquía del sistema.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024
 */
public abstract class Sala {
    
    /** Exposición asociada a la sala */
    protected Exposicion exposicion;
    
    /** Nombre de la sala */
    protected String nombre;
    
    /** Número interno de la sala */
    protected String num_int;

    /**
     * Constructor por defecto
     */
    public Sala() {
    }

    /**
     * Constructor con parámetros
     * @param exposicion Exposición asociada
     * @param nombre Nombre de la sala
     * @param num_int Número interno de la sala
     */
    public Sala(Exposicion exposicion, String nombre, String num_int) {
        this.exposicion = exposicion;
        this.nombre = nombre;
        this.num_int = num_int;
    }

    /**
     * Método para acceder a información de la sala
     * @param tipoUsuario Tipo de usuario que accede
     * @return String con mensaje de acceso
     */
    public String acceso(String tipoUsuario) {
        return "Acceso general permitido a la sala " + this.nombre;
    }

    // Getters y Setters
    public Exposicion getExposicion() { 
        return exposicion; 
    }
    
    public void setExposicion(Exposicion exposicion) { 
        this.exposicion = exposicion; 
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getNum_int() { 
        return num_int; 
    }
    
    public void setNum_int(String num_int) { 
        this.num_int = num_int; 
    }

    @Override
    public String toString() {
        return "Sala: " + nombre + " (Núm: " + num_int + ")";
    }
}