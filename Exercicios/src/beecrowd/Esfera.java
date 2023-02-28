package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double calc, pi = 3.14159;
        System.out.println("Informe o valor do Raio: ");
        double raio = sc.nextDouble();

        calc = (4 / 3.0) * pi * (Math.pow(raio, 3));

        System.out.printf("VOLUME = %.3f\n", calc);

    }
}
