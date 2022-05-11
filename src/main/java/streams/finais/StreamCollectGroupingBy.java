package streams.finais;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectGroupingBy {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //Lista Original
        System.out.println("\nLista original" + lista);

        //Implementação 1 - Nova JAVA 8 Stream Collect groupingBy
        //Vai agrupar por pares(atendeu o criterio) e impares não atenderam o criterio
        Map<Boolean, List<Integer>> mapa = lista.stream()
                .map(elementoLista -> elementoLista * 3)
                .collect(Collectors.groupingBy(elementoLista -> elementoLista %2 ==0));//Coleta os itens após as operações intermediarias e adiciona em um mapeamento agrupando pelo resultado segundo os critérios do groupingBy

        System.out.println("\nNova lista apos as operações intermediarias: " + mapa);


        //Lista Original
        System.out.println("\nLista original" + lista);

        //Implementação 2 - Nova JAVA 8 Stream Collect groupingBy
        //Vai agrupar pelo resto da divisao do item por 3
        Map<Integer, List<Integer>> mapa2 = lista.stream()
                .collect(Collectors.groupingBy(elementoLista -> elementoLista % 3));//Coleta os itens após as operações intermediarias e adiciona em um mapeamento agrupando pelo resultado segundo os critérios do groupingBy

        System.out.println("\nNova lista apos as operações intermediarias: " + mapa2);



    }
}
