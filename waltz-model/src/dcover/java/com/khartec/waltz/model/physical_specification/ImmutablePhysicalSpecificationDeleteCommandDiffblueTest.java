package com.khartec.waltz.model.physical_specification;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutablePhysicalSpecificationDeleteCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecificationDeleteCommand.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutablePhysicalSpecificationDeleteCommand.Json actualJson = new ImmutablePhysicalSpecificationDeleteCommand.Json();

    // Assert
    assertFalse(actualJson.specificationIdIsSet);
    assertEquals(0L, actualJson.specificationId);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutablePhysicalSpecificationDeleteCommand.copyOf(new ImmutablePhysicalSpecificationDeleteCommand.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutablePhysicalSpecificationDeleteCommand.fromJson(new ImmutablePhysicalSpecificationDeleteCommand.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutablePhysicalSpecificationDeleteCommand.Builder builderResult = ImmutablePhysicalSpecificationDeleteCommand
        .builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutablePhysicalSpecificationDeleteCommand.Json());
  }
  @Test
  public void setSpecificationIdTest() {
    // Arrange
    ImmutablePhysicalSpecificationDeleteCommand.Json json = new ImmutablePhysicalSpecificationDeleteCommand.Json();

    // Act
    json.setSpecificationId(123L);

    // Assert
    assertTrue(json.specificationIdIsSet);
    assertEquals(123L, json.specificationId);
  }
  @Test
  public void specificationIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutablePhysicalSpecificationDeleteCommand.Json()).specificationId();
  }
}

