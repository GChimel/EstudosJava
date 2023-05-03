package exercicios_vetores.media_pares;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();

        int vetor[] = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = input.nextInt();
        }

        int numerosPares = 0;
        double soma = 0.0;
        double media = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                numerosPares ++;
                soma += vetor[i];
                media = soma / numerosPares;
            }
        }

        if (numerosPares == 0) {
            System.out.println("Nenhum número par!");
        } else {
            System.out.printf("A media dos pares é: %.2f", media);
        }

        input.close();
    }
}
