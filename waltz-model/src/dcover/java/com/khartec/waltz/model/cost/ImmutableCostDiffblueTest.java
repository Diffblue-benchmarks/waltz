package com.khartec.waltz.model.cost;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import java.math.BigDecimal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableCostDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCost.Json()).kind();
  }
  @Test
  public void setYearTest() {
    // Arrange
    ImmutableCost.Json json = new ImmutableCost.Json();

    // Act
    json.setYear(1);

    // Assert
    assertTrue(json.yearIsSet);
    assertEquals(1, json.year);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableCost.Json actualJson = new ImmutableCost.Json();

    // Assert
    assertNull(actualJson.costKind);
    assertFalse(actualJson.yearIsSet);
    assertEquals(0, actualJson.year);
    assertNull(actualJson.kind);
    assertNull(actualJson.amount);
  }
  @Test
  public void yearTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCost.Json()).year();
  }
  @Test
  public void setAmountTest() {
    // Arrange
    BigDecimal valueOfResult = BigDecimal.valueOf(1L);
    ImmutableCost.Json json = new ImmutableCost.Json();

    // Act
    json.setAmount(valueOfResult);

    // Assert
    assertSame(valueOfResult, json.amount);
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableCost.Json json = new ImmutableCost.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void costKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCost.Json()).costKind();
  }
  @Test
  public void setCostKindTest() {
    // Arrange
    ImmutableCost.Json json = new ImmutableCost.Json();

    // Act
    json.setCostKind("foo");

    // Assert
    assertEquals("foo", json.costKind);
  }
  @Test
  public void amountTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCost.Json()).amount();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableCost.fromJson(new ImmutableCost.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableCost.copyOf(new ImmutableCost.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableCost.Builder builderResult = ImmutableCost.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableCost.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableCost.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableCost.Builder builderResult = ImmutableCost.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableCost.Json());
  }
}

