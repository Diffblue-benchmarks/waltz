package com.khartec.waltz.model.entity_statistic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.NameProvider;
import com.khartec.waltz.model.ParentIdProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableEntityStatisticDefinitionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityStatisticDefinition.builder().build();
  }

  @Test
  public void fromTest6() {
    // Arrange
    ImmutableEntityStatisticDefinition.Builder builderResult = ImmutableEntityStatisticDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutableEntityStatisticDefinition.Json());
  }

  @Test
  public void fromTest5() {
    // Arrange
    ImmutableEntityStatisticDefinition.Builder builderResult = ImmutableEntityStatisticDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableEntityStatisticDefinition.Json());
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutableEntityStatisticDefinition.Builder builderResult = ImmutableEntityStatisticDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableEntityStatisticDefinition.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutableEntityStatisticDefinition.Builder builderResult = ImmutableEntityStatisticDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableEntityStatisticDefinition.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableEntityStatisticDefinition.Builder builderResult = ImmutableEntityStatisticDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableEntityStatisticDefinition.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableEntityStatisticDefinition.Builder builderResult = ImmutableEntityStatisticDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ParentIdProvider) new ImmutableEntityStatisticDefinition.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableEntityStatisticDefinition.fromJson(new ImmutableEntityStatisticDefinition.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableEntityStatisticDefinition.copyOf(new ImmutableEntityStatisticDefinition.Json());
  }

  @Test
  public void typeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticDefinition.Json()).type();
  }

  @Test
  public void activeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticDefinition.Json()).active();
  }

  @Test
  public void rollupVisibilityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticDefinition.Json()).rollupVisibility();
  }

  @Test
  public void entityVisibilityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticDefinition.Json()).entityVisibility();
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticDefinition.Json()).name();
  }

  @Test
  public void setActiveTest() {
    // Arrange
    ImmutableEntityStatisticDefinition.Json json = new ImmutableEntityStatisticDefinition.Json();

    // Act
    json.setActive(true);

    // Assert
    assertTrue(json.active);
    assertTrue(json.activeIsSet);
  }

  @Test
  public void parentIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticDefinition.Json()).parentId();
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutableEntityStatisticDefinition.Json json = new ImmutableEntityStatisticDefinition.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }

  @Test
  public void historicRendererTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticDefinition.Json()).historicRenderer();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableEntityStatisticDefinition.Json actualJson = new ImmutableEntityStatisticDefinition.Json();

    // Assert
    assertSame(actualJson.id, actualJson.parentId);
  }

  @Test
  public void setRollupVisibilityTest() {
    // Arrange
    ImmutableEntityStatisticDefinition.Json json = new ImmutableEntityStatisticDefinition.Json();

    // Act
    json.setRollupVisibility(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), json.rollupVisibility);
  }

  @Test
  public void setRendererTest() {
    // Arrange
    ImmutableEntityStatisticDefinition.Json json = new ImmutableEntityStatisticDefinition.Json();

    // Act
    json.setRenderer("foo");

    // Assert
    assertEquals("foo", json.renderer);
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutableEntityStatisticDefinition.Json json = new ImmutableEntityStatisticDefinition.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }

  @Test
  public void rendererTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticDefinition.Json()).renderer();
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticDefinition.Json()).description();
  }

  @Test
  public void setEntityVisibilityTest() {
    // Arrange
    ImmutableEntityStatisticDefinition.Json json = new ImmutableEntityStatisticDefinition.Json();

    // Act
    json.setEntityVisibility(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), json.entityVisibility);
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticDefinition.Json()).provenance();
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticDefinition.Json()).id();
  }

  @Test
  public void rollupKindTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticDefinition.Json()).rollupKind();
  }

  @Test
  public void setTypeTest() {
    // Arrange
    ImmutableEntityStatisticDefinition.Json json = new ImmutableEntityStatisticDefinition.Json();

    // Act
    json.setType(StatisticType.BOOLEAN);

    // Assert
    assertEquals(StatisticType.BOOLEAN, json.type);
  }

  @Test
  public void categoryTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableEntityStatisticDefinition.Json()).category();
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableEntityStatisticDefinition.Json json = new ImmutableEntityStatisticDefinition.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void setRollupKindTest() {
    // Arrange
    ImmutableEntityStatisticDefinition.Json json = new ImmutableEntityStatisticDefinition.Json();

    // Act
    json.setRollupKind(RollupKind.COUNT_BY_ENTITY);

    // Assert
    assertEquals(RollupKind.COUNT_BY_ENTITY, json.rollupKind);
  }

  @Test
  public void setCategoryTest() {
    // Arrange
    ImmutableEntityStatisticDefinition.Json json = new ImmutableEntityStatisticDefinition.Json();

    // Act
    json.setCategory(StatisticCategory.COMPLIANCE);

    // Assert
    assertEquals(StatisticCategory.COMPLIANCE, json.category);
  }

  @Test
  public void setHistoricRendererTest() {
    // Arrange
    ImmutableEntityStatisticDefinition.Json json = new ImmutableEntityStatisticDefinition.Json();

    // Act
    json.setHistoricRenderer("foo");

    // Assert
    assertEquals("foo", json.historicRenderer);
  }
}

