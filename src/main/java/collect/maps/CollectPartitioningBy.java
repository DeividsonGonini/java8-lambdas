package collect.maps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectPartitioningBy {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Agrupa os elementos de acordo um boolean (True or False)
        Map<Boolean, List<Integer>> partitioningBy = lista.stream()
                .collect(Collectors.partitioningBy((elementoLista) -> elementoLista % 3 == 0 ));
        System.out.println("\nLista original: " + lista);
        System.out.println("\nLista do Collect: " + partitioningBy );

    }
}
