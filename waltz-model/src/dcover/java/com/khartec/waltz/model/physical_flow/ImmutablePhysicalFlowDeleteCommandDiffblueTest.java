package com.khartec.waltz.model.physical_flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalFlowDeleteCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalFlowDeleteCommand.copyOf(new ImmutablePhysicalFlowDeleteCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowDeleteCommand.fromJson(new ImmutablePhysicalFlowDeleteCommand.Json());
  }
  @Test
  public void flowIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowDeleteCommand.Json()).flowId();
  }
  @Test
  public void setFlowIdTest() {
    // Arrange
    ImmutablePhysicalFlowDeleteCommand.Json json = new ImmutablePhysicalFlowDeleteCommand.Json();

    // Act
    json.setFlowId(123L);

    // Assert
    assertTrue(json.flowIdIsSet);
    assertEquals(123L, json.flowId);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalFlowDeleteCommand.Json actualJson = new ImmutablePhysicalFlowDeleteCommand.Json();

    // Assert
    assertFalse(actualJson.flowIdIsSet);
    assertEquals(0L, actualJson.flowId);
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowDeleteCommand.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalFlowDeleteCommand.Builder builderResult = ImmutablePhysicalFlowDeleteCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalFlowDeleteCommand.Json());
  }
}

