package collect.calculo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectMaxMin {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("\nLista original: " + lista);
        System.out.println("\nValor Maximo: ");
        //Retorna o valor maximo da lista final
        lista.stream()
                .filter((elementoLista) -> elementoLista % 2 == 0)
                .collect(Collectors.maxBy(Comparator.naturalOrder()))
                .ifPresent(System.out::println);

        System.out.println("\nLista original: " + lista);
        System.out.println("\nValor Minimo: ");
        //Retorna o valor minimo da lista final
        lista.stream()
                .filter((elementoLista) -> elementoLista % 2 == 0)
                .collect(Collectors.minBy(Comparator.naturalOrder()))
                .ifPresent(System.out::println);




    }
}
