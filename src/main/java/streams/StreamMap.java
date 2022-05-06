package streams;

import java.util.Arrays;
import java.util.List;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //Implementação Nova JAVA 8 Stream Map
        //Filter - efetua uma transformação nos dados que estao passando no stream, a lista original não sofre alteração, a função para a transformação é informada no parâmetro.
        lista.stream()
                .map(elementoLista -> elementoLista * 2)//ira multiplicar os elementos por 2
                .forEach(elementoLista -> System.out.println(elementoLista));

        //Lista Original
        System.out.println("\nLista original" + lista);
    }
}
