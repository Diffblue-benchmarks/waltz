package com.khartec.waltz.model.accesslog;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAccessTimeDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAccessTime.builder().build();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAccessTime.Json actualJson = new ImmutableAccessTime.Json();

    // Assert
    assertNull(actualJson.userId);
    assertNull(actualJson.createdAt);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAccessTime.copyOf(new ImmutableAccessTime.Json());
  }

  @Test
  public void createdAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAccessTime.Json()).createdAt();
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAccessTime.fromJson(new ImmutableAccessTime.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableAccessTime.Builder builderResult = ImmutableAccessTime.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAccessTime.Json());
  }

  @Test
  public void setUserIdTest() {
    // Arrange
    ImmutableAccessTime.Json json = new ImmutableAccessTime.Json();

    // Act
    json.setUserId("123");

    // Assert
    assertEquals("123", json.userId);
  }

  @Test
  public void userIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAccessTime.Json()).userId();
  }
}

