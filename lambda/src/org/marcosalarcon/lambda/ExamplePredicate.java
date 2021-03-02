package org.marcosalarcon.lambda;

import org.marcosalarcon.lambda.models.Person;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ExamplePredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = numero -> numero > 10;
        boolean resultado = test.test(11);
        System.out.println("resultado es "+ resultado);


        Predicate<String> test2 = role -> role.equals("ROL_ADMIN");
        System.out.println(test2.test("ROL_USER"));


        BiPredicate<String, String> test3 = (a, b) -> a.equals(b);
        System.out.println(test3.test("lucas","lucas"));


        BiPredicate<Integer, Integer> test4 = (i, j) -> i > j;
        boolean resultado2 = test4.test(55, 100);
        System.out.println(resultado2);

        Person a = new Person();
        Person b = new Person();
        a.setNombre("maria");
        b.setNombre("fabiola");
        BiPredicate<Person, Person> test5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(test5.test(a, b));

    }

}
