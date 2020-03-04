package com.khartec.waltz.model.entity_relationship;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableUpdateEntityRelationshipParamsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUpdateEntityRelationshipParams.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableUpdateEntityRelationshipParams.Json actualJson = new ImmutableUpdateEntityRelationshipParams.Json();

    // Assert
    assertNull(actualJson.relationshipKind);
    assertNull(actualJson.description);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableUpdateEntityRelationshipParams.copyOf(new ImmutableUpdateEntityRelationshipParams.Json());
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdateEntityRelationshipParams.Json()).description();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUpdateEntityRelationshipParams.fromJson(new ImmutableUpdateEntityRelationshipParams.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableUpdateEntityRelationshipParams.Builder builderResult = ImmutableUpdateEntityRelationshipParams.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityRelationship.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableUpdateEntityRelationshipParams.Builder builderResult = ImmutableUpdateEntityRelationshipParams.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableUpdateEntityRelationshipParams.Json());
  }

  @Test
  public void relationshipKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUpdateEntityRelationshipParams.Json()).relationshipKind();
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableUpdateEntityRelationshipParams.Json json = new ImmutableUpdateEntityRelationshipParams.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void setRelationshipKindTest() {
    // Arrange
    ImmutableUpdateEntityRelationshipParams.Json json = new ImmutableUpdateEntityRelationshipParams.Json();

    // Act
    json.setRelationshipKind(RelationshipKind.HAS);

    // Assert
    assertEquals(RelationshipKind.HAS, json.relationshipKind);
  }
}

