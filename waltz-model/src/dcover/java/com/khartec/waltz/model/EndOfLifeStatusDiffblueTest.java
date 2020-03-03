package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import java.util.Date;
import org.junit.Test;

public class EndOfLifeStatusDiffblueTest {
  @Test
  public void calculateEndOfLifeStatusTest() {
    // Arrange, Act and Assert
    assertEquals(EndOfLifeStatus.END_OF_LIFE, EndOfLifeStatus.calculateEndOfLifeStatus(new Date(1L)));
  }
}

