package com.khartec.waltz.web.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSharedPreferenceKeyAndCategoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSharedPreferenceKeyAndCategory.builder().build();
  }

  @Test
  public void categoryTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSharedPreferenceKeyAndCategory.Json()).category();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSharedPreferenceKeyAndCategory.Json actualJson = new ImmutableSharedPreferenceKeyAndCategory.Json();

    // Assert
    assertNull(actualJson.category);
    assertNull(actualJson.key);
  }

  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSharedPreferenceKeyAndCategory.copyOf(new ImmutableSharedPreferenceKeyAndCategory.Json());
  }

  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSharedPreferenceKeyAndCategory.fromJson(new ImmutableSharedPreferenceKeyAndCategory.Json());
  }

  @Test
  public void fromTest() {
    // Arrange
    ImmutableSharedPreferenceKeyAndCategory.Builder builderResult = ImmutableSharedPreferenceKeyAndCategory.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSharedPreferenceKeyAndCategory.Json());
  }

  @Test
  public void keyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSharedPreferenceKeyAndCategory.Json()).key();
  }

  @Test
  public void setCategoryTest() {
    // Arrange
    ImmutableSharedPreferenceKeyAndCategory.Json json = new ImmutableSharedPreferenceKeyAndCategory.Json();

    // Act
    json.setCategory("category");

    // Assert
    assertEquals("category", json.category);
  }

  @Test
  public void setKeyTest() {
    // Arrange
    ImmutableSharedPreferenceKeyAndCategory.Json json = new ImmutableSharedPreferenceKeyAndCategory.Json();

    // Act
    json.setKey("key");

    // Assert
    assertEquals("key", json.key);
  }
}

