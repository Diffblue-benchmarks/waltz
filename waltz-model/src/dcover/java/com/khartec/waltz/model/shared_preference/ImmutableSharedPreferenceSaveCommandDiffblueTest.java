package com.khartec.waltz.model.shared_preference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSharedPreferenceSaveCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSharedPreferenceSaveCommand.builder().build();
  }
  @Test
  public void categoryTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSharedPreferenceSaveCommand.Json()).category();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSharedPreferenceSaveCommand.Json actualJson = new ImmutableSharedPreferenceSaveCommand.Json();

    // Assert
    assertNull(actualJson.key);
    assertNull(actualJson.value);
    assertNull(actualJson.category);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSharedPreferenceSaveCommand.copyOf(new ImmutableSharedPreferenceSaveCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSharedPreferenceSaveCommand.fromJson(new ImmutableSharedPreferenceSaveCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSharedPreferenceSaveCommand.Builder builderResult = ImmutableSharedPreferenceSaveCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSharedPreferenceSaveCommand.Json());
  }
  @Test
  public void keyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSharedPreferenceSaveCommand.Json()).key();
  }
  @Test
  public void setCategoryTest() {
    // Arrange
    ImmutableSharedPreferenceSaveCommand.Json json = new ImmutableSharedPreferenceSaveCommand.Json();

    // Act
    json.setCategory("category");

    // Assert
    assertEquals("category", json.category);
  }
  @Test
  public void setKeyTest() {
    // Arrange
    ImmutableSharedPreferenceSaveCommand.Json json = new ImmutableSharedPreferenceSaveCommand.Json();

    // Act
    json.setKey("key");

    // Assert
    assertEquals("key", json.key);
  }
  @Test
  public void setValueTest() {
    // Arrange
    ImmutableSharedPreferenceSaveCommand.Json json = new ImmutableSharedPreferenceSaveCommand.Json();

    // Act
    json.setValue("value");

    // Assert
    assertEquals("value", json.value);
  }
  @Test
  public void valueTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSharedPreferenceSaveCommand.Json()).value();
  }
}

