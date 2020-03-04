package com.khartec.waltz.model.assessment_rating;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableRemoveAssessmentRatingCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void assessmentDefinitionIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRemoveAssessmentRatingCommand.Json()).assessmentDefinitionId();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRemoveAssessmentRatingCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableRemoveAssessmentRatingCommand.Json actualJson = new ImmutableRemoveAssessmentRatingCommand.Json();

    // Assert
    assertEquals(0L, actualJson.assessmentDefinitionId);
    assertFalse(actualJson.assessmentDefinitionIdIsSet);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.entityReference);
    assertNull(actualJson.lastUpdatedAt);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableRemoveAssessmentRatingCommand.copyOf(new ImmutableRemoveAssessmentRatingCommand.Json());
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRemoveAssessmentRatingCommand.Json()).entityReference();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRemoveAssessmentRatingCommand.fromJson(new ImmutableRemoveAssessmentRatingCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableRemoveAssessmentRatingCommand.Builder builderResult = ImmutableRemoveAssessmentRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((AssessmentRatingCommand) new ImmutableRemoveAssessmentRatingCommand.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableRemoveAssessmentRatingCommand.Builder builderResult = ImmutableRemoveAssessmentRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableRemoveAssessmentRatingCommand.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableRemoveAssessmentRatingCommand.Builder builderResult = ImmutableRemoveAssessmentRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAssessmentRating.Json());
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRemoveAssessmentRatingCommand.Json()).lastUpdatedAt();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRemoveAssessmentRatingCommand.Json()).lastUpdatedBy();
  }
  @Test
  public void setAssessmentDefinitionIdTest() {
    // Arrange
    ImmutableRemoveAssessmentRatingCommand.Json json = new ImmutableRemoveAssessmentRatingCommand.Json();

    // Act
    json.setAssessmentDefinitionId(123L);

    // Assert
    assertEquals(123L, json.assessmentDefinitionId);
    assertTrue(json.assessmentDefinitionIdIsSet);
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableRemoveAssessmentRatingCommand.Json json = new ImmutableRemoveAssessmentRatingCommand.Json();

    // Act
    json.setLastUpdatedBy("lastUpdatedBy");

    // Assert
    assertEquals("lastUpdatedBy", json.lastUpdatedBy);
  }
}

