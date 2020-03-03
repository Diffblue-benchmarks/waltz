package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyRunWithOwnerAndStatsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyRunWithOwnerAndStats.copyOf(new ImmutableSurveyRunWithOwnerAndStats.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyRunWithOwnerAndStats.fromJson(new ImmutableSurveyRunWithOwnerAndStats.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyRunWithOwnerAndStats.Builder builderResult = ImmutableSurveyRunWithOwnerAndStats.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyRunWithOwnerAndStats.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyRunWithOwnerAndStats.builder().build();
  }
  @Test
  public void setSurveyRunTest() {
    // Arrange
    ImmutableSurveyRunWithOwnerAndStats.Json json = new ImmutableSurveyRunWithOwnerAndStats.Json();
    ImmutableSurveyRun.Json json1 = new ImmutableSurveyRun.Json();

    // Act
    json.setSurveyRun(json1);

    // Assert
    assertSame(json1, json.surveyRun);
  }
  @Test
  public void ownerTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunWithOwnerAndStats.Json()).owner();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyRunWithOwnerAndStats.Json actualJson = new ImmutableSurveyRunWithOwnerAndStats.Json();

    // Assert
    assertNull(actualJson.completionRateStats);
    assertNull(actualJson.owner);
    assertNull(actualJson.surveyRun);
  }
  @Test
  public void surveyRunTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunWithOwnerAndStats.Json()).surveyRun();
  }
  @Test
  public void setCompletionRateStatsTest() {
    // Arrange
    ImmutableSurveyRunWithOwnerAndStats.Json json = new ImmutableSurveyRunWithOwnerAndStats.Json();
    ImmutableSurveyRunCompletionRate.Json json1 = new ImmutableSurveyRunCompletionRate.Json();

    // Act
    json.setCompletionRateStats(json1);

    // Assert
    assertSame(json1, json.completionRateStats);
  }
  @Test
  public void completionRateStatsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunWithOwnerAndStats.Json()).completionRateStats();
  }
}

