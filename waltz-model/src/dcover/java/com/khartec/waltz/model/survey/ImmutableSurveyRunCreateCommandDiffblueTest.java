package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.NameProvider;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyRunCreateCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyRunCreateCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyRunCreateCommand.Json actualJson = new ImmutableSurveyRunCreateCommand.Json();

    // Assert
    Optional<String> actualOptional = actualJson.contactEmail;
    Optional<LocalDate> expectedOptional = actualJson.dueDate;
    assertEquals(0, actualJson.involvementKindIds.size());
    assertSame(expectedOptional, actualOptional);
  }
  @Test
  public void contactEmailTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunCreateCommand.Json()).contactEmail();
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyRunCreateCommand.copyOf(new ImmutableSurveyRunCreateCommand.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunCreateCommand.Json()).description();
  }
  @Test
  public void dueDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunCreateCommand.Json()).dueDate();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyRunCreateCommand.fromJson(new ImmutableSurveyRunCreateCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyRunCreateCommand.Builder builderResult = ImmutableSurveyRunCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyRunCreateCommand.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSurveyRunCreateCommand.Builder builderResult = ImmutableSurveyRunCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableSurveyRun.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableSurveyRunCreateCommand.Builder builderResult = ImmutableSurveyRunCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableSurveyRun.Json());
  }
  @Test
  public void involvementKindIdsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunCreateCommand.Json()).involvementKindIds();
  }
  @Test
  public void issuanceKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunCreateCommand.Json()).issuanceKind();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunCreateCommand.Json()).name();
  }
  @Test
  public void selectionOptionsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunCreateCommand.Json()).selectionOptions();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableSurveyRunCreateCommand.Json json = new ImmutableSurveyRunCreateCommand.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setInvolvementKindIdsTest() {
    // Arrange
    ImmutableSurveyRunCreateCommand.Json json = new ImmutableSurveyRunCreateCommand.Json();
    HashSet<Long> resultLongSet = new HashSet<Long>();
    resultLongSet.add(Long.valueOf(1L));

    // Act
    json.setInvolvementKindIds(resultLongSet);

    // Assert
    assertSame(resultLongSet, json.involvementKindIds);
  }
  @Test
  public void setIssuanceKindTest() {
    // Arrange
    ImmutableSurveyRunCreateCommand.Json json = new ImmutableSurveyRunCreateCommand.Json();

    // Act
    json.setIssuanceKind(SurveyIssuanceKind.GROUP);

    // Assert
    assertEquals(SurveyIssuanceKind.GROUP, json.issuanceKind);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableSurveyRunCreateCommand.Json json = new ImmutableSurveyRunCreateCommand.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setSurveyTemplateIdTest() {
    // Arrange
    ImmutableSurveyRunCreateCommand.Json json = new ImmutableSurveyRunCreateCommand.Json();

    // Act
    json.setSurveyTemplateId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.surveyTemplateId);
  }
  @Test
  public void surveyTemplateIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunCreateCommand.Json()).surveyTemplateId();
  }
}

