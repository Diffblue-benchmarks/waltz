package com.khartec.waltz.jobs.harness;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.util.function.SingletonSupplier;

public class HarnessUtilitiesDiffblueTest {
  @Test
  public void timeTest() {
    // Arrange, Act and Assert
    assertEquals("instance",
        HarnessUtilities.<Object>time("]",
            new SingletonSupplier<Object>("instance", new SingletonSupplier<Object>("instance",
                new SingletonSupplier<Object>("instance", new SingletonSupplier<Object>("instance", null))))));
  }
}

