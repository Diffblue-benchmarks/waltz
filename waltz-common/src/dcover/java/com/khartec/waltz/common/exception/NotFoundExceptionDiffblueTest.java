package com.khartec.waltz.common.exception;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NotFoundExceptionDiffblueTest {
  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("foo", (new NotFoundException("foo", "An error occurred", new Throwable())).getCode());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new NotFoundException("foo", "An error occurred")).getCode());
  }
}

