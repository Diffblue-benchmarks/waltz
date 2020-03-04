package com.khartec.waltz.model.role;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableRoleDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRole.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableRole.Json actualJson = new ImmutableRole.Json();

    // Assert
    assertNull(actualJson.description);
    assertFalse(actualJson.isCustomIsSet);
    assertNull(actualJson.key);
    assertFalse(actualJson.isCustom);
    assertNull(actualJson.name);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableRole.copyOf(new ImmutableRole.Json());
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRole.Json()).description();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRole.fromJson(new ImmutableRole.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableRole.Builder builderResult = ImmutableRole.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableRole.Json());
  }

  @Test
  public void isCustomTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRole.Json()).isCustom();
  }

  @Test
  public void keyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRole.Json()).key();
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRole.Json()).name();
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableRole.Json json = new ImmutableRole.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void setIsCustomTest() {
    // Arrange
    ImmutableRole.Json json = new ImmutableRole.Json();

    // Act
    json.setIsCustom(true);

    // Assert
    assertTrue(json.isCustomIsSet);
    assertTrue(json.isCustom);
  }

  @Test
  public void setKeyTest() {
    // Arrange
    ImmutableRole.Json json = new ImmutableRole.Json();

    // Act
    json.setKey("key");

    // Assert
    assertEquals("key", json.key);
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutableRole.Json json = new ImmutableRole.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
}

