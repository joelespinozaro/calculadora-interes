package com.joelespinozaro.calculadora.persistence;

import com.joelespinozaro.calculadora.domain.Client;
import com.joelespinozaro.calculadora.domain.repository.ClientRepository;
import com.joelespinozaro.calculadora.persistence.crud.ClienteCrudRepository;
import com.joelespinozaro.calculadora.persistence.entity.Cliente;
import com.joelespinozaro.calculadora.persistence.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository implements ClientRepository {
    @Autowired
    private ClienteCrudRepository clienteCrudRepository;

    @Autowired
    private ClientMapper mapper;

    @Override
    public List<Client> getAll() {
        List<Cliente> clientes = (List<Cliente>) clienteCrudRepository.findAll();
        return mapper.toClients(clientes);
    }

    @Override
    public Optional<Client> getClient(int clientId) {
        return clienteCrudRepository.findById(clientId).map(cliente -> mapper.toClient(cliente));
    }

    @Override
    public Client save(Client client) {
        Cliente cliente = mapper.toCliente(client);
        return mapper.toClient(clienteCrudRepository.save(cliente));
    }

    @Override
    public void delete(int clientId) {
        clienteCrudRepository.deleteById(clientId);
    }


}
