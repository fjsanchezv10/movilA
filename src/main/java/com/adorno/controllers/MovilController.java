package com.adorno.controllers;

import com.adorno.model.Movil;
import com.adorno.model.Pair;
import com.adorno.model.TipoPantalla;
import com.adorno.services.MovilService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movil")
public class MovilController {
    private final MovilService movilService;

    public MovilController(MovilService movilService) {
        this.movilService = movilService;
    }

    @GetMapping("/get/{marca}")
    public ResponseEntity<List<Movil>> getMovilesByMarca(@PathVariable String marca){
        if(movilService.getMovilsByMarcaSummarized(marca).isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(movilService.getMovilsByMarcaSummarized(marca).get(), HttpStatus.OK);
    }
    @GetMapping("/get/precio/{min}-{max}")
    public ResponseEntity<List<Movil>> getMovilesByPrecio(@PathVariable float min, @PathVariable float max){
        if(movilService.getMovilesByPrecio(min, max).isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(movilService.getMovilesByPrecio(min, max).get(), HttpStatus.OK);
    }
    @GetMapping("/get/ram/{min}-{max}")
    public ResponseEntity<List<Movil>> getMovilesByRAM(@PathVariable float min, @PathVariable float max){
        if(movilService.getMovilesByRAM(min, max).isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(movilService.getMovilesByRAM(min, max).get(), HttpStatus.OK);
    }
    @GetMapping("/get/five")
    public ResponseEntity<List<Movil>> getFiveMoviles(){
        if(movilService.getFiveMovilSummarized().isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(movilService.getFiveMovilSummarized().get(), HttpStatus.OK);
    }
    @GetMapping("/get/NFC")
    public ResponseEntity<List<Movil>> getMovilesWithNFC(){
        if(movilService.getMovilesIfNFC().isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(movilService.getMovilesIfNFC().get(), HttpStatus.OK);
    }
    @GetMapping("/get/{screen}")
    public ResponseEntity<List<Movil>> getMovilesByTipoPantalla(@PathVariable TipoPantalla tipoPantalla){
        if(movilService.getMovilesByTipoPantalla(tipoPantalla).isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(movilService.getMovilesByTipoPantalla(tipoPantalla).get(), HttpStatus.OK);
    }
    @GetMapping("/get/pair/{idOne}-{idTwo}")
    public ResponseEntity<Pair<Movil>> getPairOfMovilesByIDs(@PathVariable Long idOne, @PathVariable Long idTwo){
        if(movilService.getTwoMoviles(idOne, idTwo).isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(movilService.getTwoMoviles(idOne, idTwo).get(), HttpStatus.OK);
    }
}
