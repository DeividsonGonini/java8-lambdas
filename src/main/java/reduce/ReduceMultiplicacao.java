package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMultiplicacao {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*
        Ira Multiplicar os 2 primeiros elementos da lista
        O resultado ser atribuido ao N1 e Multiplicar com o proximo (3º elemento da lista)
        E assim sucessivamente até o final
         */

//        Reduce Multiplicação
        Optional<Integer> reduceMultiplicacao = lista.stream()
                .reduce((n1, n2) -> n1 * n2);
        System.out.println("Resultado do reduce Multiplicação: " + reduceMultiplicacao.get());

    }
}
