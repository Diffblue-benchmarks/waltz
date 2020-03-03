package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.IdProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyInstanceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstance.builder().build();
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSurveyInstance.Builder builderResult = ImmutableSurveyInstance.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableSurveyInstance.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyInstance.Builder builderResult = ImmutableSurveyInstance.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyInstance.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstance.fromJson(new ImmutableSurveyInstance.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyInstance.copyOf(new ImmutableSurveyInstance.Json());
  }
  @Test
  public void surveyEntityExternalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstance.Json()).surveyEntityExternalId();
  }
  @Test
  public void dueDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstance.Json()).dueDate();
  }
  @Test
  public void setSurveyRunIdTest() {
    // Arrange
    ImmutableSurveyInstance.Json json = new ImmutableSurveyInstance.Json();

    // Act
    json.setSurveyRunId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.surveyRunId);
  }
  @Test
  public void originalInstanceIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstance.Json()).originalInstanceId();
  }
  @Test
  public void submittedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstance.Json()).submittedBy();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstance.Json()).id();
  }
  @Test
  public void surveyEntityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstance.Json()).surveyEntity();
  }
  @Test
  public void setSubmittedByTest() {
    // Arrange
    ImmutableSurveyInstance.Json json = new ImmutableSurveyInstance.Json();

    // Act
    json.setSubmittedBy("foo");

    // Assert
    assertEquals("foo", json.submittedBy);
  }
  @Test
  public void setSurveyEntityExternalIdTest() {
    // Arrange
    ImmutableSurveyInstance.Json json = new ImmutableSurveyInstance.Json();

    // Act
    json.setSurveyEntityExternalId("123");

    // Assert
    assertEquals("123", json.surveyEntityExternalId);
  }
  @Test
  public void setStatusTest() {
    // Arrange
    ImmutableSurveyInstance.Json json = new ImmutableSurveyInstance.Json();

    // Act
    json.setStatus(SurveyInstanceStatus.NOT_STARTED);

    // Assert
    assertEquals(SurveyInstanceStatus.NOT_STARTED, json.status);
  }
  @Test
  public void setApprovedByTest() {
    // Arrange
    ImmutableSurveyInstance.Json json = new ImmutableSurveyInstance.Json();

    // Act
    json.setApprovedBy("foo");

    // Assert
    assertEquals("foo", json.approvedBy);
  }
  @Test
  public void statusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstance.Json()).status();
  }
  @Test
  public void surveyRunIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstance.Json()).surveyRunId();
  }
  @Test
  public void approvedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstance.Json()).approvedAt();
  }
  @Test
  public void submittedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstance.Json()).submittedAt();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyInstance.Json actualJson = new ImmutableSurveyInstance.Json();

    // Assert
    assertNull(actualJson.surveyEntityExternalId);
    assertNull(actualJson.submittedBy);
    assertNull(actualJson.surveyEntity);
    assertNull(actualJson.originalInstanceId);
    assertNull(actualJson.dueDate);
    assertNull(actualJson.surveyRunId);
    assertNull(actualJson.approvedBy);
    assertNull(actualJson.approvedAt);
    assertNull(actualJson.status);
    assertNull(actualJson.submittedAt);
  }
  @Test
  public void setOriginalInstanceIdTest() {
    // Arrange
    ImmutableSurveyInstance.Json json = new ImmutableSurveyInstance.Json();

    // Act
    json.setOriginalInstanceId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.originalInstanceId);
  }
  @Test
  public void approvedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstance.Json()).approvedBy();
  }
}

