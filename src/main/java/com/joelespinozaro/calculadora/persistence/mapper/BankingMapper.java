package com.joelespinozaro.calculadora.persistence.mapper;

import com.joelespinozaro.calculadora.domain.Banking;
import com.joelespinozaro.calculadora.persistence.entity.EntidadBancaria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {BankingTypeMapper.class})
public interface BankingMapper {
    @Mappings({
            @Mapping(source = "idEntidadBancaria", target="bankingId"),
            @Mapping(source = "nombre", target="name"),
            @Mapping(source = "direccion", target="address"),
            @Mapping(source = "telefono", target="phoneNumber"),
            @Mapping(source = "idTipoEntidadBancaria", target="bankingTypeId"),
            @Mapping(source = "tipoEntidadBancaria", target="bankingType")

    })
    Banking toBanking(EntidadBancaria entidadBancaria);
    List<Banking> toBankings(List<EntidadBancaria> entidadesBancarias);

    @InheritInverseConfiguration
    EntidadBancaria toEntidadBancaria(Banking banking);
}
