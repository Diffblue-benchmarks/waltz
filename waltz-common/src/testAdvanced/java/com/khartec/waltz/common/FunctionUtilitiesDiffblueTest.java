package com.khartec.waltz.common;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.util.function.SingletonSupplier;

public class FunctionUtilitiesDiffblueTest {
  @Test
  public void timeTest() {
    // Arrange, Act and Assert
    assertEquals("foo",
        FunctionUtilities.<Object>time("name", new SingletonSupplier<Object>("foo", new SingletonSupplier<Object>("foo",
            new SingletonSupplier<Object>("foo", new SingletonSupplier<Object>("foo", null))))));
  }
}

