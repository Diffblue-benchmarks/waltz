package com.khartec.waltz.model.authoritativesource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.rating.AuthoritativenessRating;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAuthoritativeSourceCreateCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void applicationIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSourceCreateCommand.Json()).applicationId();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAuthoritativeSourceCreateCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAuthoritativeSourceCreateCommand.Json actualJson = new ImmutableAuthoritativeSourceCreateCommand.Json();

    // Assert
    assertNull(actualJson.description);
    assertFalse(actualJson.dataTypeIdIsSet);
    assertFalse(actualJson.orgUnitIdIsSet);
    assertEquals(0L, actualJson.orgUnitId);
    assertEquals(0L, actualJson.applicationId);
    assertFalse(actualJson.applicationIdIsSet);
    assertEquals(0L, actualJson.dataTypeId);
    assertNull(actualJson.rating);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAuthoritativeSourceCreateCommand.copyOf(new ImmutableAuthoritativeSourceCreateCommand.Json());
  }
  @Test
  public void dataTypeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSourceCreateCommand.Json()).dataTypeId();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSourceCreateCommand.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAuthoritativeSourceCreateCommand.fromJson(new ImmutableAuthoritativeSourceCreateCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAuthoritativeSourceCreateCommand.Builder builderResult = ImmutableAuthoritativeSourceCreateCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAuthoritativeSourceCreateCommand.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAuthoritativeSourceCreateCommand.Builder builderResult = ImmutableAuthoritativeSourceCreateCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAuthoritativeSource.Json());
  }
  @Test
  public void orgUnitIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSourceCreateCommand.Json()).orgUnitId();
  }
  @Test
  public void ratingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAuthoritativeSourceCreateCommand.Json()).rating();
  }
  @Test
  public void setApplicationIdTest() {
    // Arrange
    ImmutableAuthoritativeSourceCreateCommand.Json json = new ImmutableAuthoritativeSourceCreateCommand.Json();

    // Act
    json.setApplicationId(123L);

    // Assert
    assertEquals(123L, json.applicationId);
    assertTrue(json.applicationIdIsSet);
  }
  @Test
  public void setDataTypeIdTest() {
    // Arrange
    ImmutableAuthoritativeSourceCreateCommand.Json json = new ImmutableAuthoritativeSourceCreateCommand.Json();

    // Act
    json.setDataTypeId(123L);

    // Assert
    assertTrue(json.dataTypeIdIsSet);
    assertEquals(123L, json.dataTypeId);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableAuthoritativeSourceCreateCommand.Json json = new ImmutableAuthoritativeSourceCreateCommand.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setOrgUnitIdTest() {
    // Arrange
    ImmutableAuthoritativeSourceCreateCommand.Json json = new ImmutableAuthoritativeSourceCreateCommand.Json();

    // Act
    json.setOrgUnitId(123L);

    // Assert
    assertTrue(json.orgUnitIdIsSet);
    assertEquals(123L, json.orgUnitId);
  }
  @Test
  public void setRatingTest() {
    // Arrange
    ImmutableAuthoritativeSourceCreateCommand.Json json = new ImmutableAuthoritativeSourceCreateCommand.Json();

    // Act
    json.setRating(AuthoritativenessRating.PRIMARY);

    // Assert
    assertEquals(AuthoritativenessRating.PRIMARY, json.rating);
  }
}

