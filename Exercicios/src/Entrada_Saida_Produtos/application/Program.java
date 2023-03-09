package Entrada_Saida_Produtos.application;

import Entrada_Saida_Produtos.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println(); // Jump-line
        System.out.println("Product data: " + product);

        System.out.println(); // Jump-line
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);

        System.out.println(); // Jump-line
        System.out.println("Updated data: " + product);

        System.out.println(); // Jump-line
        System.out.print("Enter the number of products to be reoved from stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);

        System.out.println(); // Jump-line
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
