package com.blackrock.retirement_saving.service;

import java.util.HashSet;

import org.apache.el.util.Validation;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import com.blackrock.retirement_saving.model.InvalidTransaction;
import com.blackrock.retirement_saving.model.Transaction;
import com.blackrock.retirement_saving.model.ValidationResponse;


@Service
public class ValidationService {
    public ValidationResponse validate(List<Transaction> transactions) {
        List<Transaction> valid = new ArrayList<>();
        // Perform validation logic here
        // Set response fields based on validation results
        List<InvalidTransaction> invalid = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        for (Transaction t : transactions) {
            if(t.getAmount()<0){
                InvalidTransaction it = new InvalidTransaction();
                it.setDate(t.getDate());
                it.setAmount(t.getAmount());
                it.setMessage("Negative amounts are not allowed");
                invalid.add(it);
                continue;
            }
            String key = t.getDate().toString() + ":" + t.getAmount();
            if (seen.contains(key)) {
                InvalidTransaction it = new InvalidTransaction();
                it.setDate(t.getDate());
                it.setAmount(t.getAmount());
                it.setMessage("Duplicate transaction");
                invalid.add(it);
                continue;
            } 
                seen.add(key);
                valid.add(t);
        }
        ValidationResponse response = new ValidationResponse();
        response.setValid(valid);
        response.setInvalid(invalid);
        return response;
    }
}
