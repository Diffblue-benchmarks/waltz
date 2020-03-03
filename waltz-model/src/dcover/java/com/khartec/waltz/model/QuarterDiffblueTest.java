package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class QuarterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromIntTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Quarter.fromInt(Integer.valueOf(0));
  }

  @Test
  public void fromIntTest() {
    // Arrange
    Quarter actualFromIntResult = Quarter.fromInt(Integer.valueOf(1));
    Quarter actualFromIntResult1 = Quarter.fromInt(Integer.valueOf(2));
    Quarter actualFromIntResult2 = Quarter.fromInt(Integer.valueOf(3));

    // Act and Assert
    assertEquals(Quarter.Q1, actualFromIntResult);
    assertEquals(Quarter.Q2, actualFromIntResult1);
    assertEquals(Quarter.Q3, actualFromIntResult2);
    assertEquals(Quarter.Q4, Quarter.fromInt(Integer.valueOf(4)));
  }
}

