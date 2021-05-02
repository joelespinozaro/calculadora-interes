package com.joelespinozaro.calculadora.domain.service;

import com.joelespinozaro.calculadora.domain.Recommendation;
import com.joelespinozaro.calculadora.domain.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecommendationService {
    @Autowired
    private RecommendationRepository recommendationRepository;

    public List<Recommendation> getAll() {
        return recommendationRepository.getAll();
    }

    public Optional<Recommendation> getRecommendation(int recommendationId) {
        return recommendationRepository.getRecommendation(recommendationId);
    }

    public Recommendation save(Recommendation recommendation) {
        return recommendationRepository.save(recommendation);
    }

    public boolean delete (int recommendationId) {
        return getRecommendation(recommendationId).map(recommendation -> {
            recommendationRepository.delete(recommendationId);
            return true;
        }).orElse(false);
    }

}
