package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableUpdateDescriptionCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    assertEquals("UpdateDescriptionCommand{newDescription=null}",
        ImmutableUpdateDescriptionCommand.builder().build().toString());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableUpdateDescriptionCommand.Builder builderResult = ImmutableUpdateDescriptionCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableUpdateDescriptionCommand.Json());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(ImmutableUpdateDescriptionCommand.fromJson(new ImmutableUpdateDescriptionCommand.Json()).equals("foo"));
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    assertEquals("UpdateDescriptionCommand{newDescription=null}",
        ImmutableUpdateDescriptionCommand.fromJson(new ImmutableUpdateDescriptionCommand.Json()).toString());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(177573,
        ImmutableUpdateDescriptionCommand.fromJson(new ImmutableUpdateDescriptionCommand.Json()).hashCode());
  }

  @Test
  public void newDescriptionTest2() {
    // Arrange, Act and Assert
    assertNull(
        ImmutableUpdateDescriptionCommand.fromJson(new ImmutableUpdateDescriptionCommand.Json()).newDescription());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableUpdateDescriptionCommand.copyOf(new ImmutableUpdateDescriptionCommand.Json());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("UpdateDescriptionCommand{newDescription=null}",
        ImmutableUpdateDescriptionCommand.fromJson(new ImmutableUpdateDescriptionCommand.Json()).toString());
  }

  @Test
  public void withNewDescriptionTest() {
    // Arrange, Act and Assert
    assertEquals("UpdateDescriptionCommand{newDescription=value}", ImmutableUpdateDescriptionCommand
        .fromJson(new ImmutableUpdateDescriptionCommand.Json()).withNewDescription("value").toString());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ImmutableUpdateDescriptionCommand.Json()).newDescription);
  }

  @Test
  public void newDescriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdateDescriptionCommand.Json()).newDescription();
  }

  @Test
  public void setNewDescriptionTest() {
    // Arrange
    ImmutableUpdateDescriptionCommand.Json json = new ImmutableUpdateDescriptionCommand.Json();

    // Act
    json.setNewDescription("foo");

    // Assert
    assertEquals("foo", json.newDescription);
  }
}

