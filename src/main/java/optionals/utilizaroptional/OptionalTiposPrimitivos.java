package optionals.utilizaroptional;

import java.util.OptionalInt;

public class OptionalTiposPrimitivos {
    public static void main(String[] args) {

        String numeroEmString = "2";
//         String numeroEmString = "ABC";

         /*
          Procura um valor valido dentro do Optional, caso encontre ira retornar.
         Caso não recebe uma expressao lambda (onde pode conter uma operação),
          e só é executado se não tiver um valor valido dentro do Optional
          */
        int numero = converterStringEmNumeros(numeroEmString).
                orElseThrow(() -> new NullPointerException("Valor Vazio. "));
        System.out.println("\nNumero convertido da String: " + numero);
    }


    /*
    Implementação com Tipos Primitivos
    Podemos ter Int, Double ou Long
    */
    public static OptionalInt converterStringEmNumeros(String numeroString) {
        try {
            Integer integer = Integer.parseInt(numeroString);
            return OptionalInt.of(integer);
        } catch (Exception e) {
            return OptionalInt.empty(); //Caso nao tenha numero ira retornar option vazio(Optional.empty)
        }
    }
}
