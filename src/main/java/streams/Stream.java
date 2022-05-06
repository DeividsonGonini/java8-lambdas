package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //Implementação Antiga JAVA 4 - Iterator
        System.out.println("Inicio Implementação Antiga JAVA 4 - Iterator");
        for(Iterator iterator = lista.iterator(); iterator.hasNext();){
            Integer integer = (Integer) iterator.next();
            System.out.println(integer);
        }
        System.out.println("FIM Implementação Antiga JAVA 4 - Iterator \n\n");


        //Implementação Antiga JAVA 5 forEach
        System.out.println("Inicio Implementação Antiga JAVA 5 - forEach");
        for(Integer integer : lista){
            System.out.println(integer);
        }
        System.out.println("FIM Implementação Antiga JAVA 5 - forEach \n\n");


        //Implementação Nova JAVA 8 Stream
        System.out.println("Inicio Implementação Nova JAVA 8 - Stream");
        lista.stream().forEach(elementoLista -> System.out.println(elementoLista));
        System.out.println("FIM Implementação Nova JAVA 8 - Stream");
    }
}
