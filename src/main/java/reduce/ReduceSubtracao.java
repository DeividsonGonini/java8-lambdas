package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceSubtracao {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*
        NÃO UTILIZAR Reduce em Subtração
         */
        Optional<Integer> reduceSubtração = lista.stream()
                .reduce((n1, n2) -> n1 - n2);
        System.out.println("Resultado do reduce Concatenação: " + reduceSubtração.get());

    }
}
