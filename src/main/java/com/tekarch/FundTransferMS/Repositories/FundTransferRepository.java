package com.tekarch.FundTransferMS.Repositories;

import com.tekarch.FundTransferMS.Controller.FundTransfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundTransferRepository extends JpaRepository<FundTransfer,Long> {
}
