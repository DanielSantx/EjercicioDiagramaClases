package Biblioteca;

public class copiasImpresas implements prestamoLibro{

    private int idCopia;
    private String calidad;

    public copiasImpresas(int idCopia, String calidad) {
        this.idCopia = idCopia;
        this.calidad = calidad;
    }

    public void cesion(String idCopia) {
        System.out.println("Libro cedido");
    }

    @Override
    public void registroFechaPrestamo() {

    }

    @Override
    public void registroFechaDevolucion() {

    }
}
