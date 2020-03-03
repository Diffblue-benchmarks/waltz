package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyInstanceQuestionResponseDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyInstanceQuestionResponse.Builder builderResult = ImmutableSurveyInstanceQuestionResponse.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyInstanceQuestionResponse.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstanceQuestionResponse.builder().build();
  }
  @Test
  public void setQuestionResponseTest() {
    // Arrange
    ImmutableSurveyInstanceQuestionResponse.Json json = new ImmutableSurveyInstanceQuestionResponse.Json();
    ImmutableSurveyQuestionResponse.Json json1 = new ImmutableSurveyQuestionResponse.Json();

    // Act
    json.setQuestionResponse(json1);

    // Assert
    assertSame(json1, json.questionResponse);
  }
  @Test
  public void setPersonIdTest() {
    // Arrange
    ImmutableSurveyInstanceQuestionResponse.Json json = new ImmutableSurveyInstanceQuestionResponse.Json();

    // Act
    json.setPersonId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.personId);
  }
  @Test
  public void questionResponseTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceQuestionResponse.Json()).questionResponse();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceQuestionResponse.Json()).lastUpdatedAt();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyInstanceQuestionResponse.Json actualJson = new ImmutableSurveyInstanceQuestionResponse.Json();

    // Assert
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.personId);
    assertNull(actualJson.surveyInstanceId);
    assertNull(actualJson.questionResponse);
  }
  @Test
  public void personIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceQuestionResponse.Json()).personId();
  }
  @Test
  public void surveyInstanceIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceQuestionResponse.Json()).surveyInstanceId();
  }
  @Test
  public void setSurveyInstanceIdTest() {
    // Arrange
    ImmutableSurveyInstanceQuestionResponse.Json json = new ImmutableSurveyInstanceQuestionResponse.Json();

    // Act
    json.setSurveyInstanceId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.surveyInstanceId);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstanceQuestionResponse.fromJson(new ImmutableSurveyInstanceQuestionResponse.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyInstanceQuestionResponse.copyOf(new ImmutableSurveyInstanceQuestionResponse.Json());
  }
}

