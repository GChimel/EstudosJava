import java.util.Locale;

public class saidaDeDados {
    public static void main(String[] args) {
        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        Locale.setDefault(Locale.US);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.println("Bom dia!");
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Esse mes meu carro andou: " + x + " quilômetros");
        System.out.printf("Esse mes meu carro andou: %.2f quilômetros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}