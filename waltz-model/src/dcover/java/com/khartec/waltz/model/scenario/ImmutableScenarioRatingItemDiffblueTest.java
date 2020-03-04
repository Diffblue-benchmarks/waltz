package com.khartec.waltz.model.scenario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableScenarioRatingItemDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableScenarioRatingItem.builder().build();
  }
  @Test
  public void columnTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenarioRatingItem.Json()).column();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableScenarioRatingItem.Json actualJson = new ImmutableScenarioRatingItem.Json();

    // Assert
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.row);
    assertNull(actualJson.column);
    assertEquals('\u0000', actualJson.rating);
    assertNull(actualJson.description);
    assertFalse(actualJson.ratingIsSet);
    assertFalse(actualJson.scenarioIdIsSet);
    assertEquals(0L, actualJson.scenarioId);
    assertNull(actualJson.item);
    assertNull(actualJson.lastUpdatedBy);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableScenarioRatingItem.copyOf(new ImmutableScenarioRatingItem.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenarioRatingItem.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableScenarioRatingItem.fromJson(new ImmutableScenarioRatingItem.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableScenarioRatingItem.Builder builderResult = ImmutableScenarioRatingItem.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableScenario.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableScenarioRatingItem.Builder builderResult = ImmutableScenarioRatingItem.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableScenarioRatingItem.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableScenarioRatingItem.Builder builderResult = ImmutableScenarioRatingItem.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableScenario.Json());
  }
  @Test
  public void itemTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenarioRatingItem.Json()).item();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenarioRatingItem.Json()).lastUpdatedAt();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenarioRatingItem.Json()).lastUpdatedBy();
  }
  @Test
  public void ratingTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenarioRatingItem.Json()).rating();
  }
  @Test
  public void rowTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenarioRatingItem.Json()).row();
  }
  @Test
  public void scenarioIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenarioRatingItem.Json()).scenarioId();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableScenarioRatingItem.Json json = new ImmutableScenarioRatingItem.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableScenarioRatingItem.Json json = new ImmutableScenarioRatingItem.Json();

    // Act
    json.setLastUpdatedBy("lastUpdatedBy");

    // Assert
    assertEquals("lastUpdatedBy", json.lastUpdatedBy);
  }
  @Test
  public void setRatingTest() {
    // Arrange
    ImmutableScenarioRatingItem.Json json = new ImmutableScenarioRatingItem.Json();

    // Act
    json.setRating('A');

    // Assert
    assertEquals('A', json.rating);
    assertTrue(json.ratingIsSet);
  }
  @Test
  public void setScenarioIdTest() {
    // Arrange
    ImmutableScenarioRatingItem.Json json = new ImmutableScenarioRatingItem.Json();

    // Act
    json.setScenarioId(123L);

    // Assert
    assertTrue(json.scenarioIdIsSet);
    assertEquals(123L, json.scenarioId);
  }
}

