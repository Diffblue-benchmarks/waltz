package com.khartec.waltz.model.entity_statistic;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityStatisticDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityStatistic.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityStatistic.Json actualJson = new ImmutableEntityStatistic.Json();

    // Assert
    assertNull(actualJson.value);
    assertNull(actualJson.definition);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityStatistic.copyOf(new ImmutableEntityStatistic.Json());
  }
  @Test
  public void definitionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatistic.Json()).definition();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityStatistic.fromJson(new ImmutableEntityStatistic.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityStatistic.Builder builderResult = ImmutableEntityStatistic.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityStatistic.Json());
  }
  @Test
  public void setDefinitionTest() {
    // Arrange
    ImmutableEntityStatistic.Json json = new ImmutableEntityStatistic.Json();
    ImmutableEntityStatisticDefinition.Json json1 = new ImmutableEntityStatisticDefinition.Json();

    // Act
    json.setDefinition(json1);

    // Assert
    assertSame(json1, json.definition);
  }
  @Test
  public void setValueTest() {
    // Arrange
    ImmutableEntityStatistic.Json json = new ImmutableEntityStatistic.Json();
    ImmutableEntityStatisticValue.Json json1 = new ImmutableEntityStatisticValue.Json();

    // Act
    json.setValue(json1);

    // Assert
    assertSame(json1, json.value);
  }
  @Test
  public void valueTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatistic.Json()).value();
  }
}

