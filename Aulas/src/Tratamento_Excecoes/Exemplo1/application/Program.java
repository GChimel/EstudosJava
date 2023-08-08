package Tratamento_Excecoes.Exemplo1.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            //Vetor para informar nomes separando com um espaço
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        //Tratamento de posição inválida.
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        }
        //Tratamento de valor inválido.
        catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        System.out.println("End of program");

        sc.close();
    }
}
