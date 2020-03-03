package com.khartec.waltz.model.logical_flow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableLogicalFlowMeasuresDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLogicalFlowMeasures.builder().build();
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableLogicalFlowMeasures.Builder builderResult = ImmutableLogicalFlowMeasures.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableLogicalFlowMeasures.Json());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableLogicalFlowMeasures.copyOf(new ImmutableLogicalFlowMeasures.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLogicalFlowMeasures.fromJson(new ImmutableLogicalFlowMeasures.Json());
  }

  @Test
  public void setInboundTest() {
    // Arrange
    ImmutableLogicalFlowMeasures.Json json = new ImmutableLogicalFlowMeasures.Json();

    // Act
    json.setInbound(10.0);

    // Assert
    assertTrue(json.inboundIsSet);
    assertEquals(10.0, json.inbound, 0.0);
  }

  @Test
  public void setIntraTest() {
    // Arrange
    ImmutableLogicalFlowMeasures.Json json = new ImmutableLogicalFlowMeasures.Json();

    // Act
    json.setIntra(10.0);

    // Assert
    assertEquals(10.0, json.intra, 0.0);
    assertTrue(json.intraIsSet);
  }

  @Test
  public void inboundTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowMeasures.Json()).inbound();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableLogicalFlowMeasures.Json actualJson = new ImmutableLogicalFlowMeasures.Json();

    // Assert
    assertFalse(actualJson.inboundIsSet);
    assertEquals(0.0, actualJson.intra, 0.0);
    assertEquals(0.0, actualJson.inbound, 0.0);
    assertEquals(0.0, actualJson.outbound, 0.0);
    assertFalse(actualJson.outboundIsSet);
    assertFalse(actualJson.intraIsSet);
  }

  @Test
  public void intraTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowMeasures.Json()).intra();
  }

  @Test
  public void outboundTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalFlowMeasures.Json()).outbound();
  }

  @Test
  public void setOutboundTest() {
    // Arrange
    ImmutableLogicalFlowMeasures.Json json = new ImmutableLogicalFlowMeasures.Json();

    // Act
    json.setOutbound(10.0);

    // Assert
    assertEquals(10.0, json.outbound, 0.0);
    assertTrue(json.outboundIsSet);
  }
}

