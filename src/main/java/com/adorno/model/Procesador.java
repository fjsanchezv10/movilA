package com.adorno.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Procesador {
		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		 private Long id;
		 @NonNull
		 private float velocidad;
		 @NonNull
		 private String tipo;
		 @NonNull
		 private Long nucleos;
		 
		 
}
