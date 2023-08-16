package org.ansel.cryptotrading.repository;

import org.ansel.cryptotrading.entity.CryptoCurrency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CryptoCurrencyRepository extends JpaRepository<CryptoCurrency, Long> {
    // Add custom query methods if needed
}