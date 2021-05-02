package com.joelespinozaro.calculadora.domain.service;

import com.joelespinozaro.calculadora.domain.FinancialService;
import com.joelespinozaro.calculadora.domain.repository.FinancialServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinancialServiceService {
    @Autowired
    private FinancialServiceRepository financialServiceRepository;

    public List<FinancialService> getAll() {
        return financialServiceRepository.getAll();
    }

    public Optional<FinancialService> getFinancialService(int financialServiceId) {
        return financialServiceRepository.getFinancialService(financialServiceId);
    }

    public FinancialService save(FinancialService financialService) {
        return financialServiceRepository.save(financialService);
    }

    public boolean delete (int financialServiceId) {
        return getFinancialService(financialServiceId).map(financialService -> {
            financialServiceRepository.delete(financialServiceId);
            return true;
        }).orElse(false);
    }

}
