package todosstreams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CriandoStrems {
    public static void main(String[] args) throws IOException {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4);

        //Collection
        lista.stream().forEach(System.out::println);

        //Arrays
        Integer[] intArray = new Integer[]{1, 2, 3, 4};
        Arrays.stream(intArray)
                .forEach(System.out::println);

        //Stream.of
        Stream.of("Criando", "Stream", "de", "qualquer", "coisa", "tipo", "Strings,", "Clientes", "!")
                .forEach(System.out::println);

        //IntStream.range
        IntStream.range(15, 20)
                .forEach(System.out::println);

        //IntStream.rangeClosed
        IntStream.rangeClosed(15, 20)
                .forEach(System.out::println);

        //Stream.iterate
        Stream.iterate(5, (n) -> n * 2)
                .limit(10)
                .forEach(System.out::println);

        //BufferedReader - lines
        //streams.txt - 11, 12, 13
        File file = new File("src/main/resources/streams.txt");
        FileReader in = new FileReader(file);
        try (BufferedReader bufferedReader = new BufferedReader(in)) {
            bufferedReader.lines().forEach(System.out::println);
        }

        //Files
        Path path = Paths.get("");
        Files.list(path).forEach(System.out::println);

        //Random
        new Random().ints()
                .limit(5).forEach(System.out::println);

        //Pattern
        String string = "Criando, Stream com pattern quebrado por regex";
        Pattern pattern = Pattern.compile(" ");//regex que usa para quebrar o Stream
        pattern.splitAsStream(string).forEach(System.out::println);
    }
}
