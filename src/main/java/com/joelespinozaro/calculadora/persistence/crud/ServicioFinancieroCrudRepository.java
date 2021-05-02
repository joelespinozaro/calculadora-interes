package com.joelespinozaro.calculadora.persistence.crud;

import com.joelespinozaro.calculadora.persistence.entity.ServicioFinanciero;
import org.springframework.data.repository.CrudRepository;

public interface ServicioFinancieroCrudRepository extends CrudRepository<ServicioFinanciero,Integer> {
}
