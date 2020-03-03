package com.khartec.waltz.model.cost;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAssetCostDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAssetCost.builder().build();
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableAssetCost.Builder builderResult = ImmutableAssetCost.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableAssetCost.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableAssetCost.Builder builderResult = ImmutableAssetCost.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAssetCost.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAssetCost.copyOf(new ImmutableAssetCost.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAssetCost.fromJson(new ImmutableAssetCost.Json());
  }

  @Test
  public void assetCodeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssetCost.Json()).assetCode();
  }

  @Test
  public void setAssetCodeTest() {
    // Arrange
    ImmutableAssetCost.Json json = new ImmutableAssetCost.Json();

    // Act
    json.setAssetCode("foo");

    // Assert
    assertEquals("foo", json.assetCode);
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssetCost.Json()).provenance();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAssetCost.Json actualJson = new ImmutableAssetCost.Json();

    // Assert
    assertNull(actualJson.assetCode);
    assertNull(actualJson.provenance);
    assertNull(actualJson.cost);
  }

  @Test
  public void costTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAssetCost.Json()).cost();
  }

  @Test
  public void setCostTest() {
    // Arrange
    ImmutableAssetCost.Json json = new ImmutableAssetCost.Json();
    ImmutableCost.Json json1 = new ImmutableCost.Json();

    // Act
    json.setCost(json1);

    // Assert
    assertSame(json1, json.cost);
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableAssetCost.Json json = new ImmutableAssetCost.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
}

