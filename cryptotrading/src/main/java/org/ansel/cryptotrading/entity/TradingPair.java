package org.ansel.cryptotrading.entity;

import javax.persistence.*;

@Entity
public class TradingPair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CryptoCurrency baseCurrency; // E.g., BTC

    @ManyToOne
    private CryptoCurrency quoteCurrency; // E.g., USDT

    // Other trading pair-related fields

    // Constructors, getters, setters
}