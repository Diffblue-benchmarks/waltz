package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ReleaseLifecycleStatus;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyTemplateDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableSurveyTemplate.Builder builderResult = ImmutableSurveyTemplate.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableSurveyRun.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableSurveyTemplate.Builder builderResult = ImmutableSurveyTemplate.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyInstance.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSurveyTemplate.Builder builderResult = ImmutableSurveyTemplate.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyTemplate.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyTemplate.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyTemplate.Builder builderResult = ImmutableSurveyTemplate.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableSurveyRun.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyTemplate.fromJson(new ImmutableSurveyTemplate.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyTemplate.copyOf(new ImmutableSurveyTemplate.Json());
  }
  @Test
  public void createdAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyTemplate.Json()).createdAt();
  }
  @Test
  public void targetEntityKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyTemplate.Json()).targetEntityKind();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyTemplate.Json()).description();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyTemplate.Json()).id();
  }
  @Test
  public void ownerIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyTemplate.Json()).ownerId();
  }
  @Test
  public void setStatusTest() {
    // Arrange
    ImmutableSurveyTemplate.Json json = new ImmutableSurveyTemplate.Json();

    // Act
    json.setStatus(ReleaseLifecycleStatus.DRAFT);

    // Assert
    assertEquals(ReleaseLifecycleStatus.DRAFT, json.status);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableSurveyTemplate.Json json = new ImmutableSurveyTemplate.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyTemplate.Json()).name();
  }
  @Test
  public void setOwnerIdTest() {
    // Arrange
    ImmutableSurveyTemplate.Json json = new ImmutableSurveyTemplate.Json();

    // Act
    json.setOwnerId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.ownerId);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableSurveyTemplate.Json json = new ImmutableSurveyTemplate.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyTemplate.Json actualJson = new ImmutableSurveyTemplate.Json();

    // Assert
    assertNull(actualJson.createdAt);
    assertNull(actualJson.name);
    assertNull(actualJson.description);
    assertNull(actualJson.ownerId);
    assertNull(actualJson.targetEntityKind);
    assertNull(actualJson.status);
  }
  @Test
  public void setTargetEntityKindTest() {
    // Arrange
    ImmutableSurveyTemplate.Json json = new ImmutableSurveyTemplate.Json();

    // Act
    json.setTargetEntityKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.targetEntityKind);
  }
  @Test
  public void statusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyTemplate.Json()).status();
  }
}

