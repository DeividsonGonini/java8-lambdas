package streams.finais;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectToList {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //Implementação Nova JAVA 8 Stream Collect toList
        List<Integer> novaListaCollector = lista.stream()
                .limit(12)
                .filter(elementoLista -> elementoLista %2 ==0)//ira multiplicar os elementos por 2
                .map(elementoLista -> elementoLista * 3)
                .collect(Collectors.toList());//Coleta os após as operações intermediarias e adiciona em uma nova lista

        System.out.println("\nNova lista apos as operações intermediarias: " + novaListaCollector);

        //Lista Original
        System.out.println("\nLista original" + lista);

    }
}
