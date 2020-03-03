package com.khartec.waltz.model.accesslog;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableAccessLogDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAccessLog.fromJson(new ImmutableAccessLog.Json());
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableAccessLog.copyOf(new ImmutableAccessLog.Json());
  }
  @Test
  public void userIdTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAccessLog.Json()).userId();
  }
  @Test
  public void setParamsTest() {
    // Arrange
    ImmutableAccessLog.Json json = new ImmutableAccessLog.Json();

    // Act
    json.setParams("foo");

    // Assert
    assertEquals("foo", json.params);
  }
  @Test
  public void setStateTest() {
    // Arrange
    ImmutableAccessLog.Json json = new ImmutableAccessLog.Json();

    // Act
    json.setState("foo");

    // Assert
    assertEquals("foo", json.state);
  }
  @Test
  public void createdAtTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAccessLog.Json()).createdAt();
  }
  @Test
  public void stateTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAccessLog.Json()).state();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableAccessLog.Json actualJson = new ImmutableAccessLog.Json();

    // Assert
    assertNull(actualJson.state);
    assertNull(actualJson.createdAt);
    assertNull(actualJson.params);
    assertNull(actualJson.userId);
  }
  @Test
  public void paramsTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableAccessLog.Json()).params();
  }
  @Test
  public void setUserIdTest() {
    // Arrange
    ImmutableAccessLog.Json json = new ImmutableAccessLog.Json();

    // Act
    json.setUserId("123");

    // Assert
    assertEquals("123", json.userId);
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableAccessLog.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableAccessLog.Builder builderResult = ImmutableAccessLog.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableAccessLog.Json());
  }
}

