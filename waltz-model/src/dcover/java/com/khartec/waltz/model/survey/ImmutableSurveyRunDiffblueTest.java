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

public class ImmutableSurveyRunDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyRun.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyRun.Json actualJson = new ImmutableSurveyRun.Json();

    // Assert
    Optional<Long> actualOptional = actualJson.id;
    Optional<LocalDate> expectedOptional = actualJson.issuedOn;
    assertEquals(0, actualJson.involvementKindIds.size());
    assertSame(expectedOptional, actualOptional);
  }
  @Test
  public void contactEmailTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRun.Json()).contactEmail();
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyRun.copyOf(new ImmutableSurveyRun.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRun.Json()).description();
  }
  @Test
  public void dueDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRun.Json()).dueDate();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyRun.fromJson(new ImmutableSurveyRun.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyRun.Builder builderResult = ImmutableSurveyRun.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableSurveyRun.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSurveyRun.Builder builderResult = ImmutableSurveyRun.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyInstance.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableSurveyRun.Builder builderResult = ImmutableSurveyRun.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyRun.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableSurveyRun.Builder builderResult = ImmutableSurveyRun.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableSurveyRun.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRun.Json()).id();
  }
  @Test
  public void involvementKindIdsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRun.Json()).involvementKindIds();
  }
  @Test
  public void issuanceKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRun.Json()).issuanceKind();
  }
  @Test
  public void issuedOnTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRun.Json()).issuedOn();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRun.Json()).name();
  }
  @Test
  public void ownerIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRun.Json()).ownerId();
  }
  @Test
  public void selectionOptionsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRun.Json()).selectionOptions();
  }
  @Test
  public void setContactEmailTest() {
    // Arrange
    ImmutableSurveyRun.Json json = new ImmutableSurveyRun.Json();

    // Act
    json.setContactEmail("contactEmail");

    // Assert
    assertEquals("contactEmail", json.contactEmail);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableSurveyRun.Json json = new ImmutableSurveyRun.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setInvolvementKindIdsTest() {
    // Arrange
    ImmutableSurveyRun.Json json = new ImmutableSurveyRun.Json();
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
    ImmutableSurveyRun.Json json = new ImmutableSurveyRun.Json();

    // Act
    json.setIssuanceKind(SurveyIssuanceKind.GROUP);

    // Assert
    assertEquals(SurveyIssuanceKind.GROUP, json.issuanceKind);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableSurveyRun.Json json = new ImmutableSurveyRun.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setOwnerIdTest() {
    // Arrange
    ImmutableSurveyRun.Json json = new ImmutableSurveyRun.Json();

    // Act
    json.setOwnerId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.ownerId);
  }
  @Test
  public void setStatusTest() {
    // Arrange
    ImmutableSurveyRun.Json json = new ImmutableSurveyRun.Json();

    // Act
    json.setStatus(SurveyRunStatus.DRAFT);

    // Assert
    assertEquals(SurveyRunStatus.DRAFT, json.status);
  }
  @Test
  public void setSurveyTemplateIdTest() {
    // Arrange
    ImmutableSurveyRun.Json json = new ImmutableSurveyRun.Json();

    // Act
    json.setSurveyTemplateId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.surveyTemplateId);
  }
  @Test
  public void statusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRun.Json()).status();
  }
  @Test
  public void surveyTemplateIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRun.Json()).surveyTemplateId();
  }
}

