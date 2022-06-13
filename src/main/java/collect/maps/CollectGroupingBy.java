package collect.maps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectGroupingBy {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Agrupa os elementos de acordo com a expressão Lambda informada
        Map<Integer, List<Integer>> groupingBy = lista.stream()
                .collect(Collectors.groupingBy((elementoLista) -> elementoLista % 3));
        System.out.println("\nLista original: " + lista);
        System.out.println("\nLista do Collect: " + groupingBy);

    }
}
