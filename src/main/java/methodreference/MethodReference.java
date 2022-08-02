package methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        //Com Method Reference
        lista.stream()
                .forEach(System.out::println);

        //Sem Method Reference
        lista.stream()
                .forEach(n-> System.out.println(n));
    }

}
