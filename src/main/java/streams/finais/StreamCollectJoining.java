package streams.finais;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectJoining {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //Lista Original
        System.out.println("\nLista original" + lista);

        //Implementação Nova JAVA 8 Stream Collect Joining
        String novaListaCollector= lista.stream()
                .map(elementoLista -> String.valueOf(elementoLista))//converte os itens para string
                .collect(Collectors.joining(", "));//Só Trabalha com Strings, basicamente agrupa Strings, podendo passar um delimitador para separar as Strings e adiciona em uma nova lista

        System.out.println("\nNova lista apos as operações intermediarias: " + novaListaCollector);
    }
}
