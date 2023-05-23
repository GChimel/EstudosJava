package Listas;

import java.util.ArrayList;
import java.util.List;

public class Aula {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Gustavo");
        list.add("Alex");
        list.add("Bober");
        list.add("José");
        list.add("Melina");
        list.add("Ana");
        list.add("Gabriel");

//      Adicionar um elemento ao index 2
        list.add(2,"Antonio");

        System.out.println(list.size());

        for (String lista : list) {
            System.out.println(lista);
        }

        System.out.println("---------------");
//      Remover o elemento == Alex
        list.remove("Alex");

//      Remover o elemento do index 3
        list.remove(3);

//      Remover somente os elementos que começam com a letra M
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String lista : list) {
            System.out.println(lista);
        }

        System.out.println("---------------");

        System.out.println("Index of Bober " + list.indexOf("Bober"));
        System.out.println("Index of Ale " + list.indexOf("Ale"));

        System.out.println("---------------");

//      Mostrar somente os elementos que começam com a letra A
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();

        for (String lista2 : result) {
            System.out.println(lista2);
        }

        System.out.println("---------------");

//      Encontrar o primeiro elemento que começa com a letra A
        String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println(name);
    }
}
