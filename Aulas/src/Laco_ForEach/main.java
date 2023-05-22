package Laco_ForEach;

public class main {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

//        For:
        for (int i=0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("-------------");

//        For each
        for (String obj : vect) {
            System.out.println(obj);
        }

    }
}
