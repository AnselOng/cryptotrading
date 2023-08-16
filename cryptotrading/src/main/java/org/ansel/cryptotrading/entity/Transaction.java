package org.ansel.cryptotrading.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private TradingPair tradingPair;

    private BigDecimal price;

    private BigDecimal quantity;

    private LocalDateTime timestamp;

    // Other transaction-related fields

    // Constructors, getters, setters
}
