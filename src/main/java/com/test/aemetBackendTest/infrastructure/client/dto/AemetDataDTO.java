package com.test.aemetBackendTest.infrastructure.client.dto;

public class AemetDataDTO {

    private String descripcion;

    private Integer estado;

    private String datos;

    private String metadatos;

    public AemetDataDTO() {
    }

    public AemetDataDTO(String descripcion, String metadatos, Integer estado, String datos) {
        this.descripcion = descripcion;
        this.metadatos = metadatos;
        this.estado = estado;
        this.datos = datos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMetadatos() {
        return metadatos;
    }

    public void setMetadatos(String metadatos) {
        this.metadatos = metadatos;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

}
