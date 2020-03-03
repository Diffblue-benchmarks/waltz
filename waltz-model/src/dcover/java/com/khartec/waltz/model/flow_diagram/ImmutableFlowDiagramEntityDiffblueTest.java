package com.khartec.waltz.model.flow_diagram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableFlowDiagramEntityDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableFlowDiagramEntity.fromJson(new ImmutableFlowDiagramEntity.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableFlowDiagramEntity.copyOf(new ImmutableFlowDiagramEntity.Json());
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagramEntity.Json()).entityReference();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableFlowDiagramEntity.Json actualJson = new ImmutableFlowDiagramEntity.Json();

    // Assert
    assertFalse(actualJson.isNotable);
    assertNull(actualJson.entityReference);
    assertFalse(actualJson.isNotableIsSet);
  }
  @Test
  public void diagramIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagramEntity.Json()).diagramId();
  }
  @Test
  public void isNotableTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagramEntity.Json()).isNotable();
  }
  @Test
  public void setIsNotableTest() {
    // Arrange
    ImmutableFlowDiagramEntity.Json json = new ImmutableFlowDiagramEntity.Json();

    // Act
    json.setIsNotable(true);

    // Assert
    assertTrue(json.isNotable);
    assertTrue(json.isNotableIsSet);
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableFlowDiagramEntity.Builder builderResult = ImmutableFlowDiagramEntity.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableFlowDiagramEntity.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableFlowDiagramEntity.builder().build();
  }
}

