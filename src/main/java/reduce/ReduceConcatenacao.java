package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceConcatenacao {
    public static void main(String[] args) {

        String string = "Compartilhe o conhecimento, assim voce aprende até mais";
        String[] split = string.split(" ");
        List<String> listaString = Arrays.asList(split);

        /*
        Ira Concatenar os 2 primeiros elementos da lista
        O resultado ser atribuido ao N1 e Concatenar com o proximo (3º elemento da lista)
        E assim sucessivamente até o final
         */

//        Reduce Concatenação
        Optional<String> reduceConcatenacao = listaString.stream()
                .reduce((string1, string2) -> string1.concat(string2));
        System.out.println("Resultado do reduce Concatenação: " + reduceConcatenacao.get());
    }
}
