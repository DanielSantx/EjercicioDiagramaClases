package Biblioteca;

public interface prestamoLibro {

    void registroFechaPrestamo();
    void registroFechaDevolucion();

    default void multa() {
        System.out.println("No tiene multa");
    }
}
