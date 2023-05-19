package exercicios_vetores.pensionato.application;

import exercicios_vetores.pensionato.entities.Rooms;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = input.nextInt();

        Rooms[] rent = new Rooms[10];

        int rentNumber = 1;
        for(int i = 0; i < n ; i++) {
            System.out.print("Rent #" +rentNumber++ + ":\n");
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Room: ");
            int room = input.nextInt();
            rent[room] = new Rooms(name, email, room);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for(int i = 0; i < 10; i++) {
            if (rent[i] != null) {
                System.out.println(rent[i].getRoom() + ": " + rent[i].getName() + ", " + rent[i].getEmail());
            }
        }

        input.close();
    }
}
