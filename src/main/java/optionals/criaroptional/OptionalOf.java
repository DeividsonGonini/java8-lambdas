package optionals.criaroptional;

import java.util.Optional;

public class OptionalOf {
    public static void main(String[] args) {

        String numeroEmString = "1";
        Optional<Integer> numeroConvertido = converterStringEmNumeros(numeroEmString);
        System.out.println("\nNumero convertido da String: " + numeroConvertido);
    }

    //Implementação nova - Java 8
    public static Optional<Integer> converterStringEmNumeros(String numeroString) {
        Integer integer = Integer.valueOf(numeroString);
        return Optional.of(integer);
    }
}
