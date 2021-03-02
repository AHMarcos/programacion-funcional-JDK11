package org.marcosalarcon.stream;

import org.marcosalarcon.stream.models.Usuario;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ExampleParallel {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Marcos","Alarcon"));
        lista.add(new Usuario("Faustina","Hermoza"));
        lista.add(new Usuario("Ernesto","Alarcon"));
        lista.add(new Usuario("Sebastian","Orellana"));
        lista.add(new Usuario("Fabi","Alarcon"));
        lista.add(new Usuario("Fabi","Alarcon"));

        Long t1 = System.currentTimeMillis();
        String resultado = lista.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(n -> {
                    System.out.println("Nombre Thread: " +  Thread.currentThread().getName()
                    + " - " + n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    if (nombre.contains("Fabi".toUpperCase())){
                        return Stream.of((nombre));
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        Long t2 = System.currentTimeMillis();
        System.out.println("tiempo total: " + (t2 - t1));
        System.out.println(resultado);

    }
}
