package com.khartec.waltz.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.junit.Test;
import org.springframework.util.function.SingletonSupplier;

public class DebugUtilitiesDiffblueTest {
  @Test
  public void logValueTest2() {
    // Arrange, Act and Assert
    assertEquals("foo",
        DebugUtilities.<Object>logValue(
            (Supplier<Object>) new SingletonSupplier<Object>("foo",
                new SingletonSupplier<Object>("foo",
                    new SingletonSupplier<Object>("foo", new SingletonSupplier<Object>("foo", null)))),
            "foo", "foo", "foo"));
  }

  @Test
  public void logValueTest() {
    // Arrange, Act and Assert
    assertEquals("foo", DebugUtilities.<Object>logValue("foo", "foo", "foo", "foo"));
  }

  @Test
  public void dumpTest() {
    // Arrange
    HashMap<Object, Object> objectObjectMap = new HashMap<Object, Object>();
    objectObjectMap.put("foo", "foo");

    // Act
    Map<Object, Object> actualDumpResult = DebugUtilities.<Object, Object>dump(objectObjectMap);

    // Assert
    assertSame(objectObjectMap, actualDumpResult);
    assertEquals(1, actualDumpResult.size());
  }
}

