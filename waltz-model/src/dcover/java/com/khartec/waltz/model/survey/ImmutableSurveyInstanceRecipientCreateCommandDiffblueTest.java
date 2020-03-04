package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyInstanceRecipientCreateCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstanceRecipientCreateCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyInstanceRecipientCreateCommand.Json actualJson = new ImmutableSurveyInstanceRecipientCreateCommand.Json();

    // Assert
    assertNull(actualJson.personId);
    assertNull(actualJson.surveyInstanceId);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyInstanceRecipientCreateCommand.copyOf(new ImmutableSurveyInstanceRecipientCreateCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstanceRecipientCreateCommand.fromJson(new ImmutableSurveyInstanceRecipientCreateCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyInstanceRecipientCreateCommand.Builder builderResult = ImmutableSurveyInstanceRecipientCreateCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyInstanceRecipientCreateCommand.Json());
  }
  @Test
  public void personIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceRecipientCreateCommand.Json()).personId();
  }
  @Test
  public void setPersonIdTest() {
    // Arrange
    ImmutableSurveyInstanceRecipientCreateCommand.Json json = new ImmutableSurveyInstanceRecipientCreateCommand.Json();

    // Act
    json.setPersonId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.personId);
  }
  @Test
  public void setSurveyInstanceIdTest() {
    // Arrange
    ImmutableSurveyInstanceRecipientCreateCommand.Json json = new ImmutableSurveyInstanceRecipientCreateCommand.Json();

    // Act
    json.setSurveyInstanceId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.surveyInstanceId);
  }
  @Test
  public void surveyInstanceIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceRecipientCreateCommand.Json()).surveyInstanceId();
  }
}

