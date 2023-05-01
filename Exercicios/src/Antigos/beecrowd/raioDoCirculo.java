package Antigos.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class raioDoCirculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double raio, calc, pi = 3.14159;
        raio = sc.nextDouble();

        calc = pi * Math.pow(raio, 2);

        System.out.printf("A= %.4f", calc);
        sc.close();
    }
}
