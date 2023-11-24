import java.util.Scanner;
public class Main {
    public Main(String[] args) {
        double[][] calificacionesE = new double[10][5];
        leerNotas(calificacionesE);
        double[] promedioE = notaProm(calificacionesE);
        mostrarP(promedioE);
        verSuple(promedioE);
    }

    private static double[] notaProm(double[][] calificacionesE) {
        double[] promedio = new double[calificacionesE.length];
        for(int i = 0; i < calificacionesE.length; i++){
            double suma = 0;
            for(int j = 0; j < calificacionesE[i].length; j ++);{
                int j = 0;
                suma += calificacionesE[i][j];
            }
        }
        return promedio;
    }
    private static void mostrarP(double[] promedioE) {
        System.out.println("Promedio de cada estudiante: ");
        for (int i = 0; i < promedioE.length; i++){
            System.out.println("Estudiante " + (i + 1) + ": " + promedioE[i]);
        }
    }
    private static void verSuple(double[] promedioE) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese s")

    }
    private static void leerNotas(double[][] promedioE) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngrese su numero de estudiante para verificar si se quedo a supletorio:");
        int numeroEstudiante = scanner.nextInt();

        if (numeroEstudiante > 0 && numeroEstudiante <= promedioE.length) {
            double[] promedioEstudiante = promedioE[numeroEstudiante - 1];
            System.out.println("El promedio del estudiante " + numeroEstudiante + " es: " + promedioEstudiante);

            System.out.println("Ni modo anda alistandote para el suple");
        } else {
            System.out.println("Número de estudiante no válido");
        }
    }
    }
}
