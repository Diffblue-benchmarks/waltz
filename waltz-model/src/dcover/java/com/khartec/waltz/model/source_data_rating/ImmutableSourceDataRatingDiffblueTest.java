package com.khartec.waltz.model.source_data_rating;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.rating.RagRating;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSourceDataRatingDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void accuracyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSourceDataRating.Json()).accuracy();
  }

  @Test
  public void authoritativenessTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSourceDataRating.Json()).authoritativeness();
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSourceDataRating.builder().build();
  }

  @Test
  public void completenessTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSourceDataRating.Json()).completeness();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSourceDataRating.Json actualJson = new ImmutableSourceDataRating.Json();

    // Assert
    assertNull(actualJson.entityKind);
    assertNull(actualJson.completeness);
    assertNull(actualJson.sourceName);
    assertNull(actualJson.accuracy);
    assertNull(actualJson.authoritativeness);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSourceDataRating.copyOf(new ImmutableSourceDataRating.Json());
  }

  @Test
  public void entityKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSourceDataRating.Json()).entityKind();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSourceDataRating.fromJson(new ImmutableSourceDataRating.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableSourceDataRating.Builder builderResult = ImmutableSourceDataRating.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSourceDataRating.Json());
  }

  @Test
  public void lastImportDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSourceDataRating.Json()).lastImportDate();
  }

  @Test
  public void setAccuracyTest() {
    // Arrange
    ImmutableSourceDataRating.Json json = new ImmutableSourceDataRating.Json();

    // Act
    json.setAccuracy(RagRating.R);

    // Assert
    assertEquals(RagRating.R, json.accuracy);
  }

  @Test
  public void setAuthoritativenessTest() {
    // Arrange
    ImmutableSourceDataRating.Json json = new ImmutableSourceDataRating.Json();

    // Act
    json.setAuthoritativeness(RagRating.R);

    // Assert
    assertEquals(RagRating.R, json.authoritativeness);
  }

  @Test
  public void setCompletenessTest() {
    // Arrange
    ImmutableSourceDataRating.Json json = new ImmutableSourceDataRating.Json();

    // Act
    json.setCompleteness(RagRating.R);

    // Assert
    assertEquals(RagRating.R, json.completeness);
  }

  @Test
  public void setEntityKindTest() {
    // Arrange
    ImmutableSourceDataRating.Json json = new ImmutableSourceDataRating.Json();

    // Act
    json.setEntityKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.entityKind);
  }

  @Test
  public void setSourceNameTest() {
    // Arrange
    ImmutableSourceDataRating.Json json = new ImmutableSourceDataRating.Json();

    // Act
    json.setSourceName("sourceName");

    // Assert
    assertEquals("sourceName", json.sourceName);
  }

  @Test
  public void sourceNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSourceDataRating.Json()).sourceName();
  }
}

