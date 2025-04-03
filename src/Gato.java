public class Gato extends Animal {

    public Gato(String nombre, String raza, String color) {
        super(nombre, raza, color);
    }

    @Override
    public void respirar() {
        super.respirar();
    }

    public void maullar() {
        System.out.println("*Miau*");
    }
}
