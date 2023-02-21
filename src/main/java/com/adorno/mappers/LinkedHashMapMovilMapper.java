package com.adorno.mappers;

import com.adorno.dto.MovilDTO;
import com.adorno.model.Procesador;

import java.util.LinkedHashMap;

public class LinkedHashMapMovilMapper implements Mapper<MovilDTO, LinkedHashMap> {

    private final LinkedHashMapProcesadorMapper procesadorMapper = new LinkedHashMapProcesadorMapper();

    @Override
    public MovilDTO map(LinkedHashMap linkedHashMap) {
        Procesador procesador = procesadorMapper.map((LinkedHashMap) linkedHashMap.get("procesador"));
        return new MovilDTO((String) linkedHashMap.get("marca"), (String) linkedHashMap.get("modelo"), procesador,
                (long) linkedHashMap.get("almacenamiento"), (long) linkedHashMap.get("ram"), (float) linkedHashMap.get("precio"));
    }
}
