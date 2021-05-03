package com.joelespinozaro.calculadora.persistence.mapper;

import com.joelespinozaro.calculadora.domain.Recommendation;
import com.joelespinozaro.calculadora.persistence.entity.Recomendacion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses = {BankingMapper.class, AdvisorMapper.class})
public interface RecommendationMapper {
        @Mappings({
                @Mapping(source = "idRecomendacion", target="recommendationId"),
                @Mapping(source = "idAsesorFinanciero", target="advisorId"),
                @Mapping(source = "idEntidadBancaria", target="bankingId"),
                @Mapping(source = "asesorFinanciero", target="banking"),
                @Mapping(source = "entidadBancaria", target="advisor")

        })
        Recommendation toRecommendation(Recomendacion recomendacion);
        List<Recommendation> toRecommendations(List<Recomendacion> recomendaciones);

        @InheritInverseConfiguration
        //@Mapping(target = "recomendaciones", ignore = true)
        Recomendacion toRecomendacion(Recommendation recommendation);
}
