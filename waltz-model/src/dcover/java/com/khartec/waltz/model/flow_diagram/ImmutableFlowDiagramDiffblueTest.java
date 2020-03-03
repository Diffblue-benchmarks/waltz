package com.khartec.waltz.model.flow_diagram;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.EntityKind;
import com.khartec.waltz.model.EntityKindProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.IsRemovedProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableFlowDiagramDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest7() {
    // Arrange
    ImmutableFlowDiagram.Builder builderResult = ImmutableFlowDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableFlowDiagram.Json());
  }
  @Test
  public void fromTest6() {
    // Arrange
    ImmutableFlowDiagram.Builder builderResult = ImmutableFlowDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((EntityKindProvider) new ImmutableFlowDiagram.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableFlowDiagram.builder().build();
  }
  @Test
  public void fromTest5() {
    // Arrange
    ImmutableFlowDiagram.Builder builderResult = ImmutableFlowDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableFlowDiagram.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutableFlowDiagram.Builder builderResult = ImmutableFlowDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableFlowDiagram.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableFlowDiagram.Builder builderResult = ImmutableFlowDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableFlowDiagram.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableFlowDiagram.Builder builderResult = ImmutableFlowDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableFlowDiagram.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableFlowDiagram.Builder builderResult = ImmutableFlowDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IsRemovedProvider) new ImmutableFlowDiagram.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableFlowDiagram.copyOf(new ImmutableFlowDiagram.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableFlowDiagram.fromJson(new ImmutableFlowDiagram.Json());
  }
  @Test
  public void kindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagram.Json()).kind();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableFlowDiagram.Json json = new ImmutableFlowDiagram.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagram.Json()).description();
  }
  @Test
  public void setLayoutDataTest() {
    // Arrange
    ImmutableFlowDiagram.Json json = new ImmutableFlowDiagram.Json();

    // Act
    json.setLayoutData("foo");

    // Assert
    assertEquals("foo", json.layoutData);
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagram.Json()).lastUpdatedBy();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagram.Json()).id();
  }
  @Test
  public void setKindTest() {
    // Arrange
    ImmutableFlowDiagram.Json json = new ImmutableFlowDiagram.Json();

    // Act
    json.setKind(EntityKind.ACTOR);

    // Assert
    assertEquals(EntityKind.ACTOR, json.kind);
  }
  @Test
  public void setIsRemovedTest() {
    // Arrange
    ImmutableFlowDiagram.Json json = new ImmutableFlowDiagram.Json();

    // Act
    json.setIsRemoved(true);

    // Assert
    assertTrue(json.isRemovedIsSet);
    assertTrue(json.isRemoved);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableFlowDiagram.Json json = new ImmutableFlowDiagram.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagram.Json()).name();
  }
  @Test
  public void layoutDataTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagram.Json()).layoutData();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagram.Json()).lastUpdatedAt();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableFlowDiagram.Json json = new ImmutableFlowDiagram.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableFlowDiagram.Json actualJson = new ImmutableFlowDiagram.Json();

    // Assert
    assertNull(actualJson.kind);
    assertNull(actualJson.description);
    assertNull(actualJson.name);
    assertNull(actualJson.layoutData);
    assertFalse(actualJson.isRemovedIsSet);
    assertFalse(actualJson.isRemoved);
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.lastUpdatedAt);
  }
  @Test
  public void isRemovedTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowDiagram.Json()).isRemoved();
  }
}

