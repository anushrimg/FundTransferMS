package com.tekarch.FundTransferMS.Service;

import com.tekarch.FundTransferMS.Models.FundTransfer;
import com.tekarch.FundTransferMS.Repositories.FundTransferRepository;
import com.tekarch.FundTransferMS.RestTemplateConfig;
import com.tekarch.FundTransferMS.Service.Interfaces.FundTransferService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class FundTransferServiceImpl implements FundTransferService {

    @Autowired
    private  FundTransferRepository fundTransferRepository;
    private static final Logger logger = LogManager.getLogger(FundTransferServiceImpl.class);

    @Autowired
    private RestTemplateConfig restTemplate;
    public FundTransfer initiateTransfer(Long senderId, Long receiverId, BigDecimal amount) {
        // Create and save fund transfer
        FundTransfer transfer = new FundTransfer();
        transfer.setSenderAccountId(senderId);
        transfer.setReceiverAccountId(receiverId);
        transfer.setAmount(amount);
        transfer = fundTransferRepository.save(transfer);

        // Perform transfer logic
        try {
            // Call external API or perform any additional logic
            // Example: restTemplate.postForObject("http://some-banking-api", request, Response.class);
            transfer.setStatus("completed");
            transfer.setCompletedAt(LocalDateTime.now());
        } catch (Exception e) {
            transfer.setStatus("failed");
        }

        return fundTransferRepository.save(transfer);
    }

    public Optional<FundTransfer> getTransfer(Long transferId) {
        return fundTransferRepository.findById(transferId);
    }



}
