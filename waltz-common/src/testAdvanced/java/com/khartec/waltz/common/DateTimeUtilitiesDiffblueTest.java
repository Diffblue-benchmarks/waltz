package com.khartec.waltz.common;

import static org.junit.Assert.assertNull;
import java.time.LocalDate;
import org.junit.Test;

public class DateTimeUtilitiesDiffblueTest {
  @Test
  public void toSqlDateTest() {
    // Arrange, Act and Assert
    assertNull(DateTimeUtilities.toSqlDate((LocalDate) null));
  }
}

