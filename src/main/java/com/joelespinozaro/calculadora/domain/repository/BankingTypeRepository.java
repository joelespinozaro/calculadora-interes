package com.joelespinozaro.calculadora.domain.repository;

import com.joelespinozaro.calculadora.domain.BankingType;

import java.util.List;
import java.util.Optional;

public interface BankingTypeRepository {
    List<BankingType> getAll();
    Optional<BankingType> getBankingType(int bankingTypeId);
    BankingType save(BankingType advisor);
    void delete(int bankingTypeId);
}
