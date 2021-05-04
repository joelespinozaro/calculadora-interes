package com.joelespinozaro.calculadora.web.controller;

import com.joelespinozaro.calculadora.domain.Advisor;
import com.joelespinozaro.calculadora.domain.service.AdvisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/advisor")
public class AdvisorController {
    @Autowired
    private AdvisorService advisorService;

    @GetMapping("/all")
    public List<Advisor> getAll() {
        return advisorService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Advisor> getAdvisor(@PathVariable("id") int advisorId) {
        return advisorService.getAdvisor(advisorId);
    }

    @PostMapping("/save")
    public Advisor save(@RequestBody Advisor advisor) {
        return advisorService.save(advisor);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int advisorId) {
        return  advisorService.delete(advisorId);
    }
}
