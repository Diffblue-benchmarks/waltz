package com.khartec.waltz.model.client_cache_key;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableClientCacheKeyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableClientCacheKey.fromJson(new ImmutableClientCacheKey.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableClientCacheKey.copyOf(new ImmutableClientCacheKey.Json());
  }
  @Test
  public void keyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableClientCacheKey.Json()).key();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableClientCacheKey.Json()).lastUpdatedAt();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableClientCacheKey.Json actualJson = new ImmutableClientCacheKey.Json();

    // Assert
    assertNull(actualJson.key);
    assertNull(actualJson.lastUpdatedAt);
    assertNull(actualJson.guid);
  }
  @Test
  public void setGuidTest() {
    // Arrange
    ImmutableClientCacheKey.Json json = new ImmutableClientCacheKey.Json();

    // Act
    json.setGuid("12345678");

    // Assert
    assertEquals("12345678", json.guid);
  }
  @Test
  public void setKeyTest() {
    // Arrange
    ImmutableClientCacheKey.Json json = new ImmutableClientCacheKey.Json();

    // Act
    json.setKey("foo");

    // Assert
    assertEquals("foo", json.key);
  }
  @Test
  public void guidTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableClientCacheKey.Json()).guid();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableClientCacheKey.Builder builderResult = ImmutableClientCacheKey.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableClientCacheKey.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableClientCacheKey.builder().build();
  }
}

