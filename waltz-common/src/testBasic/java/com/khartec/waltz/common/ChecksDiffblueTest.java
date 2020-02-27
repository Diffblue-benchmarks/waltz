package com.khartec.waltz.common;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ChecksDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void checkNotNullTest() {
    // Arrange, Act and Assert
    assertEquals("foo", Checks.<Object>checkNotNull("foo", "message", "foo", "foo", "foo"));
  }
  @Test
  public void mkFailTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Checks.mkFail("foo", "foo", "foo", "foo");
  }
  @Test
  public void failTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Checks.fail("foo", "foo", "foo", "foo");
  }
  @Test
  public void checkNotEmptyTest() {
    // Arrange, Act and Assert
    assertEquals("foo", Checks.checkNotEmpty("foo", "message"));
  }
  @Test
  public void checkFalseTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Checks.checkFalse(true, "message");
  }
}

