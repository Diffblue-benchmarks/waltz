package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSimpleDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSimple.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ImmutableSimple.Json()).message);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSimple.copyOf(new ImmutableSimple.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSimple.fromJson(new ImmutableSimple.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSimple.Builder builderResult = ImmutableSimple.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSimple.Json());
  }
  @Test
  public void messageTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSimple.Json()).message();
  }
  @Test
  public void secretTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSimple.Json()).secret();
  }
  @Test
  public void setMessageTest() {
    // Arrange
    ImmutableSimple.Json json = new ImmutableSimple.Json();

    // Act
    json.setMessage("message");

    // Assert
    assertEquals("message", json.message);
  }
}

