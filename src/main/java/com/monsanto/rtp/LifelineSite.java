package com.monsanto.rtp;


public class LifelineSite extends Site {
  protected double calculateTaxAmount() {
    return calculateBaseAmount() * Site.TAX_RATE * .8;
  }

  protected double calculateBaseAmount() {
    return getRate() * getUnits() * 0.5;
  }

}
