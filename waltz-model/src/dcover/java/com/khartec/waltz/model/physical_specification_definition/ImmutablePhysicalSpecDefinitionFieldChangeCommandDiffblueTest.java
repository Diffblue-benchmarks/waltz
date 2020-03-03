package com.khartec.waltz.model.physical_specification_definition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.DescriptionProvider;
import com.khartec.waltz.model.FieldDataType;
import com.khartec.waltz.model.NameProvider;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalSpecDefinitionFieldChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecDefinitionFieldChangeCommand
        .fromJson(new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalSpecDefinitionFieldChangeCommand
        .copyOf(new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json());
  }
  @Test
  public void logicalDataElementIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json()).logicalDataElementId();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json()).description();
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json()).id();
  }
  @Test
  public void setPositionTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json json = new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json();

    // Act
    json.setPosition(1);

    // Assert
    assertEquals(1, json.position);
    assertTrue(json.positionIsSet);
  }
  @Test
  public void setTypeTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json json = new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json();

    // Act
    json.setType(FieldDataType.DATE);

    // Assert
    assertEquals(FieldDataType.DATE, json.type);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json json = new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json()).name();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json json = new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json actualJson = new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json();

    // Assert
    Optional<Long> optional = actualJson.id;
    assertSame(actualJson.logicalDataElementId, optional);
    assertSame(optional, actualJson.logicalDataElementId);
  }
  @Test
  public void typeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json()).type();
  }
  @Test
  public void positionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json()).position();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecDefinitionFieldChangeCommand.builder().build();
  }
  @Test
  public void fromTest4() {
    // Arrange
    ImmutablePhysicalSpecDefinitionFieldChangeCommand.Builder builderResult = ImmutablePhysicalSpecDefinitionFieldChangeCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalSpecDefinition.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutablePhysicalSpecDefinitionFieldChangeCommand.Builder builderResult = ImmutablePhysicalSpecDefinitionFieldChangeCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalSpecDefinitionFieldChangeCommand.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePhysicalSpecDefinitionFieldChangeCommand.Builder builderResult = ImmutablePhysicalSpecDefinitionFieldChangeCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutablePhysicalSpecDefinitionField.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionFieldChangeCommand.Builder builderResult = ImmutablePhysicalSpecDefinitionFieldChangeCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutablePhysicalSpecDefinitionField.Json());
  }
}

