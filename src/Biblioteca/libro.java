package Biblioteca;

import java.util.Date;

public class libro extends autor {

    private int id;
    private String titulo;
    private String tipoLibro;
    private String editorial;
    private Date fechaLanz;

    public libro(String nombre, String nacionalidad, Date fechaNac, int id, String titulo, String tipoLibro, String editorial, Date fechaLanz) {
        super(nombre, nacionalidad, fechaNac);
        this.id = id;
        this.titulo = titulo;
        this.tipoLibro = tipoLibro;
        this.editorial = editorial;
        this.fechaLanz = fechaLanz;
    }

    public void getNombreAutor() {
        this.getNombre();
    }
}
