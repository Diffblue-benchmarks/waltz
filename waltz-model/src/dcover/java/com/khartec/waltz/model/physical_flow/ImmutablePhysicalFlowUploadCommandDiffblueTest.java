package com.khartec.waltz.model.physical_flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalFlowUploadCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void basisOffsetTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).basisOffset();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowUploadCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalFlowUploadCommand.Json actualJson = new ImmutablePhysicalFlowUploadCommand.Json();

    // Assert
    assertNull(actualJson.target);
    assertNull(actualJson.basisOffset);
    assertNull(actualJson.name);
    assertNull(actualJson.specDescription);
    assertNull(actualJson.specExternalId);
    assertNull(actualJson.owner);
    assertNull(actualJson.dataType);
    assertNull(actualJson.transport);
    assertNull(actualJson.source);
    assertNull(actualJson.externalId);
    assertNull(actualJson.description);
    assertNull(actualJson.criticality);
    assertNull(actualJson.format);
    assertNull(actualJson.frequency);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalFlowUploadCommand.copyOf(new ImmutablePhysicalFlowUploadCommand.Json());
  }
  @Test
  public void criticalityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).criticality();
  }
  @Test
  public void dataTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).dataType();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).description();
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).externalId();
  }
  @Test
  public void formatTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).format();
  }
  @Test
  public void frequencyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).frequency();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowUploadCommand.fromJson(new ImmutablePhysicalFlowUploadCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Builder builderResult = ImmutablePhysicalFlowUploadCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalFlowUploadCommand.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Builder builderResult = ImmutablePhysicalFlowUploadCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableFlowAttributes.Json());
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).name();
  }
  @Test
  public void ownerTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).owner();
  }
  @Test
  public void setBasisOffsetTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setBasisOffset("basisOffset");

    // Assert
    assertEquals("basisOffset", json.basisOffset);
  }
  @Test
  public void setCriticalityTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setCriticality("criticality");

    // Assert
    assertEquals("criticality", json.criticality);
  }
  @Test
  public void setDataTypeTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setDataType("dataType");

    // Assert
    assertEquals("dataType", json.dataType);
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setExternalIdTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setExternalId("123");

    // Assert
    assertEquals("123", json.externalId);
  }
  @Test
  public void setFormatTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setFormat("format");

    // Assert
    assertEquals("format", json.format);
  }
  @Test
  public void setFrequencyTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setFrequency("frequency");

    // Assert
    assertEquals("frequency", json.frequency);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void setOwnerTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setOwner("owner");

    // Assert
    assertEquals("owner", json.owner);
  }
  @Test
  public void setSourceTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setSource("source");

    // Assert
    assertEquals("source", json.source);
  }
  @Test
  public void setSpecDescriptionTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setSpecDescription("specDescription");

    // Assert
    assertEquals("specDescription", json.specDescription);
  }
  @Test
  public void setSpecExternalIdTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setSpecExternalId("123");

    // Assert
    assertEquals("123", json.specExternalId);
  }
  @Test
  public void setTargetTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setTarget("target");

    // Assert
    assertEquals("target", json.target);
  }
  @Test
  public void setTransportTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setTransport("transport");

    // Assert
    assertEquals("transport", json.transport);
  }
  @Test
  public void sourceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).source();
  }
  @Test
  public void specDescriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).specDescription();
  }
  @Test
  public void specExternalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).specExternalId();
  }
  @Test
  public void targetTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).target();
  }
  @Test
  public void transportTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).transport();
  }
}

