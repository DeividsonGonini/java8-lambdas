package debugstream;

import java.util.Arrays;
import java.util.List;

public class DebugLambda {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 8, 9);

        lista.stream()
                .map(n->new StringBuilder().append(n).append("s").append("a"))
                .forEach(System.out::println);

    }
}
