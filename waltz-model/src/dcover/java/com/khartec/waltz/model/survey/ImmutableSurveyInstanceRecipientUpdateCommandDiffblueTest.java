package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyInstanceRecipientUpdateCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyInstanceRecipientUpdateCommand.copyOf(new ImmutableSurveyInstanceRecipientUpdateCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstanceRecipientUpdateCommand.fromJson(new ImmutableSurveyInstanceRecipientUpdateCommand.Json());
  }
  @Test
  public void setPersonIdTest() {
    // Arrange
    ImmutableSurveyInstanceRecipientUpdateCommand.Json json = new ImmutableSurveyInstanceRecipientUpdateCommand.Json();

    // Act
    json.setPersonId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.personId);
  }
  @Test
  public void instanceRecipientIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceRecipientUpdateCommand.Json()).instanceRecipientId();
  }
  @Test
  public void setInstanceRecipientIdTest() {
    // Arrange
    ImmutableSurveyInstanceRecipientUpdateCommand.Json json = new ImmutableSurveyInstanceRecipientUpdateCommand.Json();

    // Act
    json.setInstanceRecipientId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.instanceRecipientId);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyInstanceRecipientUpdateCommand.Json actualJson = new ImmutableSurveyInstanceRecipientUpdateCommand.Json();

    // Assert
    assertNull(actualJson.instanceRecipientId);
    assertNull(actualJson.surveyInstanceId);
    assertNull(actualJson.personId);
  }
  @Test
  public void personIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceRecipientUpdateCommand.Json()).personId();
  }
  @Test
  public void surveyInstanceIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceRecipientUpdateCommand.Json()).surveyInstanceId();
  }
  @Test
  public void setSurveyInstanceIdTest() {
    // Arrange
    ImmutableSurveyInstanceRecipientUpdateCommand.Json json = new ImmutableSurveyInstanceRecipientUpdateCommand.Json();

    // Act
    json.setSurveyInstanceId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.surveyInstanceId);
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyInstanceRecipientUpdateCommand.Builder builderResult = ImmutableSurveyInstanceRecipientUpdateCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyInstanceRecipientUpdateCommand.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstanceRecipientUpdateCommand.builder().build();
  }
}

