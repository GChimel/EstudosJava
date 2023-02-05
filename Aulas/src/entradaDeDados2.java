import java.util.Scanner;
public class entradaDeDados2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeCompleto, cidadeEstado;
        int numeroDaCasa;

        numeroDaCasa = sc.nextInt();
        sc.nextLine();
        nomeCompleto = sc.nextLine();
        cidadeEstado = sc.nextLine();

        System.out.println("Numero da casa é:"+ numeroDaCasa);
        System.out.println("Seu nome completo é:"+ nomeCompleto);
        System.out.println("Sua cidade e estádo é:"+ cidadeEstado);

        sc.close();
    }
}
