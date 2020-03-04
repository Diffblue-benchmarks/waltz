package com.khartec.waltz.model.complexity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableComplexityRatingDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableComplexityRating.builder().build();
  }

  @Test
  public void connectionComplexityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableComplexityRating.Json()).connectionComplexity();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableComplexityRating.Json actualJson = new ImmutableComplexityRating.Json();

    // Assert
    Optional<ComplexityScore> optional = actualJson.serverComplexity;
    assertSame(actualJson.measurableComplexity, optional);
    assertSame(optional, actualJson.connectionComplexity);
    assertSame(optional, actualJson.measurableComplexity);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableComplexityRating.copyOf(new ImmutableComplexityRating.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableComplexityRating.fromJson(new ImmutableComplexityRating.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableComplexityRating.Builder builderResult = ImmutableComplexityRating.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableComplexityRating.Json());
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableComplexityRating.Json()).id();
  }

  @Test
  public void measurableComplexityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableComplexityRating.Json()).measurableComplexity();
  }

  @Test
  public void overallScoreTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableComplexityRating.Json()).overallScore();
  }

  @Test
  public void serverComplexityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableComplexityRating.Json()).serverComplexity();
  }

  @Test
  public void setIdTest() {
    // Arrange
    ImmutableComplexityRating.Json json = new ImmutableComplexityRating.Json();

    // Act
    json.setId(123L);

    // Assert
    assertTrue(json.idIsSet);
    assertEquals(123L, json.id);
  }
}

