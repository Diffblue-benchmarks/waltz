package com.khartec.waltz.model.entity_workflow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityWorkflowStateDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityWorkflowState.fromJson(new ImmutableEntityWorkflowState.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityWorkflowState.copyOf(new ImmutableEntityWorkflowState.Json());
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableEntityWorkflowState.Builder builderResult = ImmutableEntityWorkflowState.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableEntityWorkflowState.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEntityWorkflowState.Builder builderResult = ImmutableEntityWorkflowState.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityWorkflowDefinition.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEntityWorkflowState.Builder builderResult = ImmutableEntityWorkflowState.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableEntityWorkflowState.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityWorkflowState.Builder builderResult = ImmutableEntityWorkflowState.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityWorkflowState.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityWorkflowState.builder().build();
  }

  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowState.Json()).entityReference();
  }

  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableEntityWorkflowState.Json json = new ImmutableEntityWorkflowState.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }

  @Test
  public void setStateTest() {
    // Arrange
    ImmutableEntityWorkflowState.Json json = new ImmutableEntityWorkflowState.Json();

    // Act
    json.setState("foo");

    // Assert
    assertEquals("foo", json.state);
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowState.Json()).description();
  }

  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowState.Json()).lastUpdatedBy();
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowState.Json()).provenance();
  }

  @Test
  public void setWorkflowIdTest() {
    // Arrange
    ImmutableEntityWorkflowState.Json json = new ImmutableEntityWorkflowState.Json();

    // Act
    json.setWorkflowId(123L);

    // Assert
    assertEquals(123L, json.workflowId);
    assertTrue(json.workflowIdIsSet);
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableEntityWorkflowState.Json json = new ImmutableEntityWorkflowState.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void workflowIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowState.Json()).workflowId();
  }

  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowState.Json()).lastUpdatedAt();
  }

  @Test
  public void stateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowState.Json()).state();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityWorkflowState.Json actualJson = new ImmutableEntityWorkflowState.Json();

    // Assert
    assertNull(actualJson.entityReference);
    assertNull(actualJson.description);
    assertNull(actualJson.state);
    assertEquals(0L, actualJson.workflowId);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.provenance);
    assertFalse(actualJson.workflowIdIsSet);
    assertNull(actualJson.lastUpdatedAt);
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableEntityWorkflowState.Json json = new ImmutableEntityWorkflowState.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
}

