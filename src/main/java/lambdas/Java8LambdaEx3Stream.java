package lambdas;

import java.util.Arrays;
import java.util.List;

public class Java8LambdaEx3Stream {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4);
        //EXEMPLO 3
        //Implementação Antiga
        for (Integer integer : lista){
            System.out.println(integer);
        }
        System.out.println("Fim metodo antigo \n");


        //Implementação Nova - Com Lambda
        lista.stream()
                .filter(elementoLista -> elementoLista % 2 == 0) //filtra os dados que estao chegando no stream
                .forEach(elementoLista -> System.out.println(elementoLista));//para cada item da lista faça algo
    }
}
