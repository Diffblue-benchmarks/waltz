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

public class ImmutableAssessmentRatingDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void assessmentDefinitionIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentRating.Json()).assessmentDefinitionId();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAssessmentRating.builder().build();
  }
  @Test
  public void commentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentRating.Json()).comment();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAssessmentRating.Json actualJson = new ImmutableAssessmentRating.Json();

    // Assert
    assertEquals(0L, actualJson.ratingId);
    assertEquals(0L, actualJson.assessmentDefinitionId);
    assertNull(actualJson.comment);
    assertFalse(actualJson.ratingIdIsSet);
    assertFalse(actualJson.assessmentDefinitionIdIsSet);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.provenance);
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.entityReference);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAssessmentRating.copyOf(new ImmutableAssessmentRating.Json());
  }
  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentRating.Json()).entityReference();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAssessmentRating.fromJson(new ImmutableAssessmentRating.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAssessmentRating.Builder builderResult = ImmutableAssessmentRating.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableAssessmentRating.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAssessmentRating.Builder builderResult = ImmutableAssessmentRating.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableAssessmentRating.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableAssessmentRating.Builder builderResult = ImmutableAssessmentRating.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAssessmentRating.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableAssessmentRating.Builder builderResult = ImmutableAssessmentRating.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CommentProvider) new ImmutableAssessmentRating.Json());
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentRating.Json()).lastUpdatedAt();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentRating.Json()).lastUpdatedBy();
  }
  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentRating.Json()).provenance();
  }
  @Test
  public void ratingIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssessmentRating.Json()).ratingId();
  }
  @Test
  public void setAssessmentDefinitionIdTest() {
    // Arrange
    ImmutableAssessmentRating.Json json = new ImmutableAssessmentRating.Json();

    // Act
    json.setAssessmentDefinitionId(123L);

    // Assert
    assertEquals(123L, json.assessmentDefinitionId);
    assertTrue(json.assessmentDefinitionIdIsSet);
  }
  @Test
  public void setCommentTest() {
    // Arrange
    ImmutableAssessmentRating.Json json = new ImmutableAssessmentRating.Json();

    // Act
    json.setComment("comment");

    // Assert
    assertEquals("comment", json.comment);
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableAssessmentRating.Json json = new ImmutableAssessmentRating.Json();

    // Act
    json.setLastUpdatedBy("lastUpdatedBy");

    // Assert
    assertEquals("lastUpdatedBy", json.lastUpdatedBy);
  }
  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableAssessmentRating.Json json = new ImmutableAssessmentRating.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }
  @Test
  public void setRatingIdTest() {
    // Arrange
    ImmutableAssessmentRating.Json json = new ImmutableAssessmentRating.Json();

    // Act
    json.setRatingId(123L);

    // Assert
    assertEquals(123L, json.ratingId);
    assertTrue(json.ratingIdIsSet);
  }
}

