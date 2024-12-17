package com.tekarch.FundTransferMS.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transferId;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account senderAccount;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account receiverAccount;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(length = 20, nullable = false)
    private String status = "pending";

    @Column(nullable = false)
    private LocalDateTime initiatedAt = LocalDateTime.now();

    private LocalDateTime completedAt;
}
