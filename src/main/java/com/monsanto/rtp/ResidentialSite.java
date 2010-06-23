package com.monsanto.rtp;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class ResidentialSite {
  private int units;
  private double rate;

  public void setRate(double rate) {
    this.rate = rate;
    
  }

  public void setNumberOfUnits(int units) {
    this.units = units;
  }

  public int getUnits() {
    return units;
  }

  public void setUnits(int units) {
    this.units = units;
  }

  public double getRate() {
    return rate;
  }

  public double getBillableAmount() {
    final double billableAmount = (rate * units) + (rate * units * Site.TAX_RATE);
    BigDecimal amount = new BigDecimal(billableAmount).setScale(2, RoundingMode.CEILING);
    return amount.doubleValue();
  }
  
  

}
