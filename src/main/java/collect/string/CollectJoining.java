package collect.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectJoining {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*
        Utilizado para unir String
         */

        String joining = lista.stream()
                .map(elementoLista -> elementoLista.toString())
                .collect(Collectors.joining(";"));

        System.out.println("\nLista original: " + lista);
        System.out.println("Lista do Collect: " + joining);

        String joining2 = lista.stream()
                .map(elementoLista -> elementoLista.toString())
                .collect(Collectors.joining());
        System.out.println("\nLista original: " + lista);
        System.out.println("Lista do Collect: " + joining2);

    }
}
