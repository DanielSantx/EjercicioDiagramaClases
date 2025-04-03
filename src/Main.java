import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona manuel = new Persona("67676767L", "Manuel", "manuel@outlook.com");
        Persona daniel = new Persona("87878787Ñ", "Daniel", "daniel@gmail.com");

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Quién eres? Manuel/Daniel: ");
        String persona = sc.nextLine();

        Persona p = null;

        if (persona.equalsIgnoreCase("Manuel")) {
            p = manuel;
        } else if (persona.equalsIgnoreCase("Daniel")) {
            p = daniel;
        } else {
            System.out.println("Nombre no válido");
            sc.close();
            return;
        }

        System.out.print("¿Qué va a hacer la persona? Andar/Pensar/Hablar: ");
        String accion = sc.nextLine();

        if (accion.equalsIgnoreCase("andar")) {
            p.andar();
        } else if (accion.equalsIgnoreCase("pensar")) {
            p.pensar();
        } else if (accion.equalsIgnoreCase("hablar")) {
            p.hablar();
        } else {
            System.out.println("Acción no válida");
        }
    }
}