package com.khartec.waltz.model.physical_specification_definition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.NameProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalSpecDefinitionSampleFileDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecDefinitionSampleFile.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalSpecDefinitionSampleFile.Json actualJson = new ImmutablePhysicalSpecDefinitionSampleFile.Json();

    // Assert
    assertEquals(0L, actualJson.specDefinitionId);
    assertNull(actualJson.name);
    assertNull(actualJson.fileData);
    assertFalse(actualJson.specDefinitionIdIsSet);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalSpecDefinitionSampleFile.copyOf(new ImmutablePhysicalSpecDefinitionSampleFile.Json());
  }
  @Test
  public void fileDataTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionSampleFile.Json()).fileData();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecDefinitionSampleFile.fromJson(new ImmutablePhysicalSpecDefinitionSampleFile.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionSampleFile.Builder builderResult = ImmutablePhysicalSpecDefinitionSampleFile
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutablePhysicalSpecDefinitionField.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePhysicalSpecDefinitionSampleFile.Builder builderResult = ImmutablePhysicalSpecDefinitionSampleFile
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalSpecDefinitionSampleFile.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutablePhysicalSpecDefinitionSampleFile.Builder builderResult = ImmutablePhysicalSpecDefinitionSampleFile
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalSpecDefinition.Json());
  }
  @Test
  public void idTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionSampleFile.Json()).id();
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionSampleFile.Json()).name();
  }
  @Test
  public void setFileDataTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionSampleFile.Json json = new ImmutablePhysicalSpecDefinitionSampleFile.Json();

    // Act
    json.setFileData("fileData");

    // Assert
    assertEquals("fileData", json.fileData);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionSampleFile.Json json = new ImmutablePhysicalSpecDefinitionSampleFile.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setSpecDefinitionIdTest() {
    // Arrange
    ImmutablePhysicalSpecDefinitionSampleFile.Json json = new ImmutablePhysicalSpecDefinitionSampleFile.Json();

    // Act
    json.setSpecDefinitionId(123L);

    // Assert
    assertEquals(123L, json.specDefinitionId);
    assertTrue(json.specDefinitionIdIsSet);
  }
  @Test
  public void specDefinitionIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecDefinitionSampleFile.Json()).specDefinitionId();
  }
}

