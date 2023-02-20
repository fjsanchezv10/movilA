package com.adorno.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Pantalla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float inches;
    private TipoPantalla tipoPantalla;

    public Pantalla(float inches, TipoPantalla tipoPantalla) {
        this.inches = inches;
        this.tipoPantalla = tipoPantalla;
    }
}
