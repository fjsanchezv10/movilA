package com.adorno.mappers;

import com.adorno.dto.MovilDTO;
import com.adorno.model.Procesador;

import java.util.LinkedHashMap;

public class LinkedHashMapMovilMapper implements Mapper<MovilDTO, LinkedHashMap> {

    @Override
    public MovilDTO map(LinkedHashMap linkedHashMap) {
        return new MovilDTO((String) linkedHashMap.get("marca"), (String) linkedHashMap.get("modelo"),
                new LinkedHashMapProcesadorMapper().map((LinkedHashMap) linkedHashMap.get("procesador")),
                Long.valueOf(String.valueOf(linkedHashMap.get("almacenamiento"))), Long.valueOf(String.valueOf(linkedHashMap.get("ram"))), Float.valueOf(String.valueOf(linkedHashMap.get("precio"))));
    }
}
