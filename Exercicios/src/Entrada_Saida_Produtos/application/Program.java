package Entrada_Saida_Produtos.application;

import Entrada_Saida_Produtos.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        product.setName("computador");

        System.out.println(); // Jump-line
        System.out.println("Product data: " + product);

        System.out.println(); // Jump-line
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);

        System.out.println(); // Jump-line
        System.out.println("Updated data: " + product);

        System.out.println(); // Jump-line
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);

        System.out.println(); // Jump-line
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
