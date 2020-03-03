package com.khartec.waltz.model.survey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSurveyInstanceStatusChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void newStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceStatusChangeCommand.Json()).newStatus();
  }
  @Test
  public void reasonTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSurveyInstanceStatusChangeCommand.Json()).reason();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ImmutableSurveyInstanceStatusChangeCommand.Json()).newStatus);
  }
  @Test
  public void setNewStatusTest() {
    // Arrange
    ImmutableSurveyInstanceStatusChangeCommand.Json json = new ImmutableSurveyInstanceStatusChangeCommand.Json();

    // Act
    json.setNewStatus(SurveyInstanceStatus.NOT_STARTED);

    // Assert
    assertEquals(SurveyInstanceStatus.NOT_STARTED, json.newStatus);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstanceStatusChangeCommand.fromJson(new ImmutableSurveyInstanceStatusChangeCommand.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSurveyInstanceStatusChangeCommand.copyOf(new ImmutableSurveyInstanceStatusChangeCommand.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSurveyInstanceStatusChangeCommand.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSurveyInstanceStatusChangeCommand.Builder builderResult = ImmutableSurveyInstanceStatusChangeCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSurveyInstanceStatusChangeCommand.Json());
  }
}

