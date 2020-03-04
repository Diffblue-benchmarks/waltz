package com.khartec.waltz.model.tally;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableMeasurableRatingTallyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurableRatingTally.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableMeasurableRatingTally.Json actualJson = new ImmutableMeasurableRatingTally.Json();

    // Assert
    assertFalse(actualJson.idIsSet);
    assertFalse(actualJson.countIsSet);
    assertFalse(actualJson.ratingIsSet);
    assertEquals(0L, actualJson.count);
    assertEquals('\u0000', actualJson.rating);
    assertEquals(0L, actualJson.id);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableMeasurableRatingTally.copyOf(new ImmutableMeasurableRatingTally.Json());
  }
  @Test
  public void countTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingTally.Json()).count();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurableRatingTally.fromJson(new ImmutableMeasurableRatingTally.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableMeasurableRatingTally.Builder builderResult = ImmutableMeasurableRatingTally.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableMeasurableRatingTally.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingTally.Json()).id();
  }
  @Test
  public void ratingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingTally.Json()).rating();
  }
  @Test
  public void setCountTest() {
    // Arrange
    ImmutableMeasurableRatingTally.Json json = new ImmutableMeasurableRatingTally.Json();

    // Act
    json.setCount(3L);

    // Assert
    assertTrue(json.countIsSet);
    assertEquals(3L, json.count);
  }
  @Test
  public void setIdTest() {
    // Arrange
    ImmutableMeasurableRatingTally.Json json = new ImmutableMeasurableRatingTally.Json();

    // Act
    json.setId(123L);

    // Assert
    assertTrue(json.idIsSet);
    assertEquals(123L, json.id);
  }
  @Test
  public void setRatingTest() {
    // Arrange
    ImmutableMeasurableRatingTally.Json json = new ImmutableMeasurableRatingTally.Json();

    // Act
    json.setRating('A');

    // Assert
    assertTrue(json.ratingIsSet);
    assertEquals('A', json.rating);
  }
}

