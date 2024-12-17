package com.tekarch.FundTransferMS.Controller;

import com.tekarch.FundTransferMS.Models.FundTransfer;
import com.tekarch.FundTransferMS.Service.Interfaces.FundTransferService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Optional;

@RestController
@RequestMapping("/api/transfers")
public class FundTransferController {

    @Autowired
    private FundTransferService fundTransferService;
    private static final Logger logger = LogManager.getLogger(FundTransferController.class);

//    @GetMapping("/fundtransfer")
//    public String getUser(){
//        return "This  is fund transfer.";
//    }


    @PostMapping
    public ResponseEntity<?> createTransfer(
            @RequestParam Long senderAccountId,
            @RequestParam Long receiverAccountId,
            @RequestParam BigDecimal amount) {
        try {
            FundTransfer transfer = fundTransferService.initiateTransfer(senderAccountId, receiverAccountId, amount);
            return ResponseEntity.ok(transfer);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error initiating transfer: " + e.getMessage());
        }
    }

    @GetMapping("/{transferId}")
    public ResponseEntity<?> getTransfer(@PathVariable Long transferId) {
        Optional<FundTransfer> transfer = fundTransferService.getTransfer(transferId);
        return transfer.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
