package org.marcosalarcon.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleMapI {
    public static void main(String[] args) {
        Stream<String> nombres = Stream
                .of("marcos","ernesto","sebastian","freddy")
                .map(nombre -> { return nombre.toUpperCase(); })
                .peek(System.out::println)
                .map(String::toLowerCase);

        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
        // nombres.forEach(System.out::println);

    }
}
