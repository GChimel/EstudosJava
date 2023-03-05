
public class manipulandoString {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ACB abc DEFG    ";

//      Coloca toda a string em minúscula
        String s01 = original.toLowerCase();
//      Coloca toda a string em maiúscula
        String s02 = original.toUpperCase();
//      Mantem a string original mas remove os espeços nos cantos
        String s03 = original.trim();
//      Monta uma nova string apartir do caractere que você informar
        String s04 = original.substring(2);
//      Monta uma string apartir do caracter 2 mas vai até o caractere 9
        String s05 = original.substring(2, 9);
//      Realiza a troca do caractere 0 pelo caractere 1
        String s06 = original.replace('a', 'x');
//      Realiza a troca dos caracteres 0 pelos caracteres 1
        String s07 = original.replace("abc", "xy");
//      Vai mostrar qual a primeira ocorrência do valor que você informar.
        int i = original.indexOf("bc");
//      Vai mostar qual a última ocorrência do valro que você informar.
        int j = original.lastIndexOf("bc");

//      Separar uma variável
        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        String comida = "Hoje eu comi Macarrão e Carne";

        String[] comidaVect = comida.split(" ");
        System.out.println(comidaVect[3]);
        System.out.println(comidaVect[5]);

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x') : -" + s06 + "-");
        System.out.println("replace('abc', 'xy') : -" + s07 + "-");
        System.out.println("indexOf('bc') : " + i);
        System.out.println("lastIndexOf('bc') : " + j);

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}
