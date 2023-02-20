package com.adorno.dto;

import com.adorno.model.Procesador;

public record MovilDTO(String marca, String modelo, Procesador procesador, long almacenamiento, long ram, float precio) {
}
