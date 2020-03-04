package com.khartec.waltz.model.logical_flow;

import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAddLogicalFlowCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAddLogicalFlowCommand.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAddLogicalFlowCommand.Json actualJson = new ImmutableAddLogicalFlowCommand.Json();

    // Assert
    assertNull(actualJson.target);
    assertNull(actualJson.source);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAddLogicalFlowCommand.copyOf(new ImmutableAddLogicalFlowCommand.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAddLogicalFlowCommand.fromJson(new ImmutableAddLogicalFlowCommand.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableAddLogicalFlowCommand.Builder builderResult = ImmutableAddLogicalFlowCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAddLogicalFlowCommand.Json());
  }

  @Test
  public void sourceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAddLogicalFlowCommand.Json()).source();
  }

  @Test
  public void targetTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAddLogicalFlowCommand.Json()).target();
  }
}

