import java.util.ArrayList;
import java.util.List;

public class LibretaCalificaciones {

    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 10.0;
    private static final double PROMEDIO_APROBACION = 6.0;

    private final String nombreEstudiante;
    private final List<Double> notas;

    public LibretaCalificaciones(String nombreEstudiante) {
        if (nombreEstudiante == null || nombreEstudiante.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del estudiante no puede estar vacío.");
        }
        this.nombreEstudiante = nombreEstudiante;
        this.notas = new ArrayList<>();
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public int getCantidadNotas() {
        return notas.size();
    }


    public List<Double> getNotas() {
        return new ArrayList<>(notas);
    }


    public boolean agregarNota(double nota) {

        if (Double.isNaN(nota) || nota < NOTA_MINIMA || nota > NOTA_MAXIMA) {
            System.out.println("Error: la nota " + nota + " es inválida. Debe estar entre "
                    + NOTA_MINIMA + " y " + NOTA_MAXIMA + ".");
            return false;
        }
        notas.add(nota);
        System.out.println("Nota " + nota + " registrada correctamente.");
        return true;
    }


    public double obtenerPromedio() {
        if (notas.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    public String obtenerEstadoAcademico() {
        if (notas.isEmpty()) {
            return "SIN NOTAS";
        }
        return obtenerPromedio() >= PROMEDIO_APROBACION ? "APROBADO" : "DESAPROBADO";
    }

    public String obtenerInformacion() {
        return "Estudiante: " + nombreEstudiante
                + " | Notas cargadas: " + notas.size()
                + " | Promedio: " + String.format("%.2f", obtenerPromedio())
                + " | Estado: " + obtenerEstadoAcademico();
    }
}