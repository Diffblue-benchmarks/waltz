package com.khartec.waltz.model.data_flow_decorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.FlowDirection;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableDataTypeDirectionKeyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void DatatypeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataTypeDirectionKey.Json()).DatatypeId();
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableDataTypeDirectionKey.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableDataTypeDirectionKey.Json actualJson = new ImmutableDataTypeDirectionKey.Json();

    // Assert
    assertNull(actualJson.flowDirection);
    assertNull(actualJson.DatatypeId);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableDataTypeDirectionKey.copyOf(new ImmutableDataTypeDirectionKey.Json());
  }
  @Test
  public void flowDirectionTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDataTypeDirectionKey.Json()).flowDirection();
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableDataTypeDirectionKey.fromJson(new ImmutableDataTypeDirectionKey.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableDataTypeDirectionKey.Builder builderResult = ImmutableDataTypeDirectionKey.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableDataTypeDirectionKey.Json());
  }
  @Test
  public void setDatatypeIdTest() {
    // Arrange
    ImmutableDataTypeDirectionKey.Json json = new ImmutableDataTypeDirectionKey.Json();

    // Act
    json.setDatatypeId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), json.DatatypeId);
  }
  @Test
  public void setFlowDirectionTest() {
    // Arrange
    ImmutableDataTypeDirectionKey.Json json = new ImmutableDataTypeDirectionKey.Json();

    // Act
    json.setFlowDirection(FlowDirection.INBOUND);

    // Assert
    assertEquals(FlowDirection.INBOUND, json.flowDirection);
  }
}

