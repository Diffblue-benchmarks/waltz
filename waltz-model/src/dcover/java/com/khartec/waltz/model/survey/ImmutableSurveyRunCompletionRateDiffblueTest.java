package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyRunCompletionRateDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyRunCompletionRate.builder().build();
  }

  @Test
  public void completedCountTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunCompletionRate.Json()).completedCount();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyRunCompletionRate.Json actualJson = new ImmutableSurveyRunCompletionRate.Json();

    // Assert
    assertFalse(actualJson.inProgressCountIsSet);
    assertFalse(actualJson.surveyRunIdIsSet);
    assertEquals(0L, actualJson.surveyRunId);
    assertEquals(0, actualJson.inProgressCount);
    assertFalse(actualJson.notStartedCountIsSet);
    assertEquals(0, actualJson.completedCount);
    assertEquals(0, actualJson.notStartedCount);
    assertFalse(actualJson.completedCountIsSet);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyRunCompletionRate.copyOf(new ImmutableSurveyRunCompletionRate.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyRunCompletionRate.fromJson(new ImmutableSurveyRunCompletionRate.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyRunCompletionRate.Builder builderResult = ImmutableSurveyRunCompletionRate.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyRunCompletionRate.Json());
  }

  @Test
  public void inProgressCountTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunCompletionRate.Json()).inProgressCount();
  }

  @Test
  public void notStartedCountTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunCompletionRate.Json()).notStartedCount();
  }

  @Test
  public void setCompletedCountTest() {
    // Arrange
    ImmutableSurveyRunCompletionRate.Json json = new ImmutableSurveyRunCompletionRate.Json();

    // Act
    json.setCompletedCount(3);

    // Assert
    assertEquals(3, json.completedCount);
    assertTrue(json.completedCountIsSet);
  }

  @Test
  public void setInProgressCountTest() {
    // Arrange
    ImmutableSurveyRunCompletionRate.Json json = new ImmutableSurveyRunCompletionRate.Json();

    // Act
    json.setInProgressCount(3);

    // Assert
    assertTrue(json.inProgressCountIsSet);
    assertEquals(3, json.inProgressCount);
  }

  @Test
  public void setNotStartedCountTest() {
    // Arrange
    ImmutableSurveyRunCompletionRate.Json json = new ImmutableSurveyRunCompletionRate.Json();

    // Act
    json.setNotStartedCount(3);

    // Assert
    assertTrue(json.notStartedCountIsSet);
    assertEquals(3, json.notStartedCount);
  }

  @Test
  public void setSurveyRunIdTest() {
    // Arrange
    ImmutableSurveyRunCompletionRate.Json json = new ImmutableSurveyRunCompletionRate.Json();

    // Act
    json.setSurveyRunId(123L);

    // Assert
    assertTrue(json.surveyRunIdIsSet);
    assertEquals(123L, json.surveyRunId);
  }

  @Test
  public void surveyRunIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunCompletionRate.Json()).surveyRunId();
  }

  @Test
  public void totalCountTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunCompletionRate.Json()).totalCount();
  }
}

