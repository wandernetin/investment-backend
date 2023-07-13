package com.wneto.investmentsbackend.repository;

import com.wneto.investmentsbackend.domain.InvestmentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentTypeRepository extends JpaRepository<InvestmentType, Long> {
}
