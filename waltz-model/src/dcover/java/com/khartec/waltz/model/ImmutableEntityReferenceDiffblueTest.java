package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityReferenceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEntityReference.Builder builderResult = ImmutableEntityReference.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableEntityReference.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEntityReference.Builder builderResult = ImmutableEntityReference.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityReference.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityReference.Builder builderResult = ImmutableEntityReference.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityLifecycleStatusProvider) new ImmutableEntityReference.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityReference.builder().build();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityReference.Json()).id();
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityReference.Json()).kind();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityReference.Json()).name();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableEntityReference.Json json = new ImmutableEntityReference.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityReference.Json()).description();
  }
  @Test
  public void setIdTest() {
    // Arrange
    ImmutableEntityReference.Json json = new ImmutableEntityReference.Json();

    // Act
    json.setId(123L);

    // Assert
    assertTrue(json.idIsSet);
    assertEquals(123L, json.id);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityReference.Json actualJson = new ImmutableEntityReference.Json();

    // Assert
    assertFalse(actualJson.idIsSet);
    assertNull(actualJson.description);
    assertEquals(0L, actualJson.id);
    assertNull(actualJson.kind);
    assertNull(actualJson.entityLifecycleStatus);
  }
  @Test
  public void entityLifecycleStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityReference.Json()).entityLifecycleStatus();
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableEntityReference.Json json = new ImmutableEntityReference.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setEntityLifecycleStatusTest() {
    // Arrange
    ImmutableEntityReference.Json json = new ImmutableEntityReference.Json();

    // Act
    json.setEntityLifecycleStatus(EntityLifecycleStatus.ACTIVE);

    // Assert
    assertEquals(EntityLifecycleStatus.ACTIVE, json.entityLifecycleStatus);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityReference.fromJson(new ImmutableEntityReference.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityReference.copyOf(new ImmutableEntityReference.Json());
  }
}

