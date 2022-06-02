package optionals.criaroptional;

import java.util.Optional;

public class OptionalOfNullable {
    public static void main(String[] args) {

        String numeroEmString = "ABC";
        Optional<Integer> numeroConvertido = converterStringEmNumeros(numeroEmString);
        System.out.println("\nNumero convertido da String: " + numeroConvertido);
    }

    //Implementação nova - Caso  o option seja nulo, ira retornar option vazio(Optional.empty)
    public static Optional<Integer> converterStringEmNumeros(String numeroString) {
        return Optional.ofNullable(null); //
    }
}