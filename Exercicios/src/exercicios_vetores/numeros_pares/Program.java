package exercicios_vetores.numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int vetor[] = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            vetor[i] = numero;
        }

        int qtdPares = 0;
        System.out.println("Números pares: ");
        for (int i = 0; i < vetor.length; i++) {
            if ( vetor[i] % 2 == 0 ) {
                qtdPares += 1;
                System.out.print(" " + vetor[i]);
            }
        }

        System.out.println("\nQuantidade de números pares: " + qtdPares);

        sc.close();
    }
}
