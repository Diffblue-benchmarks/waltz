package com.khartec.waltz.web;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WebExceptionDiffblueTest {
  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("foo", (new WebException("foo", "An error occurred", new Throwable())).getCode());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new WebException("foo", "An error occurred")).getCode());
  }
}

