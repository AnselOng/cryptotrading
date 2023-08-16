package org.ansel.cryptotrading.controller;

import org.ansel.cryptotrading.service.PriceAggregationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class PriceAggregationController {

    @Autowired
    private PriceAggregationService priceAggregationService;

    @GetMapping("/api/latest-price")
    public ResponseEntity<String> getLatestAggregatedPrice(
            @RequestParam String baseCurrencySymbol,
            @RequestParam String quoteCurrencySymbol) {

        BigDecimal latestPrice = priceAggregationService.getLatestAggregatedPrice(baseCurrencySymbol, quoteCurrencySymbol);
        return ResponseEntity.ok("Latest Aggregated Price: " + latestPrice);
    }
}
