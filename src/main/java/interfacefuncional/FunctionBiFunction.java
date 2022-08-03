package interfacefuncional;

import java.util.Arrays;
import java.util.List;

public class FunctionBiFunction {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        lista.stream()
                .map(elementoLista -> elementoLista.doubleValue())//Recebe um valor e retorna o um valor de outro tipo
                .forEach((elementoLista)-> System.out.println(elementoLista));

    }
}
