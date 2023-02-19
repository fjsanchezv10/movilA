package com.adorno.repo;
import com.adorno.model.Movil;
import com.adorno.model.Procesador;

import java.util.List;

public class MovilOM {
    public static List<Movil> objectMother(){
        return List.of(
                new Movil("Samsung", "S23", new Procesador(), 128l, 6l, 800),
                new Movil("iPhone", "14", new Procesador(), 64l, 4l, 800),
                new Movil("Xiaomi", "Note 10", new Procesador(), 128l, 4l, 300),
                new Movil("Samsung", "S22", new Procesador(), 128l, 6l, 700));
    }
}
