package com.wneto.investmentsbackend.repository;

import com.wneto.investmentsbackend.domain.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositRepository extends JpaRepository<Deposit, Long> {
}
