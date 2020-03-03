package com.khartec.waltz.model.entity_named_note;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import java.util.HashSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityNamedNodeTypeDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableEntityNamedNodeType.Builder builderResult = ImmutableEntityNamedNodeType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityNamedNodeType.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEntityNamedNodeType.Builder builderResult = ImmutableEntityNamedNodeType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableEntityNamedNodeType.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityNamedNodeType.builder().build();
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEntityNamedNodeType.Builder builderResult = ImmutableEntityNamedNodeType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableEntityNamedNodeType.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityNamedNodeType.Builder builderResult = ImmutableEntityNamedNodeType.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableEntityNamedNodeType.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityNamedNodeType.fromJson(new ImmutableEntityNamedNodeType.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityNamedNodeType.copyOf(new ImmutableEntityNamedNodeType.Json());
  }
  @Test
  public void applicableEntityKindsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNodeType.Json()).applicableEntityKinds();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNodeType.Json()).description();
  }
  @Test
  public void setIsReadOnlyTest() {
    // Arrange
    ImmutableEntityNamedNodeType.Json json = new ImmutableEntityNamedNodeType.Json();

    // Act
    json.setIsReadOnly(true);

    // Assert
    assertTrue(json.isReadOnly);
    assertTrue(json.isReadOnlyIsSet);
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNodeType.Json()).id();
  }
  @Test
  public void isReadOnlyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNodeType.Json()).isReadOnly();
  }
  @Test
  public void setPositionTest() {
    // Arrange
    ImmutableEntityNamedNodeType.Json json = new ImmutableEntityNamedNodeType.Json();

    // Act
    json.setPosition(1);

    // Assert
    assertTrue(json.positionIsSet);
    assertEquals(1, json.position);
  }
  @Test
  public void setApplicableEntityKindsTest() {
    // Arrange
    ImmutableEntityNamedNodeType.Json json = new ImmutableEntityNamedNodeType.Json();
    HashSet<EntityKind> entityKindSet = new HashSet<EntityKind>();
    entityKindSet.add(EntityKind.ACTOR);

    // Act
    json.setApplicableEntityKinds(entityKindSet);

    // Assert
    assertSame(entityKindSet, json.applicableEntityKinds);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableEntityNamedNodeType.Json json = new ImmutableEntityNamedNodeType.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNodeType.Json()).name();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableEntityNamedNodeType.Json json = new ImmutableEntityNamedNodeType.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableEntityNamedNodeType.Json()).applicableEntityKinds.size());
  }
  @Test
  public void positionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityNamedNodeType.Json()).position();
  }
}

