package com.test.aemetBackendTest.infrastructure.client.dto;

import java.util.List;

public class PrediccionDTO {

    private List<DiaDTO> dia;

    public PrediccionDTO(List<DiaDTO> dia) {
        this.dia = dia;
    }

    public List<DiaDTO> getDia() {
        return dia;
    }

    public void setDia(List<DiaDTO> dia) {
        this.dia = dia;
    }
}
