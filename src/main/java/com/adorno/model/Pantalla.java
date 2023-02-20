package com.adorno.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Pantalla {
    @Id
    private Long id;
    private float inches;
    private TipoPantalla tipoPantalla;
}
