package org.marcosalarcon.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ExampleFunction {

    public static void main(String[] args) {

        Function<String, String> f1 = param -> {
            return "Holaa " + param;
        };
        String resultado = f1.apply("marcos");
        System.out.println(resultado);


        Function<String, String> f2 = param -> {
            return param.toUpperCase();
        };
        System.out.println(f2.apply("marcos"));


        BiFunction<String, String, String> f3 = (a, b) -> {
            return a.toUpperCase().concat(b.toUpperCase());
        };
        String resultado2 = f3.apply("marcos", "ernesto");
        System.out.println(resultado2);


        BiFunction<String,String,Integer> f4 = (x, y) -> {
          return x.compareTo(y);
        };
        System.out.println(f4.apply("sebastian", "felipe"));


        BiFunction<String,String,String> f5 = (x, y) -> {
            return x.concat(y);
        };
        System.out.println(f5.apply("jose", "luis"));

    }
}
