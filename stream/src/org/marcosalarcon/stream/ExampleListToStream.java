package org.marcosalarcon.stream;

import org.marcosalarcon.stream.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class ExampleListToStream {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Marcos","Alarcon"));
        lista.add(new Usuario("Faustina","Hermoza"));
        lista.add(new Usuario("Ernesto","Alarcon"));
        lista.add(new Usuario("Sebastian","Orellana"));
        lista.add(new Usuario("Fabi","Alarcon"));
        lista.add(new Usuario("Fabi","Alarcon"));

        Stream<String> nombres = lista.stream()
                .map(u -> u.getNombre().toUpperCase()
                .concat(" ")
                .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if (nombre.contains("Fabi".toUpperCase())){
                        return Stream.of((nombre));
                    }
                    return Stream.empty();
                })
                .map(nombre -> nombre.toLowerCase())
                .peek(System.out::println);

        System.out.println(nombres.count());

    }
}
