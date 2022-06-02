package optionals.utilizaroptional;

import java.util.stream.Stream;

public class OptionalStreamIfPresent {
    public static void main(String[] args) {

         /*
          Procura um valor primeiro dentro do Stream, caso seja valido retorna o ;
          Caso não seja valido não faz nada;
          */
        Stream.of(1, 2, 3)
                .findFirst()
                .ifPresent(elementoLista -> System.out.println("Numero: " + elementoLista));
    }


}
