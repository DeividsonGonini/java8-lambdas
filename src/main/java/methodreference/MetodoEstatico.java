package methodreference;

import java.util.Arrays;
import java.util.List;

public class MetodoEstatico {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        //Com Method Reference
        lista.stream()
                .map(MetodoEstatico::multipliquePorDois)
                .forEach(System.out::println);

        //Sem Method Reference
        lista.stream()
                .map(n-> multipliquePorDois(n))
                .forEach(System.out::println);
   }

    private static Integer multipliquePorDois (Integer i){
        return i * 2;
    }
}
