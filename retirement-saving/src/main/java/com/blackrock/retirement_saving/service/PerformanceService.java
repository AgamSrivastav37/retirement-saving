package com.blackrock.retirement_saving.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blackrock.retirement_saving.model.PerformanceResponse;
import com.blackrock.retirement_saving.model.Transaction;

@Service
public class PerformanceService {
   private final SavingRuleService ruleService;
   private final ReturnsService returnsService;
    public PerformanceService(SavingRuleService ruleService, ReturnsService returnsService) {
         this.ruleService = ruleService;
         this.returnsService = returnsService;
    }

    public PerformanceResponse calculatePerformance(List<Transaction> txns ) {
        double qAmount = ruleService.applyQRule(txns);
        double pAmount = ruleService.applyPRule(qAmount);
       double finalAmount = ruleService.applyKRule(pAmount);
        PerformanceResponse response = new PerformanceResponse();
        response.setNps(returnsService.calculateReturns(finalAmount));
        response.setIndex(returnsService.calculateIndex(finalAmount));
        return response;
    }
}
