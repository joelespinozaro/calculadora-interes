package com.joelespinozaro.calculadora.domain.service;

import com.joelespinozaro.calculadora.domain.Client;
import com.joelespinozaro.calculadora.domain.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll() {
        return clientRepository.getAll();
    }

    public Optional<Client> getClient(int clientId) {
        return clientRepository.getClient(clientId);
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }

    public boolean delete (int clientId) {
        return getClient(clientId).map(client -> {
            clientRepository.delete(clientId);
            return true;
        }).orElse(false);
    }
    public Optional<Client> getByAddress(String address) {
        return clientRepository.getByAddress(address);
    }
}
