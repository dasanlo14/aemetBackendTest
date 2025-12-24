package com.test.aemetBackendTest.application.service.impl;

import com.test.aemetBackendTest.application.dto.MunicipalityResponseDTO;
import com.test.aemetBackendTest.application.service.AemetService;
import com.test.aemetBackendTest.application.service.MunicipalityService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MunicipalityServiceImpl implements MunicipalityService {

    private final AemetService aemetService;

    public MunicipalityServiceImpl(AemetService aemetService) {
        this.aemetService = aemetService;
    }

    @Override
    public List<MunicipalityResponseDTO> getByName(String name) {

        return aemetService.getAemetMunicipalities().stream()
                .filter(m -> name == null || m.getNombre().toLowerCase()
                        .contains(name.toLowerCase()))
                .map(m -> new MunicipalityResponseDTO(
                        m.getId(),
                        m.getNombre()
                ))
                .toList();
    }
}
