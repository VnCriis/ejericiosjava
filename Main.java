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
        }
        return promedio;
    }

    private static void mostrarP(double[] promedioE) {
    }

    private static void verSuple(double[] promedioE) {
    }

    private static void leerNotas(double[][] calificacionesE) {

        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        for (int i = 0; i < calificacionesE.length; i++) {
            System.out.println("Ingrese las calificaciones del estudiante " + (i + 1) + ":");
            for (int j = 0; j < calificacionesE[i].length; j++) {
                System.out.print("Ingrese la calificacion de la materia " + (j + 1) + ": ");
                calificacionesE[i][j] = scanner.nextDouble();
            }
        }
    }
}
