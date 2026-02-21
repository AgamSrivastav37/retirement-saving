package com.blackrock.retirement_saving.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import com.blackrock.retirement_saving.model.Transaction;
import com.blackrock.retirement_saving.model.TransactionRequest;
import com.blackrock.retirement_saving.model.ValidationResponse;
import com.blackrock.retirement_saving.service.TransactionService;
import com.blackrock.retirement_saving.service.ValidationService;




@RestController
@RequestMapping("/blackrock/challenge/v1")

public class TransactionController {
    private final TransactionService transactionService;
  
    private final ValidationService validationService;
    public TransactionController(TransactionService transactionService, ValidationService validationService) {
        this.transactionService = transactionService;
        this.validationService = validationService;
    }

    
     
    @PostMapping("/transactions:parse")
    public List<Transaction> parse(@RequestBody List<TransactionRequest> requests) {
        return transactionService.parse(requests);
    }
       
    @PostMapping("/transactions:validator")
    public ValidationResponse validate(@RequestBody List<Transaction> transactions) {
        return validationService.validate(transactions);
    }


}