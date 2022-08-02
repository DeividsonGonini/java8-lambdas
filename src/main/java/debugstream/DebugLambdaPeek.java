package debugstream;

import java.util.Arrays;
import java.util.List;

public class DebugLambdaPeek {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 8, 9);

        /*
        Utilizando Peek
         */
        lista.stream()
                .peek(n -> System.out.println(n + "Primeiro Peek"))
                .filter(n -> n%2 == 0)
                .peek(n -> System.out.println(n + "Segundo Peek"))
                 .forEach(System.out::println);
    }
}
