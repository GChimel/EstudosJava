package Antigos.CursoUdemy;

import java.util.Scanner;
public class numeroPositivoOuNegativo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("POSITIVO");
        }
        sc.close();
    }
}
