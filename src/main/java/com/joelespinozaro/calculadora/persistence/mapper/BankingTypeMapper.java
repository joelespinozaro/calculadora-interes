package com.joelespinozaro.calculadora.persistence.mapper;

import com.joelespinozaro.calculadora.domain.BankingType;
import com.joelespinozaro.calculadora.persistence.entity.TipoEntidadBancaria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BankingTypeMapper {
    @Mappings({
            @Mapping(source = "idTipoEntidadBancaria", target = "bankingTypeId"),
            @Mapping(source = "descripcion", target = "description")
    })
    BankingType toBankingType(TipoEntidadBancaria tipoEntidadBancaria);
    List<BankingType> toBankingTypes(List<TipoEntidadBancaria> tipoEntidadesBancarias);

    @InheritInverseConfiguration
    @Mapping(target = "entidadesBancarias", ignore = true)
    TipoEntidadBancaria toTipoEntidadBancaria(BankingType bankingType);
}
