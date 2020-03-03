package com.khartec.waltz.model.roadmap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableRoadmapCreateCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableRoadmapCreateCommand.Builder builderResult = ImmutableRoadmapCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableRoadmapCreateCommand.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRoadmapCreateCommand.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableRoadmapCreateCommand.Builder builderResult = ImmutableRoadmapCreateCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableRoadmap.Json());
  }
  @Test
  public void setRatingSchemeIdTest() {
    // Arrange
    ImmutableRoadmapCreateCommand.Json json = new ImmutableRoadmapCreateCommand.Json();

    // Act
    json.setRatingSchemeId(123L);

    // Assert
    assertTrue(json.ratingSchemeIdIsSet);
    assertEquals(123L, json.ratingSchemeId);
  }
  @Test
  public void ratingSchemeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmapCreateCommand.Json()).ratingSchemeId();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmapCreateCommand.Json()).name();
  }
  @Test
  public void columnTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmapCreateCommand.Json()).columnType();
  }
  @Test
  public void rowTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmapCreateCommand.Json()).rowType();
  }
  @Test
  public void linkedEntityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmapCreateCommand.Json()).linkedEntity();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableRoadmapCreateCommand.Json json = new ImmutableRoadmapCreateCommand.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableRoadmapCreateCommand.Json actualJson = new ImmutableRoadmapCreateCommand.Json();

    // Assert
    assertNull(actualJson.name);
    assertNull(actualJson.columnType);
    assertNull(actualJson.rowType);
    assertFalse(actualJson.ratingSchemeIdIsSet);
    assertNull(actualJson.linkedEntity);
    assertEquals(0L, actualJson.ratingSchemeId);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRoadmapCreateCommand.fromJson(new ImmutableRoadmapCreateCommand.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableRoadmapCreateCommand.copyOf(new ImmutableRoadmapCreateCommand.Json());
  }
}

