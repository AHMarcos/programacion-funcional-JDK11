package org.marcosalarcon.optional;

import org.marcosalarcon.optional.models.Computador;
import org.marcosalarcon.optional.repository.ComputadorRespository;
import org.marcosalarcon.optional.repository.Repositorio;

public class ExampleRepositoryMetodoOrElse {
        public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRespository();


        //Computador defecto = new Computador("HP","Notebook");
        // EXPRESION LAMBDA NO
        Computador pc = repositorio.filtrar("Lenovo").orElse(valorDefecto());
            System.out.println(pc);
        // EXPRESION LAMBDA SI
        pc = repositorio.filtrar("Macbook").orElseGet(() -> valorDefecto());
            System.out.println(pc);
    }

    public static Computador  valorDefecto(){
        System.out.println("Obteniedo valor por defecto!");
            return new Computador("HP","Notebook");
    }

}
