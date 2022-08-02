package debugstream;

import java.util.Arrays;
import java.util.List;

public class DebugLambdaBloco {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 8, 9);

        //Original
        lista.stream()
                .map(n -> new StringBuilder().append(n).append("s").append("a"))
                .forEach(System.out::println);

        /*
        Transformando o lambda em bloco
         */
        lista.stream()
                .map(n -> {
                    StringBuilder builder = new StringBuilder();
                    builder.append(n);
                    builder.append("s");
                    builder.append("a");
                    return builder;
                })
                .forEach(System.out::println);
    }
}
