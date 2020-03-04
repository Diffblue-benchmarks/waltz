package com.khartec.waltz.model.physical_flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalFlowSpecDefinitionChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowSpecDefinitionChangeCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalFlowSpecDefinitionChangeCommand.Json actualJson = new ImmutablePhysicalFlowSpecDefinitionChangeCommand.Json();

    // Assert
    assertEquals(0L, actualJson.newSpecDefinitionId);
    assertFalse(actualJson.newSpecDefinitionIdIsSet);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalFlowSpecDefinitionChangeCommand
        .copyOf(new ImmutablePhysicalFlowSpecDefinitionChangeCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowSpecDefinitionChangeCommand
        .fromJson(new ImmutablePhysicalFlowSpecDefinitionChangeCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalFlowSpecDefinitionChangeCommand.Builder builderResult = ImmutablePhysicalFlowSpecDefinitionChangeCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalFlowSpecDefinitionChangeCommand.Json());
  }
  @Test
  public void newSpecDefinitionIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowSpecDefinitionChangeCommand.Json()).newSpecDefinitionId();
  }
  @Test
  public void setNewSpecDefinitionIdTest() {
    // Arrange
    ImmutablePhysicalFlowSpecDefinitionChangeCommand.Json json = new ImmutablePhysicalFlowSpecDefinitionChangeCommand.Json();

    // Act
    json.setNewSpecDefinitionId(123L);

    // Assert
    assertEquals(123L, json.newSpecDefinitionId);
    assertTrue(json.newSpecDefinitionIdIsSet);
  }
}

