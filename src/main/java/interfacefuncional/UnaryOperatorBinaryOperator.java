package interfacefuncional;

import java.util.Arrays;
import java.util.List;

public class UnaryOperatorBinaryOperator {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        lista.stream()
                .map(elementoLista -> elementoLista.doubleValue())
                .reduce((elementoLista1, elementoLista2) -> elementoLista1 + elementoLista2)//Recebe dois valor e retorna o um valor, nessa caso o valor double
                .ifPresent(System.out::println);

    }
}
