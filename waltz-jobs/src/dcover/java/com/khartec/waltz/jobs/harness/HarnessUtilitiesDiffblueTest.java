package com.khartec.waltz.jobs.harness;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.util.function.SingletonSupplier;

public class HarnessUtilitiesDiffblueTest {
  @Test
  public void timeTest() {
    // Arrange, Act and Assert
    assertEquals("foo",
        HarnessUtilities.<Object>time("name", new SingletonSupplier<Object>("foo", new SingletonSupplier<Object>("foo",
            new SingletonSupplier<Object>("foo", new SingletonSupplier<Object>("foo", null))))));
  }
}

