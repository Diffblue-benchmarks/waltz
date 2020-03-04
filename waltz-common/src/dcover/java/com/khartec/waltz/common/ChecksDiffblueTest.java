package com.khartec.waltz.common;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ChecksDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void checkFalseTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Checks.checkFalse(true, "message");
  }
  @Test
  public void checkNotEmptyTest() {
    // Arrange, Act and Assert
    assertEquals("str", Checks.checkNotEmpty("str", "message"));
  }
  @Test
  public void checkNotEmptyTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Checks.checkNotEmpty("", "message");
  }
  @Test
  public void checkNotNullTest() {
    // Arrange, Act and Assert
    assertEquals("", Checks.<Object>checkNotNull("", "message", "foo", "", "foo"));
  }
  @Test
  public void failTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Checks.fail("", "foo", "foo", "foo");
  }
  @Test
  public void mkFailTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Checks.mkFail("", "foo", "foo", "foo");
  }
}

