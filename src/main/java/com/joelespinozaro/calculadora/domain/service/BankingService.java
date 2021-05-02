package com.joelespinozaro.calculadora.domain.service;

import com.joelespinozaro.calculadora.domain.Banking;
import com.joelespinozaro.calculadora.domain.repository.BankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankingService {
    @Autowired
    private BankingRepository bankingRepository;

    public List<Banking> getAll() {
        return bankingRepository.getAll();
    }

    public Optional<Banking> getBanking(int bankingId) {
        return bankingRepository.getBanking(bankingId);
    }

    public Banking save(Banking banking) {
        return bankingRepository.save(banking);
    }

    public boolean delete (int bankingId) {
        return getBanking(bankingId).map(banking -> {
            bankingRepository.delete(bankingId);
            return true;
        }).orElse(false);
    }
}
