package com.adorno.services;

import com.adorno.model.Movil;
import com.adorno.model.Pair;
import com.adorno.model.TipoPantalla;
import com.adorno.repo.MovilOM;
import com.adorno.repo.MovilRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.StreamSupport;

@Service
public class MovilService {
    private final MovilRepository movilRepository;

    public MovilService(MovilRepository movilRepository) {
        this.movilRepository = movilRepository;
        setMoviles();
    }
    private void setMoviles(){
        if(movilRepository.count() == 0){
            movilRepository.saveAll(MovilOM.objectMother());
        } else {
            movilRepository.deleteAll();
            movilRepository.saveAll(MovilOM.objectMother());
        }
    }

    public Optional<Set<Movil>> getFiveMovilSummarized() {
        Set<Movil> listaMovil = new HashSet<>();
        if(movilRepository.count() > 0){
            for(int i=0; i<5; i++){
                long random = new Random().nextLong(movilRepository.count()+1);
                if(!listaMovil.contains(movilRepository.findById(random))){
                    listaMovil.add(movilRepository.findById(random));
                } else {
                    i--;
                }
            }
        } else {
            return Optional.empty();
        }
        return Optional.ofNullable(listaMovil);
    }
    public Optional<List<Movil>> getAll() {
        return Optional.ofNullable(StreamSupport
                .stream(movilRepository.findAll().spliterator(), false)
                .toList());
    }
    public Optional<List<Movil>> getMovilsByMarcaSummarized(String marca) {
        return Optional.ofNullable(movilRepository
                .findByMarcaLike(marca)
                .stream()
                .map(movil -> new Movil(movil.getMarca(), movil.getModelo(), movil.getProcesador(), movil.getAlmacenamiento(), movil.getRam(), movil.getPrecio()))
                .toList());
    }
    public Optional<List<Movil>> getMovilesByTipoPantalla(TipoPantalla tipoPantalla) {
        return Optional.ofNullable(StreamSupport
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

}
