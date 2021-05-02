package com.joelespinozaro.calculadora.web.controller;

import com.joelespinozaro.calculadora.domain.service.BankingService;
import com.joelespinozaro.calculadora.domain.Banking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bank")
public class BankingController {
    @Autowired
    private BankingService bankingService;

    @GetMapping("/all")
    public List<Banking> getAll() {
        return bankingService.getAll();
    }

    public Optional<Banking> getBanking(int bankingId) {
        return bankingService.getBanking(bankingId);
    }

    public Banking save(Banking banking) {
        return bankingService.save(banking);
    }

    public boolean delete(int bankingId) {
        return  bankingService.delete(bankingId);
    }
}
