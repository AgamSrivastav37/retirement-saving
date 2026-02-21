package com.blackrock.retirement_saving.model;

import lombok.Data;

@Data
public class InvalidTransaction {
   private String date;
    private double amount;
    private String message;
}
