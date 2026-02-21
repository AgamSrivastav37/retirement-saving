package com.blackrock.retirement_saving.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import com.blackrock.retirement_saving.model.Transaction;
import com.blackrock.retirement_saving.model.TransactionRequest;
import com.blackrock.retirement_saving.util.CalculationUtil;
@Service
public class TransactionService {
    public List<Transaction> parse(List<TransactionRequest> requests) {
        List<Transaction> transactions = new ArrayList<>();
        for (TransactionRequest request : requests) {
            Transaction transaction = new Transaction();
            transaction.setDate(request.getDate());
            transaction.setAmount(request.getAmount());
            double ceiling = CalculationUtil.calculateCeiling(request.getAmount());
            transaction.setCeiling(ceiling);
            transaction.setRemanent(ceiling - request.getAmount());
            transactions.add(transaction);
        }
        return transactions;
    }
}
