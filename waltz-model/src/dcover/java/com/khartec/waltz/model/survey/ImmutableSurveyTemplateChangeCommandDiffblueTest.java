package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyTemplateChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyTemplateChangeCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSurveyTemplateChangeCommand.Json actualJson = new ImmutableSurveyTemplateChangeCommand.Json();

    // Assert
    assertNull(actualJson.targetEntityKind);
    assertNull(actualJson.name);
    assertNull(actualJson.description);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyTemplateChangeCommand.copyOf(new ImmutableSurveyTemplateChangeCommand.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyTemplateChangeCommand.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyTemplateChangeCommand.fromJson(new ImmutableSurveyTemplateChangeCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyTemplateChangeCommand.Builder builderResult = ImmutableSurveyTemplateChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyInstance.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSurveyTemplateChangeCommand.Builder builderResult = ImmutableSurveyTemplateChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyTemplateChangeCommand.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableSurveyTemplateChangeCommand.Builder builderResult = ImmutableSurveyTemplateChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableSurveyRun.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableSurveyTemplateChangeCommand.Builder builderResult = ImmutableSurveyTemplateChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableSurveyRun.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyTemplateChangeCommand.Json()).id();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyTemplateChangeCommand.Json()).name();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableSurveyTemplateChangeCommand.Json json = new ImmutableSurveyTemplateChangeCommand.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableSurveyTemplateChangeCommand.Json json = new ImmutableSurveyTemplateChangeCommand.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setTargetEntityKindTest() {
    // Arrange
    ImmutableSurveyTemplateChangeCommand.Json json = new ImmutableSurveyTemplateChangeCommand.Json();

    // Act
    json.setTargetEntityKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.targetEntityKind);
  }
  @Test
  public void targetEntityKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyTemplateChangeCommand.Json()).targetEntityKind();
  }
}

