package com.joelespinozaro.calculadora.web.controller;

import com.joelespinozaro.calculadora.domain.FinancialService;
import com.joelespinozaro.calculadora.domain.service.FinancialServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/financial")
public class FinancialServiceController {
    @Autowired
    private FinancialServiceService financialServiceService;

    @GetMapping("/all")
    public List<FinancialService> getAll() {
        return financialServiceService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<FinancialService> getFinancialService(@PathVariable("id") int financialServiceId) {
        return financialServiceService.getFinancialService(financialServiceId);
    }
    @PostMapping("/save")
    public FinancialService save(@RequestBody FinancialService financialService) {
        return financialServiceService.save(financialService);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int financialServiceId) {
        return  financialServiceService.delete(financialServiceId);
    }
}
