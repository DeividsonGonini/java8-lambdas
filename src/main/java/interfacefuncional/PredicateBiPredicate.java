package interfacefuncional;

import java.util.Arrays;
import java.util.List;

public class PredicateBiPredicate {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        lista.stream()
                .filter(elementoLista -> elementoLista % 2 == 0)//Recebe valor, efetua a função para comparar e retorna Verdadeiro ou falso
                .forEach((elementoLista)-> System.out.println(elementoLista));

    }
}
