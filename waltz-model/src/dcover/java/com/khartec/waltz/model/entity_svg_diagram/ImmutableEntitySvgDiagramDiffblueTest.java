package com.khartec.waltz.model.entity_svg_diagram;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.ExternalIdProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntitySvgDiagramDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntitySvgDiagram.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntitySvgDiagram.Json actualJson = new ImmutableEntitySvgDiagram.Json();

    // Assert
    assertSame(actualJson.id, actualJson.externalId);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntitySvgDiagram.copyOf(new ImmutableEntitySvgDiagram.Json());
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntitySvgDiagram.Json()).description();
  }

  @Test
  public void entityReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntitySvgDiagram.Json()).entityReference();
  }

  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntitySvgDiagram.Json()).externalId();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntitySvgDiagram.fromJson(new ImmutableEntitySvgDiagram.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntitySvgDiagram.Builder builderResult = ImmutableEntitySvgDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntitySvgDiagram.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEntitySvgDiagram.Builder builderResult = ImmutableEntitySvgDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableEntitySvgDiagram.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEntitySvgDiagram.Builder builderResult = ImmutableEntitySvgDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableEntitySvgDiagram.Json());
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableEntitySvgDiagram.Builder builderResult = ImmutableEntitySvgDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableEntitySvgDiagram.Json());
  }

  @Test
  public void fromTest5() {
    // Arrange
    ImmutableEntitySvgDiagram.Builder builderResult = ImmutableEntitySvgDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableEntitySvgDiagram.Json());
  }

  @Test
  public void fromTest6() {
    // Arrange
    ImmutableEntitySvgDiagram.Builder builderResult = ImmutableEntitySvgDiagram.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ExternalIdProvider) new ImmutableEntitySvgDiagram.Json());
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntitySvgDiagram.Json()).id();
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntitySvgDiagram.Json()).name();
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntitySvgDiagram.Json()).provenance();
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableEntitySvgDiagram.Json json = new ImmutableEntitySvgDiagram.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutableEntitySvgDiagram.Json json = new ImmutableEntitySvgDiagram.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableEntitySvgDiagram.Json json = new ImmutableEntitySvgDiagram.Json();

    // Act
    json.setProvenance("provenance");

    // Assert
    assertEquals("provenance", json.provenance);
  }

  @Test
  public void setSvgTest() {
    // Arrange
    ImmutableEntitySvgDiagram.Json json = new ImmutableEntitySvgDiagram.Json();

    // Act
    json.setSvg("svg");

    // Assert
    assertEquals("svg", json.svg);
  }

  @Test
  public void svgTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntitySvgDiagram.Json()).svg();
  }
}

