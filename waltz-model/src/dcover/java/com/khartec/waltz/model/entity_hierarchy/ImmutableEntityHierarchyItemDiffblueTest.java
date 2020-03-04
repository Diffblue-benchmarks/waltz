package com.khartec.waltz.model.entity_hierarchy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LevelProvider;
import com.khartec.waltz.model.ParentIdProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityHierarchyItemDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityHierarchyItem.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityHierarchyItem.Json actualJson = new ImmutableEntityHierarchyItem.Json();

    // Assert
    assertSame(actualJson.id, actualJson.parentId);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityHierarchyItem.copyOf(new ImmutableEntityHierarchyItem.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityHierarchyItem.fromJson(new ImmutableEntityHierarchyItem.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityHierarchyItem.Builder builderResult = ImmutableEntityHierarchyItem.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ParentIdProvider) new ImmutableEntityHierarchyItem.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEntityHierarchyItem.Builder builderResult = ImmutableEntityHierarchyItem.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LevelProvider) new ImmutableEntityHierarchyItem.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEntityHierarchyItem.Builder builderResult = ImmutableEntityHierarchyItem.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityHierarchyItem.Json());
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableEntityHierarchyItem.Builder builderResult = ImmutableEntityHierarchyItem.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableEntityHierarchyItem.Json());
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityHierarchyItem.Json()).id();
  }

  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityHierarchyItem.Json()).kind();
  }

  @Test
  public void levelTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityHierarchyItem.Json()).level();
  }

  @Test
  public void parentIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityHierarchyItem.Json()).parentId();
  }

  @Test
  public void setKindTest() {
    // Arrange
    ImmutableEntityHierarchyItem.Json json = new ImmutableEntityHierarchyItem.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }

  @Test
  public void setLevelTest() {
    // Arrange
    ImmutableEntityHierarchyItem.Json json = new ImmutableEntityHierarchyItem.Json();

    // Act
    json.setLevel(1);

    // Assert
    assertEquals(1, json.level);
    assertTrue(json.levelIsSet);
  }
}

