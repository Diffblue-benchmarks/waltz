package com.khartec.waltz.model.physical_specification_definition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalSpecDefinitionSampleFileCreateCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Builder builderResult = ImmutablePhysicalSpecDefinitionSampleFileCreateCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.builder().build();
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalSpecDefinitionSampleFileCreateCommand
        .copyOf(new ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecDefinitionSampleFileCreateCommand
        .fromJson(new ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Json());
  }

  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Json()).name();
  }

  @Test
  public void setNameTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Json json = new ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Json actualJson = new ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Json();

    // Assert
    assertNull(actualJson.fileData);
    assertNull(actualJson.name);
  }

  @Test
  public void fileDataTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Json()).fileData();
  }

  @Test
  public void setFileDataTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Json json = new ImmutablePhysicalSpecDefinitionSampleFileCreateCommand.Json();

    // Act
    json.setFileData("foo");

    // Assert
    assertEquals("foo", json.fileData);
  }
}

