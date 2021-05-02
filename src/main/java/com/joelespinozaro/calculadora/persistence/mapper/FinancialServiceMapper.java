package com.joelespinozaro.calculadora.persistence.mapper;

import com.joelespinozaro.calculadora.domain.Banking;
import com.joelespinozaro.calculadora.domain.FinancialService;
import com.joelespinozaro.calculadora.persistence.entity.EntidadBancaria;
import com.joelespinozaro.calculadora.persistence.entity.ServicioFinanciero;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

public interface FinancialServiceMapper {
        @Mappings({
                @Mapping(source = "idServicioFinanciero", target="financialServiceId"),
                @Mapping(source = "idRecomendacion", target="recommendationId"),
                @Mapping(source = "idCliente", target="clientId"),
                @Mapping(source = "tasa", target="rate"),
                @Mapping(source = "capital", target="capital"),
                @Mapping(source = "periodo", target="period"),
                @Mapping(source = "recomendacion", target="recommendation"),
                @Mapping(source = "cliente", target="client")

        })
        FinancialService toFinancialService(ServicioFinanciero servicioFinanciero);
        List<FinancialService> toFinancialServices(List<ServicioFinanciero> serviciosFinancieros);

        @InheritInverseConfiguration
        ServicioFinanciero toServicioFinanciero(FinancialService financialService);
}
