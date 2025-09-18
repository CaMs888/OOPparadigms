package co.edu.poli.actividad3.modelo;

//HOLI
public class Autor {
    private String fecha_nac;
    private String nombre;
    private String num_ID;
    private Pais pais;

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
}
