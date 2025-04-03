package Biblioteca;

public class lector implements prestamoLibro{

    private int dni;
    private String situacionLector;

    public lector(int dni, String situacionLector) {
        this.dni = dni;
        this.situacionLector = situacionLector;
    }

    public void cogerLibro(String dni) {
        System.out.println("El lector ha codigo un libro");
    }

    public void devolverLibro(String dni) {
        System.out.println("El lector ha devuelto el libro");
    }

    @Override
    public void registroFechaPrestamo() {

    }

    @Override
    public void registroFechaDevolucion() {

    }

    @Override
    public void multa() {
        prestamoLibro.super.multa();
    }
}
