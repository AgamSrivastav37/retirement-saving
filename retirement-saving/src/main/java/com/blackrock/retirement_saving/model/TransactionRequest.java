package com.blackrock.retirement_saving.model;

import lombok.Data;

@Data
public class TransactionRequest {
    private String date;
     private double amount;
}
