package org.marcosalarcon.lambda;

import org.marcosalarcon.lambda.aritmetica.Aritmetica;
import org.marcosalarcon.lambda.aritmetica.Calculadora;

public class ExampleInterfaceFunctional {

    public static void main(String[] args) {
        Aritmetica suma = (a, b) -> a + b;
        Aritmetica resta =(a, b) -> a - b;
        Aritmetica multi =(a, b) -> a * b;

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.computar(10, 5, suma));
        System.out.println(calculadora.computar(10, 5, resta));
        System.out.println(calculadora.computar(10, 5, multi));

        System.out.println(calculadora.computar2(10, 11, (a, b) -> a + b ));

    }

}
