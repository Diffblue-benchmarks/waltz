package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyQuestionDropdownEntryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void valueTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionDropdownEntry.Json()).value();
  }
  @Test
  public void questionIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionDropdownEntry.Json()).questionId();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionDropdownEntry.Json()).id();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyQuestionDropdownEntry.Json actualJson = new ImmutableSurveyQuestionDropdownEntry.Json();

    // Assert
    assertSame(actualJson.questionId, actualJson.id);
  }
  @Test
  public void setValueTest() {
    // Arrange
    ImmutableSurveyQuestionDropdownEntry.Json json = new ImmutableSurveyQuestionDropdownEntry.Json();

    // Act
    json.setValue("value");

    // Assert
    assertEquals("value", json.value);
  }
  @Test
  public void positionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionDropdownEntry.Json()).position();
  }
  @Test
  public void setPositionTest() {
    // Arrange
    ImmutableSurveyQuestionDropdownEntry.Json json = new ImmutableSurveyQuestionDropdownEntry.Json();

    // Act
    json.setPosition(1);

    // Assert
    assertTrue(json.positionIsSet);
    assertEquals(1, json.position);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyQuestionDropdownEntry.copyOf(new ImmutableSurveyQuestionDropdownEntry.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyQuestionDropdownEntry.fromJson(new ImmutableSurveyQuestionDropdownEntry.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyQuestionDropdownEntry.builder().build();
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSurveyQuestionDropdownEntry.Builder builderResult = ImmutableSurveyQuestionDropdownEntry.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyInstance.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyQuestionDropdownEntry.Builder builderResult = ImmutableSurveyQuestionDropdownEntry.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyQuestionDropdownEntry.Json());
  }
}

