package com.adorno.om;

import com.adorno.model.Procesador;

import java.util.List;

public class ProcesadorOM implements ObjectMother<Procesador>{

    @Override
    public List<Procesador> objectMother() {
        return List.of(
                new Procesador(1.5f, "A15", 8l),
                new Procesador(2.5f, "Snapdragon 880", 6l),
                new Procesador(2.0f, "SQ1", 8l),
                new Procesador(3f, "Snapdragon 870", 4l));
    }
}
