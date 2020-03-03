package com.khartec.waltz.model.entity_relationship;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityRelationshipDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityRelationship.builder().build();
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableEntityRelationship.Builder builderResult = ImmutableEntityRelationship.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableEntityRelationship.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEntityRelationship.Builder builderResult = ImmutableEntityRelationship.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableEntityRelationship.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEntityRelationship.Builder builderResult = ImmutableEntityRelationship.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityRelationship.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityRelationship.Builder builderResult = ImmutableEntityRelationship.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableEntityRelationship.Json());
  }
  @Test
  public void aTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityRelationship.Json()).a();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableEntityRelationship.Json json = new ImmutableEntityRelationship.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void bTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityRelationship.Json()).b();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityRelationship.Json()).description();
  }
  @Test
  public void setRelationshipTest() {
    // Arrange
    ImmutableEntityRelationship.Json json = new ImmutableEntityRelationship.Json();

    // Act
    json.setRelationship(RelationshipKind.HAS);

    // Assert
    assertEquals(RelationshipKind.HAS, json.relationship);
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityRelationship.Json()).lastUpdatedBy();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityRelationship.Json()).provenance();
  }
  @Test
  public void relationshipTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityRelationship.Json()).relationship();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableEntityRelationship.Json json = new ImmutableEntityRelationship.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityRelationship.Json()).lastUpdatedAt();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityRelationship.Json actualJson = new ImmutableEntityRelationship.Json();

    // Assert
    assertNull(actualJson.relationship);
    assertNull(actualJson.b);
    assertNull(actualJson.provenance);
    assertNull(actualJson.a);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.description);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableEntityRelationship.Json json = new ImmutableEntityRelationship.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityRelationship.fromJson(new ImmutableEntityRelationship.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityRelationship.copyOf(new ImmutableEntityRelationship.Json());
  }
}

