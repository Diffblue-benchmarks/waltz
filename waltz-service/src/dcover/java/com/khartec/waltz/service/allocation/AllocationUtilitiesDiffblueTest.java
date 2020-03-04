package com.khartec.waltz.service.allocation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AllocationUtilitiesDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("", (new AllocationUtilities.ValidationResult()).message());
  }

  @Test
  public void failedTest() {
    // Arrange, Act and Assert
    assertFalse((new AllocationUtilities.ValidationResult()).failed());
  }

  @Test
  public void messageTest() {
    // Arrange, Act and Assert
    assertEquals("", (new AllocationUtilities.ValidationResult()).message());
  }
}

