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
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalFlowUploadCommand.copyOf(new ImmutablePhysicalFlowUploadCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowUploadCommand.fromJson(new ImmutablePhysicalFlowUploadCommand.Json());
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
  public void fromTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Builder builderResult = ImmutablePhysicalFlowUploadCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalFlowUploadCommand.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowUploadCommand.builder().build();
  }
  @Test
  public void setCriticalityTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setCriticality("foo");

    // Assert
    assertEquals("foo", json.criticality);
  }
  @Test
  public void criticalityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).criticality();
  }
  @Test
  public void setFrequencyTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setFrequency("foo");

    // Assert
    assertEquals("foo", json.frequency);
  }
  @Test
  public void specExternalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).specExternalId();
  }
  @Test
  public void specDescriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).specDescription();
  }
  @Test
  public void setTransportTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setTransport("foo");

    // Assert
    assertEquals("foo", json.transport);
  }
  @Test
  public void setBasisOffsetTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setBasisOffset("foo");

    // Assert
    assertEquals("foo", json.basisOffset);
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
  public void setTargetTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setTarget("foo");

    // Assert
    assertEquals("foo", json.target);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).name();
  }
  @Test
  public void setDataTypeTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setDataType("foo");

    // Assert
    assertEquals("foo", json.dataType);
  }
  @Test
  public void transportTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).transport();
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
  public void basisOffsetTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).basisOffset();
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
  public void setOwnerTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setOwner("foo");

    // Assert
    assertEquals("foo", json.owner);
  }
  @Test
  public void frequencyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).frequency();
  }
  @Test
  public void formatTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).format();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).description();
  }
  @Test
  public void sourceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).source();
  }
  @Test
  public void setFormatTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setFormat("foo");

    // Assert
    assertEquals("foo", json.format);
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).externalId();
  }
  @Test
  public void setSourceTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setSource("foo");

    // Assert
    assertEquals("foo", json.source);
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
  public void dataTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).dataType();
  }
  @Test
  public void targetTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).target();
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
  public void setSpecDescriptionTest() {
    // Arrange
    ImmutablePhysicalFlowUploadCommand.Json json = new ImmutablePhysicalFlowUploadCommand.Json();

    // Act
    json.setSpecDescription("foo");

    // Assert
    assertEquals("foo", json.specDescription);
  }
  @Test
  public void ownerTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowUploadCommand.Json()).owner();
  }
}

