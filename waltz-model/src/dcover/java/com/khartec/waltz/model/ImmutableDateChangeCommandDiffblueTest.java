package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import java.time.LocalDate;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableDateChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    assertEquals("DateChangeCommand{}", ImmutableDateChangeCommand.builder().build().toString());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    Optional<LocalDate> optional = (new ImmutableDateChangeCommand.Json()).newDateVal;
    assertEquals("Optional.empty", optional.toString());
    assertFalse(optional.isPresent());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableDateChangeCommand.copyOf(new ImmutableDateChangeCommand.Json());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(
        ImmutableDateChangeCommand.fromJson(new ImmutableDateChangeCommand.Json()).equals("DateChangeCommand{"));
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    assertEquals("DateChangeCommand{}",
        ImmutableDateChangeCommand.fromJson(new ImmutableDateChangeCommand.Json()).toString());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableDateChangeCommand.Builder builderResult = ImmutableDateChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableDateChangeCommand.Json());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(177573, ImmutableDateChangeCommand.fromJson(new ImmutableDateChangeCommand.Json()).hashCode());
  }

  @Test
  public void newDateValTest() {
    // Arrange
    ImmutableDateChangeCommand.Json json = new ImmutableDateChangeCommand.Json();

    // Act and Assert
    assertSame(json.newDateVal, ImmutableDateChangeCommand.fromJson(json).newDateVal());
  }

  @Test
  public void newDateValTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableDateChangeCommand.Json()).newDateVal();
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("DateChangeCommand{}",
        ImmutableDateChangeCommand.fromJson(new ImmutableDateChangeCommand.Json()).toString());
  }
}

