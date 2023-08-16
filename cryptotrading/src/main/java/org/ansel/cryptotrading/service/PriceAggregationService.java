package org.ansel.cryptotrading.service;

import org.ansel.cryptotrading.entity.TradingPair;
import org.ansel.cryptotrading.repository.TradingPairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class PriceAggregationService {

    @Autowired
    private TradingPairRepository tradingPairRepository;

    public BigDecimal getLatestAggregatedPrice(String baseCurrencySymbol, String quoteCurrencySymbol) {
        TradingPair tradingPair = tradingPairRepository.findByBaseCurrencySymbolAndQuoteCurrencySymbol(baseCurrencySymbol, quoteCurrencySymbol)
                .orElseThrow(() -> new EntityNotFoundException("Trading pair not found"));

        // Perform logic to calculate and return the latest aggregated price

        return calculatedPrice; // Replace with the actual calculated price
    }
}
