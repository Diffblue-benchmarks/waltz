package com.khartec.waltz.model.allocation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.Operation;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableMeasurablePercentageChangeDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurablePercentageChange.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableMeasurablePercentageChange.Json actualJson = new ImmutableMeasurablePercentageChange.Json();

    // Assert
    assertNull(actualJson.measurablePercentage);
    assertNull(actualJson.operation);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableMeasurablePercentageChange.copyOf(new ImmutableMeasurablePercentageChange.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurablePercentageChange.fromJson(new ImmutableMeasurablePercentageChange.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableMeasurablePercentageChange.Builder builderResult = ImmutableMeasurablePercentageChange.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableMeasurablePercentageChange.Json());
  }

  @Test
  public void measurablePercentageTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurablePercentageChange.Json()).measurablePercentage();
  }

  @Test
  public void operationTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurablePercentageChange.Json()).operation();
  }

  @Test
  public void setMeasurablePercentageTest() {
    // Arrange
    ImmutableMeasurablePercentageChange.Json json = new ImmutableMeasurablePercentageChange.Json();
    ImmutableMeasurablePercentage.Json json1 = new ImmutableMeasurablePercentage.Json();

    // Act
    json.setMeasurablePercentage(json1);

    // Assert
    assertSame(json1, json.measurablePercentage);
  }

  @Test
  public void setOperationTest() {
    // Arrange
    ImmutableMeasurablePercentageChange.Json json = new ImmutableMeasurablePercentageChange.Json();

    // Act
    json.setOperation(Operation.ADD);

    // Assert
    assertEquals(Operation.ADD, json.operation);
  }
}

