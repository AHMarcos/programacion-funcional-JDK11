package org.marcosalarcon.optional;

import org.marcosalarcon.optional.models.Computador;
import org.marcosalarcon.optional.repository.ComputadorRespository;
import org.marcosalarcon.optional.repository.Repositorio;

import java.util.Optional;

public class ExampleRepository {
        public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRespository();

        // FORMA FUNCIONAL
        repositorio.filtrar("Lenovo").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));


        // FORMA NORMAL
//        Optional<Computador> pc = repositorio.filtrar("Lenovo");
//
//        if (pc.isPresent()){
//            System.out.println(pc.get().toString());
//        }else {
//            System.out.println("No se encontró");
//        }

    }
}
