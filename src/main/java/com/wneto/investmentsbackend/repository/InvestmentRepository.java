package com.wneto.investmentsbackend.repository;

import com.wneto.investmentsbackend.domain.Investment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}
