package streams.finais;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMin {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //Implementação Nova JAVA 8 Stream Min
        Optional<Integer> min = lista.stream()
                .limit(12)
                .filter(elementoLista -> elementoLista %2 ==0)//ira multiplicar os elementos por 2
                .min(Comparator.naturalOrder());//Identifica qual foi o menor valor que chegou nele

        System.out.println("\nMenor entre os elementos que passaram no min: " + min.get());

        //Lista Original
        System.out.println("\nLista original" + lista);

    }
}
