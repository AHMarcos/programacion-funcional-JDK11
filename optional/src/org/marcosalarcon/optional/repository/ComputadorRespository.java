package org.marcosalarcon.optional.repository;

import org.marcosalarcon.optional.models.Computador;
import org.marcosalarcon.optional.models.Fabricante;
import org.marcosalarcon.optional.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRespository implements Repositorio<Computador> {

    private List<Computador> datasource = new ArrayList<>();
    public ComputadorRespository() {
        datasource = new ArrayList<>();
        Procesador proc = new Procesador("Ryzen 9", new Fabricante("AMD"));
        Computador asus = new Computador("Lenovo", "Thinkpad");
        asus.setProcesador(proc);
        datasource.add(asus);
        datasource.add(new Computador("Macbook Pro", "13"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre){
        // FORMA FUNCIONAL
        return datasource.stream()
                .filter(c -> c.getNombre().contains(nombre))
                .findFirst();

        // FORMA NORMAL
//        for(Computador c: datasource){
//            if (c.getNombre().equalsIgnoreCase(nombre)){
//                return Optional.of(c);
//            }
//        }
//        return Optional.empty();
    }

}
