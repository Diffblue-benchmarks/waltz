package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyInstanceRecipientDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstanceRecipient.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyInstanceRecipient.Json actualJson = new ImmutableSurveyInstanceRecipient.Json();

    // Assert
    assertNull(actualJson.person);
    assertNull(actualJson.surveyInstance);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyInstanceRecipient.copyOf(new ImmutableSurveyInstanceRecipient.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstanceRecipient.fromJson(new ImmutableSurveyInstanceRecipient.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyInstanceRecipient.Builder builderResult = ImmutableSurveyInstanceRecipient.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyInstance.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSurveyInstanceRecipient.Builder builderResult = ImmutableSurveyInstanceRecipient.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyInstanceRecipient.Json());
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceRecipient.Json()).id();
  }

  @Test
  public void personTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceRecipient.Json()).person();
  }

  @Test
  public void setSurveyInstanceTest() {
    // Arrange
    ImmutableSurveyInstanceRecipient.Json json = new ImmutableSurveyInstanceRecipient.Json();
    ImmutableSurveyInstance.Json json1 = new ImmutableSurveyInstance.Json();

    // Act
    json.setSurveyInstance(json1);

    // Assert
    assertSame(json1, json.surveyInstance);
  }

  @Test
  public void surveyInstanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceRecipient.Json()).surveyInstance();
  }
}

