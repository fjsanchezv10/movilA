package com.adorno.model;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Data
public class Movil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marca;
	private String modelo;
	@ManyToOne(cascade = CascadeType.ALL)
	private Procesador procesador;
	private Long almacenamiento;
	@ManyToOne(cascade = CascadeType.ALL)
	private Pantalla pantalla;
	private Long ram;
	private Double dimensionAlto;
	private Double dimensionAncho;
	private Double dimensionProfundidad;
	private long peso;
	private long camara;
	private long bateria;
	private boolean nfc;
	private float precio;
	private LocalDate fechaNacimiento;

	public TipoPantalla getTipoPantalla(){
		return this.pantalla.getTipoPantalla();
	}

	public Movil(String marca, String modelo, Procesador procesador, Long almacenamiento, Pantalla pantalla, Long ram,
				 Double dimensionAlto, Double dimensionAncho, Double dimensionProfundidad, long peso, long camara,
				 long bateria, boolean nfc, float precio, LocalDate fechaNacimiento) {
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.almacenamiento = almacenamiento;
		this.pantalla = pantalla;
		this.ram = ram;
		this.dimensionAlto = dimensionAlto;
		this.dimensionAncho = dimensionAncho;
		this.dimensionProfundidad = dimensionProfundidad;
		this.peso = peso;
		this.camara = camara;
		this.bateria = bateria;
		this.nfc = nfc;
		this.precio = precio;
		this.fechaNacimiento = fechaNacimiento;
	}
}
