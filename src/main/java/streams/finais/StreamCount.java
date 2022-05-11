package streams.finais;

import java.util.Arrays;
import java.util.List;

public class StreamCount {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //Implementação Nova JAVA 8 Stream Count
        long count = lista.stream()
                .limit(12)
                .filter(elementoLista -> elementoLista %2 ==0)//ira multiplicar os elementos por 2
                .count();//Conta quantos elementos passaram pelo count, Ex. caso tenha um filter antes ira contar os que restaram após o filtro

        System.out.println("\nContagem de elementos que passaram na lista: " + count);

        //Lista Original
        System.out.println("\nLista original" + lista);

    }
}
