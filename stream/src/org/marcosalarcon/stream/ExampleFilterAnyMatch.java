package org.marcosalarcon.stream;

import org.marcosalarcon.stream.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleFilterAnyMatch {
    public static void main(String[] args) {
        boolean existe = Stream
                .of("marcos alarcon","ernesto martinez","sebastian hermoza","freddy tica")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                // 1 sola linea de codigo
                .anyMatch(u -> u.getIdperson().equals(1));

        System.out.println(existe);

        List<Usuario> lista = Arrays.asList(new Usuario("marcos", " alarcon"),
                new Usuario("ernesto", "martinez"),
                new Usuario("sebastian", "hermoza"),
                new Usuario("freddy", "tica"));

        // varias lineas de codigos
        boolean resultado = false;
        for (Usuario u : lista) {
            if (u.getIdperson().equals(3)) {
                resultado = true;
                break;
            }
        }
        System.out.println(resultado);

    }
}
