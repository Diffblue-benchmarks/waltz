package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyRunStatusChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyRunStatusChangeCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ImmutableSurveyRunStatusChangeCommand.Json()).newStatus);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyRunStatusChangeCommand.copyOf(new ImmutableSurveyRunStatusChangeCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyRunStatusChangeCommand.fromJson(new ImmutableSurveyRunStatusChangeCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyRunStatusChangeCommand.Builder builderResult = ImmutableSurveyRunStatusChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyRunStatusChangeCommand.Json());
  }
  @Test
  public void newStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyRunStatusChangeCommand.Json()).newStatus();
  }
  @Test
  public void setNewStatusTest() {
    // Arrange
    ImmutableSurveyRunStatusChangeCommand.Json json = new ImmutableSurveyRunStatusChangeCommand.Json();

    // Act
    json.setNewStatus(SurveyRunStatus.DRAFT);

    // Assert
    assertEquals(SurveyRunStatus.DRAFT, json.newStatus);
  }
}

