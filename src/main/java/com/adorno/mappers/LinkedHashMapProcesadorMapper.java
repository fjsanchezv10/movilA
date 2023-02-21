package com.adorno.mappers;

import com.adorno.model.Procesador;

import java.util.LinkedHashMap;

public class LinkedHashMapProcesadorMapper implements Mapper<Procesador, LinkedHashMap> {
    @Override
    public Procesador map(LinkedHashMap linkedHashMap) {
        return new Procesador((float) linkedHashMap.get("velocidad"), (String) linkedHashMap.get("tipo"), (long) linkedHashMap.get("nucleos"));
    }
}
