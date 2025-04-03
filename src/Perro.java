public class Perro extends Animal {

    public Perro(String nombre, String raza, String color) {
        super(nombre, raza, color);
    }

    @Override
    public void respirar() {
        super.respirar();
    }

    public void ladrar() {
        System.out.println("*Guau*");
    }
}
