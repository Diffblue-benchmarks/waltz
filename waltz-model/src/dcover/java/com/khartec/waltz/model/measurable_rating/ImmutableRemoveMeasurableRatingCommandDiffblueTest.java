package com.khartec.waltz.model.measurable_rating;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableRemoveMeasurableRatingCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableRemoveMeasurableRatingCommand.Builder builderResult = ImmutableRemoveMeasurableRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableRemoveMeasurableRatingCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableRemoveMeasurableRatingCommand.Builder builderResult = ImmutableRemoveMeasurableRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((MeasurableRatingCommand) new ImmutableRemoveMeasurableRatingCommand.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRemoveMeasurableRatingCommand.builder().build();
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRemoveMeasurableRatingCommand.Json()).entityReference();
  }
  @Test
  public void setMeasurableIdTest() {
    // Arrange
    ImmutableRemoveMeasurableRatingCommand.Json json = new ImmutableRemoveMeasurableRatingCommand.Json();

    // Act
    json.setMeasurableId(123L);

    // Assert
    assertTrue(json.measurableIdIsSet);
    assertEquals(123L, json.measurableId);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableRemoveMeasurableRatingCommand.Json actualJson = new ImmutableRemoveMeasurableRatingCommand.Json();

    // Assert
    assertFalse(actualJson.measurableIdIsSet);
    assertNull(actualJson.entityReference);
    assertNull(actualJson.lastUpdate);
    assertEquals(0L, actualJson.measurableId);
  }
  @Test
  public void measurableIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRemoveMeasurableRatingCommand.Json()).measurableId();
  }
  @Test
  public void lastUpdateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRemoveMeasurableRatingCommand.Json()).lastUpdate();
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableRemoveMeasurableRatingCommand.copyOf(new ImmutableRemoveMeasurableRatingCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRemoveMeasurableRatingCommand.fromJson(new ImmutableRemoveMeasurableRatingCommand.Json());
  }
}

