package com.wneto.investmentsbackend.repository;

import com.wneto.investmentsbackend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Since email is unique, we'll find users by email
    Optional<User> findByEmail(String email);
}
