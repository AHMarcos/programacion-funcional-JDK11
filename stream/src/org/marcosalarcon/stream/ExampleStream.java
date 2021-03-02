package org.marcosalarcon.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleStream {
    public static void main(String[] args) {
//        Stream<String> animales = Stream.of("pato","gallo","pavo","paloma","cuculi");
//        animales.forEach(e -> System.out.println(e));

//        String[] arr = {"pato","gallo","pavo","paloma","cuculi"};
//        Stream<String> animales = Arrays.stream(arr);
//        animales.forEach(e -> System.out.println(e));

//          Stream<String> nombres = Stream.<String>builder().add("pedro")
//                  .add("lucas")
//                  .add("luis")
//                  .add("anthony")
//                  .build();
//          nombres.forEach(e -> System.out.println(e));

        List<String> lista = new ArrayList<>();
        lista.add("lucas");
        lista.add("luis");
        lista.add("pedro");
        lista.add("anthony");

        Stream<String> nombres = lista.stream();
        nombres.forEach(e -> System.out.println(e));
        lista.stream().forEach(System.out::println);

    }
}
