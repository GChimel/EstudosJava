package trabalhandoComArquivos.exemplo3.application;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        //Vetor de string
        String[] lines = new String[] {"Good morning", "Good Afternoon",
        "Good night"};

        //Caminho do arquivo
        String path = "c:\\temp\\out.txt";

        //Sem utilizar o parÂmetro true ele irá criar ou recriar o arquivo.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path/* parâmetro true*/))) {
            //Para cada String line contido no vetor lines
            for (String line : lines) {
                //write para escrever
                bw.write(line);
                // quebra de linha
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
