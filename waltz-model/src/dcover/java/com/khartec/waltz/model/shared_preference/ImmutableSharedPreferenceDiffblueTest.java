package com.khartec.waltz.model.shared_preference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.khartec.waltz.model.LastUpdatedProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableSharedPreferenceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableSharedPreference.copyOf(new ImmutableSharedPreference.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSharedPreference.fromJson(new ImmutableSharedPreference.Json());
  }
  @Test
  public void valueTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSharedPreference.Json()).value();
  }
  @Test
  public void categoryTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSharedPreference.Json()).category();
  }
  @Test
  public void setLastUpdatedByTest() {
    // Arrange
    ImmutableSharedPreference.Json json = new ImmutableSharedPreference.Json();

    // Act
    json.setLastUpdatedBy("foo");

    // Assert
    assertEquals("foo", json.lastUpdatedBy);
  }
  @Test
  public void keyTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSharedPreference.Json()).key();
  }
  @Test
  public void setCategoryTest() {
    // Arrange
    ImmutableSharedPreference.Json json = new ImmutableSharedPreference.Json();

    // Act
    json.setCategory("foo");

    // Assert
    assertEquals("foo", json.category);
  }
  @Test
  public void lastUpdatedByTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSharedPreference.Json()).lastUpdatedBy();
  }
  @Test
  public void lastUpdatedAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableSharedPreference.Json()).lastUpdatedAt();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableSharedPreference.Json actualJson = new ImmutableSharedPreference.Json();

    // Assert
    assertNull(actualJson.lastUpdatedBy);
    assertNull(actualJson.category);
    assertNull(actualJson.value);
    assertNull(actualJson.key);
    assertNull(actualJson.lastUpdatedAt);
  }
  @Test
  public void setValueTest() {
    // Arrange
    ImmutableSharedPreference.Json json = new ImmutableSharedPreference.Json();

    // Act
    json.setValue("value");

    // Assert
    assertEquals("value", json.value);
  }
  @Test
  public void setKeyTest() {
    // Arrange
    ImmutableSharedPreference.Json json = new ImmutableSharedPreference.Json();

    // Act
    json.setKey("foo");

    // Assert
    assertEquals("foo", json.key);
  }
  @Test
  public void fromTest2() {
    // Arrange
    ImmutableSharedPreference.Builder builderResult = ImmutableSharedPreference.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableSharedPreference.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableSharedPreference.Builder builderResult = ImmutableSharedPreference.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from((LastUpdatedProvider) new ImmutableSharedPreference.Json());
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableSharedPreference.builder().build();
  }
}

