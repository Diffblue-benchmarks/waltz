package com.khartec.waltz.model.entity_statistic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityStatisticValueDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityStatisticValue.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityStatisticValue.Json actualJson = new ImmutableEntityStatisticValue.Json();

    // Assert
    assertNull(actualJson.reason);
    assertFalse(actualJson.statisticIdIsSet);
    assertNull(actualJson.state);
    assertFalse(actualJson.currentIsSet);
    assertNull(actualJson.createdAt);
    assertEquals(0L, actualJson.statisticId);
    assertNull(actualJson.outcome);
    assertNull(actualJson.entity);
    assertNull(actualJson.value);
    assertFalse(actualJson.current);
    assertNull(actualJson.provenance);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityStatisticValue.copyOf(new ImmutableEntityStatisticValue.Json());
  }

  @Test
  public void createdAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticValue.Json()).createdAt();
  }

  @Test
  public void currentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticValue.Json()).current();
  }

  @Test
  public void entityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticValue.Json()).entity();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityStatisticValue.fromJson(new ImmutableEntityStatisticValue.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityStatisticValue.Builder builderResult = ImmutableEntityStatisticValue.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableEntityStatisticDefinition.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEntityStatisticValue.Builder builderResult = ImmutableEntityStatisticValue.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableEntityStatisticDefinition.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEntityStatisticValue.Builder builderResult = ImmutableEntityStatisticValue.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityStatisticValue.Json());
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticValue.Json()).id();
  }

  @Test
  public void outcomeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticValue.Json()).outcome();
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticValue.Json()).provenance();
  }

  @Test
  public void reasonTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticValue.Json()).reason();
  }

  @Test
  public void setCurrentTest() {
    // Arrange
    ImmutableEntityStatisticValue.Json json = new ImmutableEntityStatisticValue.Json();

    // Act
    json.setCurrent(true);

    // Assert
    assertTrue(json.currentIsSet);
    assertTrue(json.current);
  }

  @Test
  public void setOutcomeTest() {
    // Arrange
    ImmutableEntityStatisticValue.Json json = new ImmutableEntityStatisticValue.Json();

    // Act
    json.setOutcome("outcome");

    // Assert
    assertEquals("outcome", json.outcome);
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableEntityStatisticValue.Json json = new ImmutableEntityStatisticValue.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }

  @Test
  public void setReasonTest() {
    // Arrange
    ImmutableEntityStatisticValue.Json json = new ImmutableEntityStatisticValue.Json();

    // Act
    json.setReason("because");

    // Assert
    assertEquals("because", json.reason);
  }

  @Test
  public void setStateTest() {
    // Arrange
    ImmutableEntityStatisticValue.Json json = new ImmutableEntityStatisticValue.Json();

    // Act
    json.setState(StatisticValueState.EXEMPT);

    // Assert
    assertEquals(StatisticValueState.EXEMPT, json.state);
  }

  @Test
  public void setStatisticIdTest() {
    // Arrange
    ImmutableEntityStatisticValue.Json json = new ImmutableEntityStatisticValue.Json();

    // Act
    json.setStatisticId(123L);

    // Assert
    assertTrue(json.statisticIdIsSet);
    assertEquals(123L, json.statisticId);
  }

  @Test
  public void setValueTest() {
    // Arrange
    ImmutableEntityStatisticValue.Json json = new ImmutableEntityStatisticValue.Json();

    // Act
    json.setValue("value");

    // Assert
    assertEquals("value", json.value);
  }

  @Test
  public void stateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticValue.Json()).state();
  }

  @Test
  public void statisticIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticValue.Json()).statisticId();
  }

  @Test
  public void valueTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticValue.Json()).value();
  }
}

