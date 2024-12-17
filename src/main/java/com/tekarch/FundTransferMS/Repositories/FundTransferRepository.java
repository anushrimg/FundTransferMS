package com.tekarch.FundTransferMS.Repositories;

import com.tekarch.FundTransferMS.Models.FundTransfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundTransferRepository extends JpaRepository<FundTransfer,Long> {
}
