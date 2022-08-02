package methodreference;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class VariasInstancias {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        //Com Method Reference
        lista.stream()
                .map(Integer::doubleValue)
                .forEach(System.out::println);

        //Sem Method Reference
        lista.stream()
                .map(n -> n.doubleValue())
                .forEach(System.out::println);
    }

    private static Integer multipliquePorDois (Integer i){
        return i * 2;
    }

}
