package com.khartec.waltz.model.flow_diagram;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableFlowDiagramAnnotationDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableFlowDiagramAnnotation.builder().build();
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableFlowDiagramAnnotation.Builder builderResult = ImmutableFlowDiagramAnnotation.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableFlowDiagramAnnotation.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableFlowDiagramAnnotation.copyOf(new ImmutableFlowDiagramAnnotation.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableFlowDiagramAnnotation.fromJson(new ImmutableFlowDiagramAnnotation.Json());
  }

  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagramAnnotation.Json()).entityReference();
  }

  @Test
  public void setNoteTest() {
    // Arrange
    ImmutableFlowDiagramAnnotation.Json json = new ImmutableFlowDiagramAnnotation.Json();

    // Act
    json.setNote("foo");

    // Assert
    assertEquals("foo", json.note);
  }

  @Test
  public void noteTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagramAnnotation.Json()).note();
  }

  @Test
  public void annotationIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagramAnnotation.Json()).annotationId();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableFlowDiagramAnnotation.Json actualJson = new ImmutableFlowDiagramAnnotation.Json();

    // Assert
    assertNull(actualJson.annotationId);
    assertNull(actualJson.entityReference);
    assertNull(actualJson.note);
  }

  @Test
  public void diagramIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagramAnnotation.Json()).diagramId();
  }

  @Test
  public void setAnnotationIdTest() {
    // Arrange
    ImmutableFlowDiagramAnnotation.Json json = new ImmutableFlowDiagramAnnotation.Json();

    // Act
    json.setAnnotationId("123");

    // Assert
    assertEquals("123", json.annotationId);
  }
}

