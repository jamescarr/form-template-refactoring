package com.monsanto.rtp;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Site {
  public static final double TAX_RATE = 0.12;
  
  private int units;
  private double rate;

  public void setRate(double rate) {
    this.rate = rate;
    
  }

  public void setNumberOfUnits(int units) {
    this.units = units;
  }

  protected int getUnits() {
    return units;
  }

  public void setUnits(int units) {
    this.units = units;
  }

  protected double getRate() {
    return rate;
  }
  public double getBillableAmount() {
    final double baseAmount = calculateBaseAmount();
    final double taxAmount = calculateTaxAmount();
    final double billableAmount = baseAmount + taxAmount;
    BigDecimal amount = new BigDecimal(billableAmount).setScale(2, RoundingMode.CEILING);
    return amount.doubleValue();
  }

  protected abstract double calculateTaxAmount();

  protected abstract double calculateBaseAmount();

}
