 package optionals.utilizaroptional;

import java.util.Optional;

 public class OptionalOrElseThrow {
     public static void main(String[] args) {

 //        String numeroEmString = "2";
         String numeroEmString = "ABC";

         /*
          Procura um valor valido dentro do Optional, caso encontre ira retornar.
         Caso não recebe uma expressao lambda (onde pode conter uma operação),
          e só é executado se não tiver um valor valido dentro do Optional
          */
         Integer numero = converterStringEmNumeros(numeroEmString).
                 orElseThrow(() -> new NullPointerException("Valor Vazio. "));
         System.out.println("\nNumero convertido da String: " + numero);
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
