package com.khartec.waltz.model.cost;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableApplicationCostDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void applicationTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplicationCost.Json()).application();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableApplicationCost.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableApplicationCost.Json actualJson = new ImmutableApplicationCost.Json();

    // Assert
    assertNull(actualJson.cost);
    assertNull(actualJson.application);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableApplicationCost.copyOf(new ImmutableApplicationCost.Json());
  }
  @Test
  public void costTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplicationCost.Json()).cost();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableApplicationCost.fromJson(new ImmutableApplicationCost.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableApplicationCost.Builder builderResult = ImmutableApplicationCost.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableApplicationCost.Json());
  }
  @Test
  public void setCostTest() {
    // Arrange
    ImmutableApplicationCost.Json json = new ImmutableApplicationCost.Json();
    ImmutableCost.Json json1 = new ImmutableCost.Json();

    // Act
    json.setCost(json1);

    // Assert
    assertSame(json1, json.cost);
  }
}

