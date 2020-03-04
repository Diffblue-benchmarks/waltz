package com.khartec.waltz.model.flow_diagram;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.NameProvider;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSaveDiagramCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void annotationsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveDiagramCommand.Json()).annotations();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSaveDiagramCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSaveDiagramCommand.Json actualJson = new ImmutableSaveDiagramCommand.Json();

    // Assert
    List<FlowDiagramAnnotation> actualFlowDiagramAnnotationList = actualJson.annotations;
    List<FlowDiagramEntity> flowDiagramEntityList = actualJson.entities;
    assertEquals(0, flowDiagramEntityList.size());
    assertSame(flowDiagramEntityList, actualFlowDiagramAnnotationList);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSaveDiagramCommand.copyOf(new ImmutableSaveDiagramCommand.Json());
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveDiagramCommand.Json()).description();
  }
  @Test
  public void diagramIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveDiagramCommand.Json()).diagramId();
  }
  @Test
  public void entitiesTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveDiagramCommand.Json()).entities();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSaveDiagramCommand.fromJson(new ImmutableSaveDiagramCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSaveDiagramCommand.Builder builderResult = ImmutableSaveDiagramCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableFlowDiagram.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSaveDiagramCommand.Builder builderResult = ImmutableSaveDiagramCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableFlowDiagram.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableSaveDiagramCommand.Builder builderResult = ImmutableSaveDiagramCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSaveDiagramCommand.Json());
  }
  @Test
  public void layoutDataTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveDiagramCommand.Json()).layoutData();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSaveDiagramCommand.Json()).name();
  }
  @Test
  public void setAnnotationsTest() {
    // Arrange
    ImmutableSaveDiagramCommand.Json json = new ImmutableSaveDiagramCommand.Json();
    ArrayList<FlowDiagramAnnotation> flowDiagramAnnotationList = new ArrayList<FlowDiagramAnnotation>();
    flowDiagramAnnotationList.add(new ImmutableFlowDiagramAnnotation.Json());

    // Act
    json.setAnnotations(flowDiagramAnnotationList);

    // Assert
    assertSame(flowDiagramAnnotationList, json.annotations);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableSaveDiagramCommand.Json json = new ImmutableSaveDiagramCommand.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setEntitiesTest() {
    // Arrange
    ImmutableSaveDiagramCommand.Json json = new ImmutableSaveDiagramCommand.Json();
    ArrayList<FlowDiagramEntity> flowDiagramEntityList = new ArrayList<FlowDiagramEntity>();
    flowDiagramEntityList.add(new ImmutableFlowDiagramEntity.Json());

    // Act
    json.setEntities(flowDiagramEntityList);

    // Assert
    assertSame(flowDiagramEntityList, json.entities);
  }
  @Test
  public void setLayoutDataTest() {
    // Arrange
    ImmutableSaveDiagramCommand.Json json = new ImmutableSaveDiagramCommand.Json();

    // Act
    json.setLayoutData("layoutData");

    // Assert
    assertEquals("layoutData", json.layoutData);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableSaveDiagramCommand.Json json = new ImmutableSaveDiagramCommand.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
}

