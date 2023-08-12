package trabalhandoComArquivos.exemplo2.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        //String para definir o caminho do arquivo
        String path = "c:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            //Ler a a linha (caso não tenha mais linha retorna null)
            String line = br.readLine();

            //Enquanto linha for diferente de nulo será exibido na tela
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

