package com.khartec.waltz.model.attestation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAttestationRunResponseSummaryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttestationRunResponseSummary.fromJson(new ImmutableAttestationRunResponseSummary.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAttestationRunResponseSummary.copyOf(new ImmutableAttestationRunResponseSummary.Json());
  }
  @Test
  public void pendingCountTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRunResponseSummary.Json()).pendingCount();
  }
  @Test
  public void runIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRunResponseSummary.Json()).runId();
  }
  @Test
  public void setRunIdTest() {
    // Arrange
    ImmutableAttestationRunResponseSummary.Json json = new ImmutableAttestationRunResponseSummary.Json();

    // Act
    json.setRunId(123L);

    // Assert
    assertEquals(123L, json.runId);
    assertTrue(json.runIdIsSet);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAttestationRunResponseSummary.Json actualJson = new ImmutableAttestationRunResponseSummary.Json();

    // Assert
    assertFalse(actualJson.pendingCountIsSet);
    assertEquals(0L, actualJson.runId);
    assertFalse(actualJson.completeCountIsSet);
    assertEquals(0L, actualJson.completeCount);
    assertFalse(actualJson.runIdIsSet);
    assertEquals(0L, actualJson.pendingCount);
  }
  @Test
  public void setPendingCountTest() {
    // Arrange
    ImmutableAttestationRunResponseSummary.Json json = new ImmutableAttestationRunResponseSummary.Json();

    // Act
    json.setPendingCount(3L);

    // Assert
    assertTrue(json.pendingCountIsSet);
    assertEquals(3L, json.pendingCount);
  }
  @Test
  public void setCompleteCountTest() {
    // Arrange
    ImmutableAttestationRunResponseSummary.Json json = new ImmutableAttestationRunResponseSummary.Json();

    // Act
    json.setCompleteCount(3L);

    // Assert
    assertTrue(json.completeCountIsSet);
    assertEquals(3L, json.completeCount);
  }
  @Test
  public void completeCountTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAttestationRunResponseSummary.Json()).completeCount();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAttestationRunResponseSummary.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAttestationRunResponseSummary.Builder builderResult = ImmutableAttestationRunResponseSummary.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAttestationRunResponseSummary.Json());
  }
}

