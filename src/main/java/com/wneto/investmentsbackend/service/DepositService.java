package com.wneto.investmentsbackend.service;

import com.wneto.investmentsbackend.domain.Deposit;
import com.wneto.investmentsbackend.repository.DepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepositService {
    
    private final DepositRepository depositRepository;

    @Autowired
    public DepositService(DepositRepository depositRepository) {
        this.depositRepository = depositRepository;
    }

    public Deposit findById(Long id) {
        return depositRepository.findById(id).orElseThrow();
    }
    public List<Deposit> findAll() {
        return depositRepository.findAll();
    }
    public Deposit save(Deposit deposit) {
        return depositRepository.save(deposit);
    }
    public void delete(Deposit deposit) {
        depositRepository.delete(deposit);
    }
}
