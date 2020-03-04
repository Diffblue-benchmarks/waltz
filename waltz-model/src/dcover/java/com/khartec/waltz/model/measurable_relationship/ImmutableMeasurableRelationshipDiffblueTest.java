package com.khartec.waltz.model.measurable_relationship;

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

public class ImmutableMeasurableRelationshipDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurableRelationship.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableMeasurableRelationship.Json actualJson = new ImmutableMeasurableRelationship.Json();

    // Assert
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.relationshipKind);
    assertFalse(actualJson.measurableBIsSet);
    assertNull(actualJson.description);
    assertEquals(0L, actualJson.measurableB);
    assertEquals(0L, actualJson.measurableA);
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.provenance);
    assertFalse(actualJson.measurableAIsSet);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableMeasurableRelationship.copyOf(new ImmutableMeasurableRelationship.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRelationship.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableMeasurableRelationship.fromJson(new ImmutableMeasurableRelationship.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableMeasurableRelationship.Builder builderResult = ImmutableMeasurableRelationship.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableMeasurableRelationship.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableMeasurableRelationship.Builder builderResult = ImmutableMeasurableRelationship.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableMeasurableRelationship.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableMeasurableRelationship.Builder builderResult = ImmutableMeasurableRelationship.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableMeasurableRelationship.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableMeasurableRelationship.Builder builderResult = ImmutableMeasurableRelationship.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableMeasurableRelationship.Json());
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRelationship.Json()).lastUpdatedAt();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRelationship.Json()).lastUpdatedBy();
  }
  @Test
  public void measurableATest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRelationship.Json()).measurableA();
  }
  @Test
  public void measurableBTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRelationship.Json()).measurableB();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRelationship.Json()).provenance();
  }
  @Test
  public void relationshipKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableMeasurableRelationship.Json()).relationshipKind();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableMeasurableRelationship.Json json = new ImmutableMeasurableRelationship.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableMeasurableRelationship.Json json = new ImmutableMeasurableRelationship.Json();

    // Act
    json.setLastUpdatedBy("lastUpdatedBy");

    // Assert
    assertEquals("lastUpdatedBy", json.lastUpdatedBy);
  }
  @Test
  public void setMeasurableATest() {
    // Arrange
    ImmutableMeasurableRelationship.Json json = new ImmutableMeasurableRelationship.Json();

    // Act
    json.setMeasurableA(1L);

    // Assert
    assertEquals(1L, json.measurableA);
    assertTrue(json.measurableAIsSet);
  }
  @Test
  public void setMeasurableBTest() {
    // Arrange
    ImmutableMeasurableRelationship.Json json = new ImmutableMeasurableRelationship.Json();

    // Act
    json.setMeasurableB(1L);

    // Assert
    assertTrue(json.measurableBIsSet);
    assertEquals(1L, json.measurableB);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableMeasurableRelationship.Json json = new ImmutableMeasurableRelationship.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
  @Test
  public void setRelationshipKindTest() {
    // Arrange
    ImmutableMeasurableRelationship.Json json = new ImmutableMeasurableRelationship.Json();

    // Act
    json.setRelationshipKind(MeasurableRelationshipKind.WEAKLY_RELATES_TO);

    // Assert
    assertEquals(MeasurableRelationshipKind.WEAKLY_RELATES_TO, json.relationshipKind);
  }
}

