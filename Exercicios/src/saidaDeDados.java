import java.util.Locale;

public class saidaDeDados {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Produtcs:");
        System.out.printf("%s, wich price is $ %.2f%n%s, wich price is %.2f%n", product1, price1, product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("Measue witch eight decimal places: %f%nRouded (three decimal places):" +
                        "%.3f%n", measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Us decimal point: %.3f%n", measure);
    }
}
