package org.marcosalarcon.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleFilterRange {
    public static void main(String[] args) {
        IntStream numeros = IntStream.range(5 ,20).peek(System.out::println);

//      Integer result = numeros.reduce(0,(a, b) -> a+b);
//      Integer result = numeros.sum();
        IntSummaryStatistics stats = numeros.summaryStatistics();

        System.out.println("max es: " + stats.getMax());
        System.out.println("min es: " + stats.getMin());
        System.out.println("suma es: " + stats.getSum());
        System.out.println("promedio es: " + stats.getAverage());
        System.out.println("total: " + stats.getCount());

    }
}
