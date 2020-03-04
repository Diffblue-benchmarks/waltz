package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableLeveledEntityReferenceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLeveledEntityReference.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableLeveledEntityReference.Json actualJson = new ImmutableLeveledEntityReference.Json();

    // Assert
    assertNull(actualJson.entityReference);
    assertFalse(actualJson.levelIsSet);
    assertEquals(0, actualJson.level);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableLeveledEntityReference.copyOf(new ImmutableLeveledEntityReference.Json());
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLeveledEntityReference.Json()).entityReference();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLeveledEntityReference.fromJson(new ImmutableLeveledEntityReference.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableLeveledEntityReference.Builder builderResult = ImmutableLeveledEntityReference.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableLeveledEntityReference.Json());
  }
  @Test
  public void levelTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLeveledEntityReference.Json()).level();
  }
  @Test
  public void setEntityReferenceTest() {
    // Arrange
    ImmutableLeveledEntityReference.Json json = new ImmutableLeveledEntityReference.Json();
    ImmutableEntityReference.Json json1 = new ImmutableEntityReference.Json();

    // Act
    json.setEntityReference(json1);

    // Assert
    assertSame(json1, json.entityReference);
  }
  @Test
  public void setLevelTest() {
    // Arrange
    ImmutableLeveledEntityReference.Json json = new ImmutableLeveledEntityReference.Json();

    // Act
    json.setLevel(1);

    // Assert
    assertTrue(json.levelIsSet);
    assertEquals(1, json.level);
  }
}

