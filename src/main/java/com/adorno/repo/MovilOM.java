package com.adorno.repo;
import com.adorno.model.Movil;
import com.adorno.model.Pantalla;
import com.adorno.model.Procesador;
import com.adorno.model.TipoPantalla;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class MovilOM {
    private static List<Procesador> procesadores = List.of(
            new Procesador(1.5f, "A15", 8l),
            new Procesador(2.5f, "Snapdragon 880", 6l),
            new Procesador(2.0f, "SQ1", 8l),
            new Procesador(3f, "Snapdragon 870", 4l)
    );
    private static List<Pantalla> pantallas = List.of(
            new Pantalla(6.4f, TipoPantalla.IPS),
            new Pantalla(5.5f, TipoPantalla.OLED),
            new Pantalla(5.4f, TipoPantalla.AMOLED),
            new Pantalla(6f, TipoPantalla.VA),
            new Pantalla(4.8f, TipoPantalla.TN)
    );
    public static List<Movil> objectMother(){
        return List.of(
                new Movil("Samsung", "S23", procesadores.get(new Random().nextInt(procesadores.size())), 256l,
                        pantallas.get(new Random().nextInt(pantallas.size())), 8l, 4d, 1d, 2d, 200l, 50l, 5500l,
                        true, 800f, LocalDate.of(2022, 12, 20)),
                new Movil("iPhone", "14", procesadores.get(new Random().nextInt(procesadores.size())), 128l,
                        pantallas.get(new Random().nextInt(pantallas.size())), 6l, 3d, 1d, 2d, 200l, 45l, 2500l,
                        true, 800f, LocalDate.of(2022, 10, 18)),
                new Movil("Xiaomi", "S23", procesadores.get(new Random().nextInt(procesadores.size())), 256l,
                        pantallas.get(new Random().nextInt(pantallas.size())), 8l, 4d, 1d, 2d, 200l, 50l, 5500l,
                        true, 800f, LocalDate.of(2022, 12, 20)));
    }
}
