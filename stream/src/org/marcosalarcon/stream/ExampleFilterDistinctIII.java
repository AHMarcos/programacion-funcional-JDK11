package org.marcosalarcon.stream;

import org.marcosalarcon.stream.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleFilterDistinctIII {
    public static void main(String[] args) {
        IntStream largoNombres = Stream
                .of("marcos alarcon","ernesto martinez","sebastian hermoza","freddy tica",
                     "marcos alarcon","marcos alarcon","marcos alarcon")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);

        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        System.out.println("la suma es: " + stats.getSum());
        System.out.println("el max es: " + stats.getMax());
        System.out.println("el min es: " + stats.getMin());
        System.out.println("el promedio es: " +stats.getAverage());


    }
}
