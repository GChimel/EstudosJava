public class incrementoDecremento {

    public static void main(String[] args) {
        int totalDeVoltas = 10;
        int totalDeCurvas = 5;
// Imagine que eu preciso incrementar algumas voltas na pista

//      Primeira forma:
        totalDeVoltas = totalDeVoltas + 1;
//      Segunda forma:
        totalDeVoltas += 1;
//      Terceira forma:
//          Forma pós fixada, onde colocamos o sinal depois da variável.
        totalDeVoltas++;
//      Quarta forma:
//          Utilizada quando quremos utilizar uma incremeto ou decremento atribuindo em uma nova variável.
        int novoTotalDeCurvas = --totalDeCurvas;

        System.out.println("Novo total de curvas:" + novoTotalDeCurvas);
        System.out.println("Total de voltas na pista: " + totalDeVoltas);

    }

}