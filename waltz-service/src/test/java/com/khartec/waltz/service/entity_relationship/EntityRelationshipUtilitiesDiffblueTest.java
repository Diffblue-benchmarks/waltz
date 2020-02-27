package com.khartec.waltz.service.entity_relationship;

import com.khartec.waltz.model.entity_relationship.RelationshipKind;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EntityRelationshipUtilitiesDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void mkEntityRelationshipKeyTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    EntityRelationshipUtilities.mkEntityRelationshipKey(null, null, RelationshipKind.HAS, true);
  }
}

