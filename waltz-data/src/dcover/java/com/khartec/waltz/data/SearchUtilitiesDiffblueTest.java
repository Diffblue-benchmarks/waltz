package com.khartec.waltz.data;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class SearchUtilitiesDiffblueTest {
  @Test
  public void mkTermsTest() {
    // Arrange and Act
    List<String> actualMkTermsResult = SearchUtilities.mkTerms("query cannot be null");

    // Assert
    assertEquals(4, actualMkTermsResult.size());
    assertEquals("query", actualMkTermsResult.get(0));
    assertEquals("cannot", actualMkTermsResult.get(1));
    assertEquals("be", actualMkTermsResult.get(2));
    assertEquals("null", actualMkTermsResult.get(3));
  }

  @Test
  public void mkTermsTest2() {
    // Arrange, Act and Assert
    assertEquals(0, SearchUtilities.mkTerms("[").size());
  }

  @Test
  public void mkTermsTest3() {
    // Arrange and Act
    List<String> actualMkTermsResult = SearchUtilities.mkTerms("query");

    // Assert
    assertEquals(1, actualMkTermsResult.size());
    assertEquals("query", actualMkTermsResult.get(0));
  }
}

