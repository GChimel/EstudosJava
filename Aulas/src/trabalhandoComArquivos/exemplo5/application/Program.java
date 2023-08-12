package trabalhandoComArquivos.exemplo5.application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //Pega o nome do arquivo
        System.out.println("getName: " + path.getName());

        //Pega o caminho do arquivo
        System.out.println("getParent: " + path.getParent());

        //Pega o caminho completo do arquivo
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }
}
