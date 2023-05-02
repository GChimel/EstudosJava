package exercicios_vetores.alturas.application;

import exercicios_vetores.alturas.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qtdPessoas = input.nextInt();

        Pessoas[] vetor = new Pessoas[qtdPessoas];

        System.out.println("Dados da primeira pessoa:");

        for (int i = 0; i < vetor.length; i++) {
            input.nextLine();
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Altura: ");
            double altura = input.nextDouble();
            vetor[i] = new Pessoas(nome, idade, altura);
        }

        double alturaMedia = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            alturaMedia = vetor[i].getAltura() / vetor.length;
        }

        double porcentagemPessoas = 0.0;
        double quantidadePessoas = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                quantidadePessoas += 1;
                porcentagemPessoas = ((quantidadePessoas * 100) / vetor.length);

                System.out.println(vetor[i].getNome() + " ");
            }
        }

        System.out.printf("Altura média: %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%.", porcentagemPessoas);

        input.close();
    }
}
