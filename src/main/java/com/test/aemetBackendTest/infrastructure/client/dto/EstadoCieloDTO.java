package com.test.aemetBackendTest.infrastructure.client.dto;

public class EstadoCieloDTO {
    private String value;
    private String periodo;
    private String descripcion;

    public EstadoCieloDTO(String value, String periodo, String descripcion) {
        this.value = value;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
