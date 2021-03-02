package org.marcosalarcon.stream;

import org.marcosalarcon.stream.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleFilterSingleI {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("marcos alarcon","ernesto martinez","sebastian hermoza","freddy tica")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("marcos"))
                .peek(System.out::println);


        Optional<Usuario> usuario = nombres.findFirst();
       // Manejar un nullPointerException

        // 1
        //System.out.println(usuario.orElse(new Usuario("joe","cuzcano")));
        // 2
        //System.out.println(usuario.orElseGet(() -> new Usuario("joe","cuzcano")));
        // 3
        if (usuario.isPresent()){
            System.out.println(usuario.get().getNombre());
        }else {
            System.out.println("Nose encontró el dato!");
        }

    }
}
