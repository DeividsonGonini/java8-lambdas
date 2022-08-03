package interfacefuncional;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ConsumerBiConsumer {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        lista.stream()
                .forEach((elementoLista)-> System.out.println(elementoLista));//Recebe o elementoLista, processa mas nao retorna nada

    }
}
