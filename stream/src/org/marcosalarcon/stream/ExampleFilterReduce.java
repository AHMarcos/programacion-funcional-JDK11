package org.marcosalarcon.stream;

import java.util.stream.Stream;

public class ExampleFilterReduce {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("marcos alarcon","ernesto martinez","sebastian hermoza","freddy tica","marcos alarcon","marcos alarcon")
                .distinct();

        String result = nombres.reduce("",(a, b) -> a+ "," + b);
        System.out.println("resultado es: " + result);

    }
}
