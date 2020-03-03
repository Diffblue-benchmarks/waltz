package com.khartec.waltz.model.measurable_rating_replacement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.CreatedProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableMeasurableRatingReplacementDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurableRatingReplacement.fromJson(new ImmutableMeasurableRatingReplacement.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableMeasurableRatingReplacement.copyOf(new ImmutableMeasurableRatingReplacement.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableMeasurableRatingReplacement.Builder builderResult = ImmutableMeasurableRatingReplacement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CreatedProvider) new ImmutableMeasurableRatingReplacement.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableMeasurableRatingReplacement.Builder builderResult = ImmutableMeasurableRatingReplacement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableMeasurableRatingReplacement.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableMeasurableRatingReplacement.Builder builderResult = ImmutableMeasurableRatingReplacement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableMeasurableRatingReplacement.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurableRatingReplacement.builder().build();
  }
  @Test
  public void createdByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingReplacement.Json()).createdBy();
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingReplacement.Json()).entityReference();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableMeasurableRatingReplacement.Json json = new ImmutableMeasurableRatingReplacement.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void createdAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingReplacement.Json()).createdAt();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingReplacement.Json()).lastUpdatedBy();
  }
  @Test
  public void setDecommissionIdTest() {
    // Arrange
    ImmutableMeasurableRatingReplacement.Json json = new ImmutableMeasurableRatingReplacement.Json();

    // Act
    json.setDecommissionId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.decommissionId);
  }
  @Test
  public void setCreatedByTest() {
    // Arrange
    ImmutableMeasurableRatingReplacement.Json json = new ImmutableMeasurableRatingReplacement.Json();

    // Act
    json.setCreatedBy("foo");

    // Assert
    assertEquals("foo", json.createdBy);
  }
  @Test
  public void setIdTest() {
    // Arrange
    ImmutableMeasurableRatingReplacement.Json json = new ImmutableMeasurableRatingReplacement.Json();

    // Act
    json.setId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.id);
  }
  @Test
  public void decommissionIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingReplacement.Json()).decommissionId();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingReplacement.Json()).lastUpdatedAt();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableMeasurableRatingReplacement.Json actualJson = new ImmutableMeasurableRatingReplacement.Json();

    // Assert
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.id);
    assertNull(actualJson.decommissionId);
    assertNull(actualJson.createdAt);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.entityReference);
    assertNull(actualJson.plannedCommissionDate);
    assertNull(actualJson.createdBy);
  }
  @Test
  public void plannedCommissionDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingReplacement.Json()).plannedCommissionDate();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingReplacement.Json()).id();
  }
}

