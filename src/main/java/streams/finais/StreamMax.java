package streams.finais;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMax {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //Implementação Nova JAVA 8 Stream Max
        Optional<Integer> min = lista.stream()
                .limit(12)
              //  .filter(elementoLista -> elementoLista %2 ==0)//ira multiplicar os elementos por 2
                .max(Comparator.naturalOrder());//Identifica qual foi o maior valor que chegou nele

        System.out.println("\nMaior entre os elementos que passaram no max: " + min.get());

        //Lista Original
        System.out.println("\nLista original" + lista);

    }
}
