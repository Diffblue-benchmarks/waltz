package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEnumValueDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void setTypeTest() {
    // Arrange
    ImmutableEnumValue.Json json = new ImmutableEnumValue.Json();

    // Act
    json.setType("foo");

    // Assert
    assertEquals("foo", json.type);
  }
  @Test
  public void iconColorTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEnumValue.Json()).iconColor();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEnumValue.Json()).description();
  }
  @Test
  public void setIconColorTest() {
    // Arrange
    ImmutableEnumValue.Json json = new ImmutableEnumValue.Json();

    // Act
    json.setIconColor("foo");

    // Assert
    assertEquals("foo", json.iconColor);
  }
  @Test
  public void typeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEnumValue.Json()).type();
  }
  @Test
  public void iconTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEnumValue.Json()).icon();
  }
  @Test
  public void setPositionTest() {
    // Arrange
    ImmutableEnumValue.Json json = new ImmutableEnumValue.Json();

    // Act
    json.setPosition(1);

    // Assert
    assertEquals(1, json.position);
    assertTrue(json.positionIsSet);
  }
  @Test
  public void setIconTest() {
    // Arrange
    ImmutableEnumValue.Json json = new ImmutableEnumValue.Json();

    // Act
    json.setIcon("foo");

    // Assert
    assertEquals("foo", json.icon);
  }
  @Test
  public void keyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEnumValue.Json()).key();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableEnumValue.Json json = new ImmutableEnumValue.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEnumValue.Json()).name();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableEnumValue.Json json = new ImmutableEnumValue.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEnumValue.Json actualJson = new ImmutableEnumValue.Json();

    // Assert
    assertNull(actualJson.type);
    assertEquals(0, actualJson.position);
    assertFalse(actualJson.positionIsSet);
    assertNull(actualJson.description);
    assertNull(actualJson.iconColor);
    assertNull(actualJson.name);
    assertNull(actualJson.icon);
    assertNull(actualJson.key);
  }
  @Test
  public void setKeyTest() {
    // Arrange
    ImmutableEnumValue.Json json = new ImmutableEnumValue.Json();

    // Act
    json.setKey("foo");

    // Assert
    assertEquals("foo", json.key);
  }
  @Test
  public void positionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEnumValue.Json()).position();
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEnumValue.copyOf(new ImmutableEnumValue.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEnumValue.fromJson(new ImmutableEnumValue.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableEnumValue.Builder builderResult = ImmutableEnumValue.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityReference.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableEnumValue.Builder builderResult = ImmutableEnumValue.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableCodedReference.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEnumValue.builder().build();
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEnumValue.Builder builderResult = ImmutableEnumValue.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((PositionProvider) new ImmutableEnumValue.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEnumValue.Builder builderResult = ImmutableEnumValue.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IconProvider) new ImmutableEnumValue.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEnumValue.Builder builderResult = ImmutableEnumValue.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEnumValue.Json());
  }
}

