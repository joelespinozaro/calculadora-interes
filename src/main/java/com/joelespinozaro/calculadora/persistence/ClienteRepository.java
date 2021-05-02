package com.joelespinozaro.calculadora.persistence;

import com.joelespinozaro.calculadora.persistence.crud.ClienteCrudRepository;
import com.joelespinozaro.calculadora.persistence.entity.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepository {
    private ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> getAll() {
        return (List<Cliente>) clienteCrudRepository.findAll();
    }

    public List<Cliente> getByDocumento(String nroDocumento){
        return clienteCrudRepository.findByNroDocumentoOrderByNombresAsc(nroDocumento);
    }

    public Cliente save(Cliente cliente) {
        return clienteCrudRepository.save(cliente);
    }

    public void delete(int idCliente) {
        clienteCrudRepository.deleteById(idCliente);
    }
}
