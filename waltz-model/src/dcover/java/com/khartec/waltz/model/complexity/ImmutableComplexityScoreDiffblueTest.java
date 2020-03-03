package com.khartec.waltz.model.complexity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableComplexityScoreDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromTest() {
    // Arrange
    ImmutableComplexityScore.Builder builderResult = ImmutableComplexityScore.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableComplexityScore.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableComplexityScore.builder().build();
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableComplexityScore.copyOf(new ImmutableComplexityScore.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableComplexityScore.fromJson(new ImmutableComplexityScore.Json());
  }

  @Test
  public void setKindTest() {
    // Arrange
    ImmutableComplexityScore.Json json = new ImmutableComplexityScore.Json();

    // Act
    json.setKind(ComplexityKind.CONNECTION);

    // Assert
    assertEquals(ComplexityKind.CONNECTION, json.kind);
  }

  @Test
  public void setScoreTest() {
    // Arrange
    ImmutableComplexityScore.Json json = new ImmutableComplexityScore.Json();

    // Act
    json.setScore(10.0);

    // Assert
    assertTrue(json.scoreIsSet);
    assertEquals(10.0, json.score, 0.0);
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableComplexityScore.Json()).id();
  }

  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableComplexityScore.Json()).kind();
  }

  @Test
  public void scoreTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableComplexityScore.Json()).score();
  }

  @Test
  public void setIdTest() {
    // Arrange
    ImmutableComplexityScore.Json json = new ImmutableComplexityScore.Json();

    // Act
    json.setId(123L);

    // Assert
    assertEquals(123L, json.id);
    assertTrue(json.idIsSet);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableComplexityScore.Json actualJson = new ImmutableComplexityScore.Json();

    // Assert
    assertEquals(0L, actualJson.id);
    assertFalse(actualJson.scoreIsSet);
    assertNull(actualJson.kind);
    assertEquals(0.0, actualJson.score, 0.0);
    assertFalse(actualJson.idIsSet);
  }
}

