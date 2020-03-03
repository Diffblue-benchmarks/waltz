package com.khartec.waltz.model.command;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableCommandResponseDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableCommandResponse.<Command>fromJson(new ImmutableCommandResponse.Json<Command>());
  }

  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCommandResponse.Json<Command>()).entityReference();
  }

  @Test
  public void originalCommandTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCommandResponse.Json<Command>()).originalCommand();
  }

  @Test
  public void messageTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCommandResponse.Json<Command>()).message();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableCommandResponse.Json<Command> actualJson = new ImmutableCommandResponse.Json<Command>();

    // Assert
    assertNull(actualJson.entityReference);
    assertNull(actualJson.outcome);
    assertNull(actualJson.originalCommand);
  }

  @Test
  public void outcomeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCommandResponse.Json<Command>()).outcome();
  }

  @Test
  public void setOutcomeTest() {
    // Arrange
    ImmutableCommandResponse.Json<Command> json = new ImmutableCommandResponse.Json<Command>();

    // Act
    json.setOutcome(CommandOutcome.SUCCESS);

    // Assert
    assertEquals(CommandOutcome.SUCCESS, json.outcome);
  }
}

