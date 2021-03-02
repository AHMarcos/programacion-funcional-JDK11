package org.marcosalarcon.stream;

import java.util.stream.Stream;

public class ExampleFilterDistinctI {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("marcos alarcon","ernesto martinez","sebastian hermoza","freddy tica","marcos alarcon","marcos alarcon")
                .distinct();

        nombres.forEach(System.out::println);

    }
}
