package com.wneto.investmentsbackend.service;

import com.wneto.investmentsbackend.domain.Investment;
import com.wneto.investmentsbackend.repository.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentService {

    private final InvestmentRepository investmentRepository;

    @Autowired
    public InvestmentService(InvestmentRepository investmentRepository) {
        this.investmentRepository = investmentRepository;
    }
    public Investment findById(Long id) {
        return investmentRepository.findById(id).orElseThrow();
    }
    public List<Investment> findAll() {
        return investmentRepository.findAll();
    }
    public Investment save(Investment investment) {
        return investmentRepository.save(investment);
    }
    public void delete(Investment investment) {
        investmentRepository.delete(investment);
    }
}
