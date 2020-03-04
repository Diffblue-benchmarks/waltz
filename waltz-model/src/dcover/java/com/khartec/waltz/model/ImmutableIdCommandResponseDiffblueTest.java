package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableIdCommandResponseDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    assertEquals("IdCommandResponse{}", ImmutableIdCommandResponse.builder().build().toString());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    Optional<Long> optional = (new ImmutableIdCommandResponse.Json()).id;
    assertEquals("Optional.empty", optional.toString());
    assertFalse(optional.isPresent());
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableIdCommandResponse.copyOf(new ImmutableIdCommandResponse.Json());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse(
        ImmutableIdCommandResponse.fromJson(new ImmutableIdCommandResponse.Json()).equals("IdCommandResponse{"));
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    assertEquals("IdCommandResponse{}",
        ImmutableIdCommandResponse.fromJson(new ImmutableIdCommandResponse.Json()).toString());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableIdCommandResponse.Builder builderResult = ImmutableIdCommandResponse.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((IdProvider) new ImmutableIdCommandResponse.Json());
  }

  @Test
  public void fromTest2() {
    // Arrange
    ImmutableIdCommandResponse.Builder builderResult = ImmutableIdCommandResponse.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableIdCommandResponse.Json());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(177573, ImmutableIdCommandResponse.fromJson(new ImmutableIdCommandResponse.Json()).hashCode());
  }

  @Test
  public void idTest() {
    // Arrange
    ImmutableIdCommandResponse.Json json = new ImmutableIdCommandResponse.Json();

    // Act and Assert
    assertSame(json.id, ImmutableIdCommandResponse.fromJson(json).id());
  }

  @Test
  public void idTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableIdCommandResponse.Json()).id();
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("IdCommandResponse{}",
        ImmutableIdCommandResponse.fromJson(new ImmutableIdCommandResponse.Json()).toString());
  }

  @Test
  public void withIdTest() {
    // Arrange, Act and Assert
    assertEquals("IdCommandResponse{id=42}",
        ImmutableIdCommandResponse.fromJson(new ImmutableIdCommandResponse.Json()).withId(42L).toString());
  }
}

