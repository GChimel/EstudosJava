package exercicios_vetores.maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = input.nextInt();

        int vetor[] = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            int numero = input.nextInt();
            vetor[i] = numero;
        }

        int maior = 0;
        int posicao = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao ++;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Posição do maior valor: " + posicao);

        input.close();
    }
}
