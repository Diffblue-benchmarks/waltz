package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableWebErrorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromTest() {
    // Arrange
    ImmutableWebError.Builder builderResult = ImmutableWebError.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableWebError.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableWebError.builder().build();
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableWebError.copyOf(new ImmutableWebError.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableWebError.fromJson(new ImmutableWebError.Json());
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableWebError.Json()).id();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ImmutableWebError.Json()).message);
  }

  @Test
  public void messageTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableWebError.Json()).message();
  }

  @Test
  public void setMessageTest() {
    // Arrange
    ImmutableWebError.Json json = new ImmutableWebError.Json();

    // Act
    json.setMessage("message");

    // Assert
    assertEquals("message", json.message);
  }
}

