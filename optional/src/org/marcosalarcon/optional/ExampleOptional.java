package org.marcosalarcon.optional;

import java.util.Optional;

public class ExampleOptional {
    public static void main(String[] args) {

        String nombre = "Andres";
        Optional<String> opt = Optional.of(nombre);
        System.out.println("optional: " + opt);
        System.out.println(opt.isPresent());
        if (opt.isPresent()){
            System.out.println("hola " + opt.get());
        }
        System.out.println(opt.isEmpty());

    }
}
