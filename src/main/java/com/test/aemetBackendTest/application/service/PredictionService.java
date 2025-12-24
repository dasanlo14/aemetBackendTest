package com.test.aemetBackendTest.application.service;

import com.test.aemetBackendTest.application.dto.TomorrowPredictionResponseDTO;
import com.test.aemetBackendTest.shared.enumeration.TemperatureUnit;

public interface PredictionService {

    TomorrowPredictionResponseDTO getTomorrowPrediction(
            String municipalityId,
            TemperatureUnit unit
    );
}
