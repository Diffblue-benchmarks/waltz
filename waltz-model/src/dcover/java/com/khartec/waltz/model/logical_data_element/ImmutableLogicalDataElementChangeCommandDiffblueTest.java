package com.khartec.waltz.model.logical_data_element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.khartec.waltz.model.EntityReference;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableLogicalDataElementChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    Optional<EntityReference> optional = (new ImmutableLogicalDataElementChangeCommand.Json()).newLogicalDataElement;
    assertEquals("Optional.empty", optional.toString());
    assertFalse(optional.isPresent());
  }

  @Test
  public void newLogicalDataElementTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLogicalDataElementChangeCommand.Json()).newLogicalDataElement();
  }

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    assertEquals("LogicalDataElementChangeCommand{}",
        ImmutableLogicalDataElementChangeCommand.builder().build().toString());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableLogicalDataElementChangeCommand.Builder builderResult = ImmutableLogicalDataElementChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableLogicalDataElementChangeCommand.Json());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(ImmutableLogicalDataElementChangeCommand.fromJson(new ImmutableLogicalDataElementChangeCommand.Json())
        .equals("LogicalDataElementChangeCommand{"));
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableLogicalDataElementChangeCommand.copyOf(new ImmutableLogicalDataElementChangeCommand.Json());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(177573, ImmutableLogicalDataElementChangeCommand
        .fromJson(new ImmutableLogicalDataElementChangeCommand.Json()).hashCode());
  }

  @Test
  public void newLogicalDataElementTest() {
    // Arrange
    ImmutableLogicalDataElementChangeCommand.Json json = new ImmutableLogicalDataElementChangeCommand.Json();

    // Act and Assert
    assertSame(json.newLogicalDataElement,
        ImmutableLogicalDataElementChangeCommand.fromJson(json).newLogicalDataElement());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("LogicalDataElementChangeCommand{}", ImmutableLogicalDataElementChangeCommand
        .fromJson(new ImmutableLogicalDataElementChangeCommand.Json()).toString());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    assertEquals("LogicalDataElementChangeCommand{}", ImmutableLogicalDataElementChangeCommand
        .fromJson(new ImmutableLogicalDataElementChangeCommand.Json()).toString());
  }
}

