package com.adorno.services;

import com.adorno.dto.MovilDTO;
import com.adorno.model.Movil;
import com.adorno.model.Pair;
import com.adorno.model.TipoPantalla;
import com.adorno.repo.MovilRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.StreamSupport;

@Service
public class MovilService {
    private final MovilRepository movilRepository;

    public MovilService(MovilRepository movilRepository) {
        this.movilRepository = movilRepository;
    }

    public Optional<List<MovilDTO>> getFiveMovilSummarized() {
        return Optional.of(StreamSupport.stream(movilRepository.findAll().spliterator(), false)
                .sorted( /* Sortea en posición random */ (a, b) -> new Random().nextInt(3)-1)
                .map(movil -> new MovilDTO(movil.getMarca(), movil.getModelo(), movil.getProcesador(),
                        movil.getAlmacenamiento(), movil.getRam(), movil.getPrecio()))
                .limit(5)
                .toList());
    }
    public Optional<List<Movil>> getAll() {
        return Optional.of(StreamSupport
                .stream(movilRepository.findAll().spliterator(), false)
                .toList());
    }
    public Optional<List<MovilDTO>> getMovilsByMarcaSummarized(String marca) {
        return Optional.of(movilRepository
                .findByMarcaLike(marca)
                .stream()
                .map(movil -> new MovilDTO(movil.getMarca(), movil.getModelo(), movil.getProcesador(), movil.getAlmacenamiento(), movil.getRam(), movil.getPrecio()))
                .toList());
    }
    public Optional<List<Movil>> getMovilesByTipoPantalla(TipoPantalla tipoPantalla) {
        return Optional.of(StreamSupport
                .stream(movilRepository.findAll().spliterator(), false)
                .filter((Movil movil) -> movil.getTipoPantalla().equals(tipoPantalla))
                .toList());
    }
    public Optional<List<Movil>> getMovilesByPrecio(float min, float max){
        return Optional.ofNullable(movilRepository.findAllByPrecioGreaterThanAndPrecioLessThan(min, max));
    }
    public Optional<List<Movil>> getMovilesIfNFC(){
        return Optional.ofNullable(movilRepository.findAllByNfcIsTrue());
    }
    public Optional<List<Movil>> getMovilesByRAM(float min, float max){
        return Optional.ofNullable(movilRepository.findAllByRamGreaterThanAndRamLessThan(min, max));
    }
    public Optional<Pair<Movil>> getTwoMoviles(long idOne, long idTwo){
        Pair<Movil> pair = new Pair<>();
        pair.add(movilRepository.findById(idOne));
        pair.add(movilRepository.findById(idTwo));
        return Optional.ofNullable(pair);
    }
    // IMPORTANT: CUSTOM
    public Movil insertMovil(Movil movil){
        return movilRepository.save(movil);
    }
    // IMPORTANT: CUSTOM
    public List<Movil> insertSomeMovil(Iterable<Movil> listMovil){
        return (List<Movil>) movilRepository.saveAll(listMovil);
    }
}
