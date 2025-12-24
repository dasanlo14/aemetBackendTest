package com.test.aemetBackendTest.application.service;

import com.test.aemetBackendTest.infrastructure.client.dto.AemetMunicipalidadDTO;
import com.test.aemetBackendTest.infrastructure.client.dto.AemetPrediccionDTO;

import java.util.List;

public interface AemetService {

    public List<AemetMunicipalidadDTO> getAemetMunicipalities();

    public List<AemetPrediccionDTO> getAemetPredictionByMunicipality(String idMunicipio);
}
