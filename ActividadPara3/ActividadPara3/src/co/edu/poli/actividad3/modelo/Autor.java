package co.edu.poli.actividad3.modelo;

/**
 * Representa un autor de obras (pinturas, esculturas u objetos).
 * Contiene datos básicos como fecha de nacimiento, nombre, número de identificación y país.
 */
public class Autor {
    private String fecha_nac;
    private String nombre;
    private String num_ID;
    private Pais pais;

    /**
     * Constructor completo de Autor.
     *
     * @param fecha_nac fecha de nacimiento en formato YYYY-MM-DD
     * @param nombre nombre completo
     * @param num_ID documento de identidad
     * @param pais país de origen
     */
    public Autor(String fecha_nac, String nombre, String num_ID, Pais pais) {
        this.fecha_nac = fecha_nac;
        this.nombre = nombre;
        this.num_ID = num_ID;
        this.pais = pais;
    }

    public String getFecha_nac() { return fecha_nac; }
    public void setFecha_nac(String fecha_nac) { this.fecha_nac = fecha_nac; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNum_ID() { return num_ID; }
    public void setNum_ID(String num_ID) { this.num_ID = num_ID; }
    public Pais getPais() { return pais; }
    public void setPais(Pais pais) { this.pais = pais; }

    @Override
    public String toString() {
        return "Autor{" + "nombre='" + nombre + '\'' + ", num_ID='" + num_ID + '\'' + ", pais=" + (pais!=null?pais.getNombre():"null") + '}';
    }
}

