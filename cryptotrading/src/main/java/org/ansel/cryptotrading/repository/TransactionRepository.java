package org.ansel.cryptotrading.repository;

import org.ansel.cryptotrading.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Add custom query methods if needed
}
