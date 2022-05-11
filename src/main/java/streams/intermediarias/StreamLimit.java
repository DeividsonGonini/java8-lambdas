package streams.intermediarias;

import java.util.Arrays;
import java.util.List;

public class StreamLimit {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //Implementação Nova JAVA 8 Stream Limit
        //Limit - limita a processar apenas uma determinada quantidade de elementos da lista, os outros elementos serão ignorados a quantidade a ser limitada é informada no parâmetro.
        lista.stream()
                .limit(4)//ira atuar nos 4 primeiros elementos e ignorar todos os demais elementos
                .forEach(elementoLista -> System.out.println(elementoLista));
    }
}
