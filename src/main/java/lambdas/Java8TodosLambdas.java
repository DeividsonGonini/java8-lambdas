package lambdas;

import java.util.stream.IntStream;

public class Java8TodosLambdas {
    public static void main(String[] args) {
/*  Parenteses  */
        //Para declarar tipo do elemento
        IntStream.range(0,5)
                .filter((int elementoLista) -> elementoLista % 2 ==0) //declarar tipo do elemento
                .forEach(System.out::println);

        //Para utilizar mais de um argumento/elementos
        IntStream.range(0,5)
                .filter(elementoLista -> elementoLista % 2 ==0)
                .reduce((elementoLista1, elementoLista2) -> elementoLista1 + elementoLista2) //mais de um argumento/elementos
                .ifPresent(System.out::println);

        //Para utilizar mais de um argumento/elementos
        Runnable runnable = () -> System.out.println("Olá mundo");

/*  Chaves  */
        /*
        Podemos ter mais de uma expressão/linha de codigo
        Precisamos colocar o return
         */
        IntStream.range(0,5)
                .filter((int elementoLista) -> {
                    System.out.println("Olá mundo");
                    return elementoLista % 2 == 0;
                }) //declarar tipo do elemento
                .forEach(System.out::println);
    }
}
