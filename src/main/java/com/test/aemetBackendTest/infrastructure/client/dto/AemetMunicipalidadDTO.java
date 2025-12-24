package com.test.aemetBackendTest.infrastructure.client.dto;

public class AemetMunicipalidadDTO {

    private String latitud;

    private String id_old;
    
    private String url;

    private String latitud_dec;
    
    private String altitud;
    
    private String capital;
    
    private String num_hab;

    private String zona_comarcal;
    
    private String destacada;
    
    private String nombre;
    
    private String longitud_dec;
    
    private String id;
    
    private String longitud;


    public AemetMunicipalidadDTO(String latitud, String id_old, String url, String latitud_dec, String altitud, String capital, String num_hab, String zona_comarcal, String destacada, String nombre, String longitud_dec, String id, String longitud) {
        this.latitud = latitud;
        this.id_old = id_old;
        this.url = url;
        this.latitud_dec = latitud_dec;
        this.altitud = altitud;
        this.capital = capital;
        this.num_hab = num_hab;
        this.zona_comarcal = zona_comarcal;
        this.destacada = destacada;
        this.nombre = nombre;
        this.longitud_dec = longitud_dec;
        this.id = id;
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getId_old() {
        return id_old;
    }

    public void setId_old(String id_old) {
        this.id_old = id_old;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLatitud_dec() {
        return latitud_dec;
    }

    public void setLatitud_dec(String latitud_dec) {
        this.latitud_dec = latitud_dec;
    }

    public String getAltitud() {
        return altitud;
    }

    public void setAltitud(String altitud) {
        this.altitud = altitud;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(String num_hab) {
        this.num_hab = num_hab;
    }

    public String getZona_comarcal() {
        return zona_comarcal;
    }

    public void setZona_comarcal(String zona_comarcal) {
        this.zona_comarcal = zona_comarcal;
    }

    public String getDestacada() {
        return destacada;
    }

    public void setDestacada(String destacada) {
        this.destacada = destacada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLongitud_dec() {
        return longitud_dec;
    }

    public void setLongitud_dec(String longitud_dec) {
        this.longitud_dec = longitud_dec;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

}
