package com.adorno.model;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Movil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String marca;
	@NonNull
	private String modelo;
	@ManyToOne(cascade = CascadeType.ALL)
	@NonNull
	private Procesador procesador;
	@NonNull
	private Long almacenamiento;
	@ManyToOne
	private Pantalla pantalla;
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

	public TipoPantalla getTipoPantalla(){
		return this.pantalla.getTipoPantalla();
	}
}
