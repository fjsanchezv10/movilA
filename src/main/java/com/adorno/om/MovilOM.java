package com.adorno.om;
import com.adorno.model.Movil;
import com.adorno.model.Pantalla;
import com.adorno.model.Procesador;
import com.adorno.model.TipoPantalla;
import com.adorno.repo.PantallaRepository;
import com.adorno.repo.ProcesadorRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class MovilOM{

    public static List<Movil> objectMother() {
        return List.of(
                new Movil("Samsung", "S23", new Procesador(2f, "ARMv8", 8l), 256l,
                        new Pantalla(7f, TipoPantalla.AMOLED), 8l, 4d, 1d, 2d, 200l, 50l, 5500l,
                        true, 800f, LocalDate.of(2022, 12, 20)),
                new Movil("iPhone", "14", new Procesador(2.5f, "ARMv8", 6l), 128l,
                        new Pantalla(6f, TipoPantalla.OLED), 6l, 3d,
                        1d, 2d, 200l, 45l, 2500l,
                        true, 800f, LocalDate.of(2022, 10, 18)),
                new Movil("Xiaomi", "Note 10", new Procesador(1.8f, "ARMv8", 6l), 256l,
                        new Pantalla(6f, TipoPantalla.IPS), 8l, 4d, 1d, 2d, 200l, 50l, 5500l,
                        true, 200f, LocalDate.of(2022, 12, 20)));
    }
}