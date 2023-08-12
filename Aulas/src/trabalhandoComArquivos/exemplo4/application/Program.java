package trabalhandoComArquivos.exemplo4.application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Usuário vai digitar o caminho da pasta.
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //Será adicionado em um vetor todas as pastas.
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folder:");
        for (File pastas : folders) {
            System.out.println(pastas);
        }

        //Será adicionado ao vetor todos os arquivos.
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files:");
        for (File arquivos : files) {
            System.out.println(arquivos);
        }

        boolean success = new File(strPath + "\\novaPasta").mkdir();
        System.out.println("Directory created sucessfully" + success);
        sc.close();
    }
}