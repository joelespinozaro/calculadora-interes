package com.joelespinozaro.calculadora.persistence.crud;

import com.joelespinozaro.calculadora.persistence.entity.EntidadBancaria;
import org.springframework.data.repository.CrudRepository;

public interface EntidadBancariaCrudRepository extends CrudRepository<EntidadBancaria, Integer> {
}
