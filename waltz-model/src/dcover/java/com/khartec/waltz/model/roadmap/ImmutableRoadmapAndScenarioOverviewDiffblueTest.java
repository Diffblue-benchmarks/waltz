package com.khartec.waltz.model.roadmap;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.scenario.Scenario;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableRoadmapAndScenarioOverviewDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRoadmapAndScenarioOverview.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableRoadmapAndScenarioOverview.Json actualJson = new ImmutableRoadmapAndScenarioOverview.Json();

    // Assert
    assertNull(actualJson.roadmap);
    assertNull(actualJson.scenarios);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableRoadmapAndScenarioOverview.copyOf(new ImmutableRoadmapAndScenarioOverview.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRoadmapAndScenarioOverview.fromJson(new ImmutableRoadmapAndScenarioOverview.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableRoadmapAndScenarioOverview.Builder builderResult = ImmutableRoadmapAndScenarioOverview.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableRoadmapAndScenarioOverview.Json());
  }

  @Test
  public void roadmapTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmapAndScenarioOverview.Json()).roadmap();
  }

  @Test
  public void scenariosTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmapAndScenarioOverview.Json()).scenarios();
  }

  @Test
  public void setRoadmapTest() {
    // Arrange
    ImmutableRoadmapAndScenarioOverview.Json json = new ImmutableRoadmapAndScenarioOverview.Json();
    ImmutableRoadmap.Json json1 = new ImmutableRoadmap.Json();

    // Act
    json.setRoadmap(json1);

    // Assert
    assertSame(json1, json.roadmap);
  }

  @Test
  public void setScenariosTest() {
    // Arrange
    ImmutableRoadmapAndScenarioOverview.Json json = new ImmutableRoadmapAndScenarioOverview.Json();
    ArrayList<Scenario> scenarioList = new ArrayList<Scenario>();
    scenarioList.add(null);

    // Act
    json.setScenarios(scenarioList);

    // Assert
    assertSame(scenarioList, json.scenarios);
  }
}

