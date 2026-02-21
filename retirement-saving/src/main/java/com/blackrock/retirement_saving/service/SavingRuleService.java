package com.blackrock.retirement_saving.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blackrock.retirement_saving.model.Transaction;

@Service
public class SavingRuleService {
     public double  applyQRule(List<Transaction> txns) {
        // Implement the logic to calculate the ceiling based on the amount
        // For example, you can use a simple rule like:
       return txns.stream().mapToDouble(Transaction::getAmount).sum(); // Example: 10% of total amount
     }

     public double applyPRule(double baseAmount) {
        return baseAmount+(baseAmount*0.10);//+10% of the base amount
     }

     public double applyKRule(double amount) {
        return amount*1.05; // Example: 5% increase
     }

}
