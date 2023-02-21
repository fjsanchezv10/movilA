package com.adorno.om;

import com.adorno.model.Pantalla;
import com.adorno.model.TipoPantalla;

import java.util.List;

public class PantallaOM implements ObjectMother<Pantalla>{
    @Override
    public List<Pantalla> objectMother() {
        return List.of(
                new Pantalla(6.4f, TipoPantalla.IPS),
                new Pantalla(5.5f, TipoPantalla.OLED),
                new Pantalla(5.4f, TipoPantalla.AMOLED),
                new Pantalla(6f, TipoPantalla.VA),
                new Pantalla(4.8f, TipoPantalla.TN));
    }
}
