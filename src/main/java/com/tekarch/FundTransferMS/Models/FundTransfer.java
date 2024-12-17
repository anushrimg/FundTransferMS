package com.tekarch.FundTransferMS.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class FundTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transferId;

    @Column(nullable = false)
    private Long senderAccountId;

    @Column(nullable = false)
    private Long receiverAccountId;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(nullable = false, length = 20)
    private String status = "pending";

    @Column(nullable = false, updatable = false)
    private LocalDateTime initiatedAt = LocalDateTime.now();

    private LocalDateTime completedAt;

}
