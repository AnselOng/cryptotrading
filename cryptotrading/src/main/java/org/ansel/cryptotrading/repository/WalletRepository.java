package org.ansel.cryptotrading.repository;

import org.ansel.cryptotrading.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
    // Add custom query methods if needed
}
