package com.adorno.mappers;

import com.adorno.dto.MovilDTO;
import com.adorno.model.Procesador;

import java.util.LinkedHashMap;

public class LinkedHashMapMovilMapper implements Mapper<MovilDTO, LinkedHashMap> {

    @Override
    public MovilDTO map(LinkedHashMap linkedHashMap) {
        return new MovilDTO((String) linkedHashMap.get("marca"), (String) linkedHashMap.get("modelo"), (Procesador) linkedHashMap.get("procesador"),
                (long) linkedHashMap.get("almacenamiento"), (long) linkedHashMap.get("ram"), (float) linkedHashMap.get("precio"));
    }
}
