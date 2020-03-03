package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.NameProvider;
import java.util.HashSet;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyRunChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void dueDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunChangeCommand.Json()).dueDate();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunChangeCommand.Json()).description();
  }
  @Test
  public void selectionOptionsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunChangeCommand.Json()).selectionOptions();
  }
  @Test
  public void surveyTemplateIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunChangeCommand.Json()).surveyTemplateId();
  }
  @Test
  public void setIssuanceKindTest() {
    // Arrange
    ImmutableSurveyRunChangeCommand.Json json = new ImmutableSurveyRunChangeCommand.Json();

    // Act
    json.setIssuanceKind(SurveyIssuanceKind.GROUP);

    // Assert
    assertEquals(SurveyIssuanceKind.GROUP, json.issuanceKind);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableSurveyRunChangeCommand.Json json = new ImmutableSurveyRunChangeCommand.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void contactEmailTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunChangeCommand.Json()).contactEmail();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunChangeCommand.Json()).name();
  }
  @Test
  public void setSurveyTemplateIdTest() {
    // Arrange
    ImmutableSurveyRunChangeCommand.Json json = new ImmutableSurveyRunChangeCommand.Json();

    // Act
    json.setSurveyTemplateId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.surveyTemplateId);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableSurveyRunChangeCommand.Json json = new ImmutableSurveyRunChangeCommand.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void involvementKindIdsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunChangeCommand.Json()).involvementKindIds();
  }
  @Test
  public void setInvolvementKindIdsTest() {
    // Arrange
    ImmutableSurveyRunChangeCommand.Json json = new ImmutableSurveyRunChangeCommand.Json();
    HashSet<Long> resultLongSet = new HashSet<Long>();
    resultLongSet.add(Long.valueOf(1L));

    // Act
    json.setInvolvementKindIds(resultLongSet);

    // Assert
    assertSame(resultLongSet, json.involvementKindIds);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyRunChangeCommand.Json actualJson = new ImmutableSurveyRunChangeCommand.Json();

    // Assert
    Optional<String> optional = actualJson.contactEmail;
    assertSame(actualJson.dueDate, optional);
    assertSame(optional, actualJson.dueDate);
    assertEquals(0, actualJson.involvementKindIds.size());
  }
  @Test
  public void issuanceKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunChangeCommand.Json()).issuanceKind();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyRunChangeCommand.builder().build();
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableSurveyRunChangeCommand.Builder builderResult = ImmutableSurveyRunChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableSurveyRun.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSurveyRunChangeCommand.Builder builderResult = ImmutableSurveyRunChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableSurveyRun.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyRunChangeCommand.Builder builderResult = ImmutableSurveyRunChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyRunChangeCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyRunChangeCommand.fromJson(new ImmutableSurveyRunChangeCommand.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyRunChangeCommand.copyOf(new ImmutableSurveyRunChangeCommand.Json());
  }
}

