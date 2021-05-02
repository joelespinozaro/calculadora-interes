package com.joelespinozaro.calculadora.domain.repository;

import com.joelespinozaro.calculadora.domain.Advisor;

import java.util.List;
import java.util.Optional;

public interface AdvisorRepository {
    List<Advisor> getAll();
    Optional<Advisor> getAdvisor(int advisorId);
    Advisor save(Advisor advisor);
    void delete(int advisorId);
}
