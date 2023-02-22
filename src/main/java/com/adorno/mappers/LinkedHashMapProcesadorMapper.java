package com.adorno.mappers;

import com.adorno.model.Procesador;

import java.util.LinkedHashMap;

public class LinkedHashMapProcesadorMapper implements Mapper<Procesador, LinkedHashMap> {
    @Override
    public Procesador map(LinkedHashMap linkedHashMap) {
        return new Procesador(Float.parseFloat(String.valueOf(linkedHashMap.get("velocidad"))),
                (String) linkedHashMap.get("tipo"), Long.valueOf(String.valueOf(linkedHashMap.get("nucleos"))));
    }
}
