package com.khartec.waltz.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class StreamUtilitiesDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    StreamUtilities.Siphon<Object> siphon = new StreamUtilities.Siphon<Object>(new StreamUtilities.Siphon<Object>(
        new StreamUtilities.Siphon<Object>(new StreamUtilities.Siphon<Object>(null))));

    // Act and Assert
    List<Object> results = (new StreamUtilities.Siphon<Object>(siphon)).getResults();
    assertTrue(results instanceof java.util.ArrayList);
    assertEquals(0, results.size());
    List<Object> results1 = siphon.getResults();
    assertTrue(results1 instanceof java.util.ArrayList);
    assertEquals(0, results1.size());
  }
}

