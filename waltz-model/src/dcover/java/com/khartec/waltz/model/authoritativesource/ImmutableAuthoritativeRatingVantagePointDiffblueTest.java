package com.khartec.waltz.model.authoritativesource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.rating.AuthoritativenessRating;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAuthoritativeRatingVantagePointDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAuthoritativeRatingVantagePoint.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAuthoritativeRatingVantagePoint.Builder builderResult = ImmutableAuthoritativeRatingVantagePoint.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAuthoritativeRatingVantagePoint.Json());
  }
  @Test
  public void setDataTypeRankTest() {
    // Arrange
    ImmutableAuthoritativeRatingVantagePoint.Json json = new ImmutableAuthoritativeRatingVantagePoint.Json();

    // Act
    json.setDataTypeRank(1);

    // Assert
    assertTrue(json.dataTypeRankIsSet);
    assertEquals(1, json.dataTypeRank);
  }
  @Test
  public void applicationIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeRatingVantagePoint.Json()).applicationId();
  }
  @Test
  public void setDataTypeCodeTest() {
    // Arrange
    ImmutableAuthoritativeRatingVantagePoint.Json json = new ImmutableAuthoritativeRatingVantagePoint.Json();

    // Act
    json.setDataTypeCode("foo");

    // Assert
    assertEquals("foo", json.dataTypeCode);
  }
  @Test
  public void setRatingTest() {
    // Arrange
    ImmutableAuthoritativeRatingVantagePoint.Json json = new ImmutableAuthoritativeRatingVantagePoint.Json();

    // Act
    json.setRating(AuthoritativenessRating.PRIMARY);

    // Assert
    assertEquals(AuthoritativenessRating.PRIMARY, json.rating);
  }
  @Test
  public void setApplicationIdTest() {
    // Arrange
    ImmutableAuthoritativeRatingVantagePoint.Json json = new ImmutableAuthoritativeRatingVantagePoint.Json();

    // Act
    json.setApplicationId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.applicationId);
  }
  @Test
  public void dataTypeCodeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeRatingVantagePoint.Json()).dataTypeCode();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAuthoritativeRatingVantagePoint.Json actualJson = new ImmutableAuthoritativeRatingVantagePoint.Json();

    // Assert
    assertNull(actualJson.applicationId);
    assertNull(actualJson.vantagePoint);
    assertFalse(actualJson.dataTypeRankIsSet);
    assertEquals(0, actualJson.vantagePointRank);
    assertNull(actualJson.dataTypeCode);
    assertEquals(0, actualJson.dataTypeRank);
    assertNull(actualJson.rating);
    assertFalse(actualJson.vantagePointRankIsSet);
  }
  @Test
  public void vantagePointRankTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeRatingVantagePoint.Json()).vantagePointRank();
  }
  @Test
  public void vantagePointTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeRatingVantagePoint.Json()).vantagePoint();
  }
  @Test
  public void setVantagePointRankTest() {
    // Arrange
    ImmutableAuthoritativeRatingVantagePoint.Json json = new ImmutableAuthoritativeRatingVantagePoint.Json();

    // Act
    json.setVantagePointRank(1);

    // Assert
    assertEquals(1, json.vantagePointRank);
    assertTrue(json.vantagePointRankIsSet);
  }
  @Test
  public void dataTypeRankTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeRatingVantagePoint.Json()).dataTypeRank();
  }
  @Test
  public void ratingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeRatingVantagePoint.Json()).rating();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAuthoritativeRatingVantagePoint.fromJson(new ImmutableAuthoritativeRatingVantagePoint.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAuthoritativeRatingVantagePoint.copyOf(new ImmutableAuthoritativeRatingVantagePoint.Json());
  }
}

