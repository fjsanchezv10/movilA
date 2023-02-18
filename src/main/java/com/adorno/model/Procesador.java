package com.adorno.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Procesador {
		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		 private Long id;
		 
		 private float velocidad;
		 
		 private String tipo;
		 
		 private Long nucleos;

		public Procesador(Long id, float velocidad, String tipo, Long nucleos) {
			super();
			this.id = id;
			this.velocidad = velocidad;
			this.tipo = tipo;
			this.nucleos = nucleos;
		}

		public Procesador() {
			super();
		}
		 
		 
}
