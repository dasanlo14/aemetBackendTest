package com.test.aemetBackendTest.infrastructure.client.impl;

import com.test.aemetBackendTest.infrastructure.client.AemetClient;
import com.test.aemetBackendTest.infrastructure.client.dto.AemetDataDTO;
import com.test.aemetBackendTest.infrastructure.client.dto.AemetMunicipalidadDTO;
import com.test.aemetBackendTest.infrastructure.client.dto.AemetPrediccionDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class AemetClientImpl implements AemetClient {

    @Value("${aemet.api.url}")
    private String aemetApiUrl;

    @Value("${aemet.api.key}")
    private String aemetApiKey;

    private final RestTemplate restTemplate;

    public AemetClientImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<AemetMunicipalidadDTO> getMunicipalities(){
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(aemetApiKey);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<AemetDataDTO> wrapperResponse =
                restTemplate.exchange(
                        aemetApiUrl + "/maestro/municipios",
                        HttpMethod.GET,
                        entity,
                        AemetDataDTO.class
                );

        AemetDataDTO aemetDataDTO = wrapperResponse.getBody();

        if (aemetDataDTO == null || aemetDataDTO.getDatos() == null) {
            throw new IllegalStateException("Respuesta inválida de AEMET");
        }

        ResponseEntity<AemetMunicipalidadDTO[]> municipiosResponse =
                restTemplate.exchange(
                        aemetDataDTO.getDatos(),
                        HttpMethod.GET,
                        entity,
                        AemetMunicipalidadDTO[].class
                );

        return Optional.ofNullable(municipiosResponse.getBody())
                .map(Arrays::asList)
                .orElse(List.of());
    }

    @Override
    public List<AemetPrediccionDTO> getPrediction(String municipalityId){

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(aemetApiKey);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<AemetDataDTO> wrapperResponse =
                restTemplate.exchange(
                        aemetApiUrl + "/prediccion/especifica/municipio/diaria/" + municipalityId,
                        HttpMethod.GET,
                        entity,
                        AemetDataDTO.class
                );

        AemetDataDTO aemetDataDTO = wrapperResponse.getBody();

        if (aemetDataDTO == null || aemetDataDTO.getDatos() == null) {
            throw new IllegalStateException("Respuesta inválida de AEMET (predicción)");
        }

        ResponseEntity<AemetPrediccionDTO[]> predictionResponse =
                restTemplate.exchange(
                        aemetDataDTO.getDatos(),
                        HttpMethod.GET,
                        entity,
                        AemetPrediccionDTO[].class
                );

        return Optional.ofNullable(predictionResponse.getBody())
                .map(Arrays::asList)
                .orElse(List.of());
    }
}
