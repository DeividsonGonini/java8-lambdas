package optionals.utilizaroptional;

import java.util.Optional;

public class OptionalIsPresent {
    public static void main(String[] args) {

        String numeroEmString = "2";
//        String numeroEmString = "ABC";
        Optional<Integer> numeroConvertido = converterStringEmNumeros(numeroEmString);
        //Caso encontre um numero retorna True, caso não retorna False
        System.out.println("\nNumero convertido da String: " + numeroConvertido.isPresent());
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
