package collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collect {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6);

        /*
        Supplier (Fornecedor) – Função Lambda que fornece a instancia do Objeto que iremos utilizar para acumular o resultado
        Accumulator – Parecido com o reduce, pega todos os elementos do Stream, junta/agrupa eles de alguma forma (pela sua função de acumulação) que no final ira transformar todos os seus elementos em apenas um elemento
        Combiner – Parecido com o reduce, tem vários collectors executando em paralelo e ele combina todos em um único objeto

         */
        Set<String> collect = lista.stream()
                .collect(
                        () -> new HashSet<>(), //Supplier (Fornecedor)
                        (listaNova, elementoLista) -> listaNova.add(elementoLista.toString()), //Accumulator (Acumulação)
                        (listaNova1, listaNova2) -> listaNova1.addAll(listaNova2) //Combinner (Combinação)
                );

        System.out.println("Lista original: " + lista );
        System.out.println("Lista do Collect: " + collect );
    }
}
