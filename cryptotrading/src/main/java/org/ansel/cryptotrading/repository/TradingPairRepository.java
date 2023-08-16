package org.ansel.cryptotrading.repository;

import org.ansel.cryptotrading.entity.TradingPair;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradingPairRepository extends JpaRepository<TradingPair, Long> {

    Object findByBaseCurrencySymbolAndQuoteCurrencySymbol(String baseCurrencySymbol, String quoteCurrencySymbol);
    // Add custom query methods if needed
}
