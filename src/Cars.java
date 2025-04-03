public class Cars {

    private String matricula;
    private String kilometraje;
    private String maxVelocidad;

    public void avisosEmergencia(String matricula) {
        System.out.println("El coche con matrícula: " + matricula + ", ha tenido un accidente");
    }

    public void aparcar(String matricula) {
        System.out.println("El coche con matrícula: " + matricula + ", ha aparcado");
    }

    public void acelerar(String matricula) {
        System.out.println("El coche con matrícula: " + matricula + ", ha acelerado");
    }
}
