package com.tekarch.FundTransferMS.Service.Interfaces;

import com.tekarch.FundTransferMS.Models.FundTransfer;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface FundTransferService {
    FundTransfer initiateTransfer(Long senderId, Long receiverId, BigDecimal amount);
    Optional<FundTransfer> getTransfer(Long transferId);
    List<FundTransfer> getTransfersByStatus(String status);
    List<FundTransfer> getAllTransfers();

}
