package com.adorno.model;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class Movil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String marca;
	@NonNull
	private String modelo;
	@ManyToOne
	@NonNull
	private Procesador procesador;
	@NonNull
	private Long almacenamiento;
	private float pulgadas;
	private TipoPantalla tipoPantalla;
	@NonNull
	private Long ram;
	private Double dimensionAlto;
	private Double dimensionAncho;
	private Double dimensionProfundidad;
	private long peso;
	private long camara;
	private long bateria;
	private boolean nfc;
	@NonNull
	private float precio;
	private Date fechaNacimiento;

}
