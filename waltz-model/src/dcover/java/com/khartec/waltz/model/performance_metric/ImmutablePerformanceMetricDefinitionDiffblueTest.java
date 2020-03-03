package com.khartec.waltz.model.performance_metric;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePerformanceMetricDefinitionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePerformanceMetricDefinition.fromJson(new ImmutablePerformanceMetricDefinition.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePerformanceMetricDefinition.copyOf(new ImmutablePerformanceMetricDefinition.Json());
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutablePerformanceMetricDefinition.Json json = new ImmutablePerformanceMetricDefinition.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerformanceMetricDefinition.Json()).name();
  }
  @Test
  public void categoryNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerformanceMetricDefinition.Json()).categoryName();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerformanceMetricDefinition.Json()).description();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutablePerformanceMetricDefinition.Json json = new ImmutablePerformanceMetricDefinition.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerformanceMetricDefinition.Json()).id();
  }
  @Test
  public void setCategoryDescriptionTest() {
    // Arrange
    ImmutablePerformanceMetricDefinition.Json json = new ImmutablePerformanceMetricDefinition.Json();

    // Act
    json.setCategoryDescription("foo");

    // Assert
    assertEquals("foo", json.categoryDescription);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePerformanceMetricDefinition.Json actualJson = new ImmutablePerformanceMetricDefinition.Json();

    // Assert
    assertNull(actualJson.categoryName);
    assertNull(actualJson.name);
    assertNull(actualJson.categoryDescription);
    assertNull(actualJson.description);
  }
  @Test
  public void setCategoryNameTest() {
    // Arrange
    ImmutablePerformanceMetricDefinition.Json json = new ImmutablePerformanceMetricDefinition.Json();

    // Act
    json.setCategoryName("name");

    // Assert
    assertEquals("name", json.categoryName);
  }
  @Test
  public void categoryDescriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePerformanceMetricDefinition.Json()).categoryDescription();
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutablePerformanceMetricDefinition.Builder builderResult = ImmutablePerformanceMetricDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutablePerformanceMetricDefinition.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePerformanceMetricDefinition.builder().build();
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutablePerformanceMetricDefinition.Builder builderResult = ImmutablePerformanceMetricDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutablePerformanceMetricDefinition.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePerformanceMetricDefinition.Builder builderResult = ImmutablePerformanceMetricDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutablePerformanceMetricDefinition.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePerformanceMetricDefinition.Builder builderResult = ImmutablePerformanceMetricDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePerformanceMetricDefinition.Json());
  }
}

