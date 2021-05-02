package com.joelespinozaro.calculadora.persistence.crud;

import com.joelespinozaro.calculadora.persistence.entity.Recomendacion;
import org.springframework.data.repository.CrudRepository;

public interface RecomendacionCrudRepository extends CrudRepository<Recomendacion,Integer> {
}
