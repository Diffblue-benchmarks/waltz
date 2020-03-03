package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSetAttributeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSetAttributeCommand.Builder builderResult = ImmutableSetAttributeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableCodedReference.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableSetAttributeCommand.Builder builderResult = ImmutableSetAttributeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSetAttributeCommand.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSetAttributeCommand.builder().build();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSetAttributeCommand.fromJson(new ImmutableSetAttributeCommand.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSetAttributeCommand.copyOf(new ImmutableSetAttributeCommand.Json());
  }

  @Test
  public void valueTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSetAttributeCommand.Json()).value();
  }

  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSetAttributeCommand.Json()).entityReference();
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSetAttributeCommand.Json()).name();
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutableSetAttributeCommand.Json json = new ImmutableSetAttributeCommand.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSetAttributeCommand.Json actualJson = new ImmutableSetAttributeCommand.Json();

    // Assert
    assertNull(actualJson.value);
    assertNull(actualJson.entityReference);
    assertNull(actualJson.name);
  }

  @Test
  public void setValueTest() {
    // Arrange
    ImmutableSetAttributeCommand.Json json = new ImmutableSetAttributeCommand.Json();

    // Act
    json.setValue("value");

    // Assert
    assertEquals("value", json.value);
  }

  @Test
  public void setEntityReferenceTest() {
    // Arrange
    ImmutableSetAttributeCommand.Json json = new ImmutableSetAttributeCommand.Json();
    ImmutableEntityReference.Json json1 = new ImmutableEntityReference.Json();

    // Act
    json.setEntityReference(json1);

    // Assert
    assertSame(json1, json.entityReference);
  }
}

