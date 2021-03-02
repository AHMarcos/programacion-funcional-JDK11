package org.marcosalarcon.stream;

import java.util.stream.Stream;

public class ExampleFilterEmpty {
    public static void main(String[] args) {
        Long count = Stream
                .of("marcos alarcon","","sebastian hermoza","")
                .filter(n -> n.isEmpty())
                .peek(System.out::println)
                .count();

        System.out.println("count = " + count);

    }
}
