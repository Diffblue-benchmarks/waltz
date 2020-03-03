package com.khartec.waltz.model.involvement;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableApplicationInvolvementDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void setInvolvementTest() {
    // Arrange
    ImmutableApplicationInvolvement.Json json = new ImmutableApplicationInvolvement.Json();
    ImmutableInvolvement.Json json1 = new ImmutableInvolvement.Json();

    // Act
    json.setInvolvement(json1);

    // Assert
    assertSame(json1, json.involvement);
  }
  @Test
  public void applicationTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplicationInvolvement.Json()).application();
  }
  @Test
  public void involvementTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableApplicationInvolvement.Json()).involvement();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableApplicationInvolvement.Json actualJson = new ImmutableApplicationInvolvement.Json();

    // Assert
    assertNull(actualJson.involvement);
    assertNull(actualJson.application);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableApplicationInvolvement.copyOf(new ImmutableApplicationInvolvement.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableApplicationInvolvement.fromJson(new ImmutableApplicationInvolvement.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableApplicationInvolvement.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableApplicationInvolvement.Builder builderResult = ImmutableApplicationInvolvement.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableApplicationInvolvement.Json());
  }
}

