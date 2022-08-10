package streamsparalelos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsParalelos {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4);
        /*   Parallel x ParellelStream   */
        //  ParellelStream()
//        lista.parallelStream()

        //parallel
//        IntStream.range(0,5).parallel()

        /*   forEach x forEachOrdered   */
        //forEach
        System.out.println("---forEach---");
        lista.parallelStream()
                .forEach(System.out::println);

        //forEachOrdered
        System.out.println("---forEachOrdered---");
        lista.parallelStream()
                .forEachOrdered(System.out::println);


        /*   findAny   */
        System.out.println("---findAny Paralelo---");
        lista.parallelStream()
                .findAny()
                .ifPresent(System.out::println);

        System.out.println("---findAny---");
        lista.stream()
                .findAny()
                .ifPresent(System.out::println);


        /*   Unordered   */
        System.out.println("--- Unordered ---");
        lista.parallelStream()
                .unordered()
                .skip(1) //pula elemento da primeira thread processada
                .limit(2)//limita aos 2 primeiro elementos das 2 thread seguintes processada
                .forEach(System.out::println);

        /*   Reduce   */
        System.out.println("--- Reduce ---");
        lista.parallelStream()
                .reduce((n1, n2) -> n1 + n2)
                .ifPresent(System.out::println);

        System.out.println("--- toConcurrentMap ---");
        Map<Integer, Boolean> collect =
                lista.parallelStream()
                        .collect(Collectors
                                        .toConcurrentMap(n -> n, n-> n % 2 == 0));
        System.out.println(collect);

        System.out.println("--- groupingByConcurrent ---");
        Map<Boolean, List<Integer>> collect2 =
                lista.parallelStream()
                        .collect(Collectors
                                .groupingByConcurrent(n-> n % 2 == 0));
        System.out.println(collect2);



    }
}
