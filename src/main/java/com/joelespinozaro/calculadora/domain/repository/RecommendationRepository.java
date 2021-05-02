package com.joelespinozaro.calculadora.domain.repository;

import com.joelespinozaro.calculadora.domain.Recommendation;

import java.util.List;
import java.util.Optional;

public interface RecommendationRepository {
    List<Recommendation> getAll();
    Optional<Recommendation> getRecommendation(int recommendationId);
    Recommendation save(Recommendation recommendation);
    void delete(int recommendationId);
}
