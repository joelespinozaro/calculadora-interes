package com.joelespinozaro.calculadora.persistence;

import com.joelespinozaro.calculadora.domain.Recommendation;
import com.joelespinozaro.calculadora.domain.repository.RecommendationRepository;
import com.joelespinozaro.calculadora.persistence.crud.RecomendacionCrudRepository;
import com.joelespinozaro.calculadora.persistence.entity.Recomendacion;
import com.joelespinozaro.calculadora.persistence.mapper.RecommendationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RecomendacionRepository implements RecommendationRepository {
    @Autowired
    private RecomendacionCrudRepository recomendacionCrudRepository;

    @Autowired
    private RecommendationMapper mapper;

    @Override
    public List<Recommendation> getAll() {
        List<Recomendacion> recomendaciones = (List<Recomendacion>) recomendacionCrudRepository.findAll();
        return mapper.toRecommendations(recomendaciones);
    }

    @Override
    public Optional<Recommendation> getRecommendation(int recommendationId) {
        return recomendacionCrudRepository.findById(recommendationId).map(recomendacion -> mapper.toRecommendation(recomendacion));
    }

    @Override
    public Recommendation save(Recommendation recommendation) {
        Recomendacion recomendacion = mapper.toRecomendacion(recommendation);
        return mapper.toRecommendation(recomendacionCrudRepository.save(recomendacion));
    }

    @Override
    public void delete(int recommendationId) {
        recomendacionCrudRepository.deleteById(recommendationId);
    }
}
