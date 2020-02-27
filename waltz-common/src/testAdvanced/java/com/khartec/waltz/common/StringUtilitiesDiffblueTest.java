package com.khartec.waltz.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.Test;

public class StringUtilitiesDiffblueTest {
  @Test
  public void parseIntegerTest2() {
    // Arrange, Act and Assert
    assertEquals(Integer.valueOf(3), StringUtilities.parseInteger("3", 0));
  }

  @Test
  public void parseIntegerTest() {
    // Arrange, Act and Assert
    assertEquals(Integer.valueOf(1), StringUtilities.parseInteger("value", Integer.valueOf(1)));
  }

  @Test
  public void mkSafeTest() {
    // Arrange, Act and Assert
    assertEquals("foo", StringUtilities.mkSafe("foo"));
  }

  @Test
  public void firstCharTest() {
    // Arrange
    char actualFirstCharResult = StringUtilities.firstChar("foo", 'A');

    // Act and Assert
    assertEquals('f', actualFirstCharResult);
    assertEquals('A', StringUtilities.firstChar("", 'A'));
  }

  @Test
  public void joinTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertEquals("foo", StringUtilities.join(objectList, "foo"));
  }

  @Test
  public void ifEmptyTest() {
    // Arrange
    String actualIfEmptyResult = StringUtilities.ifEmpty("foo", "foo");

    // Act and Assert
    assertEquals("foo", actualIfEmptyResult);
    assertEquals("foo", StringUtilities.ifEmpty("", "foo"));
  }

  @Test
  public void tokeniseTest4() {
    // Arrange and Act
    List<String> actualTokeniseResult = StringUtilities.tokenise("value");

    // Assert
    assertEquals(1, actualTokeniseResult.size());
    assertEquals("value", actualTokeniseResult.get(0));
  }

  @Test
  public void tokeniseTest3() {
    // Arrange and Act
    List<String> actualTokeniseResult = StringUtilities.tokenise("value", "foo");

    // Assert
    assertEquals(1, actualTokeniseResult.size());
    assertEquals("value", actualTokeniseResult.get(0));
  }

  @Test
  public void tokeniseTest2() {
    // Arrange and Act
    List<String> actualTokeniseResult = StringUtilities.tokenise("value", "");

    // Assert
    assertEquals(5, actualTokeniseResult.size());
    assertEquals("v", actualTokeniseResult.get(0));
    assertEquals("a", actualTokeniseResult.get(1));
    assertEquals("l", actualTokeniseResult.get(2));
    assertEquals("u", actualTokeniseResult.get(3));
    assertEquals("e", actualTokeniseResult.get(4));
  }

  @Test
  public void tokeniseTest() {
    // Arrange
    List<String> tokeniseResult = StringUtilities.tokenise("foo", "foo");

    // Act
    List<String> actualTokeniseResult = StringUtilities.tokenise("", "foo");

    // Assert
    assertEquals(0, tokeniseResult.size());
    assertEquals(0, actualTokeniseResult.size());
  }

  @Test
  public void parseLongTest2() {
    // Arrange, Act and Assert
    assertEquals(Long.valueOf(7L), StringUtilities.parseLong("7", 0L));
  }

  @Test
  public void parseLongTest() {
    // Arrange, Act and Assert
    assertEquals(Long.valueOf(1L), StringUtilities.parseLong("value", Long.valueOf(1L)));
  }

  @Test
  public void isEmptyTest3() {
    // Arrange, Act and Assert
    assertTrue(StringUtilities.isEmpty(""));
  }

  @Test
  public void isEmptyTest2() {
    // Arrange, Act and Assert
    assertFalse(StringUtilities.isEmpty("foo"));
  }

  @Test
  public void lowerTest() {
    // Arrange, Act and Assert
    assertEquals("value", StringUtilities.lower("value"));
  }

  @Test
  public void isEmptyTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtilities.isEmpty((Optional<String>) null));
  }

  @Test
  public void notEmptyTest() {
    // Arrange
    boolean actualNotEmptyResult = StringUtilities.notEmpty("foo");

    // Act and Assert
    assertTrue(actualNotEmptyResult);
    assertFalse(StringUtilities.notEmpty(""));
  }

  @Test
  public void limitTest() {
    // Arrange, Act and Assert
    assertEquals("foo", StringUtilities.limit("foo", 3));
  }

  @Test
  public void lengthTest2() {
    // Arrange, Act and Assert
    assertEquals(0, StringUtilities.length(""));
  }

  @Test
  public void lengthTest() {
    // Arrange, Act and Assert
    assertEquals(3, StringUtilities.length("foo"));
  }
}

