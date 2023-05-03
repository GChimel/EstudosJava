package exercicios_vetores.somas_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos valores vai ter em cada vetor? ");
        int n = input.nextInt();

        int A[] = new int[n];
        int B[] = new int[n];
        int C[] = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Valor: ");
            A[i] = input.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print("Valor: ");
            B[i] = input.nextInt();
        }

        System.out.println("Vetor resultante: ");

        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }

        input.close();
    }
}
