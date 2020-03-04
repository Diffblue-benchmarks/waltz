package com.khartec.waltz.model.authoritativesource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableNonAuthoritativeSourceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableNonAuthoritativeSource.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableNonAuthoritativeSource.Json actualJson = new ImmutableNonAuthoritativeSource.Json();

    // Assert
    assertNull(actualJson.sourceReference);
    assertEquals(0, actualJson.count);
    assertEquals(0L, actualJson.dataTypeId);
    assertFalse(actualJson.countIsSet);
    assertFalse(actualJson.dataTypeIdIsSet);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableNonAuthoritativeSource.copyOf(new ImmutableNonAuthoritativeSource.Json());
  }

  @Test
  public void countTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableNonAuthoritativeSource.Json()).count();
  }

  @Test
  public void dataTypeIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableNonAuthoritativeSource.Json()).dataTypeId();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableNonAuthoritativeSource.fromJson(new ImmutableNonAuthoritativeSource.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableNonAuthoritativeSource.Builder builderResult = ImmutableNonAuthoritativeSource.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableNonAuthoritativeSource.Json());
  }

  @Test
  public void setCountTest() {
    // Arrange
    ImmutableNonAuthoritativeSource.Json json = new ImmutableNonAuthoritativeSource.Json();

    // Act
    json.setCount(3);

    // Assert
    assertEquals(3, json.count);
    assertTrue(json.countIsSet);
  }

  @Test
  public void setDataTypeIdTest() {
    // Arrange
    ImmutableNonAuthoritativeSource.Json json = new ImmutableNonAuthoritativeSource.Json();

    // Act
    json.setDataTypeId(123L);

    // Assert
    assertEquals(123L, json.dataTypeId);
    assertTrue(json.dataTypeIdIsSet);
  }

  @Test
  public void sourceReferenceTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableNonAuthoritativeSource.Json()).sourceReference();
  }
}

