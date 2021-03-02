package org.marcosalarcon.stream;

import java.util.stream.Stream;

public class ExampleFilterReduceInt {
    public static void main(String[] args) {
        Stream<Integer> nombres = Stream.of(5,10,15,20);

        Integer result = nombres.reduce(0,(a, b) -> a+b);
        System.out.println("resultado es: " + result);

    }
}
