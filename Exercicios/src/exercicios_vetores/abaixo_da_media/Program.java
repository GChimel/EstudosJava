package exercicios_vetores.abaixo_da_media;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double media[] = new double[n];

        for (int i = 0; i < media.length; i++) {
            System.out.print("Digite um número: ");
            media[i] = sc.nextDouble();
        }

        double sum = 0.0;
        double mediaValores = 0.0;

        for (int i = 0; i < media.length; i++) {
            sum += media[i];
            mediaValores = sum / media.length;
        }

        System.out.printf("Media do vetor: %.3f\n", mediaValores);

        System.out.print("Elementos abaixo da media: \n");

        for (int i = 0; i < media.length; i++) {
            if (media[i] < mediaValores) {
                System.out.println(media[i]);
            }
        }
        sc.close();
    }
}
