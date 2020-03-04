package com.khartec.waltz.model.measurable_rating_planned_decommission;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.CreatedProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableMeasurableRatingPlannedDecommissionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurableRatingPlannedDecommission.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableMeasurableRatingPlannedDecommission.Json actualJson = new ImmutableMeasurableRatingPlannedDecommission.Json();

    // Assert
    assertNull(actualJson.id);
    assertNull(actualJson.plannedDecommissionDate);
    assertNull(actualJson.measurableId);
    assertNull(actualJson.createdAt);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.createdBy);
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.entityReference);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableMeasurableRatingPlannedDecommission.copyOf(new ImmutableMeasurableRatingPlannedDecommission.Json());
  }
  @Test
  public void createdAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingPlannedDecommission.Json()).createdAt();
  }
  @Test
  public void createdByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingPlannedDecommission.Json()).createdBy();
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingPlannedDecommission.Json()).entityReference();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurableRatingPlannedDecommission.fromJson(new ImmutableMeasurableRatingPlannedDecommission.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableMeasurableRatingPlannedDecommission.Builder builderResult = ImmutableMeasurableRatingPlannedDecommission
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableMeasurableRatingPlannedDecommission.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableMeasurableRatingPlannedDecommission.Builder builderResult = ImmutableMeasurableRatingPlannedDecommission
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CreatedProvider) new ImmutableMeasurableRatingPlannedDecommission.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableMeasurableRatingPlannedDecommission.Builder builderResult = ImmutableMeasurableRatingPlannedDecommission
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableMeasurableRatingPlannedDecommission.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingPlannedDecommission.Json()).id();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingPlannedDecommission.Json()).lastUpdatedAt();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingPlannedDecommission.Json()).lastUpdatedBy();
  }
  @Test
  public void measurableIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingPlannedDecommission.Json()).measurableId();
  }
  @Test
  public void plannedDecommissionDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRatingPlannedDecommission.Json()).plannedDecommissionDate();
  }
  @Test
  public void setCreatedByTest() {
    // Arrange
    ImmutableMeasurableRatingPlannedDecommission.Json json = new ImmutableMeasurableRatingPlannedDecommission.Json();

    // Act
    json.setCreatedBy("createdBy");

    // Assert
    assertEquals("createdBy", json.createdBy);
  }
  @Test
  public void setIdTest() {
    // Arrange
    ImmutableMeasurableRatingPlannedDecommission.Json json = new ImmutableMeasurableRatingPlannedDecommission.Json();

    // Act
    json.setId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.id);
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableMeasurableRatingPlannedDecommission.Json json = new ImmutableMeasurableRatingPlannedDecommission.Json();

    // Act
    json.setLastUpdatedBy("lastUpdatedBy");

    // Assert
    assertEquals("lastUpdatedBy", json.lastUpdatedBy);
  }
  @Test
  public void setMeasurableIdTest() {
    // Arrange
    ImmutableMeasurableRatingPlannedDecommission.Json json = new ImmutableMeasurableRatingPlannedDecommission.Json();

    // Act
    json.setMeasurableId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.measurableId);
  }
}

