package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.EntityReference;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyQuestionResponseDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyQuestionResponse.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyQuestionResponse.Builder builderResult = ImmutableSurveyQuestionResponse.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyQuestionResponse.Json());
  }
  @Test
  public void questionIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionResponse.Json()).questionId();
  }
  @Test
  public void numberResponseTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionResponse.Json()).numberResponse();
  }
  @Test
  public void booleanResponseTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionResponse.Json()).booleanResponse();
  }
  @Test
  public void dateResponseTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionResponse.Json()).dateResponse();
  }
  @Test
  public void listResponseTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionResponse.Json()).listResponse();
  }
  @Test
  public void setQuestionIdTest() {
    // Arrange
    ImmutableSurveyQuestionResponse.Json json = new ImmutableSurveyQuestionResponse.Json();

    // Act
    json.setQuestionId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.questionId);
  }
  @Test
  public void stringResponseTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionResponse.Json()).stringResponse();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyQuestionResponse.Json actualJson = new ImmutableSurveyQuestionResponse.Json();

    // Assert
    Optional<EntityReference> optional = actualJson.entityResponse;
    assertSame(actualJson.stringResponse, optional);
    assertSame(optional, actualJson.stringResponse);
    assertSame(optional, actualJson.listResponse);
    assertSame(optional, actualJson.booleanResponse);
    assertSame(optional, actualJson.numberResponse);
    assertSame(optional, actualJson.dateResponse);
    assertSame(optional, actualJson.comment);
  }
  @Test
  public void commentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionResponse.Json()).comment();
  }
  @Test
  public void entityResponseTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyQuestionResponse.Json()).entityResponse();
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyQuestionResponse.copyOf(new ImmutableSurveyQuestionResponse.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyQuestionResponse.fromJson(new ImmutableSurveyQuestionResponse.Json());
  }
}

