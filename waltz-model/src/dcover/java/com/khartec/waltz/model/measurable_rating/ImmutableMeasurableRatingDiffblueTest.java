package com.khartec.waltz.model.measurable_rating;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableMeasurableRatingDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurableRating.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableMeasurableRating.Json actualJson = new ImmutableMeasurableRating.Json();

    // Assert
    assertEquals('\u0000', actualJson.rating);
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.entityReference);
    assertEquals(0L, actualJson.measurableId);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.provenance);
    assertFalse(actualJson.ratingIsSet);
    assertFalse(actualJson.measurableIdIsSet);
    assertNull(actualJson.description);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableMeasurableRating.copyOf(new ImmutableMeasurableRating.Json());
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRating.Json()).description();
  }

  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRating.Json()).entityReference();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurableRating.fromJson(new ImmutableMeasurableRating.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableMeasurableRating.Builder builderResult = ImmutableMeasurableRating.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableMeasurableRating.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableMeasurableRating.Builder builderResult = ImmutableMeasurableRating.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableMeasurableRating.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableMeasurableRating.Builder builderResult = ImmutableMeasurableRating.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableMeasurableRating.Json());
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableMeasurableRating.Builder builderResult = ImmutableMeasurableRating.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableMeasurableRating.Json());
  }

  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRating.Json()).lastUpdatedAt();
  }

  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRating.Json()).lastUpdatedBy();
  }

  @Test
  public void measurableIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRating.Json()).measurableId();
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRating.Json()).provenance();
  }

  @Test
  public void ratingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRating.Json()).rating();
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableMeasurableRating.Json json = new ImmutableMeasurableRating.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableMeasurableRating.Json json = new ImmutableMeasurableRating.Json();

    // Act
    json.setLastUpdatedBy("lastUpdatedBy");

    // Assert
    assertEquals("lastUpdatedBy", json.lastUpdatedBy);
  }

  @Test
  public void setMeasurableIdTest() {
    // Arrange
    ImmutableMeasurableRating.Json json = new ImmutableMeasurableRating.Json();

    // Act
    json.setMeasurableId(123L);

    // Assert
    assertEquals(123L, json.measurableId);
    assertTrue(json.measurableIdIsSet);
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableMeasurableRating.Json json = new ImmutableMeasurableRating.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }

  @Test
  public void setRatingTest() {
    // Arrange
    ImmutableMeasurableRating.Json json = new ImmutableMeasurableRating.Json();

    // Act
    json.setRating('A');

    // Assert
    assertEquals('A', json.rating);
    assertTrue(json.ratingIsSet);
  }
}

