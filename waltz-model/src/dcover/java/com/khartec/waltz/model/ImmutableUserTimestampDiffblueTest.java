package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableUserTimestampDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void atTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUserTimestamp.Json()).at();
  }

  @Test
  public void atTimestampTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUserTimestamp.Json()).atTimestamp();
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUserTimestamp.builder().build();
  }

  @Test
  public void byTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUserTimestamp.Json()).by();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableUserTimestamp.Json actualJson = new ImmutableUserTimestamp.Json();

    // Assert
    assertNull(actualJson.by);
    assertNull(actualJson.at);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableUserTimestamp.copyOf(new ImmutableUserTimestamp.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUserTimestamp.fromJson(new ImmutableUserTimestamp.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableUserTimestamp.Builder builderResult = ImmutableUserTimestamp.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableUserTimestamp.Json());
  }

  @Test
  public void setByTest() {
    // Arrange
    ImmutableUserTimestamp.Json json = new ImmutableUserTimestamp.Json();

    // Act
    json.setBy("by");

    // Assert
    assertEquals("by", json.by);
  }
}

