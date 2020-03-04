package com.khartec.waltz.model.svg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSvgDiagramDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSvgDiagram.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSvgDiagram.Json actualJson = new ImmutableSvgDiagram.Json();

    // Assert
    assertNull(actualJson.displayWidthPercent);
    assertNull(actualJson.name);
    assertNull(actualJson.displayHeightPercent);
    assertNull(actualJson.description);
    assertEquals(0, actualJson.priority);
    assertNull(actualJson.svg);
    assertFalse(actualJson.priorityIsSet);
    assertNull(actualJson.group);
    assertNull(actualJson.product);
    assertNull(actualJson.keyProperty);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSvgDiagram.copyOf(new ImmutableSvgDiagram.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSvgDiagram.Json()).description();
  }
  @Test
  public void displayHeightPercentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSvgDiagram.Json()).displayHeightPercent();
  }
  @Test
  public void displayWidthPercentTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSvgDiagram.Json()).displayWidthPercent();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSvgDiagram.fromJson(new ImmutableSvgDiagram.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSvgDiagram.Builder builderResult = ImmutableSvgDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableSvgDiagram.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSvgDiagram.Builder builderResult = ImmutableSvgDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableSvgDiagram.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableSvgDiagram.Builder builderResult = ImmutableSvgDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableSvgDiagram.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableSvgDiagram.Builder builderResult = ImmutableSvgDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSvgDiagram.Json());
  }
  @Test
  public void groupTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSvgDiagram.Json()).group();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSvgDiagram.Json()).id();
  }
  @Test
  public void keyPropertyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSvgDiagram.Json()).keyProperty();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSvgDiagram.Json()).name();
  }
  @Test
  public void priorityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSvgDiagram.Json()).priority();
  }
  @Test
  public void productTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSvgDiagram.Json()).product();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableSvgDiagram.Json json = new ImmutableSvgDiagram.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setDisplayHeightPercentTest() {
    // Arrange
    ImmutableSvgDiagram.Json json = new ImmutableSvgDiagram.Json();

    // Act
    json.setDisplayHeightPercent(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), json.displayHeightPercent);
  }
  @Test
  public void setDisplayWidthPercentTest() {
    // Arrange
    ImmutableSvgDiagram.Json json = new ImmutableSvgDiagram.Json();

    // Act
    json.setDisplayWidthPercent(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), json.displayWidthPercent);
  }
  @Test
  public void setGroupTest() {
    // Arrange
    ImmutableSvgDiagram.Json json = new ImmutableSvgDiagram.Json();

    // Act
    json.setGroup("group");

    // Assert
    assertEquals("group", json.group);
  }
  @Test
  public void setKeyPropertyTest() {
    // Arrange
    ImmutableSvgDiagram.Json json = new ImmutableSvgDiagram.Json();

    // Act
    json.setKeyProperty("keyProperty");

    // Assert
    assertEquals("keyProperty", json.keyProperty);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableSvgDiagram.Json json = new ImmutableSvgDiagram.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setPriorityTest() {
    // Arrange
    ImmutableSvgDiagram.Json json = new ImmutableSvgDiagram.Json();

    // Act
    json.setPriority(1);

    // Assert
    assertEquals(1, json.priority);
    assertTrue(json.priorityIsSet);
  }
  @Test
  public void setProductTest() {
    // Arrange
    ImmutableSvgDiagram.Json json = new ImmutableSvgDiagram.Json();

    // Act
    json.setProduct("product");

    // Assert
    assertEquals("product", json.product);
  }
  @Test
  public void setSvgTest() {
    // Arrange
    ImmutableSvgDiagram.Json json = new ImmutableSvgDiagram.Json();

    // Act
    json.setSvg("svg");

    // Assert
    assertEquals("svg", json.svg);
  }
  @Test
  public void svgTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSvgDiagram.Json()).svg();
  }
}

