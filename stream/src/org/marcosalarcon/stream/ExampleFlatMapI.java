package org.marcosalarcon.stream;

import org.marcosalarcon.stream.models.Usuario;

import java.util.stream.Stream;

public class ExampleFlatMapI {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("marcos alarcon","ernesto martinez","sebastian hermoza","freddy tica")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    if (u.getNombre().equalsIgnoreCase("marcos")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                }).peek(System.out::println);

        System.out.println(nombres.count());

    }
}
