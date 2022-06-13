package collect.collectto;

import java.util.*;
import java.util.stream.Collectors;

public class CollectToCollection {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*
        Voce passa a implementação da Collection que deseja utilizar
         */
        //Utilizando TreeSet
        Set<Integer> collect = lista.stream()
                .filter((elementoLista) -> elementoLista % 2 == 0)
                .collect(Collectors.toCollection(() -> new TreeSet<>()));
        System.out.println("Lista original: " + lista);
        System.out.println("Lista do Collect: " + collect);

        //Utilizando LinkedList
        List<Integer> collect1 = lista.stream()
                .filter((elementoLista) -> elementoLista % 2 == 0)
                .collect(Collectors.toCollection(() -> new LinkedList<>()));
        System.out.println("Lista original: " + lista);
        System.out.println("Lista do Collect: " + collect1);

        //Utilizando Deque ou ArrayDeque
        Deque<Integer> collect2 = lista.stream()
                .filter((elementoLista) -> elementoLista % 2 == 0)
                .collect(Collectors.toCollection(() -> new ArrayDeque<Integer>()
                ));
        System.out.println("Lista original: " + lista);
        System.out.println("Lista do Collect: " + collect2);
    }
}
