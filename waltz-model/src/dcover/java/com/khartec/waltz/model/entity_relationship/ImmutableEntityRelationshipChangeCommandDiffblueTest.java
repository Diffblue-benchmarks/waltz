package com.khartec.waltz.model.entity_relationship;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.Operation;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityRelationshipChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void relationshipTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityRelationshipChangeCommand.Json()).relationship();
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityRelationshipChangeCommand.Json()).entityReference();
  }
  @Test
  public void setRelationshipTest() {
    // Arrange
    ImmutableEntityRelationshipChangeCommand.Json json = new ImmutableEntityRelationshipChangeCommand.Json();

    // Act
    json.setRelationship(RelationshipKind.HAS);

    // Assert
    assertEquals(RelationshipKind.HAS, json.relationship);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityRelationshipChangeCommand.Json actualJson = new ImmutableEntityRelationshipChangeCommand.Json();

    // Assert
    assertNull(actualJson.entityReference);
    assertNull(actualJson.relationship);
    assertNull(actualJson.operation);
  }
  @Test
  public void operationTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityRelationshipChangeCommand.Json()).operation();
  }
  @Test
  public void setOperationTest() {
    // Arrange
    ImmutableEntityRelationshipChangeCommand.Json json = new ImmutableEntityRelationshipChangeCommand.Json();

    // Act
    json.setOperation(Operation.ADD);

    // Assert
    assertEquals(Operation.ADD, json.operation);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityRelationshipChangeCommand.copyOf(new ImmutableEntityRelationshipChangeCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityRelationshipChangeCommand.fromJson(new ImmutableEntityRelationshipChangeCommand.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityRelationshipChangeCommand.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityRelationshipChangeCommand.Builder builderResult = ImmutableEntityRelationshipChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityRelationshipChangeCommand.Json());
  }
}

