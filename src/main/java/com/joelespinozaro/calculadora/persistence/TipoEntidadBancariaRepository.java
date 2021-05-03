package com.joelespinozaro.calculadora.persistence;

import com.joelespinozaro.calculadora.domain.BankingType;
import com.joelespinozaro.calculadora.domain.repository.BankingTypeRepository;
import com.joelespinozaro.calculadora.persistence.crud.TipoEntidadBancariaCrudRepository;
import com.joelespinozaro.calculadora.persistence.entity.TipoEntidadBancaria;
import com.joelespinozaro.calculadora.persistence.mapper.BankingTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TipoEntidadBancariaRepository implements BankingTypeRepository {
    @Autowired
    private TipoEntidadBancariaCrudRepository tipoEntidadBancariaCrudRepository;

    @Autowired
    private BankingTypeMapper mapper;

    @Override
    public List<BankingType> getAll() {
        List<TipoEntidadBancaria> tipoEntidadesBancarias = (List<TipoEntidadBancaria>) tipoEntidadBancariaCrudRepository.findAll();
        return mapper.toBankingTypes(tipoEntidadesBancarias);
    }

    @Override
    public Optional<BankingType> getBankingType(int bankingTypeId) {
        return tipoEntidadBancariaCrudRepository.findById(bankingTypeId).map(tipoEntidadBancaria -> mapper.toBankingType(tipoEntidadBancaria));
    }

    @Override
    public BankingType save(BankingType bankingType) {
        TipoEntidadBancaria tipoEntidadBancaria = mapper.toTipoEntidadBancaria(bankingType);
        return mapper.toBankingType(tipoEntidadBancariaCrudRepository.save(tipoEntidadBancaria));
    }

    @Override
    public void delete(int bankingTypeId) {
        tipoEntidadBancariaCrudRepository.deleteById(bankingTypeId);
    }
}
