package com.joelespinozaro.calculadora.domain.repository;

import com.joelespinozaro.calculadora.domain.FinancialService;

import java.util.List;
import java.util.Optional;

public interface FinancialServiceRepository {
    List<FinancialService> getAll();
    Optional<FinancialService> getFinancialService(int financialServiceId);
    FinancialService save(FinancialService financialService);
    void delete(int financialServiceId);
}
