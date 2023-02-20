package com.adorno.om;
import com.adorno.model.Movil;
import com.adorno.model.Pantalla;
import com.adorno.model.Procesador;
import com.adorno.repo.PantallaRepository;
import com.adorno.repo.ProcesadorRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class MovilOM implements ObjectMother<Movil> {
    private final ProcesadorRepository procesadorRepository;

    private final PantallaRepository pantallaRepository;

    public MovilOM(ProcesadorRepository procesadorRepository, PantallaRepository pantallaRepository) {
        this.procesadorRepository = procesadorRepository;
        this.pantallaRepository = pantallaRepository;
    }

    //TODO FIX
    @Override
    public List<Movil> objectMother() {
        return List.of(
                new Movil("Samsung", "S23", procesadorRepository.findById(new Random().nextLong(1, procesadorRepository.count())+1).get(), 256l,
                        pantallaRepository.findById(new Random().nextLong(1, pantallaRepository.count())+1).get(),
                        8l, 4d, 1d, 2d, 200l, 50l, 5500l,
                        true, 800f, LocalDate.of(2022, 12, 20)),
                new Movil("iPhone", "14", procesadorRepository.findById(new Random().nextLong(1, procesadorRepository.count())+1).get(), 128l,
                        pantallaRepository.findById(new Random().nextLong(1, pantallaRepository.count())+1).get(), 6l, 3d,
                        1d, 2d, 200l, 45l, 2500l,
                        true, 800f, LocalDate.of(2022, 10, 18)),
                new Movil("Xiaomi", "S23", procesadorRepository.findById(new Random().nextLong(1, procesadorRepository.count())+1).get(), 256l,
                        pantallaRepository.findById(new Random().nextLong(1, pantallaRepository.count())+1).get(),
                        8l, 4d, 1d, 2d, 200l, 50l, 5500l,
                        true, 800f, LocalDate.of(2022, 12, 20)));
    }
}