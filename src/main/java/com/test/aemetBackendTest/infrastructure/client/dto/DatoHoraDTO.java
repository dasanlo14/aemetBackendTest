package com.test.aemetBackendTest.infrastructure.client.dto;

public class DatoHoraDTO {
    private Integer value;
    private Integer hora;

    public DatoHoraDTO(Integer value, Integer hora) {
        this.value = value;
        this.hora = hora;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }
}
