package com.khartec.waltz.model.roadmap;

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
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableRoadmapDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRoadmap.builder().build();
  }

  @Test
  public void columnTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmap.Json()).columnType();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableRoadmap.Json actualJson = new ImmutableRoadmap.Json();

    // Assert
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.entityLifecycleStatus);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.columnType);
    assertNull(actualJson.description);
    assertNull(actualJson.name);
    assertFalse(actualJson.ratingSchemeIdIsSet);
    assertEquals(0L, actualJson.ratingSchemeId);
    assertNull(actualJson.rowType);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableRoadmap.copyOf(new ImmutableRoadmap.Json());
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmap.Json()).description();
  }

  @Test
  public void entityLifecycleStatusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmap.Json()).entityLifecycleStatus();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableRoadmap.fromJson(new ImmutableRoadmap.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableRoadmap.Builder builderResult = ImmutableRoadmap.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableRoadmap.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableRoadmap.Builder builderResult = ImmutableRoadmap.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableRoadmap.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableRoadmap.Builder builderResult = ImmutableRoadmap.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableRoadmap.Json());
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableRoadmap.Builder builderResult = ImmutableRoadmap.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableRoadmap.Json());
  }

  @Test
  public void fromTest5() {
    // Arrange
    ImmutableRoadmap.Builder builderResult = ImmutableRoadmap.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableRoadmap.Json());
  }

  @Test
  public void fromTest6() {
    // Arrange
    ImmutableRoadmap.Builder builderResult = ImmutableRoadmap.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityLifecycleStatusProvider) new ImmutableRoadmap.Json());
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmap.Json()).id();
  }

  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmap.Json()).lastUpdatedAt();
  }

  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmap.Json()).lastUpdatedBy();
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmap.Json()).name();
  }

  @Test
  public void ratingSchemeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmap.Json()).ratingSchemeId();
  }

  @Test
  public void rowTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableRoadmap.Json()).rowType();
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableRoadmap.Json json = new ImmutableRoadmap.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void setEntityLifecycleStatusTest() {
    // Arrange
    ImmutableRoadmap.Json json = new ImmutableRoadmap.Json();

    // Act
    json.setEntityLifecycleStatus(EntityLifecycleStatus.ACTIVE);

    // Assert
    assertEquals(EntityLifecycleStatus.ACTIVE, json.entityLifecycleStatus);
  }

  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableRoadmap.Json json = new ImmutableRoadmap.Json();

    // Act
    json.setLastUpdatedBy("lastUpdatedBy");

    // Assert
    assertEquals("lastUpdatedBy", json.lastUpdatedBy);
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutableRoadmap.Json json = new ImmutableRoadmap.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }

  @Test
  public void setRatingSchemeIdTest() {
    // Arrange
    ImmutableRoadmap.Json json = new ImmutableRoadmap.Json();

    // Act
    json.setRatingSchemeId(123L);

    // Assert
    assertTrue(json.ratingSchemeIdIsSet);
    assertEquals(123L, json.ratingSchemeId);
  }
}

