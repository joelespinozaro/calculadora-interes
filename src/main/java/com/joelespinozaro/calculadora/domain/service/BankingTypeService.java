package com.joelespinozaro.calculadora.domain.service;

import com.joelespinozaro.calculadora.domain.BankingType;
import com.joelespinozaro.calculadora.domain.repository.BankingTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankingTypeService {
    @Autowired
    private BankingTypeRepository bankingTypeRepository;

    public List<BankingType> getAll() {
        return bankingTypeRepository.getAll();
    }

    public Optional<BankingType> getBankingType(int bankingTypeId) {
        return bankingTypeRepository.getBankingType(bankingTypeId);
    }

    public BankingType save(BankingType bankingType) {
        return bankingTypeRepository.save(bankingType);
    }

    public boolean delete (int bankingTypeId) {
        return getBankingType(bankingTypeId).map(bankingType -> {
            bankingTypeRepository.delete(bankingTypeId);
            return true;
        }).orElse(false);
    }
}
