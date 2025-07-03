package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculateTest {

  @Test
  public void testSum_TwoAndThree_ReturnsFive() {
    Calculate calc = new Calculate();
    assertEquals(5, calc.sum(2, 3));
  }

  @Test
  public void testAverage_TwoAndThree_Returns2Point5() {
    Calculate calc = new Calculate();
    assertEquals(2.5, calc.average(2, 3), 0.0001);
  }

  @Test
  public void testSumBetween_OneAndTen_Returns55() {
    Calculate calc = new Calculate();
    assertEquals(55, calc.sumBetween(1, 10));
  }

  @Test
  public void testAverageBetween_OneAndTen_Returns5Point5() {
    Calculate calc = new Calculate();
    assertEquals(5.5, calc.averageBetween(1, 10), 0.0001);
  }

  @Test
  public void testSumOddBetween_OneAndTen_Returns25() {
    Calculate calc = new Calculate();
    assertEquals(25, calc.sumOddBetween(1, 10));
  }

  @Test
  public void testSumEvenBetween_OneAndTen_Returns30() {
    Calculate calc = new Calculate();
    assertEquals(30, calc.sumEvenBetween(1, 10));
  }
}
