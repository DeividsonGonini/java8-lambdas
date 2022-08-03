package manipulandocollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ManipulandoCollections {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        //forEach
        lista.forEach(n -> System.out.println(n));

        //removeIf
        lista.removeIf(n -> n % 2 == 0);
        lista.forEach(System.out::println);

        //replaceAll
        lista.replaceAll(n -> n * 2);
        lista.forEach(System.out::println);

        /*   Exemplos com Mapas   */
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(0, "Manipulando");
        mapa.put(1, "Collections");
        mapa.put(2, "com");
        mapa.put(3, "Streams");

        //forEach
        mapa.forEach((chave, valor) -> System.out.println(chave + " " + valor));

        //compute
        mapa.compute(1, (chave, valor) -> valor + " Adicao Compute");
        mapa.forEach((chave, valor) -> System.out.println(chave + " " + valor));

        //merge
        mapa.merge(0, "!", (valor1, valor2) -> valor1 + valor2);
        mapa.forEach((chave, valor) -> System.out.println(chave + " " + valor));

        //replaceAll
        mapa.replaceAll((chave, valor) -> valor + "!!");
        mapa.forEach((chave, valor) -> System.out.println(chave + " " + valor));

    }
}
