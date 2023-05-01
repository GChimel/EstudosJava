package exercicios_vetores.soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numeros = input.nextInt();

        double array[] = new double[numeros];

        for (int i=0; i<array.length; i++) {
            System.out.print("Digite um número: ");
            array[i] = input.nextDouble();
        }

        System.out.print("VALORES = ");

        for (int i=0; i<array.length; i++) {
            System.out.print(" " + array[i]);
        }

        double sum = 0.0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }

        double average = sum / array.length;

        System.out.println("\nSOMA = " + sum);
        System.out.println("MEDIA = " + average);

        input.close();
    }
}
//