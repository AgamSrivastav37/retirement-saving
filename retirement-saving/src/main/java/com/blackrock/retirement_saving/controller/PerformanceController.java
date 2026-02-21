package com.blackrock.retirement_saving.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackrock.retirement_saving.model.PerformanceResponse;
import com.blackrock.retirement_saving.model.Transaction;
import com.blackrock.retirement_saving.service.PerformanceService;

@RestController
@RequestMapping("/blackrock/challenge/v1")
public class PerformanceController {
   private final PerformanceService performanceService;
    public PerformanceController(PerformanceService performanceService) {
        this.performanceService = performanceService;
    }
     @PostMapping("/performance")
    public PerformanceResponse performance(@RequestBody List<Transaction> transactions) {
        return performanceService.calculatePerformance(transactions);
    }
}
