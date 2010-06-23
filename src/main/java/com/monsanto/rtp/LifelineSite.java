package com.monsanto.rtp;

public class LifelineSite {
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

  public double getTotalAmount(){
    double baseAmount = getRate() * getUnits() * 0.5;
    double taxRate = baseAmount * Site.TAX_RATE * .8;
    return roundToDecimals(baseAmount + taxRate);
  }

  private double roundToDecimals(double value) {
    return Math.ceil(value * 100) / 100;
    }
}
