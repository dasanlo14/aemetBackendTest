package com.test.aemetBackendTest.application.service.impl;

import com.test.aemetBackendTest.infrastructure.client.dto.AemetPrediccionDTO;
import com.test.aemetBackendTest.infrastructure.client.dto.DiaDTO;
import com.test.aemetBackendTest.application.service.AemetService;
import com.test.aemetBackendTest.application.service.PredictionService;
import com.test.aemetBackendTest.application.dto.TomorrowPredictionResponseDTO;
import com.test.aemetBackendTest.application.dto.PrecipitationProbDTO;
import com.test.aemetBackendTest.shared.enumeration.TemperatureUnit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PredictionServiceImpl implements PredictionService {

    private static final List<String> PERIODS_6H = List.of(
            "00-06",
            "06-12",
            "12-18",
            "18-24"
    );

    private final AemetService aemetService;

    public PredictionServiceImpl(AemetService aemetService) {
        this.aemetService = aemetService;
    }

    @Override
    public TomorrowPredictionResponseDTO getTomorrowPrediction(
            String municipalityId,
            TemperatureUnit unit) {

        String municipalityCode = extractMunicipalityCode(municipalityId);

        AemetPrediccionDTO prediction =
                aemetService.getAemetPredictionByMunicipality(municipalityCode).getFirst();

        DiaDTO tomorrow = prediction.getPrediccion().getDia().get(1);

        double celsiusAvg =
                (tomorrow.getTemperatura().getMaxima()
                        + tomorrow.getTemperatura().getMinima()) / 2.0;

        double finalAvg = unit == TemperatureUnit.G_FAH
                ? (celsiusAvg * 9 / 5) + 32
                : celsiusAvg;

        List<PrecipitationProbDTO> precipitationProb =
                tomorrow.getProbPrecipitacion().stream()
                        .filter(p -> PERIODS_6H.contains(p.getPeriodo()))
                        .filter(p -> p.getValue() != null && !p.getValue().isBlank())
                        .map(p -> new PrecipitationProbDTO(
                                Integer.parseInt(p.getValue()),
                                p.getPeriodo()
                        ))
                        .toList();

        return new TomorrowPredictionResponseDTO(
                round(finalAvg),
                unit.name(),
                precipitationProb
        );
    }

    private String extractMunicipalityCode(String idAemet) {
        if (idAemet != null && idAemet.startsWith("id")) {
            return idAemet.substring(2);
        }
        return idAemet;
    }

    private double round(double value) {
        return Math.round(value * 10.0) / 10.0;
    }
}
