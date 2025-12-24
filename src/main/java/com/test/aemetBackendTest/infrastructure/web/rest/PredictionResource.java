package com.test.aemetBackendTest.infrastructure.web.rest;

import com.test.aemetBackendTest.application.service.PredictionService;
import com.test.aemetBackendTest.application.dto.TomorrowPredictionResponseDTO;
import com.test.aemetBackendTest.shared.enumeration.TemperatureUnit;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PredictionResource {

    private final PredictionService predictionService;

    public PredictionResource(PredictionService predictionService) {
        this.predictionService = predictionService;
    }

    @GetMapping("/prediction/{municipalityId}/tomorrow")
    public TomorrowPredictionResponseDTO getPrediccionManana(
            @PathVariable String municipalityId,
            @RequestParam(defaultValue = "G_CEL") TemperatureUnit unit) {

        return predictionService.getTomorrowPrediction(municipalityId, unit);
    }
}
