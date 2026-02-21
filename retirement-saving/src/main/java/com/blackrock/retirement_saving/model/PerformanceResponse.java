package com.blackrock.retirement_saving.model;

public class PerformanceResponse {
  private InvestmentResult nps;
    private InvestmentResult index;
    public InvestmentResult getNps() {
        return nps;
    }
    public void setNps(InvestmentResult nps) {
        this.nps = nps;
    }
    public InvestmentResult getIndex() {
        return index;
    }
    public void setIndex(InvestmentResult index) {
        this.index = index;
    }
  
}
