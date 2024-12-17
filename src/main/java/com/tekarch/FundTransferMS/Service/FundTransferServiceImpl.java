package com.tekarch.FundTransferMS.Service;

import com.tekarch.FundTransferMS.Repositories.FundTransferRepository;
import com.tekarch.FundTransferMS.Service.Interfaces.FundTransferService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class FundTransferServiceImpl implements FundTransferService {
    private final FundTransferRepository fundTransferRepository;
    private static final Logger logger = LogManager.getLogger(FundTransferServiceImpl.class);

    public FundTransferServiceImpl(FundTransferRepository fundTransferRepository) {
        this.fundTransferRepository = fundTransferRepository;
    }

}
