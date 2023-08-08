package Tratamento_Excecoes.Exemplo1.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        method1();
        System.out.println("End of program!");

        sc.close();
    }

    public static void method1() {
        System.out.println("***METOD1 START***");
        method2();
        System.out.println("***METOD1 END***");
    }
    public static void method2() {
        System.out.println("***METHOD2 START***");
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
            //Utilizado para exibir toda a chamada de métodos na seção.
            e.printStackTrace();
        }
        //Tratamento de valor inválido.
        catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        System.out.println("***METOD2 END***");
        sc.close();
    }
}
