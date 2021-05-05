package com.joelespinozaro.calculadora.web.controller;

import com.joelespinozaro.calculadora.domain.Client;
import com.joelespinozaro.calculadora.domain.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Client> getClient(@PathVariable("id") int clientId) {
        return clientService.getClient(clientId);
    }
    @PostMapping("/save")
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int clientId) {
        return  clientService.delete(clientId);
    }

    @GetMapping("/email/{email}")
    public Optional<Client> getByAddress(@PathVariable("email") String address) {
        return clientService.getByAddress(address);
    }
}
