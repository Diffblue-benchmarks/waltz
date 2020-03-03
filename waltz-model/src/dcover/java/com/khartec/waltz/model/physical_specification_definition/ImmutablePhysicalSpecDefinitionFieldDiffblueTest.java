package com.khartec.waltz.model.physical_specification_definition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.FieldDataType;
import com.khartec.waltz.model.IdProvider;
import com.khartec.waltz.model.LastUpdatedProvider;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalSpecDefinitionFieldDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromTest5() {
    // Arrange
    ImmutablePhysicalSpecDefinitionField.Builder builderResult = ImmutablePhysicalSpecDefinitionField.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutablePhysicalSpecDefinitionField.Json());
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutablePhysicalSpecDefinitionField.Builder builderResult = ImmutablePhysicalSpecDefinitionField.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutablePhysicalSpecDefinition.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutablePhysicalSpecDefinitionField.Builder builderResult = ImmutablePhysicalSpecDefinitionField.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutablePhysicalSpecDefinitionField.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecDefinitionField.builder().build();
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePhysicalSpecDefinitionField.Builder builderResult = ImmutablePhysicalSpecDefinitionField.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalSpecDefinitionField.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionField.Builder builderResult = ImmutablePhysicalSpecDefinitionField.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutablePhysicalSpecDefinition.Json());
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionField.Json json = new ImmutablePhysicalSpecDefinitionField.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void logicalDataElementIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionField.Json()).logicalDataElementId();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionField.Json()).description();
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionField.Json()).lastUpdatedBy();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionField.Json()).id();
  }
  @Test
  public void setPositionTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionField.Json json = new ImmutablePhysicalSpecDefinitionField.Json();

    // Act
    json.setPosition(1);

    // Assert
    assertTrue(json.positionIsSet);
    assertEquals(1, json.position);
  }
  @Test
  public void setTypeTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionField.Json json = new ImmutablePhysicalSpecDefinitionField.Json();

    // Act
    json.setType(FieldDataType.DATE);

    // Assert
    assertEquals(FieldDataType.DATE, json.type);
  }
  @Test
  public void setSpecDefinitionIdTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionField.Json json = new ImmutablePhysicalSpecDefinitionField.Json();

    // Act
    json.setSpecDefinitionId(123L);

    // Assert
    assertTrue(json.specDefinitionIdIsSet);
    assertEquals(123L, json.specDefinitionId);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionField.Json json = new ImmutablePhysicalSpecDefinitionField.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionField.Json()).name();
  }
  @Test
  public void specDefinitionIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionField.Json()).specDefinitionId();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionField.Json()).lastUpdatedAt();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionField.Json json = new ImmutablePhysicalSpecDefinitionField.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalSpecDefinitionField.Json actualJson = new ImmutablePhysicalSpecDefinitionField.Json();

    // Assert
    assertSame(actualJson.id, actualJson.logicalDataElementId);
  }
  @Test
  public void typeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionField.Json()).type();
  }
  @Test
  public void positionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionField.Json()).position();
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalSpecDefinitionField.copyOf(new ImmutablePhysicalSpecDefinitionField.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecDefinitionField.fromJson(new ImmutablePhysicalSpecDefinitionField.Json());
  }
}

