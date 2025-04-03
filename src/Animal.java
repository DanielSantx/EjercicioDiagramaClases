public class Animal {

    protected String nombre;
    protected String raza;
    protected String color;

    public Animal(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    public void respirar() {
        System.out.println("*Sniff*");
    }
}
