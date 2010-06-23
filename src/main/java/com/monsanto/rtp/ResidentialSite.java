package com.monsanto.rtp;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class ResidentialSite extends Site{
  protected double calculateTaxAmount() {
    return calculateBaseAmount() * Site.TAX_RATE;
  }

  protected double calculateBaseAmount() {
    return getRate() * getUnits();
  }
  
  

}
