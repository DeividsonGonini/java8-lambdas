package optionals.utilizaroptional;

import java.util.Optional;

public class OptionalOrElse {
    public static void main(String[] args) {

//        String numeroEmString = "2";
        String numeroEmString = "ABC";

        /*Procura um valor valido dentro do Optional, caso encontre ira retornar,
        caso não retorna um valor padrao definido
        */
        Integer numero = converterStringEmNumeros(numeroEmString).
                orElse(5); //valor padrao definido caso nao encontre valor valido
        System.out.println("\nNumero convertido da String: " + numero);
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
