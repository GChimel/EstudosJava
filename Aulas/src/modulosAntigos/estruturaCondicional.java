package modulosAntigos;

import java.util.Scanner;
public class estruturaCondicional {
    public static void main(String[] args) {

        int hora;

        Scanner sc = new Scanner(System.in);
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else if (hora > 12 && hora < 18) {
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }

        sc.close();
    }
}
