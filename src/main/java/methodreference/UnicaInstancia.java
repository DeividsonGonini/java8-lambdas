package methodreference;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class UnicaInstancia {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);
        BigDecimal dois = new BigDecimal(2);

        //Com Method Reference
        lista.stream()
                .map(BigDecimal::new)
                .map(dois::multiply)
                .forEach(System.out::println);

        //Sem Method Reference
        lista.stream()
                .map(BigDecimal::new)
                .map(n -> dois.multiply(n))
                .forEach(System.out::println);
    }

    private static Integer multipliquePorDois (Integer i){
        return i * 2;
    }

}
