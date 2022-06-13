package collect.calculo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectAveraging {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*
        Averaging Retorna a Média de todos os valores inteiros
         */
        Double media = lista.stream()
                .collect(Collectors.averagingInt(elementoLista -> elementoLista.intValue()));

        System.out.println("\nLista original: " + lista);
        System.out.println("Lista do Collect: " + media);

    }
}
