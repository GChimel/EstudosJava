package trabalhandoComArquivos.exemplo1.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //Utilizamos duas \\ para identificar uma \ (por conta do \n por exemplo)
        File arquivo = new File("c:\\temp\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(arquivo);
            //Enquanto tiver uma nova linha.
            while (sc.hasNextLine()) {
                //Exiba na tela a linha.
                System.out.println(sc.nextLine());
            }
        }
        //Tramento de exceção
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            //Criar um if para saber se o sc é diferente de nullo
            if (sc != null) {
                sc.close();
            }
        }
    }
}
