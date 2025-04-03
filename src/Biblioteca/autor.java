package Biblioteca;

import java.util.Date;

public class autor {

    private String nombre;
    private String nacionalidad;
    private Date fechaNac;

    public autor(String nombre, String nacionalidad, Date fechaNac) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }
}
