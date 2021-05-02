package com.joelespinozaro.calculadora.persistence.mapper;

import com.joelespinozaro.calculadora.domain.Advisor;
import com.joelespinozaro.calculadora.persistence.entity.AsesorFinanciero;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AdvisorMapper {
    @Mappings({
            @Mapping(source = "idAsesorFinanciero", target = "advisorId"),
            @Mapping(source = "nombres", target = "name"),
            @Mapping(source = "telefono", target = "phone")
    })
    Advisor toAdvisor(AsesorFinanciero asesorFinanciero);

    @InheritInverseConfiguration
    AsesorFinanciero toAsesorFinanciero(Advisor advisor);
}
