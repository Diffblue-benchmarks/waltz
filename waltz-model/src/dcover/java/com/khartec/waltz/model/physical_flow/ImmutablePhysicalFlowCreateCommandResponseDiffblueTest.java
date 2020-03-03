package com.khartec.waltz.model.physical_flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.command.CommandOutcome;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalFlowCreateCommandResponseDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalFlowCreateCommandResponse.copyOf(new ImmutablePhysicalFlowCreateCommandResponse.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowCreateCommandResponse.fromJson(new ImmutablePhysicalFlowCreateCommandResponse.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowCreateCommandResponse.builder().build();
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalFlowCreateCommandResponse.Builder builderResult = ImmutablePhysicalFlowCreateCommandResponse
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalFlowCreateCommandResponse.Json());
  }

  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowCreateCommandResponse.Json()).entityReference();
  }

  @Test
  public void messageTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowCreateCommandResponse.Json()).message();
  }

  @Test
  public void originalCommandTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowCreateCommandResponse.Json()).originalCommand();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalFlowCreateCommandResponse.Json actualJson = new ImmutablePhysicalFlowCreateCommandResponse.Json();

    // Assert
    assertNull(actualJson.outcome);
    assertNull(actualJson.entityReference);
    assertNull(actualJson.originalCommand);
  }

  @Test
  public void outcomeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowCreateCommandResponse.Json()).outcome();
  }

  @Test
  public void setOriginalCommandTest() {
    // Arrange
    ImmutablePhysicalFlowCreateCommandResponse.Json json = new ImmutablePhysicalFlowCreateCommandResponse.Json();
    ImmutablePhysicalFlowCreateCommand.Json json1 = new ImmutablePhysicalFlowCreateCommand.Json();

    // Act
    json.setOriginalCommand(json1);

    // Assert
    assertSame(json1, json.originalCommand);
  }

  @Test
  public void setOutcomeTest() {
    // Arrange
    ImmutablePhysicalFlowCreateCommandResponse.Json json = new ImmutablePhysicalFlowCreateCommandResponse.Json();

    // Act
    json.setOutcome(CommandOutcome.SUCCESS);

    // Assert
    assertEquals(CommandOutcome.SUCCESS, json.outcome);
  }
}

