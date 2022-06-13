package collect.collectto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToList {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*
        Adiciona o resultado em uma lista
         */

        List<Integer> collectToList = lista.stream()
                .filter((elementoLista) -> elementoLista % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Lista original: " + lista);
        System.out.println("Lista do Collect: " + collectToList);
    }
}
