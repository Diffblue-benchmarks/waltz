package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyInstanceCreateCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstanceCreateCommand.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyInstanceCreateCommand.Json actualJson = new ImmutableSurveyInstanceCreateCommand.Json();

    // Assert
    assertNull(actualJson.surveyRunId);
    assertNull(actualJson.status);
    assertNull(actualJson.entityReference);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyInstanceCreateCommand.copyOf(new ImmutableSurveyInstanceCreateCommand.Json());
  }

  @Test
  public void dueDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceCreateCommand.Json()).dueDate();
  }

  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceCreateCommand.Json()).entityReference();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstanceCreateCommand.fromJson(new ImmutableSurveyInstanceCreateCommand.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyInstanceCreateCommand.Builder builderResult = ImmutableSurveyInstanceCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyInstanceCreateCommand.Json());
  }

  @Test
  public void setStatusTest() {
    // Arrange
    ImmutableSurveyInstanceCreateCommand.Json json = new ImmutableSurveyInstanceCreateCommand.Json();

    // Act
    json.setStatus(SurveyInstanceStatus.NOT_STARTED);

    // Assert
    assertEquals(SurveyInstanceStatus.NOT_STARTED, json.status);
  }

  @Test
  public void setSurveyRunIdTest() {
    // Arrange
    ImmutableSurveyInstanceCreateCommand.Json json = new ImmutableSurveyInstanceCreateCommand.Json();

    // Act
    json.setSurveyRunId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.surveyRunId);
  }

  @Test
  public void statusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceCreateCommand.Json()).status();
  }

  @Test
  public void surveyRunIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceCreateCommand.Json()).surveyRunId();
  }
}

