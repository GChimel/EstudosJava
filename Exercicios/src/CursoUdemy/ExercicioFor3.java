package CursoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroCasos = sc.nextInt();

        for (int i=0; i<=numeroCasos; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double calc;

            calc = (a * 2.0 + b * 3.0 + c * 5.0) / 10;

            System.out.printf("Media = %.1f", calc);
        }

        sc.close();
    }
}
