package collect.calculo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectCounting {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Retorna a quantidade de itens na lista final
        Long collect = lista.stream()
                .filter((elementoLista) -> elementoLista % 2 == 0)
                .collect(Collectors.counting());

        System.out.println("Lista original: " + lista);
        System.out.println("Lista do Collect: " + collect);
    }
}
