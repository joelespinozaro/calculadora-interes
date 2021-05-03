package com.joelespinozaro.calculadora.persistence;

import com.joelespinozaro.calculadora.domain.FinancialService;
import com.joelespinozaro.calculadora.domain.repository.FinancialServiceRepository;
import com.joelespinozaro.calculadora.persistence.crud.ServicioFinancieroCrudRepository;
import com.joelespinozaro.calculadora.persistence.entity.ServicioFinanciero;
import com.joelespinozaro.calculadora.persistence.mapper.FinancialServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ServicioFinancieroRepository implements FinancialServiceRepository {
    @Autowired
    private ServicioFinancieroCrudRepository servicioFinancieroCrudRepository;

    @Autowired
    private FinancialServiceMapper mapper;

    @Override
    public List<FinancialService> getAll() {
        List<ServicioFinanciero> serviciosFinancieros = (List<ServicioFinanciero>) servicioFinancieroCrudRepository.findAll();
        return mapper.toFinancialServices(serviciosFinancieros);
    }

    @Override
    public Optional<FinancialService> getFinancialService(int financialServiceId) {
        return servicioFinancieroCrudRepository.findById(financialServiceId).map(servicioFinanciero -> mapper.toFinancialService(servicioFinanciero));
    }

    @Override
    public FinancialService save(FinancialService financialService) {
        ServicioFinanciero servicioFinanciero = mapper.toServicioFinanciero(financialService);
        return mapper.toFinancialService(servicioFinancieroCrudRepository.save(servicioFinanciero));
    }

    @Override
    public void delete(int financialServiceId) {
        servicioFinancieroCrudRepository.deleteById(financialServiceId);
    }
}
