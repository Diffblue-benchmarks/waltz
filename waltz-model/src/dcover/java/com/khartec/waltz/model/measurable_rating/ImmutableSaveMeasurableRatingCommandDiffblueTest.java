package com.khartec.waltz.model.measurable_rating;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSaveMeasurableRatingCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSaveMeasurableRatingCommand.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSaveMeasurableRatingCommand.Json actualJson = new ImmutableSaveMeasurableRatingCommand.Json();

    // Assert
    assertNull(actualJson.provenance);
    assertFalse(actualJson.ratingIsSet);
    assertFalse(actualJson.measurableIdIsSet);
    assertNull(actualJson.description);
    assertEquals('\u0000', actualJson.rating);
    assertNull(actualJson.lastUpdate);
    assertNull(actualJson.entityReference);
    assertEquals(0L, actualJson.measurableId);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSaveMeasurableRatingCommand.copyOf(new ImmutableSaveMeasurableRatingCommand.Json());
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveMeasurableRatingCommand.Json()).description();
  }

  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveMeasurableRatingCommand.Json()).entityReference();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSaveMeasurableRatingCommand.fromJson(new ImmutableSaveMeasurableRatingCommand.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableSaveMeasurableRatingCommand.Builder builderResult = ImmutableSaveMeasurableRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableMeasurableRating.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSaveMeasurableRatingCommand.Builder builderResult = ImmutableSaveMeasurableRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableRemoveMeasurableRatingCommand.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableSaveMeasurableRatingCommand.Builder builderResult = ImmutableSaveMeasurableRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSaveMeasurableRatingCommand.Json());
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableSaveMeasurableRatingCommand.Builder builderResult = ImmutableSaveMeasurableRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableMeasurableRating.Json());
  }

  @Test
  public void lastUpdateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveMeasurableRatingCommand.Json()).lastUpdate();
  }

  @Test
  public void measurableIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveMeasurableRatingCommand.Json()).measurableId();
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveMeasurableRatingCommand.Json()).provenance();
  }

  @Test
  public void ratingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveMeasurableRatingCommand.Json()).rating();
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableSaveMeasurableRatingCommand.Json json = new ImmutableSaveMeasurableRatingCommand.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void setMeasurableIdTest() {
    // Arrange
    ImmutableSaveMeasurableRatingCommand.Json json = new ImmutableSaveMeasurableRatingCommand.Json();

    // Act
    json.setMeasurableId(123L);

    // Assert
    assertTrue(json.measurableIdIsSet);
    assertEquals(123L, json.measurableId);
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableSaveMeasurableRatingCommand.Json json = new ImmutableSaveMeasurableRatingCommand.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }

  @Test
  public void setRatingTest() {
    // Arrange
    ImmutableSaveMeasurableRatingCommand.Json json = new ImmutableSaveMeasurableRatingCommand.Json();

    // Act
    json.setRating('A');

    // Assert
    assertTrue(json.ratingIsSet);
    assertEquals('A', json.rating);
  }
}

