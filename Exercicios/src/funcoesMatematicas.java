public class funcoesMatematicas {
    public static void main(String[] args) {

        double a = 20;
        double b = 3;
        double c = 12;

        double x,y,z;

        x = Math.sqrt(a);
        System.out.println("Raiz quadrada de " + a + " = " + x);
        y = Math.sqrt(b);
        System.out.println("Raiz quadrada de " + b + " = " + y);
        z = Math.sqrt(c);
        System.out.println("Raiz quadrada de " + c + " = " + z);

        x = Math.pow(b, 2);
        System.out.println("A potenciação de " + b + " + 2 = " + x);
        y = Math.pow(a, b);
        System.out.println("A potenciação de " + a + " + " + b + " = " + y);
        x = Math.pow(10,2);
        System.out.println("A pontenciação de 20 + 2 é = " + x);

        x = Math.abs(-5);
        System.out.println(x);
        y = Math.abs(10);
        System.out.println(y);

    }
}
