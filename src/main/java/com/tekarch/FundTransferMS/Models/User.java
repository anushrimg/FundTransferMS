package com.tekarch.FundTransferMS.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String email;
    private String passwordHash;
    private String phoneNumber;
    private Boolean twoFactorEnabled =false;
    private String kycStatus = "pending";
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
