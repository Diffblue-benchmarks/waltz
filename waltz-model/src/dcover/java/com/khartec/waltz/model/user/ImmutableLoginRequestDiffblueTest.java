package com.khartec.waltz.model.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableLoginRequestDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLoginRequest.builder().build();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableLoginRequest.Json actualJson = new ImmutableLoginRequest.Json();

    // Assert
    assertNull(actualJson.password);
    assertNull(actualJson.userName);
  }
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableLoginRequest.copyOf(new ImmutableLoginRequest.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableLoginRequest.fromJson(new ImmutableLoginRequest.Json());
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableLoginRequest.Builder builderResult = ImmutableLoginRequest.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableLoginRequest.Json());
  }
  @Test
  public void passwordTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLoginRequest.Json()).password();
  }
  @Test
  public void setPasswordTest() {
    // Arrange
    ImmutableLoginRequest.Json json = new ImmutableLoginRequest.Json();

    // Act
    json.setPassword("Password123");

    // Assert
    assertEquals("Password123", json.password);
  }
  @Test
  public void setUserNameTest() {
    // Arrange
    ImmutableLoginRequest.Json json = new ImmutableLoginRequest.Json();

    // Act
    json.setUserName("username");

    // Assert
    assertEquals("username", json.userName);
  }
  @Test
  public void userNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableLoginRequest.Json()).userName();
  }
}

