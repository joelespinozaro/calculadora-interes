package com.joelespinozaro.calculadora.persistence;

import com.joelespinozaro.calculadora.persistence.mapper.BankingMapper;
import com.joelespinozaro.calculadora.domain.Banking;
import com.joelespinozaro.calculadora.domain.repository.BankingRepository;
import com.joelespinozaro.calculadora.persistence.crud.EntidadBancariaCrudRepository;
import com.joelespinozaro.calculadora.persistence.entity.EntidadBancaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EntidadBancariaRepository implements BankingRepository {
    @Autowired
    private EntidadBancariaCrudRepository entidadBancariaCrudRepository;
    @Autowired
    private BankingMapper mapper;

    @Override
    public List<Banking> getAll() {
        List<EntidadBancaria> entidadesBancarias = (List<EntidadBancaria>) entidadBancariaCrudRepository.findAll();
        return mapper.toBankings(entidadesBancarias);
    }

    @Override
    public Optional<Banking> getBanking(int bankingId) {
        return entidadBancariaCrudRepository.findById(bankingId).map(entidadBancaria -> mapper.toBanking(entidadBancaria));
    }

    @Override
    public Banking save(Banking banking) {
        EntidadBancaria entidadBancaria = mapper.toEntidadBancaria(banking);
        return mapper.toBanking(entidadBancariaCrudRepository.save(entidadBancaria));
    }

    @Override
    public void delete (int idEntidadBancaria) {
        entidadBancariaCrudRepository.deleteById(idEntidadBancaria);
    }
}
