package org.marcosalarcon.stream;

import org.marcosalarcon.stream.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class ExampleFilterDistinctII {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("marcos alarcon","ernesto martinez","sebastian hermoza","freddy tica",
                     "marcos alarcon","marcos alarcon","marcos alarcon")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();


        nombres.forEach(System.out::println);
    }
}
