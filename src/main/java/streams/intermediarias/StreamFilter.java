package streams.intermediarias;

import java.util.Arrays;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //Implementação Nova JAVA 8 Stream Filter
        //Filter - filtro personalizado para processamento de items da lista, os elementos que não atenderem ao filtro serão ignorados, a função para filtrar é informada no parâmetro.
        lista.stream()
                .filter(elementoLista -> elementoLista %2 ==0)//ira processar apenas os numeros pares
                .forEach(elementoLista -> System.out.println(elementoLista));
    }
}
