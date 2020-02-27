package com.khartec.waltz.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RangeBandDiffblueTest {
  @Test
  public void equalsTest2() {
    // Arrange
    RangeBand rangeBand = new RangeBand(0, 0);

    // Act and Assert
    assertTrue(rangeBand.equals(new RangeBand(0, 0)));
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new RangeBand<Float>(Float.valueOf(10.0f), Float.valueOf(10.0f))).equals("foo"));
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("RangeBand{low=0, high=0}", (new RangeBand(0, 0)).toString());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    RangeBand<Float> actualRangeBand = new RangeBand<Float>(Float.valueOf(10.0f), Float.valueOf(10.0f));

    // Assert
    assertEquals(Float.valueOf(10.0f), actualRangeBand.getHigh());
    assertEquals(Float.valueOf(10.0f), actualRangeBand.getLow());
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new RangeBand(0, 0)).hashCode());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(603979776, (new RangeBand<Float>(Float.valueOf(10.0f), Float.valueOf(10.0f))).hashCode());
  }

  @Test
  public void containsTest3() {
    // Arrange, Act and Assert
    assertFalse((new RangeBand(33521663, 33521663)).contains(33554431));
  }

  @Test
  public void containsTest2() {
    // Arrange, Act and Assert
    assertFalse((new RangeBand(0, 0)).contains(-2147483648));
  }

  @Test
  public void containsTest() {
    // Arrange, Act and Assert
    assertTrue((new RangeBand<Float>(Float.valueOf(10.0f), Float.valueOf(10.0f))).contains(Float.valueOf(10.0f)));
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("RangeBand{low=10.0, high=10.0}",
        (new RangeBand<Float>(Float.valueOf(10.0f), Float.valueOf(10.0f))).toString());
  }

  @Test
  public void testTest2() {
    // Arrange, Act and Assert
    assertTrue((new RangeBand<Float>(Float.valueOf(10.0f), Float.valueOf(10.0f))).test(Float.valueOf(10.0f)));
  }

  @Test
  public void testTest() {
    // Arrange, Act and Assert
    assertFalse((new RangeBand<Float>(Float.valueOf(10.0f), Float.valueOf(10.0f))).test(Float.valueOf(0.5f)));
  }
}

