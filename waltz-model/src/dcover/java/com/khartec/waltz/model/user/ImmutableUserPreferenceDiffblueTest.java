package com.khartec.waltz.model.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableUserPreferenceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void valueTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUserPreference.Json()).value();
  }
  @Test
  public void keyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUserPreference.Json()).key();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableUserPreference.Json actualJson = new ImmutableUserPreference.Json();

    // Assert
    assertNull(actualJson.value);
    assertNull(actualJson.key);
  }
  @Test
  public void setValueTest() {
    // Arrange
    ImmutableUserPreference.Json json = new ImmutableUserPreference.Json();

    // Act
    json.setValue("value");

    // Assert
    assertEquals("value", json.value);
  }
  @Test
  public void setKeyTest() {
    // Arrange
    ImmutableUserPreference.Json json = new ImmutableUserPreference.Json();

    // Act
    json.setKey("foo");

    // Assert
    assertEquals("foo", json.key);
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUserPreference.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableUserPreference.Builder builderResult = ImmutableUserPreference.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableUserPreference.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableUserPreference.copyOf(new ImmutableUserPreference.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUserPreference.fromJson(new ImmutableUserPreference.Json());
  }
}

