package com.wneto.investmentsbackend.service;

import com.wneto.investmentsbackend.domain.InvestmentType;
import com.wneto.investmentsbackend.repository.InvestmentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentTypeService {

    private final InvestmentTypeRepository investmentTypeRepository;

    @Autowired
    public InvestmentTypeService(InvestmentTypeRepository investmentTypeRepository) {
        this.investmentTypeRepository = investmentTypeRepository;
    }

    public InvestmentType findById(Long id) {
        return investmentTypeRepository.findById(id).orElseThrow();
    }

    public List<InvestmentType> findAll() {
        return investmentTypeRepository.findAll();
    }

    public InvestmentType save(InvestmentType investmentType) {
        return investmentTypeRepository.save(investmentType);
    }

    public void delete(InvestmentType investmentType) {
        investmentTypeRepository.delete(investmentType);
    }
}
