package com.adorno.repo;

import com.adorno.model.Movil;
import com.adorno.model.TipoPantalla;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovilRepository extends CrudRepository<Movil, Long> {
    List<Movil> findByMarcaLike(String marca);
    List<Movil> findAllByPrecioGreaterThanAndPrecioLessThan(float min, float max);
    List<Movil> findAllByRamGreaterThanAndRamLessThan(float min, float max);
    List<Movil> findAllByNfcIsTrue();
    List<Movil> findAllByTipoPantallaLike(TipoPantalla tipoPantalla);
    Movil findById(long id);


}
