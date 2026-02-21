package com.blackrock.retirement_saving.model;

import java.util.List;

import lombok.Data;

@Data
public class ValidationResponse {
   private List<Transaction> valid;

   private List<InvalidTransaction> invalid;


}
