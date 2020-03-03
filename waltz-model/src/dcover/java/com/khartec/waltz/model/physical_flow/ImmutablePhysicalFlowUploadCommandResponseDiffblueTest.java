package com.khartec.waltz.model.physical_flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.command.CommandOutcome;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalFlowUploadCommandResponseDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowUploadCommandResponse.builder().build();
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommandResponse.Builder builderResult = ImmutablePhysicalFlowUploadCommandResponse
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalFlowUploadCommandResponse.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowUploadCommandResponse.fromJson(new ImmutablePhysicalFlowUploadCommandResponse.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalFlowUploadCommandResponse.copyOf(new ImmutablePhysicalFlowUploadCommandResponse.Json());
  }

  @Test
  public void setOriginalCommandTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommandResponse.Json json = new ImmutablePhysicalFlowUploadCommandResponse.Json();
    ImmutablePhysicalFlowUploadCommand.Json json1 = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setOriginalCommand(json1);

    // Assert
    assertSame(json1, json.originalCommand);
  }

  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommandResponse.Json()).entityReference();
  }

  @Test
  public void setParsedFlowTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommandResponse.Json json = new ImmutablePhysicalFlowUploadCommandResponse.Json();
    ImmutablePhysicalFlowParsed.Json json1 = new ImmutablePhysicalFlowParsed.Json();

    // Act
    json.setParsedFlow(json1);

    // Assert
    assertSame(json1, json.parsedFlow);
  }

  @Test
  public void originalCommandTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommandResponse.Json()).originalCommand();
  }

  @Test
  public void messageTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommandResponse.Json()).message();
  }

  @Test
  public void outcomeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommandResponse.Json()).outcome();
  }

  @Test
  public void setErrorsTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommandResponse.Json json = new ImmutablePhysicalFlowUploadCommandResponse.Json();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    json.setErrors(stringStringMap);

    // Assert
    assertSame(stringStringMap, json.errors);
  }

  @Test
  public void errorsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommandResponse.Json()).errors();
  }

  @Test
  public void parsedFlowTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommandResponse.Json()).parsedFlow();
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutablePhysicalFlowUploadCommandResponse.Json()).errors.size());
  }

  @Test
  public void setOutcomeTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommandResponse.Json json = new ImmutablePhysicalFlowUploadCommandResponse.Json();

    // Act
    json.setOutcome(CommandOutcome.SUCCESS);

    // Assert
    assertEquals(CommandOutcome.SUCCESS, json.outcome);
  }
}

