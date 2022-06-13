package collect.calculo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectSummarizing {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*
        Summarizing retorna alguns calculos com os valores da lista
         */
        IntSummaryStatistics estatistica = lista.stream()
                .collect(Collectors.summarizingInt(elementoLista -> elementoLista.intValue()));
        System.out.println("\nLista original: " + lista);
        System.out.println("\nIntSummaryStatistics");
        System.out.println("Lista de estatistica completa: " + estatistica);
        System.out.println("Quantidade de Elementos: " + estatistica.getCount());
        System.out.println("Soma: " + estatistica.getSum());
        System.out.println("Media: " + estatistica.getAverage());
        System.out.println("Maximo: " + estatistica.getMax());
        System.out.println("Minimo: " + estatistica.getMin());

    }
}
