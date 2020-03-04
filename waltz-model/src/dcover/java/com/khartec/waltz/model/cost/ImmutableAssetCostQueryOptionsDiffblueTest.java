package com.khartec.waltz.model.cost;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAssetCostQueryOptionsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAssetCostQueryOptions.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAssetCostQueryOptions.Json actualJson = new ImmutableAssetCostQueryOptions.Json();

    // Assert
    assertEquals(0, actualJson.year);
    assertNull(actualJson.idSelectionOptions);
    assertFalse(actualJson.yearIsSet);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAssetCostQueryOptions.copyOf(new ImmutableAssetCostQueryOptions.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAssetCostQueryOptions.fromJson(new ImmutableAssetCostQueryOptions.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAssetCostQueryOptions.Builder builderResult = ImmutableAssetCostQueryOptions.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAssetCostQueryOptions.Json());
  }
  @Test
  public void idSelectionOptionsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssetCostQueryOptions.Json()).idSelectionOptions();
  }
  @Test
  public void setYearTest() {
    // Arrange
    ImmutableAssetCostQueryOptions.Json json = new ImmutableAssetCostQueryOptions.Json();

    // Act
    json.setYear(1);

    // Assert
    assertEquals(1, json.year);
    assertTrue(json.yearIsSet);
  }
  @Test
  public void yearTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssetCostQueryOptions.Json()).year();
  }
}

