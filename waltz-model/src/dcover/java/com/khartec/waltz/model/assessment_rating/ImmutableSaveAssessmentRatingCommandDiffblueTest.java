package com.khartec.waltz.model.assessment_rating;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.CommentProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSaveAssessmentRatingCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveAssessmentRatingCommand.Json()).entityReference();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableSaveAssessmentRatingCommand.Json json = new ImmutableSaveAssessmentRatingCommand.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void setCommentTest() {
    // Arrange
    ImmutableSaveAssessmentRatingCommand.Json json = new ImmutableSaveAssessmentRatingCommand.Json();

    // Act
    json.setComment("foo");

    // Assert
    assertEquals("foo", json.comment);
  }
  @Test
  public void ratingIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveAssessmentRatingCommand.Json()).ratingId();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveAssessmentRatingCommand.Json()).lastUpdatedBy();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveAssessmentRatingCommand.Json()).provenance();
  }
  @Test
  public void commentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveAssessmentRatingCommand.Json()).comment();
  }
  @Test
  public void setRatingIdTest() {
    // Arrange
    ImmutableSaveAssessmentRatingCommand.Json json = new ImmutableSaveAssessmentRatingCommand.Json();

    // Act
    json.setRatingId(123L);

    // Assert
    assertTrue(json.ratingIdIsSet);
    assertEquals(123L, json.ratingId);
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveAssessmentRatingCommand.Json()).lastUpdatedAt();
  }
  @Test
  public void assessmentDefinitionIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveAssessmentRatingCommand.Json()).assessmentDefinitionId();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSaveAssessmentRatingCommand.Json actualJson = new ImmutableSaveAssessmentRatingCommand.Json();

    // Assert
    assertFalse(actualJson.ratingIdIsSet);
    assertNull(actualJson.provenance);
    assertFalse(actualJson.assessmentDefinitionIdIsSet);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.entityReference);
    assertEquals(0L, actualJson.ratingId);
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.comment);
    assertEquals(0L, actualJson.assessmentDefinitionId);
  }
  @Test
  public void setAssessmentDefinitionIdTest() {
    // Arrange
    ImmutableSaveAssessmentRatingCommand.Json json = new ImmutableSaveAssessmentRatingCommand.Json();

    // Act
    json.setAssessmentDefinitionId(123L);

    // Assert
    assertTrue(json.assessmentDefinitionIdIsSet);
    assertEquals(123L, json.assessmentDefinitionId);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableSaveAssessmentRatingCommand.Json json = new ImmutableSaveAssessmentRatingCommand.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSaveAssessmentRatingCommand.copyOf(new ImmutableSaveAssessmentRatingCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSaveAssessmentRatingCommand.fromJson(new ImmutableSaveAssessmentRatingCommand.Json());
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableSaveAssessmentRatingCommand.Builder builderResult = ImmutableSaveAssessmentRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSaveAssessmentRatingCommand.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableSaveAssessmentRatingCommand.Builder builderResult = ImmutableSaveAssessmentRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CommentProvider) new ImmutableAssessmentRating.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableSaveAssessmentRatingCommand.Builder builderResult = ImmutableSaveAssessmentRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableRemoveAssessmentRatingCommand.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSaveAssessmentRatingCommand.Builder builderResult = ImmutableSaveAssessmentRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableAssessmentRating.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSaveAssessmentRatingCommand.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSaveAssessmentRatingCommand.Builder builderResult = ImmutableSaveAssessmentRatingCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableAssessmentRating.Json());
  }
}

