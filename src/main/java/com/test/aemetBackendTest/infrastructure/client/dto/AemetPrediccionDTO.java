package com.test.aemetBackendTest.infrastructure.client.dto;

public class AemetPrediccionDTO {

    private OrigenDTO origen;

    private String elaborado;

    private String nombre;

    private String provincia;

    private PrediccionDTO prediccion;

    private Integer id;

    private Double version;

    public AemetPrediccionDTO(OrigenDTO origen, String elaborado, String nombre, String provincia, PrediccionDTO prediccion, Integer id, Double version) {
        this.origen = origen;
        this.elaborado = elaborado;
        this.nombre = nombre;
        this.provincia = provincia;
        this.prediccion = prediccion;
        this.id = id;
        this.version = version;
    }

    public OrigenDTO getOrigen() {
        return origen;
    }

    public void setOrigen(OrigenDTO origen) {
        this.origen = origen;
    }

    public String getElaborado() {
        return elaborado;
    }

    public void setElaborado(String elaborado) {
        this.elaborado = elaborado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public PrediccionDTO getPrediccion() {
        return prediccion;
    }

    public void setPrediccion(PrediccionDTO prediccion) {
        this.prediccion = prediccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }
}
