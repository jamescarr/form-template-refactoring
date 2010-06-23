package com.monsanto.rtp;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ResidentialSiteTest {
  private ResidentialSite site;
  
  @Before
  public void beforeEach(){
    site = new ResidentialSite();
  }
  
  @Test
  public void shouldCalculateBillingRate(){
    site.setRate(700.00);
    site.setNumberOfUnits(10);
    
    double billableAmount = site.getBillableAmount();
    
    assertThat(billableAmount, equalTo(7840.00));
  }
  
  @Test
  public void shouldRoundUpToTwoDecimalPlaces(){
    site.setRate(700.23);
    site.setNumberOfUnits(10);
    
    double billableAmount = site.getBillableAmount();
    
    assertThat(billableAmount, equalTo(7842.58));
  }
}
