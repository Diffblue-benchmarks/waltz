package com.khartec.waltz.model.performance_metric.pack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.checkpoint.CheckpointGoal;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableMetricPackItemDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void setSectionNameTest() {
    // Arrange
    ImmutableMetricPackItem.Json json = new ImmutableMetricPackItem.Json();

    // Act
    json.setSectionName("name");

    // Assert
    assertEquals("name", json.sectionName);
  }
  @Test
  public void setDefinitionIdTest() {
    // Arrange
    ImmutableMetricPackItem.Json json = new ImmutableMetricPackItem.Json();

    // Act
    json.setDefinitionId(123L);

    // Assert
    assertTrue(json.definitionIdIsSet);
    assertEquals(123L, json.definitionId);
  }
  @Test
  public void setGoalsTest() {
    // Arrange
    ImmutableMetricPackItem.Json json = new ImmutableMetricPackItem.Json();
    ArrayList<CheckpointGoal> checkpointGoalList = new ArrayList<CheckpointGoal>();
    checkpointGoalList.add(null);

    // Act
    json.setGoals(checkpointGoalList);

    // Assert
    assertSame(checkpointGoalList, json.goals);
  }
  @Test
  public void setBaseLineTest() {
    // Arrange
    ImmutableMetricPackItem.Json json = new ImmutableMetricPackItem.Json();

    // Act
    json.setBaseLine(10.0);

    // Assert
    assertTrue(json.baseLineIsSet);
    assertEquals(10.0, json.baseLine, 0.0);
  }
  @Test
  public void definitionIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricPackItem.Json()).definitionId();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricPackItem.Json()).id();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableMetricPackItem.Json()).goals.size());
  }
  @Test
  public void baseLineTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricPackItem.Json()).baseLine();
  }
  @Test
  public void sectionNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricPackItem.Json()).sectionName();
  }
  @Test
  public void goalsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMetricPackItem.Json()).goals();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMetricPackItem.fromJson(new ImmutableMetricPackItem.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableMetricPackItem.copyOf(new ImmutableMetricPackItem.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableMetricPackItem.Builder builderResult = ImmutableMetricPackItem.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableMetricPackItem.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMetricPackItem.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableMetricPackItem.Builder builderResult = ImmutableMetricPackItem.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableMetricPack.Json());
  }
}

