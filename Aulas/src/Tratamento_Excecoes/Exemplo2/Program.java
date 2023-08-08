package Tratamento_Excecoes.Exemplo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        //e.getMessage irá retornar a mensagem padrão do java sobre o erro.
        catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        //Independentemente do funcionamento do sistema acima é preciso fechar o scanner para evitar que fique aberto.
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}