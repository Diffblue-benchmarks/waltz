package com.khartec.waltz.model.physical_flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalFlowCreateCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalFlowCreateCommand.Builder builderResult = ImmutablePhysicalFlowCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalFlowCreateCommand.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowCreateCommand.builder().build();
  }
  @Test
  public void flowAttributesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowCreateCommand.Json()).flowAttributes();
  }
  @Test
  public void setLogicalFlowIdTest() {
    // Arrange
    ImmutablePhysicalFlowCreateCommand.Json json = new ImmutablePhysicalFlowCreateCommand.Json();

    // Act
    json.setLogicalFlowId(123L);

    // Assert
    assertTrue(json.logicalFlowIdIsSet);
    assertEquals(123L, json.logicalFlowId);
  }
  @Test
  public void specificationTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowCreateCommand.Json()).specification();
  }
  @Test
  public void setFlowAttributesTest() {
    // Arrange
    ImmutablePhysicalFlowCreateCommand.Json json = new ImmutablePhysicalFlowCreateCommand.Json();
    ImmutableFlowAttributes.Json json1 = new ImmutableFlowAttributes.Json();

    // Act
    json.setFlowAttributes(json1);

    // Assert
    assertSame(json1, json.flowAttributes);
  }
  @Test
  public void logicalFlowIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowCreateCommand.Json()).logicalFlowId();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalFlowCreateCommand.Json actualJson = new ImmutablePhysicalFlowCreateCommand.Json();

    // Assert
    assertNull(actualJson.specification);
    assertFalse(actualJson.logicalFlowIdIsSet);
    assertEquals(0L, actualJson.logicalFlowId);
    assertNull(actualJson.flowAttributes);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalFlowCreateCommand.copyOf(new ImmutablePhysicalFlowCreateCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowCreateCommand.fromJson(new ImmutablePhysicalFlowCreateCommand.Json());
  }
}

