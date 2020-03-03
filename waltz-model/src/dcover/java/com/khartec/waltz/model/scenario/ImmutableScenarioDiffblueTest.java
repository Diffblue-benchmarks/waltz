package com.khartec.waltz.model.scenario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityLifecycleStatus;
import com.khartec.waltz.model.EntityLifecycleStatusProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.PositionProvider;
import com.khartec.waltz.model.ReleaseLifecycleStatus;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableScenarioDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void roadmapIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenario.Json()).roadmapId();
  }
  @Test
  public void setRoadmapIdTest() {
    // Arrange
    ImmutableScenario.Json json = new ImmutableScenario.Json();

    // Act
    json.setRoadmapId(123L);

    // Assert
    assertTrue(json.roadmapIdIsSet);
    assertEquals(123L, json.roadmapId);
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableScenario.Json json = new ImmutableScenario.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void setScenarioTypeTest() {
    // Arrange
    ImmutableScenario.Json json = new ImmutableScenario.Json();

    // Act
    json.setScenarioType(ScenarioType.TARGET);

    // Assert
    assertEquals(ScenarioType.TARGET, json.scenarioType);
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenario.Json()).description();
  }
  @Test
  public void scenarioTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenario.Json()).scenarioType();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenario.Json()).lastUpdatedBy();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenario.Json()).id();
  }
  @Test
  public void releaseStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenario.Json()).releaseStatus();
  }
  @Test
  public void entityLifecycleStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenario.Json()).entityLifecycleStatus();
  }
  @Test
  public void setPositionTest() {
    // Arrange
    ImmutableScenario.Json json = new ImmutableScenario.Json();

    // Act
    json.setPosition(1);

    // Assert
    assertTrue(json.positionIsSet);
    assertEquals(1, json.position);
  }
  @Test
  public void setEntityLifecycleStatusTest() {
    // Arrange
    ImmutableScenario.Json json = new ImmutableScenario.Json();

    // Act
    json.setEntityLifecycleStatus(EntityLifecycleStatus.ACTIVE);

    // Assert
    assertEquals(EntityLifecycleStatus.ACTIVE, json.entityLifecycleStatus);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableScenario.Json json = new ImmutableScenario.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenario.Json()).name();
  }
  @Test
  public void setReleaseStatusTest() {
    // Arrange
    ImmutableScenario.Json json = new ImmutableScenario.Json();

    // Act
    json.setReleaseStatus(ReleaseLifecycleStatus.DRAFT);

    // Assert
    assertEquals(ReleaseLifecycleStatus.DRAFT, json.releaseStatus);
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenario.Json()).lastUpdatedAt();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableScenario.Json json = new ImmutableScenario.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableScenario.Json actualJson = new ImmutableScenario.Json();

    // Assert
    assertFalse(actualJson.roadmapIdIsSet);
    assertNull(actualJson.description);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.scenarioType);
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.releaseStatus);
    assertNull(actualJson.name);
    assertFalse(actualJson.positionIsSet);
    assertNull(actualJson.entityLifecycleStatus);
    assertEquals(0, actualJson.position);
    assertEquals(0L, actualJson.roadmapId);
    assertNull(actualJson.effectiveDate);
  }
  @Test
  public void effectiveDateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenario.Json()).effectiveDate();
  }
  @Test
  public void positionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableScenario.Json()).position();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableScenario.fromJson(new ImmutableScenario.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableScenario.copyOf(new ImmutableScenario.Json());
  }
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableScenario.Builder builderResult = ImmutableScenario.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableScenario.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableScenario.Builder builderResult = ImmutableScenario.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableScenario.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableScenario.builder().build();
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableScenario.Builder builderResult = ImmutableScenario.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableScenario.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableScenario.Builder builderResult = ImmutableScenario.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableScenario.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableScenario.Builder builderResult = ImmutableScenario.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityLifecycleStatusProvider) new ImmutableScenario.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableScenario.Builder builderResult = ImmutableScenario.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableScenario.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableScenario.Builder builderResult = ImmutableScenario.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((PositionProvider) new ImmutableScenario.Json());
  }
}

