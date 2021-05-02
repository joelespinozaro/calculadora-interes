package com.joelespinozaro.calculadora.persistence.mapper;

import com.joelespinozaro.calculadora.domain.Client;
import com.joelespinozaro.calculadora.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Mappings({
            @Mapping(source = "idCliente", target = "clientId"),
            @Mapping(source = "nombres", target = "client"),
            @Mapping(source = "nroDocumento", target = "cardIdNumber"),
            @Mapping(source = "direccion", target = "address")
    })
    Client toClient(Cliente cliente);

    @InheritInverseConfiguration
    Cliente toCliente(Client client);
}
