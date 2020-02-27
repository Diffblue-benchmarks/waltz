package com.khartec.waltz.common;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OptionalUtilitiesDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void contentsEqualTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    OptionalUtilities.<Object>contentsEqual(null, "foo");
  }
}

