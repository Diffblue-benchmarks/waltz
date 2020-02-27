package com.khartec.waltz.data;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class SearchUtilitiesDiffblueTest {
  @Test
  public void mkTermsTest2() {
    // Arrange and Act
    List<String> actualMkTermsResult = SearchUtilities.mkTerms("foo");

    // Assert
    assertEquals(1, actualMkTermsResult.size());
    assertEquals("foo", actualMkTermsResult.get(0));
  }

  @Test
  public void mkTermsTest() {
    // Arrange, Act and Assert
    assertEquals(0, SearchUtilities.mkTerms("[").size());
  }
}

