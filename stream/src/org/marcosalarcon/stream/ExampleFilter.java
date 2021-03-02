package org.marcosalarcon.stream;

import org.marcosalarcon.stream.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleFilter {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("marcos alarcon","ernesto martinez","sebastian hermoza","freddy tica")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("marcos"))
                .peek(System.out::println);


        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);

    }
}
