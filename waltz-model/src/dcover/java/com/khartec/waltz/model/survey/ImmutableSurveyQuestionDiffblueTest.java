package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.ExternalIdProvider;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyQuestionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyQuestion.copyOf(new ImmutableSurveyQuestion.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyQuestion.fromJson(new ImmutableSurveyQuestion.Json());
  }
  @Test
  public void questionTextTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestion.Json()).questionText();
  }
  @Test
  public void setFieldTypeTest() {
    // Arrange
    ImmutableSurveyQuestion.Json json = new ImmutableSurveyQuestion.Json();

    // Act
    json.setFieldType(SurveyQuestionFieldType.APPLICATION);

    // Assert
    assertEquals(SurveyQuestionFieldType.APPLICATION, json.fieldType);
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestion.Json()).id();
  }
  @Test
  public void setQuestionTextTest() {
    // Arrange
    ImmutableSurveyQuestion.Json json = new ImmutableSurveyQuestion.Json();

    // Act
    json.setQuestionText("foo");

    // Assert
    assertEquals("foo", json.questionText);
  }
  @Test
  public void helpTextTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestion.Json()).helpText();
  }
  @Test
  public void surveyTemplateIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestion.Json()).surveyTemplateId();
  }
  @Test
  public void sectionNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestion.Json()).sectionName();
  }
  @Test
  public void allowCommentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestion.Json()).allowComment();
  }
  @Test
  public void setIsMandatoryTest() {
    // Arrange
    ImmutableSurveyQuestion.Json json = new ImmutableSurveyQuestion.Json();

    // Act
    json.setIsMandatory(true);

    // Assert
    assertTrue(json.isMandatory);
    assertTrue(json.isMandatoryIsSet);
  }
  @Test
  public void setSurveyTemplateIdTest() {
    // Arrange
    ImmutableSurveyQuestion.Json json = new ImmutableSurveyQuestion.Json();

    // Act
    json.setSurveyTemplateId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.surveyTemplateId);
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestion.Json()).externalId();
  }
  @Test
  public void isMandatoryTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestion.Json()).isMandatory();
  }
  @Test
  public void setPositionTest() {
    // Arrange
    ImmutableSurveyQuestion.Json json = new ImmutableSurveyQuestion.Json();

    // Act
    json.setPosition(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), json.position);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyQuestion.Json actualJson = new ImmutableSurveyQuestion.Json();

    // Assert
    Optional<String> optional = actualJson.helpText;
    assertSame(optional, actualJson.sectionName);
    assertSame(optional, actualJson.id);
    assertSame(optional, actualJson.externalId);
  }
  @Test
  public void positionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestion.Json()).position();
  }
  @Test
  public void setAllowCommentTest() {
    // Arrange
    ImmutableSurveyQuestion.Json json = new ImmutableSurveyQuestion.Json();

    // Act
    json.setAllowComment(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), json.allowComment);
  }
  @Test
  public void fieldTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestion.Json()).fieldType();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyQuestion.builder().build();
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableSurveyQuestion.Builder builderResult = ImmutableSurveyQuestion.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyInstance.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSurveyQuestion.Builder builderResult = ImmutableSurveyQuestion.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableSurveyQuestion.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyQuestion.Builder builderResult = ImmutableSurveyQuestion.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyQuestion.Json());
  }
}

