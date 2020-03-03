package com.khartec.waltz.jobs.clients.c1.sc1.parse;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FlagToBooleanDiffblueTest {
  @Test
  public void applyTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), FlagToBoolean.apply("x"));
  }
}

