package com.joelespinozaro.calculadora.persistence;

import com.joelespinozaro.calculadora.domain.Advisor;
import com.joelespinozaro.calculadora.domain.repository.AdvisorRepository;
import com.joelespinozaro.calculadora.persistence.crud.AsesorFinancieroCrudRepository;
import com.joelespinozaro.calculadora.persistence.entity.AsesorFinanciero;
import com.joelespinozaro.calculadora.persistence.mapper.AdvisorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AsesorFinancieroRepository implements AdvisorRepository {
    @Autowired
    private AsesorFinancieroCrudRepository asesorFinancieroCrudRepository;

    @Autowired
    private AdvisorMapper mapper;

    @Override
    public List<Advisor> getAll() {
        List<AsesorFinanciero> asesoresFinancieros = (List<AsesorFinanciero>) asesorFinancieroCrudRepository.findAll();
        return mapper.toAdvisors(asesoresFinancieros);
    }

    @Override
    public Optional<Advisor> getAdvisor(int advisorId) {
        return asesorFinancieroCrudRepository.findById(advisorId).map(asesorFinanciero -> mapper.toAdvisor(asesorFinanciero));
    }

    @Override
    public Advisor save(Advisor advisor) {
        AsesorFinanciero asesorFinanciero = mapper.toAsesorFinanciero(advisor);
        return mapper.toAdvisor(asesorFinancieroCrudRepository.save(asesorFinanciero));
    }

    @Override
    public void delete(int advisorId) {
        asesorFinancieroCrudRepository.deleteById(advisorId);
    }
}
