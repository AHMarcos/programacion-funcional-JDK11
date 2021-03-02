package org.marcosalarcon.stream;

import org.marcosalarcon.stream.models.Factura;
import org.marcosalarcon.stream.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class ExampleFlatMapII {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("marcos", "alarcon");
        Usuario u2 = new Usuario("pepe","lucho");

        u1.addFactura(new Factura("compras tecnologicas"));
        u1.addFactura(new Factura("compras de muebles"));

        u2.addFactura(new Factura("compras de jueguetes"));
        u2.addFactura(new Factura("compras de autos"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);

        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(": cliente :")
                .concat(f.getUsuario().toString())));

//        for (Usuario u: usuarios){
//            for (Factura f: u.getFacturas()){
//                System.out.println(f.getDescripcion());
//            }
//        }


    }
}
