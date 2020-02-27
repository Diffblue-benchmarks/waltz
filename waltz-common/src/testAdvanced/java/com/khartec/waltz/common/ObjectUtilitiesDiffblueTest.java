package com.khartec.waltz.common;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ObjectUtilitiesDiffblueTest {
  @Test
  public void dumpTest() {
    // Arrange, Act and Assert
    assertEquals("foo", ObjectUtilities.<Object>dump("foo"));
  }

  @Test
  public void firstNotNullTest() {
    // Arrange, Act and Assert
    assertEquals("foo", ObjectUtilities.<Object>firstNotNull("foo", "foo", "foo"));
  }
}

