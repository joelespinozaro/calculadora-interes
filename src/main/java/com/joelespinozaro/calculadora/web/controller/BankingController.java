package com.joelespinozaro.calculadora.web.controller;

import com.joelespinozaro.calculadora.domain.service.BankingService;
import com.joelespinozaro.calculadora.domain.Banking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/bank")
public class BankingController {
    @Autowired
    private BankingService bankingService;

    @GetMapping("/all")
    public List<Banking> getAll() {
        return bankingService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Banking> getBanking(@PathVariable("id") int bankingId) {
        return bankingService.getBanking(bankingId);
    }

    @PostMapping("/save")
    public Banking save(@RequestBody Banking banking) {
        return bankingService.save(banking);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int bankingId) {
        return  bankingService.delete(bankingId);
    }
}
