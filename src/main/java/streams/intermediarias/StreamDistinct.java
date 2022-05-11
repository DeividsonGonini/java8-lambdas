package streams.intermediarias;

import java.util.Arrays;
import java.util.List;

public class StreamDistinct {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //Implementação Nova JAVA 8 Stream Distinct
        //Distinct - não processa elementos repetidos, caso seja repetino nao sera processado não aceita parâmetro.
        lista.stream()
                .distinct()//não processa elementos repetidos
                .forEach(elementoLista -> System.out.println(elementoLista));
    }
}
