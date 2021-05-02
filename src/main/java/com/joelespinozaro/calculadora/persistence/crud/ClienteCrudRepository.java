package com.joelespinozaro.calculadora.persistence.crud;

import com.joelespinozaro.calculadora.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer> {
    List<Cliente> findByNroDocumentoOrderByNombresAsc(String nroDocumento);
}
