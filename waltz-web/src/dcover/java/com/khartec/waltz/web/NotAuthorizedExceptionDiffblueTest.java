package com.khartec.waltz.web;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NotAuthorizedExceptionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("NOT_AUTHORIZED", (new NotAuthorizedException()).getCode());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("NOT_AUTHORIZED", (new NotAuthorizedException("An error occurred")).getCode());
  }
}

