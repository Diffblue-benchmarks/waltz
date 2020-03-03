package com.khartec.waltz.model.allocation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableMeasurablePercentageDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableMeasurablePercentage.copyOf(new ImmutableMeasurablePercentage.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurablePercentage.fromJson(new ImmutableMeasurablePercentage.Json());
  }
  @Test
  public void percentageTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurablePercentage.Json()).percentage();
  }
  @Test
  public void setPercentageTest() {
    // Arrange
    ImmutableMeasurablePercentage.Json json = new ImmutableMeasurablePercentage.Json();

    // Act
    json.setPercentage(1);

    // Assert
    assertEquals(1, json.percentage);
    assertTrue(json.percentageIsSet);
  }
  @Test
  public void setMeasurableIdTest() {
    // Arrange
    ImmutableMeasurablePercentage.Json json = new ImmutableMeasurablePercentage.Json();

    // Act
    json.setMeasurableId(123L);

    // Assert
    assertTrue(json.measurableIdIsSet);
    assertEquals(123L, json.measurableId);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableMeasurablePercentage.Json actualJson = new ImmutableMeasurablePercentage.Json();

    // Assert
    assertEquals(0, actualJson.percentage);
    assertFalse(actualJson.measurableIdIsSet);
    assertFalse(actualJson.percentageIsSet);
    assertEquals(0L, actualJson.measurableId);
  }
  @Test
  public void measurableIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurablePercentage.Json()).measurableId();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurablePercentage.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableMeasurablePercentage.Builder builderResult = ImmutableMeasurablePercentage.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableMeasurablePercentage.Json());
  }
}

