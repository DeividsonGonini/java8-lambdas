package streams;

import java.util.Arrays;
import java.util.List;

public class StreamExemploOperacoesIntermediarias {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //Implementação Nova JAVA 8 Stream Operações Intermediarias
        lista.stream()
                .limit(3)//limita aos 3 primeiro itens
                .map(itensLista -> itensLista * 2) //multiplica por 3 os itens filtrados
                .skip(2)//ira ignorar os 2 primeiro itens filtrados
                .distinct()
                .forEach(elementoLista -> System.out.println(elementoLista));
    }
}
