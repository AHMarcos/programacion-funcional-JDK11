package org.marcosalarcon.optional;

import org.marcosalarcon.optional.models.Computador;
import org.marcosalarcon.optional.repository.ComputadorRespository;
import org.marcosalarcon.optional.repository.Repositorio;

import java.util.Optional;

public class ExampleRepositoryMetodoOrElseThrow {
        public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRespository();

        Computador pc = repositorio.filtrar("Lenovo").orElseThrow(() -> new IllegalStateException());
            System.out.println(pc);

            String archivo = "documento.pdf";
            String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
            System.out.println(extension);


    }

}
