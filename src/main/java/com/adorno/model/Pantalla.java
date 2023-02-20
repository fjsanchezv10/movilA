package com.adorno.model;

import jakarta.persistence.*;
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
    @Enumerated(EnumType.STRING)
    private TipoPantalla tipoPantalla;

    public Pantalla(float inches, TipoPantalla tipoPantalla) {
        this.inches = inches;
        this.tipoPantalla = tipoPantalla;
    }
}
