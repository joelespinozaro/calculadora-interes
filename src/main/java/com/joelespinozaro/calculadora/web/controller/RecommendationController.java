package com.joelespinozaro.calculadora.web.controller;

import com.joelespinozaro.calculadora.domain.Recommendation;
import com.joelespinozaro.calculadora.domain.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recommend")
public class RecommendationController {
    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/all")
    public List<Recommendation> getAll() {
        return recommendationService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Recommendation> getRecommendation(@PathVariable("id") int recommendationId) {
        return recommendationService.getRecommendation(recommendationId);
    }

    @PostMapping("/save")
    public Recommendation save(@RequestBody Recommendation recommendation) {
        return recommendationService.save(recommendation);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int recommendationId) {
        return  recommendationService.delete(recommendationId);
    }
}
