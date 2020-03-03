package com.khartec.waltz.model.logical_flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.tally.TallyPack;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableLogicalFlowStatisticsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void setFlowCountsTest() {
    // Arrange
    ImmutableLogicalFlowStatistics.Json json = new ImmutableLogicalFlowStatistics.Json();
    ImmutableLogicalFlowMeasures.Json json1 = new ImmutableLogicalFlowMeasures.Json();

    // Act
    json.setFlowCounts(json1);

    // Assert
    assertSame(json1, json.flowCounts);
  }
  @Test
  public void flowCountsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowStatistics.Json()).flowCounts();
  }
  @Test
  public void appCountsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowStatistics.Json()).appCounts();
  }
  @Test
  public void setAppCountsTest() {
    // Arrange
    ImmutableLogicalFlowStatistics.Json json = new ImmutableLogicalFlowStatistics.Json();
    ImmutableLogicalFlowMeasures.Json json1 = new ImmutableLogicalFlowMeasures.Json();

    // Act
    json.setAppCounts(json1);

    // Assert
    assertSame(json1, json.appCounts);
  }
  @Test
  public void dataTypeCountsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowStatistics.Json()).dataTypeCounts();
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ImmutableLogicalFlowStatistics.Json()).dataTypeCounts.size());
  }
  @Test
  public void setDataTypeCountsTest() {
    // Arrange
    ImmutableLogicalFlowStatistics.Json json = new ImmutableLogicalFlowStatistics.Json();
    ArrayList<TallyPack<String>> tallyPackList = new ArrayList<TallyPack<String>>();

    // Act
    json.setDataTypeCounts(tallyPackList);

    // Assert
    assertSame(tallyPackList, json.dataTypeCounts);
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLogicalFlowStatistics.fromJson(new ImmutableLogicalFlowStatistics.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableLogicalFlowStatistics.copyOf(new ImmutableLogicalFlowStatistics.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableLogicalFlowStatistics.Builder builderResult = ImmutableLogicalFlowStatistics.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableLogicalFlowStatistics.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLogicalFlowStatistics.builder().build();
  }
}

