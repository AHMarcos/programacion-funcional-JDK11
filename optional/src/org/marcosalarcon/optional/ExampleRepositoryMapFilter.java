package org.marcosalarcon.optional;

import org.marcosalarcon.optional.models.Computador;
import org.marcosalarcon.optional.models.Fabricante;
import org.marcosalarcon.optional.repository.ComputadorRespository;
import org.marcosalarcon.optional.repository.Repositorio;

public class ExampleRepositoryMapFilter {
        public static void main(String[] args) {

            Repositorio<Computador> repositorio = new ComputadorRespository();

            String fbr = repositorio.filtrar("Lenovo")
                    .flatMap(c -> c.getProcesador())
                    .flatMap(p -> p.getFabricante())
                    .filter(fbrc -> "AMD".equalsIgnoreCase(fbrc.getNombre()))
                    .map(f -> f.getNombre())
                    .orElse("DESCONOCIDO");
            System.out.println(fbr);

        }

}
