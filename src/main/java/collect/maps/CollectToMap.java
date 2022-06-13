package collect.maps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectToMap {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Agrupa os elementos de acordo um boolean (True or False)
        Map<Integer, Double> partitioningBy = lista.stream()
                .collect(Collectors.toMap(chave -> chave,  valor -> Math.pow(valor.doubleValue(), 2))); // Potenciação (nesse caso valor elevado a 2)
        System.out.println("\nLista original: " + lista);
        System.out.println("\nLista do Collect: " + partitioningBy );

    }
}
