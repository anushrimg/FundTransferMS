package com.tekarch.FundTransferMS.Repositories;

import com.tekarch.FundTransferMS.Models.FundTransfer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FundTransferRepository extends JpaRepository<FundTransfer,Long> {
    List<FundTransfer> findByStatus(String status);
}
