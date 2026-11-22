import java.util.List;

public class Main {

    public static void main(String[] args) {


        LibretaCalificaciones libreta = new LibretaCalificaciones("Valentina Ortiz");

        System.out.println("=== Estado inicial ===");
        System.out.println(libreta.obtenerInformacion());

        System.out.println("\n=== Notas válidas ===");
        libreta.agregarNota(7.5);
        libreta.agregarNota(9);
        libreta.agregarNota(6);
        libreta.agregarNota(8.25);

        System.out.println("\n=== Notas inválidas ===");
        libreta.agregarNota(11);
        libreta.agregarNota(-2);
        libreta.agregarNota(Double.NaN);

        System.out.println("\n=== Intento de alterar las notas desde afuera ===");
        List<Double> copia = libreta.getNotas();
        copia.add(10.0);
        copia.set(0, 1.0);
        System.out.println("Notas reales intactas: " + libreta.getNotas());

        System.out.println("\n=== Resultado final ===");
        System.out.println("Promedio final: " + String.format("%.2f", libreta.obtenerPromedio()));
        System.out.println(libreta.obtenerInformacion());


    }
}