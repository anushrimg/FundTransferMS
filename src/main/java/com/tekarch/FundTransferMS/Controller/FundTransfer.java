package com.tekarch.FundTransferMS.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundTransfer {

    @GetMapping("/fundtransfer")
    public String getUser(){
        return "This  is fund transfer.";
    }
}
