package com.test.aemetBackendTest.infrastructure.client.dto;


import java.util.List;

public class DiaDTO {

    private List<PeriodoValorDTO> probPrecipitacion;
    
    private List<PeriodoValorDTO> cotaNieveProv;
    
    private List<EstadoCieloDTO> estadoCielo;
    
    private List<VientoDTO> viento;
    
    private List<PeriodoValorDTO> rachaMax;
    
    private TemperaturaDTO temperatura;

    private TemperaturaDTO sensTermica;
    
    private TemperaturaDTO humedadRelativa;
    
    private Integer uvMax;
    
    private String fecha;

    public DiaDTO(List<PeriodoValorDTO> probPrecipitacion, List<PeriodoValorDTO> cotaNieveProv, List<EstadoCieloDTO> estadoCielo, List<VientoDTO> viento, List<PeriodoValorDTO> rachaMax, TemperaturaDTO temperatura, TemperaturaDTO sensTermica, TemperaturaDTO humedadRelativa, Integer uvMax, String fecha) {
        this.probPrecipitacion = probPrecipitacion;
        this.cotaNieveProv = cotaNieveProv;
        this.estadoCielo = estadoCielo;
        this.viento = viento;
        this.rachaMax = rachaMax;
        this.temperatura = temperatura;
        this.sensTermica = sensTermica;
        this.humedadRelativa = humedadRelativa;
        this.uvMax = uvMax;
        this.fecha = fecha;
    }

    public List<PeriodoValorDTO> getProbPrecipitacion() {
        return probPrecipitacion;
    }

    public void setProbPrecipitacion(List<PeriodoValorDTO> probPrecipitacion) {
        this.probPrecipitacion = probPrecipitacion;
    }

    public List<PeriodoValorDTO> getCotaNieveProv() {
        return cotaNieveProv;
    }

    public void setCotaNieveProv(List<PeriodoValorDTO> cotaNieveProv) {
        this.cotaNieveProv = cotaNieveProv;
    }

    public List<EstadoCieloDTO> getEstadoCielo() {
        return estadoCielo;
    }

    public void setEstadoCielo(List<EstadoCieloDTO> estadoCielo) {
        this.estadoCielo = estadoCielo;
    }

    public List<VientoDTO> getViento() {
        return viento;
    }

    public void setViento(List<VientoDTO> viento) {
        this.viento = viento;
    }

    public List<PeriodoValorDTO> getRachaMax() {
        return rachaMax;
    }

    public void setRachaMax(List<PeriodoValorDTO> rachaMax) {
        this.rachaMax = rachaMax;
    }

    public TemperaturaDTO getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(TemperaturaDTO temperatura) {
        this.temperatura = temperatura;
    }

    public TemperaturaDTO getSensTermica() {
        return sensTermica;
    }

    public void setSensTermica(TemperaturaDTO sensTermica) {
        this.sensTermica = sensTermica;
    }

    public TemperaturaDTO getHumedadRelativa() {
        return humedadRelativa;
    }

    public void setHumedadRelativa(TemperaturaDTO humedadRelativa) {
        this.humedadRelativa = humedadRelativa;
    }

    public Integer getUvMax() {
        return uvMax;
    }

    public void setUvMax(Integer uvMax) {
        this.uvMax = uvMax;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
