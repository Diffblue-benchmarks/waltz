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

public class ImmutableEntityWorkflowTransitionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowTransition.Json()).entityReference();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableEntityWorkflowTransition.Json json = new ImmutableEntityWorkflowTransition.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void setToStateTest() {
    // Arrange
    ImmutableEntityWorkflowTransition.Json json = new ImmutableEntityWorkflowTransition.Json();

    // Act
    json.setToState("foo");

    // Assert
    assertEquals("foo", json.toState);
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowTransition.Json()).lastUpdatedBy();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowTransition.Json()).provenance();
  }
  @Test
  public void reasonTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowTransition.Json()).reason();
  }
  @Test
  public void setWorkflowIdTest() {
    // Arrange
    ImmutableEntityWorkflowTransition.Json json = new ImmutableEntityWorkflowTransition.Json();

    // Act
    json.setWorkflowId(123L);

    // Assert
    assertEquals(123L, json.workflowId);
    assertTrue(json.workflowIdIsSet);
  }
  @Test
  public void toStateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowTransition.Json()).toState();
  }
  @Test
  public void setFromStateTest() {
    // Arrange
    ImmutableEntityWorkflowTransition.Json json = new ImmutableEntityWorkflowTransition.Json();

    // Act
    json.setFromState("foo");

    // Assert
    assertEquals("foo", json.fromState);
  }
  @Test
  public void workflowIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowTransition.Json()).workflowId();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowTransition.Json()).lastUpdatedAt();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityWorkflowTransition.Json actualJson = new ImmutableEntityWorkflowTransition.Json();

    // Assert
    assertNull(actualJson.fromState);
    assertEquals(0L, actualJson.workflowId);
    assertNull(actualJson.lastUpdatedAt);
    assertFalse(actualJson.workflowIdIsSet);
    assertNull(actualJson.entityReference);
    assertNull(actualJson.reason);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.provenance);
    assertNull(actualJson.toState);
  }
  @Test
  public void setReasonTest() {
    // Arrange
    ImmutableEntityWorkflowTransition.Json json = new ImmutableEntityWorkflowTransition.Json();

    // Act
    json.setReason("because");

    // Assert
    assertEquals("because", json.reason);
  }
  @Test
  public void fromStateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityWorkflowTransition.Json()).fromState();
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableEntityWorkflowTransition.Json json = new ImmutableEntityWorkflowTransition.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityWorkflowTransition.builder().build();
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEntityWorkflowTransition.Builder builderResult = ImmutableEntityWorkflowTransition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityWorkflowTransition.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEntityWorkflowTransition.Builder builderResult = ImmutableEntityWorkflowTransition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableEntityWorkflowState.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityWorkflowTransition.Builder builderResult = ImmutableEntityWorkflowTransition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableEntityWorkflowState.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityWorkflowTransition.copyOf(new ImmutableEntityWorkflowTransition.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityWorkflowTransition.fromJson(new ImmutableEntityWorkflowTransition.Json());
  }
}

