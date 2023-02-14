package CursoUdemy;

import java.util.Scanner;
public class senhaIncorretaWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Inválida");
            System.out.println("Digite sua senha: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

        sc.close();
    }
}
