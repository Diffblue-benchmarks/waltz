package com.khartec.waltz.model.physical_flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.khartec.waltz.model.Criticality;
import com.khartec.waltz.model.DescriptionProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableFlowAttributesDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableFlowAttributes.copyOf(new ImmutableFlowAttributes.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableFlowAttributes.fromJson(new ImmutableFlowAttributes.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableFlowAttributes.Builder builderResult = ImmutableFlowAttributes.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableFlowAttributes.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableFlowAttributes.Builder builderResult = ImmutableFlowAttributes.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((DescriptionProvider) new ImmutableFlowAttributes.Json());
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableFlowAttributes.builder().build();
  }

  @Test
  public void criticalityTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowAttributes.Json()).criticality();
  }

  @Test
  public void setTransportTest() {
    // Arrange
    ImmutableFlowAttributes.Json json = new ImmutableFlowAttributes.Json();

    // Act
    json.setTransport("foo");

    // Assert
    assertEquals("foo", json.transport);
  }

  @Test
  public void setBasisOffsetTest() {
    // Arrange
    ImmutableFlowAttributes.Json json = new ImmutableFlowAttributes.Json();

    // Act
    json.setBasisOffset(1);

    // Assert
    assertEquals(1, json.basisOffset);
    assertTrue(json.basisOffsetIsSet);
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    ImmutableFlowAttributes.Json json = new ImmutableFlowAttributes.Json();

    // Act
    json.setDescription("description");

    // Assert
    assertEquals("description", json.description);
  }

  @Test
  public void descriptionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowAttributes.Json()).description();
  }

  @Test
  public void transportTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowAttributes.Json()).transport();
  }

  @Test
  public void frequencyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowAttributes.Json()).frequency();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableFlowAttributes.Json actualJson = new ImmutableFlowAttributes.Json();

    // Assert
    assertEquals(0, actualJson.basisOffset);
    assertNull(actualJson.criticality);
    assertNull(actualJson.description);
    assertNull(actualJson.transport);
    assertFalse(actualJson.basisOffsetIsSet);
    assertNull(actualJson.frequency);
  }

  @Test
  public void basisOffsetTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableFlowAttributes.Json()).basisOffset();
  }

  @Test
  public void setCriticalityTest() {
    // Arrange
    ImmutableFlowAttributes.Json json = new ImmutableFlowAttributes.Json();

    // Act
    json.setCriticality(Criticality.LOW);

    // Assert
    assertEquals(Criticality.LOW, json.criticality);
  }

  @Test
  public void setFrequencyTest() {
    // Arrange
    ImmutableFlowAttributes.Json json = new ImmutableFlowAttributes.Json();

    // Act
    json.setFrequency(FrequencyKind.ON_DEMAND);

    // Assert
    assertEquals(FrequencyKind.ON_DEMAND, json.frequency);
  }
}

