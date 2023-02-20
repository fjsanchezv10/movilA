package com.adorno.repo;

import com.adorno.model.Procesador;
import org.springframework.data.repository.CrudRepository;

public interface ProcesadorRepository extends CrudRepository<Procesador, Long> {
    Procesador findProcesadorById(long id);
}
