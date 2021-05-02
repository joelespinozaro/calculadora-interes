package com.joelespinozaro.calculadora.persistence.crud;

import com.joelespinozaro.calculadora.persistence.entity.AsesorFinanciero;
import org.springframework.data.repository.CrudRepository;

public interface AsesorFinancieroCrudRepository extends CrudRepository<AsesorFinanciero, Integer> {
}
