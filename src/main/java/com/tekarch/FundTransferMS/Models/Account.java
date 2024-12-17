package com.tekarch.FundTransferMS.Models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    private String accountHolderName;
    private String accountType;  // e.g., "Checking", "Savings"
    private String currency;     // e.g., "USD"
    private BigDecimal balance;
}
