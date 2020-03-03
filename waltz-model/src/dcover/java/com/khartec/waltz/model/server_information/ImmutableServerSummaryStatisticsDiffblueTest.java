package com.khartec.waltz.model.server_information;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.tally.Tally;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableServerSummaryStatisticsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest() {
    // Arrange
    ImmutableServerSummaryStatistics.Builder builderResult = ImmutableServerSummaryStatistics.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableServerSummaryStatistics.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableServerSummaryStatistics.builder().build();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableServerSummaryStatistics.fromJson(new ImmutableServerSummaryStatistics.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableServerSummaryStatistics.copyOf(new ImmutableServerSummaryStatistics.Json());
  }
  @Test
  public void setOperatingSystemCountsTest() {
    // Arrange
    ImmutableServerSummaryStatistics.Json json = new ImmutableServerSummaryStatistics.Json();
    ArrayList<Tally<String>> tallyList = new ArrayList<Tally<String>>();

    // Act
    json.setOperatingSystemCounts(tallyList);

    // Assert
    assertSame(tallyList, json.operatingSystemCounts);
  }
  @Test
  public void setEnvironmentCountsTest() {
    // Arrange
    ImmutableServerSummaryStatistics.Json json = new ImmutableServerSummaryStatistics.Json();
    ArrayList<Tally<String>> tallyList = new ArrayList<Tally<String>>();

    // Act
    json.setEnvironmentCounts(tallyList);

    // Assert
    assertSame(tallyList, json.environmentCounts);
  }
  @Test
  public void operatingSystemCountsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerSummaryStatistics.Json()).operatingSystemCounts();
  }
  @Test
  public void operatingSystemEndOfLifeStatusCountsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerSummaryStatistics.Json()).operatingSystemEndOfLifeStatusCounts();
  }
  @Test
  public void hardwareEndOfLifeStatusCountsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerSummaryStatistics.Json()).hardwareEndOfLifeStatusCounts();
  }
  @Test
  public void setHardwareEndOfLifeStatusCountsTest() {
    // Arrange
    ImmutableServerSummaryStatistics.Json json = new ImmutableServerSummaryStatistics.Json();
    ArrayList<Tally<String>> tallyList = new ArrayList<Tally<String>>();

    // Act
    json.setHardwareEndOfLifeStatusCounts(tallyList);

    // Assert
    assertSame(tallyList, json.hardwareEndOfLifeStatusCounts);
  }
  @Test
  public void physicalCountTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerSummaryStatistics.Json()).physicalCount();
  }
  @Test
  public void environmentCountsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerSummaryStatistics.Json()).environmentCounts();
  }
  @Test
  public void setOperatingSystemEndOfLifeStatusCountsTest() {
    // Arrange
    ImmutableServerSummaryStatistics.Json json = new ImmutableServerSummaryStatistics.Json();
    ArrayList<Tally<String>> tallyList = new ArrayList<Tally<String>>();

    // Act
    json.setOperatingSystemEndOfLifeStatusCounts(tallyList);

    // Assert
    assertSame(tallyList, json.operatingSystemEndOfLifeStatusCounts);
  }
  @Test
  public void setPhysicalCountTest() {
    // Arrange
    ImmutableServerSummaryStatistics.Json json = new ImmutableServerSummaryStatistics.Json();

    // Act
    json.setPhysicalCount(3L);

    // Assert
    assertTrue(json.physicalCountIsSet);
    assertEquals(3L, json.physicalCount);
  }
  @Test
  public void totalCountTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerSummaryStatistics.Json()).totalCount();
  }
  @Test
  public void setTotalCountTest() {
    // Arrange
    ImmutableServerSummaryStatistics.Json json = new ImmutableServerSummaryStatistics.Json();

    // Act
    json.setTotalCount(3L);

    // Assert
    assertTrue(json.totalCountIsSet);
    assertEquals(3L, json.totalCount);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableServerSummaryStatistics.Json actualJson = new ImmutableServerSummaryStatistics.Json();

    // Assert
    List<Tally<String>> tallyList = actualJson.operatingSystemCounts;
    List<Tally<String>> actualTallyList = actualJson.operatingSystemEndOfLifeStatusCounts;
    List<Tally<String>> actualTallyList1 = actualJson.environmentCounts;
    List<Tally<String>> actualTallyList2 = actualJson.hardwareEndOfLifeStatusCounts;
    List<Tally<String>> actualTallyList3 = actualJson.locationCounts;
    assertEquals(0, tallyList.size());
    assertSame(tallyList, actualTallyList3);
    assertSame(tallyList, actualTallyList2);
    assertSame(tallyList, actualTallyList1);
    assertSame(tallyList, actualTallyList);
  }
  @Test
  public void virtualCountTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerSummaryStatistics.Json()).virtualCount();
  }
  @Test
  public void setLocationCountsTest() {
    // Arrange
    ImmutableServerSummaryStatistics.Json json = new ImmutableServerSummaryStatistics.Json();
    ArrayList<Tally<String>> tallyList = new ArrayList<Tally<String>>();

    // Act
    json.setLocationCounts(tallyList);

    // Assert
    assertSame(tallyList, json.locationCounts);
  }
  @Test
  public void setVirtualCountTest() {
    // Arrange
    ImmutableServerSummaryStatistics.Json json = new ImmutableServerSummaryStatistics.Json();

    // Act
    json.setVirtualCount(3L);

    // Assert
    assertTrue(json.virtualCountIsSet);
    assertEquals(3L, json.virtualCount);
  }
  @Test
  public void locationCountsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableServerSummaryStatistics.Json()).locationCounts();
  }
}

