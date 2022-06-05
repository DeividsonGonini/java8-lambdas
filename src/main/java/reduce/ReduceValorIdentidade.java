package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class ReduceValorIdentidade {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        String string = "Compartilhe o conhecimento, assim voce aprende até mais";
        String[] split = string.split(" ");
        List<String> listaString = Arrays.asList(split);

        /*
        Utilizado quando o retorno não pode ser null.
        Nos casos anteriores pode retornar null uma vez que o retorno do método é um Optional.
        Caso a lista esteja vazia ira retornar o próprio valor de Identidade.
        É informado mais um parâmetro no reduce, esse parâmetro é o valor de identidade.
        O Valor de identidade é um parâmetro que será utilizado no N1 e independente da operação ele não pode alterar o valor de N2.
         */

        //Soma
        Integer reduceSoma = lista.stream()
                .reduce(0, (n1, n2) -> n1 + n2);
        System.out.println("Resultado do reduce Soma: " + reduceSoma);

        /*
         Multiplicação
         */
        Integer reduceMultiplicacao = lista.stream()
                .reduce(1, (n1, n2) -> n1 * n2);
        System.out.println("Resultado do reduce Multiplicação: " + reduceMultiplicacao);

         /*
         Concatenação
         */
        String reduceConcatenacao = listaString.stream()
                .reduce("", (string1, string2) -> string1.concat(string2));
        System.out.println("Resultado do reduce Concatenação: " + reduceConcatenacao);


        /*
        Exemplo com lista Vazia
         */
        List<Integer> listaVazia = Arrays.asList();
        Integer reduceListaVazia = listaVazia.stream()
                .reduce(0, (n1, n2) -> n1 + n2);
        System.out.println("Resultado do reduce Lista Vazia: " + reduceListaVazia);

        /*
        Menor Valor
         */
        double menorValor = DoubleStream.of(1.5, 0.9, 2.8, 6.7)
                .reduce(Double.POSITIVE_INFINITY, (n1, n2) -> Math.min(n1, n2));
        System.out.println("Menor valor a lista: " + menorValor);


    }
}
