package com.blackrock.retirement_saving.model;

public class InvestmentResult {
   private double investedAmount;
    private double returns;  
    private double totalValue;
    public double getInvestedAmount() {
        return investedAmount;
    }
    public void setInvestedAmount(double investedAmount) {
        this.investedAmount = investedAmount;
    }
    public double getReturns() {
        return returns;
    }
    public void setReturns(double returns) {
        this.returns = returns;
    }
    public double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

}
