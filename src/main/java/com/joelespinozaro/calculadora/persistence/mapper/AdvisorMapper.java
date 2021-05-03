package com.joelespinozaro.calculadora.persistence.mapper;

import com.joelespinozaro.calculadora.domain.Advisor;
import com.joelespinozaro.calculadora.domain.Client;
import com.joelespinozaro.calculadora.persistence.entity.AsesorFinanciero;
import com.joelespinozaro.calculadora.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdvisorMapper {
    @Mappings({
            @Mapping(source = "idAsesorFinanciero", target = "advisorId"),
            @Mapping(source = "nombres", target = "name"),
            @Mapping(source = "telefono", target = "phone")
    })
    Advisor toAdvisor(AsesorFinanciero asesorFinanciero);
    List<Advisor> toAdvisors(List<AsesorFinanciero> asesoresFinancieros);

    @InheritInverseConfiguration
    AsesorFinanciero toAsesorFinanciero(Advisor advisor);
}
