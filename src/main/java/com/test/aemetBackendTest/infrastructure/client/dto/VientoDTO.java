package com.test.aemetBackendTest.infrastructure.client.dto;

public class VientoDTO {

    private String direccion;
    private Integer velocidad;
    private String periodo;

    public VientoDTO(String direccion, Integer velocidad, String periodo) {
        this.direccion = direccion;
        this.velocidad = velocidad;
        this.periodo = periodo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
