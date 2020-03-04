package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableStringChangeCommandDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    assertEquals("StringChangeCommand{}", ImmutableStringChangeCommand.builder().build().toString());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    Optional<String> optional = (new ImmutableStringChangeCommand.Json()).newStringVal;
    assertEquals("Optional.empty", optional.toString());
    assertFalse(optional.isPresent());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableStringChangeCommand.copyOf(new ImmutableStringChangeCommand.Json());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(
        ImmutableStringChangeCommand.fromJson(new ImmutableStringChangeCommand.Json()).equals("StringChangeCommand{"));
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    assertEquals("StringChangeCommand{}",
        ImmutableStringChangeCommand.fromJson(new ImmutableStringChangeCommand.Json()).toString());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableStringChangeCommand.Builder builderResult = ImmutableStringChangeCommand.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableStringChangeCommand.Json());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(177573, ImmutableStringChangeCommand.fromJson(new ImmutableStringChangeCommand.Json()).hashCode());
  }

  @Test
  public void newStringValTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableStringChangeCommand.Json()).newStringVal();
  }

  @Test
  public void newStringValTest2() {
    // Arrange
    ImmutableStringChangeCommand.Json json = new ImmutableStringChangeCommand.Json();

    // Act and Assert
    assertSame(json.newStringVal, ImmutableStringChangeCommand.fromJson(json).newStringVal());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("StringChangeCommand{}",
        ImmutableStringChangeCommand.fromJson(new ImmutableStringChangeCommand.Json()).toString());
  }

  @Test
  public void withNewStringValTest() {
    // Arrange, Act and Assert
    assertEquals("StringChangeCommand{newStringVal=value}", ImmutableStringChangeCommand
        .fromJson(new ImmutableStringChangeCommand.Json()).withNewStringVal("value").toString());
  }
}

