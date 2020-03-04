package com.khartec.waltz.model.scenario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.AxisOrientation;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableScenarioAxisItemDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void axisOrientationTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenarioAxisItem.Json()).axisOrientation();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableScenarioAxisItem.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableScenarioAxisItem.Json actualJson = new ImmutableScenarioAxisItem.Json();

    // Assert
    assertNull(actualJson.domainItem);
    assertEquals(0, actualJson.position);
    assertFalse(actualJson.scenarioIdIsSet);
    assertEquals(0L, actualJson.scenarioId);
    assertNull(actualJson.axisOrientation);
    assertFalse(actualJson.positionIsSet);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableScenarioAxisItem.copyOf(new ImmutableScenarioAxisItem.Json());
  }
  @Test
  public void domainItemTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenarioAxisItem.Json()).domainItem();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableScenarioAxisItem.fromJson(new ImmutableScenarioAxisItem.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableScenarioAxisItem.Builder builderResult = ImmutableScenarioAxisItem.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableScenarioAxisItem.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableScenarioAxisItem.Builder builderResult = ImmutableScenarioAxisItem.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableScenario.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenarioAxisItem.Json()).id();
  }
  @Test
  public void positionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenarioAxisItem.Json()).position();
  }
  @Test
  public void scenarioIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenarioAxisItem.Json()).scenarioId();
  }
  @Test
  public void setAxisOrientationTest() {
    // Arrange
    ImmutableScenarioAxisItem.Json json = new ImmutableScenarioAxisItem.Json();

    // Act
    json.setAxisOrientation(AxisOrientation.ROW);

    // Assert
    assertEquals(AxisOrientation.ROW, json.axisOrientation);
  }
  @Test
  public void setPositionTest() {
    // Arrange
    ImmutableScenarioAxisItem.Json json = new ImmutableScenarioAxisItem.Json();

    // Act
    json.setPosition(1);

    // Assert
    assertEquals(1, json.position);
    assertTrue(json.positionIsSet);
  }
  @Test
  public void setScenarioIdTest() {
    // Arrange
    ImmutableScenarioAxisItem.Json json = new ImmutableScenarioAxisItem.Json();

    // Act
    json.setScenarioId(123L);

    // Assert
    assertTrue(json.scenarioIdIsSet);
    assertEquals(123L, json.scenarioId);
  }
}

