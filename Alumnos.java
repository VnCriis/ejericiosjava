import java.util.Scanner;
public class Alumnos {
    public static void alumnos(String[] args) {
        double[][] calificacionesE = new double[10][5];
        leerNotas(calificacionesE);
        double [] promedioE = notaProm(calificacionesE);
        mostrarP(promedioE);
        verSuple(promedioE);
    }
    private static double[] notaProm(double[][] calificacionesE) {
        return new double[0];
    }

    private static void mostrarP(double[] promedioE) {
    }
    private static void verSuple(double[] promedioE) {
    }
    private static void leerNotas(double[][] calificacionesE) {
        Scanner scanner = new Scanner(System.in);
    }
}
