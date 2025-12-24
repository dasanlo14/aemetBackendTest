package com.test.aemetBackendTest.infrastructure.client.dto;

import java.util.List;

public class TemperaturaDTO {

    private Integer maxima;

    private Integer minima;

    private List<DatoHoraDTO> dato;

    public TemperaturaDTO(Integer maxima, Integer minima, List<DatoHoraDTO> dato) {
        this.maxima = maxima;
        this.minima = minima;
        this.dato = dato;
    }

    public Integer getMaxima() {
        return maxima;
    }

    public void setMaxima(Integer maxima) {
        this.maxima = maxima;
    }

    public Integer getMinima() {
        return minima;
    }

    public void setMinima(Integer minima) {
        this.minima = minima;
    }

    public List<DatoHoraDTO> getDato() {
        return dato;
    }

    public void setDato(List<DatoHoraDTO> dato) {
        this.dato = dato;
    }
}
