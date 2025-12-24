package com.test.aemetBackendTest.application.dto;

public class PrecipitationProbDTO {

    private int probability;
    private String period;

    public PrecipitationProbDTO(int probability, String period) {
        this.probability = probability;
        this.period = period;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
