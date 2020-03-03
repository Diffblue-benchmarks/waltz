package com.khartec.waltz.model.physical_flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.Criticality;
import com.khartec.waltz.model.physical_specification.DataFormatKind;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalFlowParsedDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void sourceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).source();
  }
  @Test
  public void criticalityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).criticality();
  }
  @Test
  public void dataTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).dataType();
  }
  @Test
  public void setBasisOffsetTest() {
    // Arrange
    ImmutablePhysicalFlowParsed.Json json = new ImmutablePhysicalFlowParsed.Json();

    // Act
    json.setBasisOffset(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), json.basisOffset);
  }
  @Test
  public void setFrequencyTest() {
    // Arrange
    ImmutablePhysicalFlowParsed.Json json = new ImmutablePhysicalFlowParsed.Json();

    // Act
    json.setFrequency(FrequencyKind.ON_DEMAND);

    // Assert
    assertEquals(FrequencyKind.ON_DEMAND, json.frequency);
  }
  @Test
  public void specExternalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).specExternalId();
  }
  @Test
  public void specDescriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).specDescription();
  }
  @Test
  public void setTransportTest() {
    // Arrange
    ImmutablePhysicalFlowParsed.Json json = new ImmutablePhysicalFlowParsed.Json();

    // Act
    json.setTransport("foo");

    // Assert
    assertEquals("foo", json.transport);
  }
  @Test
  public void formatTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).format();
  }
  @Test
  public void setExternalIdTest() {
    // Arrange
    ImmutablePhysicalFlowParsed.Json json = new ImmutablePhysicalFlowParsed.Json();

    // Act
    json.setExternalId("123");

    // Assert
    assertEquals("123", json.externalId);
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).name();
  }
  @Test
  public void transportTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).transport();
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutablePhysicalFlowParsed.Json json = new ImmutablePhysicalFlowParsed.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
  @Test
  public void frequencyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).frequency();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalFlowParsed.Json actualJson = new ImmutablePhysicalFlowParsed.Json();

    // Assert
    assertNull(actualJson.owner);
    assertNull(actualJson.specExternalId);
    assertNull(actualJson.specDescription);
    assertNull(actualJson.name);
    assertNull(actualJson.basisOffset);
    assertNull(actualJson.frequency);
    assertNull(actualJson.target);
    assertNull(actualJson.transport);
    assertNull(actualJson.source);
    assertNull(actualJson.criticality);
    assertNull(actualJson.format);
    assertNull(actualJson.externalId);
    assertNull(actualJson.description);
    assertNull(actualJson.dataType);
  }
  @Test
  public void targetTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).target();
  }
  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).description();
  }
  @Test
  public void setFormatTest() {
    // Arrange
    ImmutablePhysicalFlowParsed.Json json = new ImmutablePhysicalFlowParsed.Json();

    // Act
    json.setFormat(DataFormatKind.BINARY);

    // Assert
    assertEquals(DataFormatKind.BINARY, json.format);
  }
  @Test
  public void externalIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).externalId();
  }
  @Test
  public void setCriticalityTest() {
    // Arrange
    ImmutablePhysicalFlowParsed.Json json = new ImmutablePhysicalFlowParsed.Json();

    // Act
    json.setCriticality(Criticality.LOW);

    // Assert
    assertEquals(Criticality.LOW, json.criticality);
  }
  @Test
  public void basisOffsetTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).basisOffset();
  }
  @Test
  public void ownerTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalFlowParsed.Json()).owner();
  }
  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutablePhysicalFlowParsed.Json json = new ImmutablePhysicalFlowParsed.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }
  @Test
  public void setSpecExternalIdTest() {
    // Arrange
    ImmutablePhysicalFlowParsed.Json json = new ImmutablePhysicalFlowParsed.Json();

    // Act
    json.setSpecExternalId("123");

    // Assert
    assertEquals("123", json.specExternalId);
  }
  @Test
  public void setSpecDescriptionTest() {
    // Arrange
    ImmutablePhysicalFlowParsed.Json json = new ImmutablePhysicalFlowParsed.Json();

    // Act
    json.setSpecDescription("foo");

    // Assert
    assertEquals("foo", json.specDescription);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalFlowParsed.copyOf(new ImmutablePhysicalFlowParsed.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowParsed.fromJson(new ImmutablePhysicalFlowParsed.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalFlowParsed.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalFlowParsed.Builder builderResult = ImmutablePhysicalFlowParsed.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalFlowParsed.Json());
  }
}

