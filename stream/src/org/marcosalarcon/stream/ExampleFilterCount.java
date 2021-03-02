package org.marcosalarcon.stream;

import org.marcosalarcon.stream.models.Usuario;

import java.util.stream.Stream;

public class ExampleFilterCount {
    public static void main(String[] args) {
        Long count = Stream
                .of("marcos alarcon","ernesto martinez","sebastian hermoza","freddy tica")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(count);


    }
}
