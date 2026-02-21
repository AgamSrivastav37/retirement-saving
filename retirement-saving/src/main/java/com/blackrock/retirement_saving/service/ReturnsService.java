package com.blackrock.retirement_saving.service;

import org.springframework.stereotype.Service;

import com.blackrock.retirement_saving.model.InvestmentResult;

@Service
public class ReturnsService {
    public InvestmentResult calculateReturns(double invested) {
        double rate = 0.08;
        double returns = invested * rate;
        InvestmentResult result = new InvestmentResult();
        result.setInvestedAmount(invested);
        result.setReturns(returns);
        result.setTotalValue(invested + returns);
        return result;
    }
    public InvestmentResult calculateIndex(double invested) {
        double rate = 0.12;
        double returns = invested * rate;
        InvestmentResult result = new InvestmentResult();
        result.setInvestedAmount(invested);
        result.setReturns(returns);
        result.setTotalValue(invested + returns);
        return result;
    }
    
}
