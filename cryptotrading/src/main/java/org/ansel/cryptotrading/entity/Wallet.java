package org.ansel.cryptotrading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private CryptoCurrency cryptoCurrency;

    private BigDecimal balance; // Current balance of the cryptocurrency

    // Constructors, getters, setters
}