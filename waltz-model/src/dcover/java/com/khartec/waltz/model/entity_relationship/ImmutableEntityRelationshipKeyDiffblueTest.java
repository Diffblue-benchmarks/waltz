package com.khartec.waltz.model.entity_relationship;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityRelationshipKeyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void aTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityRelationshipKey.Json()).a();
  }
  @Test
  public void bTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityRelationshipKey.Json()).b();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityRelationshipKey.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityRelationshipKey.Json actualJson = new ImmutableEntityRelationshipKey.Json();

    // Assert
    assertNull(actualJson.b);
    assertNull(actualJson.relationshipKind);
    assertNull(actualJson.a);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityRelationshipKey.copyOf(new ImmutableEntityRelationshipKey.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityRelationshipKey.fromJson(new ImmutableEntityRelationshipKey.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityRelationshipKey.Builder builderResult = ImmutableEntityRelationshipKey.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityRelationshipKey.Json());
  }
  @Test
  public void relationshipKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityRelationshipKey.Json()).relationshipKind();
  }
  @Test
  public void setRelationshipKindTest() {
    // Arrange
    ImmutableEntityRelationshipKey.Json json = new ImmutableEntityRelationshipKey.Json();

    // Act
    json.setRelationshipKind(RelationshipKind.HAS);

    // Assert
    assertEquals(RelationshipKind.HAS, json.relationshipKind);
  }
}

