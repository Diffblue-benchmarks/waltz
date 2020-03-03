package com.khartec.waltz.model.assessment_rating;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAssessmentRatingDetailDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAssessmentRatingDetail.Json actualJson = new ImmutableAssessmentRatingDetail.Json();

    // Assert
    assertNull(actualJson.assessmentRating);
    assertNull(actualJson.ratingDefinition);
  }
  @Test
  public void setAssessmentRatingTest() {
    // Arrange
    ImmutableAssessmentRatingDetail.Json json = new ImmutableAssessmentRatingDetail.Json();
    ImmutableAssessmentRating.Json json1 = new ImmutableAssessmentRating.Json();

    // Act
    json.setAssessmentRating(json1);

    // Assert
    assertSame(json1, json.assessmentRating);
  }
  @Test
  public void ratingDefinitionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentRatingDetail.Json()).ratingDefinition();
  }
  @Test
  public void assessmentRatingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentRatingDetail.Json()).assessmentRating();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAssessmentRatingDetail.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAssessmentRatingDetail.Builder builderResult = ImmutableAssessmentRatingDetail.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAssessmentRatingDetail.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAssessmentRatingDetail.fromJson(new ImmutableAssessmentRatingDetail.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAssessmentRatingDetail.copyOf(new ImmutableAssessmentRatingDetail.Json());
  }
}

