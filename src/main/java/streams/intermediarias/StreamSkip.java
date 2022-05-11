package streams.intermediarias;

import java.util.Arrays;
import java.util.List;

public class StreamSkip {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //Implementação Nova JAVA 8 Stream Skip
        //Skip - não processa (ignora) os elementos iniciais da lista, a quantidade a ser ignorada é informada no parâmetro.
        lista.stream()
                .skip(2)//ira ignorar os 2 primeiro elementos
                .forEach(elementoLista -> System.out.println(elementoLista));
    }
}
