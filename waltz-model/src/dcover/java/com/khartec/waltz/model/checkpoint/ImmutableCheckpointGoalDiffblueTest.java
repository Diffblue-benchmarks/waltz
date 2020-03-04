package com.khartec.waltz.model.checkpoint;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableCheckpointGoalDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableCheckpointGoal.builder().build();
  }

  @Test
  public void checkpointIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCheckpointGoal.Json()).checkpointId();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableCheckpointGoal.Json actualJson = new ImmutableCheckpointGoal.Json();

    // Assert
    assertEquals(0.0, actualJson.value, 0.0);
    assertNull(actualJson.goalType);
    assertFalse(actualJson.valueIsSet);
    assertFalse(actualJson.checkpointIdIsSet);
    assertEquals(0L, actualJson.checkpointId);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableCheckpointGoal.copyOf(new ImmutableCheckpointGoal.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableCheckpointGoal.fromJson(new ImmutableCheckpointGoal.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableCheckpointGoal.Builder builderResult = ImmutableCheckpointGoal.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableCheckpointGoal.Json());
  }

  @Test
  public void goalTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCheckpointGoal.Json()).goalType();
  }

  @Test
  public void setCheckpointIdTest() {
    // Arrange
    ImmutableCheckpointGoal.Json json = new ImmutableCheckpointGoal.Json();

    // Act
    json.setCheckpointId(123L);

    // Assert
    assertTrue(json.checkpointIdIsSet);
    assertEquals(123L, json.checkpointId);
  }

  @Test
  public void setGoalTypeTest() {
    // Arrange
    ImmutableCheckpointGoal.Json json = new ImmutableCheckpointGoal.Json();

    // Act
    json.setGoalType(GoalType.ABOVE_THRESHOLD);

    // Assert
    assertEquals(GoalType.ABOVE_THRESHOLD, json.goalType);
  }

  @Test
  public void setValueTest() {
    // Arrange
    ImmutableCheckpointGoal.Json json = new ImmutableCheckpointGoal.Json();

    // Act
    json.setValue(10.0);

    // Assert
    assertEquals(10.0, json.value, 0.0);
    assertTrue(json.valueIsSet);
  }

  @Test
  public void valueTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCheckpointGoal.Json()).value();
  }
}

