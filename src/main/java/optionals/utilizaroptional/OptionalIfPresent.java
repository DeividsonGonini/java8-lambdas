package optionals.utilizaroptional;

import java.util.Optional;

public class OptionalIfPresent {
    public static void main(String[] args) {

        String numeroEmString = "2";
//        String numeroEmString = "ABC";

        //Metodo recebe uma expressao lambda e só é executado se tiver um valor valido dentro do Optional
        converterStringEmNumeros(numeroEmString).
                ifPresent(elementoLista -> System.out.println("\nNumero convertido da String: " + elementoLista));
    }


    //Implementação nova - Java 8
    public static Optional<Integer> converterStringEmNumeros(String numeroString) {

        try {
            Integer integer = Integer.valueOf(numeroString);
            return Optional.of(integer);
        } catch (Exception e) {
            return Optional.empty(); //Caso nao tenha numero ira retornar option vazio(Optional.empty)
        }
    }
}
