package collect.calculo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectSumming {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*
        Summing Retorna a soma de todos os valores inteiros
         */
        Integer soma = lista.stream()
                .collect(Collectors.summingInt(elementoLista -> elementoLista.intValue()));

        System.out.println("\nLista original: " + lista);
        System.out.println("Lista do Collect: " + soma);

    }
}
