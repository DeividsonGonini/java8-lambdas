package optionals.criaroptional;

import java.util.Optional;

public class OptionalEmpty {
    public static void main(String[] args) {

        String numeroEmString = "ABC";
        Optional<Integer> numeroConvertido = converterStringEmNumeros(numeroEmString);
        System.out.println("\nNumero convertido da String: " + numeroConvertido);
    }

    //Implementação nova - Java 8
    public static Optional<Integer> converterStringEmNumeros(String numeroString) {

        try {
            Integer integer = Integer.valueOf(numeroString);
            return Optional.of(integer);
        }catch(Exception e){
            return Optional.empty(); //Caso nao tenha numero ira retornar option vazio(Optional.empty)
        }
    }
}
