package modulosAntigos;

import java.util.Scanner;

public class whileProblema1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        int soma = 0;

        while (numero != 0) {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();
            soma += numero;
        }
        System.out.println(soma);

        sc.close();
    }
}
