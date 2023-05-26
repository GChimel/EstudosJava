package exercicios_matiz.position;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Number of rows
        System.out.print("How many rows?  ");
        int row = sc.nextInt();

//        Number of columns
        System.out.print("How many columns? ");
        int columns = sc.nextInt();

//        Creating the array
        int[][] mat = new int[row][columns];

//        Insert value to array
        System.out.println("Enter values");
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("What number do you want? ");
        int number = sc.nextInt();
//        Finding Right, left, up and down.
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (number == mat[i][j]) {
                    System.out.println("Position: " + i + ", " + j);
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0 ) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length -1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length -1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
