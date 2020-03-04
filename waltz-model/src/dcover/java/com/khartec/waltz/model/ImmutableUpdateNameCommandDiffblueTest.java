package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableUpdateNameCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUpdateNameCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ImmutableUpdateNameCommand.Json()).newName);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableUpdateNameCommand.copyOf(new ImmutableUpdateNameCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUpdateNameCommand.fromJson(new ImmutableUpdateNameCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableUpdateNameCommand.Builder builderResult = ImmutableUpdateNameCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableUpdateNameCommand.Json());
  }
  @Test
  public void newNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdateNameCommand.Json()).newName();
  }
  @Test
  public void setNewNameTest() {
    // Arrange
    ImmutableUpdateNameCommand.Json json = new ImmutableUpdateNameCommand.Json();

    // Act
    json.setNewName("newName");

    // Assert
    assertEquals("newName", json.newName);
  }
}

