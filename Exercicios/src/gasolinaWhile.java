import java.util.Scanner;
public class gasolinaWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Preferência de produtos \n 1- Alcool\n 2- Gasolina\n 3- Diesel\n");

        System.out.println("Digite o código do seu produto preferido!");
        int preferencia = sc.nextInt();

        while (preferencia != 4) {
            if (preferencia == 1) {
                alcool += 1;
            }
            else if (preferencia == 2) {
                gasolina += 1;
            }
            else if (preferencia == 3) {
                diesel += 1;
            }
            else {
                System.out.println("Código inválido, digite novamente: ");
            }
            System.out.println("Para encerar o processo digite 4\nPara adicionar mais produtos digite o seu código");
            preferencia = sc.nextInt();
        }

        System.out.println("Muito obrigado!\nSeus produtos preferidos são:\n");

        System.out.println("Alcool " + alcool);
        System.out.println("Gasolina " + gasolina);
        System.out.println("Diesel " + diesel);

        sc.close();
    }
}
