package com.test.aemetBackendTest.application.service.impl;

import com.test.aemetBackendTest.infrastructure.client.AemetClient;
import com.test.aemetBackendTest.infrastructure.client.dto.AemetMunicipalidadDTO;
import com.test.aemetBackendTest.infrastructure.client.dto.AemetPrediccionDTO;
import com.test.aemetBackendTest.application.service.AemetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AemetServiceImpl implements AemetService {

    private final AemetClient aemetClient;

    public AemetServiceImpl(AemetClient aemetClient) {
        this.aemetClient = aemetClient;
    }

    @Override
    public List<AemetMunicipalidadDTO> getAemetMunicipalities(){
        return this.aemetClient.getMunicipalities();
    }

    @Override
    public List<AemetPrediccionDTO> getAemetPredictionByMunicipality(String municipalityId){
        return this.aemetClient.getPrediction(municipalityId);
    }
}
