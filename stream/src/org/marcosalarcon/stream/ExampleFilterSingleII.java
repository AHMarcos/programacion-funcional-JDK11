package org.marcosalarcon.stream;

import org.marcosalarcon.stream.models.Usuario;

import java.util.stream.Stream;

public class ExampleFilterSingleII {
    public static void main(String[] args) {
        Usuario usuario = Stream
                .of("marcos alarcon","ernesto martinez","sebastian hermoza","freddy tica")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getIdperson().equals(5))
                .findFirst().orElseGet(() -> new Usuario("lucas","lopez"));

        System.out.println(usuario);
    }
}
