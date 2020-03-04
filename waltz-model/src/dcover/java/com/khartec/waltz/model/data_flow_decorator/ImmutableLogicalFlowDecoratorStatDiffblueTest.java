package com.khartec.waltz.model.data_flow_decorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableLogicalFlowDecoratorStatDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLogicalFlowDecoratorStat.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableLogicalFlowDecoratorStat.Json actualJson = new ImmutableLogicalFlowDecoratorStat.Json();

    // Assert
    assertFalse(actualJson.dataTypeIdIsSet);
    assertEquals(0, actualJson.totalCount);
    assertNull(actualJson.logicalFlowMeasures);
    assertEquals(0L, actualJson.dataTypeId);
    assertFalse(actualJson.totalCountIsSet);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableLogicalFlowDecoratorStat.copyOf(new ImmutableLogicalFlowDecoratorStat.Json());
  }
  @Test
  public void dataTypeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowDecoratorStat.Json()).dataTypeId();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLogicalFlowDecoratorStat.fromJson(new ImmutableLogicalFlowDecoratorStat.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableLogicalFlowDecoratorStat.Builder builderResult = ImmutableLogicalFlowDecoratorStat.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableLogicalFlowDecoratorStat.Json());
  }
  @Test
  public void logicalFlowMeasuresTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowDecoratorStat.Json()).logicalFlowMeasures();
  }
  @Test
  public void setDataTypeIdTest() {
    // Arrange
    ImmutableLogicalFlowDecoratorStat.Json json = new ImmutableLogicalFlowDecoratorStat.Json();

    // Act
    json.setDataTypeId(123L);

    // Assert
    assertTrue(json.dataTypeIdIsSet);
    assertEquals(123L, json.dataTypeId);
  }
  @Test
  public void setTotalCountTest() {
    // Arrange
    ImmutableLogicalFlowDecoratorStat.Json json = new ImmutableLogicalFlowDecoratorStat.Json();

    // Act
    json.setTotalCount(3);

    // Assert
    assertEquals(3, json.totalCount);
    assertTrue(json.totalCountIsSet);
  }
  @Test
  public void totalCountTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowDecoratorStat.Json()).totalCount();
  }
}

