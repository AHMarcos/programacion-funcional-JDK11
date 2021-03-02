package org.marcosalarcon.lambda;

import org.marcosalarcon.lambda.models.Person;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

// Obtener la fecha actual
public class ExampleConsumer {
    public static void main(String[] args) {
        Consumer<Date> consumer = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumer.accept(new Date());


        BiConsumer<String, Integer> biConsumer = (nombre, edad) -> {
            System.out.println(nombre + ", tiene " + edad + " años!");
        };
        biConsumer.accept("marcos", 19);


        Consumer<String> consumer2 = mensaje -> {
            System.out.println(mensaje);
        };
        consumer2.accept("buenos dias people");


        List<String> animes = Arrays.asList("one piece", "attack of titan", "naruto shippuden", "dead note");
        animes.forEach(consumer2);

        Person person = new Person();

        BiConsumer<Person, String> AsignarNombres = (persona ,nombre) -> {
            person.setNombre(nombre);
        };
        AsignarNombres.accept(person, "pepito");
        System.out.println("Nombre de la persona: " + person.getNombre());


        Supplier<String> proveedor = () -> {
          return "que fue loco!";
        };
        System.out.println(proveedor.get());

    }

}
