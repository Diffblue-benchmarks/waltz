package com.khartec.waltz.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableCodedReferenceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableCodedReference.builder().build();
  }
  @Test
  public void codeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCodedReference.Json()).code();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableCodedReference.Json actualJson = new ImmutableCodedReference.Json();

    // Assert
    assertNull(actualJson.code);
    assertNull(actualJson.name);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableCodedReference.copyOf(new ImmutableCodedReference.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableCodedReference.fromJson(new ImmutableCodedReference.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableCodedReference.Builder builderResult = ImmutableCodedReference.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((NameProvider) new ImmutableCodedReference.Json());
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableCodedReference.Builder builderResult = ImmutableCodedReference.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableCodedReference.Json());
  }
  @Test
  public void fromTest3() {
    // Arrange
    ImmutableCodedReference.Builder builderResult = ImmutableCodedReference.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((CodeProvider) new ImmutableCodedReference.Json());
  }
  @Test
  public void nameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableCodedReference.Json()).name();
  }
  @Test
  public void setCodeTest() {
    // Arrange
    ImmutableCodedReference.Json json = new ImmutableCodedReference.Json();

    // Act
    json.setCode("code");

    // Assert
    assertEquals("code", json.code);
  }
  @Test
  public void setNameTest() {
    // Arrange
    ImmutableCodedReference.Json json = new ImmutableCodedReference.Json();

    // Act
    json.setName("name");

    // Assert
    assertEquals("name", json.name);
  }
}

