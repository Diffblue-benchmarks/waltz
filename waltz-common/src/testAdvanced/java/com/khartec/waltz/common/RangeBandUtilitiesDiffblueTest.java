package com.khartec.waltz.common;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RangeBandUtilitiesDiffblueTest {
  @Test
  public void toPrettyStringTest() {
    // Arrange, Act and Assert
    assertEquals("-89 - 1", RangeBandUtilities.toPrettyString(new RangeBand(-89, 1)));
  }
}

