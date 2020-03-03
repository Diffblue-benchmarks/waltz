package com.khartec.waltz.model;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void valueTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntry.Json<Object, Object>()).value();
  }
  @Test
  public void setKeyTest() {
    // Arrange
    ImmutableEntry.Json<Object, Object> json = new ImmutableEntry.Json<Object, Object>();

    // Act
    json.setKey("foo");

    // Assert
    assertTrue(json.key instanceof String);
  }
  @Test
  public void setValueTest() {
    // Arrange
    ImmutableEntry.Json<Object, Object> json = new ImmutableEntry.Json<Object, Object>();

    // Act
    json.setValue("value");

    // Assert
    assertTrue(json.value instanceof String);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntry.Json<Object, Object> actualJson = new ImmutableEntry.Json<Object, Object>();

    // Assert
    assertNull(actualJson.key);
    assertNull(actualJson.value);
  }
  @Test
  public void keyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntry.Json<Object, Object>()).key();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntry.<Object, Object>fromJson(new ImmutableEntry.Json<Object, Object>());
  }
}

