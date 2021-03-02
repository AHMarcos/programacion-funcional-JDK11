package org.marcosalarcon.optional.repository;

import org.marcosalarcon.optional.models.Computador;

import java.util.Optional;

public interface Repositorio <T>{

    Optional<Computador> filtrar(String nombre);

}
