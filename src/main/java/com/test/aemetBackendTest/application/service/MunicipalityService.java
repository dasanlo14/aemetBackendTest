package com.test.aemetBackendTest.application.service;

import com.test.aemetBackendTest.application.dto.MunicipalityResponseDTO;

import java.util.List;

public interface MunicipalityService {

    List<MunicipalityResponseDTO> getByName(String name);
}
