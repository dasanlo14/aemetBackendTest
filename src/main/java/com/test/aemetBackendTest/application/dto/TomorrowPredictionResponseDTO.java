package com.test.aemetBackendTest.application.dto;

import java.util.List;

public class TomorrowPredictionResponseDTO {
    private double averageTemperature;
    private String unitTemperature;
    private List<PrecipitationProbDTO> precipitationProb;

    public TomorrowPredictionResponseDTO(double averageTemperature, String unitTemperature, List<PrecipitationProbDTO> precipitationProb) {
        this.averageTemperature = averageTemperature;
        this.unitTemperature = unitTemperature;
        this.precipitationProb = precipitationProb;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getUnitTemperature() {
        return unitTemperature;
    }

    public void setUnitTemperature(String unitTemperature) {
        this.unitTemperature = unitTemperature;
    }

    public List<PrecipitationProbDTO> getPrecipitationProb() {
        return precipitationProb;
    }

    public void setPrecipitationProb(List<PrecipitationProbDTO> precipitationProb) {
        this.precipitationProb = precipitationProb;
    }
}
