public class Pez extends Animal {

    public Pez(String nombre, String raza, String color) {
        super(nombre, raza, color);
    }

    @Override
    public void respirar() {
        super.respirar();
    }

    public void nadar() {
        System.out.println("*Mamaguevo*");
    }
}
