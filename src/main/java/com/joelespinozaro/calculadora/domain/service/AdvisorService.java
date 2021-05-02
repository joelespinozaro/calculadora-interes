package com.joelespinozaro.calculadora.domain.service;

import com.joelespinozaro.calculadora.domain.Advisor;
import com.joelespinozaro.calculadora.domain.repository.AdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdvisorService {
    @Autowired
    private AdvisorRepository advisorRepository;

    public List<Advisor> getAll() {
        return advisorRepository.getAll();
    }

    public Optional<Advisor> getAdvisor(int advisorId) {
        return advisorRepository.getAdvisor(advisorId);
    }

    public Advisor save(Advisor advisor) {
        return advisorRepository.save(advisor);
    }

    public boolean delete (int advisorId) {
        return getAdvisor(advisorId).map(advisor -> {
            advisorRepository.delete(advisorId);
            return true;
        }).orElse(false);
    }
}
