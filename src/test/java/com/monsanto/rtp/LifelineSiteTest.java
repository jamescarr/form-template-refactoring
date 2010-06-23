package com.monsanto.rtp;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class LifelineSiteTest {
  private LifelineSite lifelineSite;
  
  
  @Before
  public void beforeEach(){
    lifelineSite = new LifelineSite();
  }
  
  @Test
  public void shouldCalculateUsingBaseHalvedAndTaxDownTwentyPercent(){
    lifelineSite.setUnits(10);
    lifelineSite.setRate(700);
    
    double billableAmount = lifelineSite.getTotalAmount();
    
    assertThat(billableAmount, is(3836.00));
  }
  
  @Test
  public void shouldRoundCentsUp(){
    lifelineSite.setUnits(10);
    lifelineSite.setRate(700.23);
    
    double billableAmount = lifelineSite.getTotalAmount();
    
    assertThat(billableAmount, is(3837.27));
  }
  
}
