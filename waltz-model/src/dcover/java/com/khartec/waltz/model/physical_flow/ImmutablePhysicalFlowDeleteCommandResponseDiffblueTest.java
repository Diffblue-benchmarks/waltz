package com.khartec.waltz.model.physical_flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.command.CommandOutcome;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalFlowDeleteCommandResponseDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowDeleteCommandResponse.fromJson(new ImmutablePhysicalFlowDeleteCommandResponse.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalFlowDeleteCommandResponse.copyOf(new ImmutablePhysicalFlowDeleteCommandResponse.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalFlowDeleteCommandResponse.Builder builderResult = ImmutablePhysicalFlowDeleteCommandResponse
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalFlowDeleteCommandResponse.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowDeleteCommandResponse.builder().build();
  }

  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowDeleteCommandResponse.Json()).entityReference();
  }

  @Test
  public void setIsLastPhysicalFlowTest() {
    // Arrange
    ImmutablePhysicalFlowDeleteCommandResponse.Json json = new ImmutablePhysicalFlowDeleteCommandResponse.Json();

    // Act
    json.setIsLastPhysicalFlow(true);

    // Assert
    assertTrue(json.isLastPhysicalFlow);
    assertTrue(json.isLastPhysicalFlowIsSet);
  }

  @Test
  public void originalCommandTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowDeleteCommandResponse.Json()).originalCommand();
  }

  @Test
  public void messageTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowDeleteCommandResponse.Json()).message();
  }

  @Test
  public void outcomeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowDeleteCommandResponse.Json()).outcome();
  }

  @Test
  public void setIsSpecificationUnusedTest() {
    // Arrange
    ImmutablePhysicalFlowDeleteCommandResponse.Json json = new ImmutablePhysicalFlowDeleteCommandResponse.Json();

    // Act
    json.setIsSpecificationUnused(true);

    // Assert
    assertTrue(json.isSpecificationUnusedIsSet);
    assertTrue(json.isSpecificationUnused);
  }

  @Test
  public void setOriginalCommandTest() {
    // Arrange
    ImmutablePhysicalFlowDeleteCommandResponse.Json json = new ImmutablePhysicalFlowDeleteCommandResponse.Json();
    ImmutablePhysicalFlowDeleteCommand.Json json1 = new ImmutablePhysicalFlowDeleteCommand.Json();

    // Act
    json.setOriginalCommand(json1);

    // Assert
    assertSame(json1, json.originalCommand);
  }

  @Test
  public void isSpecificationUnusedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowDeleteCommandResponse.Json()).isSpecificationUnused();
  }

  @Test
  public void isLastPhysicalFlowTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowDeleteCommandResponse.Json()).isLastPhysicalFlow();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalFlowDeleteCommandResponse.Json actualJson = new ImmutablePhysicalFlowDeleteCommandResponse.Json();

    // Assert
    assertFalse(actualJson.isSpecificationUnusedIsSet);
    assertNull(actualJson.originalCommand);
    assertFalse(actualJson.isSpecificationUnused);
    assertFalse(actualJson.isLastPhysicalFlow);
    assertNull(actualJson.outcome);
    assertNull(actualJson.entityReference);
    assertFalse(actualJson.isLastPhysicalFlowIsSet);
  }

  @Test
  public void setOutcomeTest() {
    // Arrange
    ImmutablePhysicalFlowDeleteCommandResponse.Json json = new ImmutablePhysicalFlowDeleteCommandResponse.Json();

    // Act
    json.setOutcome(CommandOutcome.SUCCESS);

    // Assert
    assertEquals(CommandOutcome.SUCCESS, json.outcome);
  }
}

