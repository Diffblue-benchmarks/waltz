package com.khartec.waltz.web.action;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableFieldChangeDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableFieldChange.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableFieldChange.Json actualJson = new ImmutableFieldChange.Json();

    // Assert
    assertSame(actualJson.original, actualJson.current);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableFieldChange.copyOf(new ImmutableFieldChange.Json());
  }
  @Test
  public void currentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFieldChange.Json()).current();
  }
  @Test
  public void dirtyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFieldChange.Json()).dirty();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableFieldChange.fromJson(new ImmutableFieldChange.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableFieldChange.Builder builderResult = ImmutableFieldChange.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableFieldChange.Json());
  }
  @Test
  public void keyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFieldChange.Json()).key();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFieldChange.Json()).name();
  }
  @Test
  public void originalTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFieldChange.Json()).original();
  }
  @Test
  public void setDirtyTest() {
    // Arrange
    ImmutableFieldChange.Json json = new ImmutableFieldChange.Json();

    // Act
    json.setDirty(true);

    // Assert
    assertTrue(json.dirtyIsSet);
    assertTrue(json.dirty);
  }
  @Test
  public void setKeyTest() {
    // Arrange
    ImmutableFieldChange.Json json = new ImmutableFieldChange.Json();

    // Act
    json.setKey("key");

    // Assert
    assertEquals("key", json.key);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableFieldChange.Json json = new ImmutableFieldChange.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
}

