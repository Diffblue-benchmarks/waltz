package com.khartec.waltz.model.drill_grid;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableDrillGridDefinitionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableDrillGridDefinition.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableDrillGridDefinition.Json actualJson = new ImmutableDrillGridDefinition.Json();

    // Assert
    assertNull(actualJson.xAxis);
    assertNull(actualJson.name);
    assertNull(actualJson.yAxis);
    assertNull(actualJson.description);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableDrillGridDefinition.copyOf(new ImmutableDrillGridDefinition.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDrillGridDefinition.Json()).description();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableDrillGridDefinition.fromJson(new ImmutableDrillGridDefinition.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableDrillGridDefinition.Builder builderResult = ImmutableDrillGridDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableDrillGridDefinition.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableDrillGridDefinition.Builder builderResult = ImmutableDrillGridDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableDrillGridDefinition.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableDrillGridDefinition.Builder builderResult = ImmutableDrillGridDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableDrillGridDefinition.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableDrillGridDefinition.Builder builderResult = ImmutableDrillGridDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableDrillGridDefinition.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDrillGridDefinition.Json()).id();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDrillGridDefinition.Json()).name();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableDrillGridDefinition.Json json = new ImmutableDrillGridDefinition.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableDrillGridDefinition.Json json = new ImmutableDrillGridDefinition.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void xAxisTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDrillGridDefinition.Json()).xAxis();
  }
  @Test
  public void yAxisTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDrillGridDefinition.Json()).yAxis();
  }
}

