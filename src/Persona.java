public class Persona {

    private String dni;
    private String nombre;
    private String correo;

    public Persona(String dni, String nombre, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void hablar() {
        System.out.println(nombre + " va a hablar");
    }
    public void andar() {
        System.out.println(nombre + " va a andar");
    }
    public void pensar() {
        System.out.println(nombre + " va a pensar");
    }
}
