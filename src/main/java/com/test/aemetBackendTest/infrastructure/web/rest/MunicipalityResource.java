package com.test.aemetBackendTest.infrastructure.web.rest;

import com.test.aemetBackendTest.application.dto.MunicipalityResponseDTO;
import com.test.aemetBackendTest.application.service.MunicipalityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MunicipalityResource {

    private final MunicipalityService municipalityService;

    public MunicipalityResource(MunicipalityService municipalityService) {
        this.municipalityService = municipalityService;
    }
    
    @GetMapping("/municipalities/search")
    public List<MunicipalityResponseDTO> search(@RequestParam String name) {
        return municipalityService.getByName(name);
    }
}
