package com.joelespinozaro.calculadora.web.controller;

import com.joelespinozaro.calculadora.domain.BankingType;
import com.joelespinozaro.calculadora.domain.service.BankingTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/banktype")
public class BankingTypeController {

    @Autowired
    private BankingTypeService bankingTypeService;

    @GetMapping("/all")
    public List<BankingType> getAll() {
        return bankingTypeService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<BankingType> getBakingType(@PathVariable("id") int bankingTypeId) {
        return bankingTypeService.getBankingType(bankingTypeId);
    }

    @PostMapping("/save")
    public BankingType save(@RequestBody BankingType bankingType) {
        return bankingTypeService.save(bankingType);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int bankingTypeId) {
        return  bankingTypeService.delete(bankingTypeId);
    }
}
