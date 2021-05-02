package com.joelespinozaro.calculadora.domain.repository;

import com.joelespinozaro.calculadora.domain.Banking;

import java.util.List;
import java.util.Optional;

public interface BankingRepository {
    List<Banking> getAll();
    Optional<Banking> getBanking(int bankingId);
    Banking save(Banking banking);
    void delete(int bankingId);
}
