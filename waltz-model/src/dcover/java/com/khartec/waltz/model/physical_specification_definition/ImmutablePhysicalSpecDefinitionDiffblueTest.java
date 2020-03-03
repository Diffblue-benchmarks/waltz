package com.khartec.waltz.model.physical_specification_definition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.CreatedProvider;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.ProvenanceProvider;
import com.khartec.waltz.model.ReleaseLifecycleStatus;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalSpecDefinitionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalSpecDefinition.copyOf(new ImmutablePhysicalSpecDefinition.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecDefinition.fromJson(new ImmutablePhysicalSpecDefinition.Json());
  }

  @Test
  public void fromTest5() {
    // Arrange
    ImmutablePhysicalSpecDefinition.Builder builderResult = ImmutablePhysicalSpecDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalSpecDefinition.Json());
  }

  @Test
  public void fromTest4() {
    // Arrange
    ImmutablePhysicalSpecDefinition.Builder builderResult = ImmutablePhysicalSpecDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutablePhysicalSpecDefinition.Json());
  }

  @Test
  public void fromTest3() {
    // Arrange
    ImmutablePhysicalSpecDefinition.Builder builderResult = ImmutablePhysicalSpecDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((ProvenanceProvider) new ImmutablePhysicalSpecDefinition.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecDefinition.builder().build();
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePhysicalSpecDefinition.Builder builderResult = ImmutablePhysicalSpecDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutablePhysicalSpecDefinition.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalSpecDefinition.Builder builderResult = ImmutablePhysicalSpecDefinition.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CreatedProvider) new ImmutablePhysicalSpecDefinition.Json());
  }

  @Test
  public void createdByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinition.Json()).createdBy();
  }

  @Test
  public void setVersionTest() {
    // Arrange
    ImmutablePhysicalSpecDefinition.Json json = new ImmutablePhysicalSpecDefinition.Json();

    // Act
    json.setVersion("foo");

    // Assert
    assertEquals("foo", json.version);
  }

  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutablePhysicalSpecDefinition.Json json = new ImmutablePhysicalSpecDefinition.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }

  @Test
  public void createdAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinition.Json()).createdAt();
  }

  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinition.Json()).lastUpdatedBy();
  }

  @Test
  public void setSpecificationIdTest() {
    // Arrange
    ImmutablePhysicalSpecDefinition.Json json = new ImmutablePhysicalSpecDefinition.Json();

    // Act
    json.setSpecificationId(123L);

    // Assert
    assertTrue(json.specificationIdIsSet);
    assertEquals(123L, json.specificationId);
  }

  @Test
  public void setCreatedByTest() {
    // Arrange
    ImmutablePhysicalSpecDefinition.Json json = new ImmutablePhysicalSpecDefinition.Json();

    // Act
    json.setCreatedBy("foo");

    // Assert
    assertEquals("foo", json.createdBy);
  }

  @Test
  public void provenanceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinition.Json()).provenance();
  }

  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinition.Json()).id();
  }

  @Test
  public void setTypeTest() {
    // Arrange
    ImmutablePhysicalSpecDefinition.Json json = new ImmutablePhysicalSpecDefinition.Json();

    // Act
    json.setType(PhysicalSpecDefinitionType.DELIMITED);

    // Assert
    assertEquals(PhysicalSpecDefinitionType.DELIMITED, json.type);
  }

  @Test
  public void delimiterTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinition.Json()).delimiter();
  }

  @Test
  public void setStatusTest() {
    // Arrange
    ImmutablePhysicalSpecDefinition.Json json = new ImmutablePhysicalSpecDefinition.Json();

    // Act
    json.setStatus(ReleaseLifecycleStatus.DRAFT);

    // Assert
    assertEquals(ReleaseLifecycleStatus.DRAFT, json.status);
  }

  @Test
  public void versionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinition.Json()).version();
  }

  @Test
  public void specificationIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinition.Json()).specificationId();
  }

  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinition.Json()).lastUpdatedAt();
  }

  @Test
  public void typeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinition.Json()).type();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalSpecDefinition.Json actualJson = new ImmutablePhysicalSpecDefinition.Json();

    // Assert
    assertSame(actualJson.id, actualJson.delimiter);
  }

  @Test
  public void statusTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinition.Json()).status();
  }

  @Test
  public void setProvenanceTest() {
    // Arrange
    ImmutablePhysicalSpecDefinition.Json json = new ImmutablePhysicalSpecDefinition.Json();

    // Act
    json.setProvenance("foo");

    // Assert
    assertEquals("foo", json.provenance);
  }
}

