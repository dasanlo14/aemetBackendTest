package com.test.aemetBackendTest.infrastructure.client;

import com.test.aemetBackendTest.infrastructure.client.dto.AemetMunicipalidadDTO;
import com.test.aemetBackendTest.infrastructure.client.dto.AemetPrediccionDTO;

import java.util.List;

public interface AemetClient {
    public List<AemetMunicipalidadDTO> getMunicipalities();
    public List<AemetPrediccionDTO> getPrediction(String municipalityId);
}
