package com.khartec.waltz.web.json;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.scenario.ScenarioAxisItem;
import com.khartec.waltz.model.scenario.ScenarioRatingItem;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableFullScenarioDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void axisDefinitionsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFullScenario.Json()).axisDefinitions();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableFullScenario.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableFullScenario.Json actualJson = new ImmutableFullScenario.Json();

    // Assert
    assertNull(actualJson.scenario);
    assertNull(actualJson.roadmap);
    assertNull(actualJson.ratings);
    assertNull(actualJson.axisDefinitions);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableFullScenario.copyOf(new ImmutableFullScenario.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableFullScenario.fromJson(new ImmutableFullScenario.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableFullScenario.Builder builderResult = ImmutableFullScenario.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableFullScenario.Json());
  }
  @Test
  public void ratingsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFullScenario.Json()).ratings();
  }
  @Test
  public void roadmapTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFullScenario.Json()).roadmap();
  }
  @Test
  public void scenarioTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFullScenario.Json()).scenario();
  }
  @Test
  public void setAxisDefinitionsTest() {
    // Arrange
    ImmutableFullScenario.Json json = new ImmutableFullScenario.Json();
    ArrayList<ScenarioAxisItem> scenarioAxisItemList = new ArrayList<ScenarioAxisItem>();
    scenarioAxisItemList.add(null);

    // Act
    json.setAxisDefinitions(scenarioAxisItemList);

    // Assert
    assertSame(scenarioAxisItemList, json.axisDefinitions);
  }
  @Test
  public void setRatingsTest() {
    // Arrange
    ImmutableFullScenario.Json json = new ImmutableFullScenario.Json();
    ArrayList<ScenarioRatingItem> scenarioRatingItemList = new ArrayList<ScenarioRatingItem>();
    scenarioRatingItemList.add(null);

    // Act
    json.setRatings(scenarioRatingItemList);

    // Assert
    assertSame(scenarioRatingItemList, json.ratings);
  }
}

