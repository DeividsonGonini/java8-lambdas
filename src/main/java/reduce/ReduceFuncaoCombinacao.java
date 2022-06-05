package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class ReduceFuncaoCombinacao {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        String string = "Compartilhe o conhecimento, assim voce aprende até mais";
        String[] split = string.split(" ");
        List<String> listaString = Arrays.asList(split);

        /*
        Ira somar os 2 primeiros elementos da lista
        O resultado ser atribuido ao N1 e somado com o proximo (3º elemento da lista)
        E assim sucessivamente até o final
         */
        //Reduce Soma
        Integer reduceSoma = lista.stream()
                .reduce(0,(n1, n2) -> n1 + n2,  //função de acumulação pega 2 elementos e soma.
                        (n1, n2) -> n1 + n2 );   //Função de combinação soma os resultados de todos os grupos.
        System.out.println("Resultado do reduce Soma: " + reduceSoma);


        /*
        Reduce Map + Combinação
        Concatenação
        */
        String reduceConcatenacao = listaString.stream()
                .reduce("",
                        (string1, string2) -> string1.toString().concat(string2.toString()),   //Função de acumulação pega 2 grupos, transforma em String e concatena
                        (string1, string2) -> string1.concat(string2)   //função de combinação concatena os resultados de todos os grupos.
                );
        System.out.println("Resultado do reduce Concatenação: " + reduceConcatenacao);

    }
}
