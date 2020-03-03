package com.khartec.waltz.model.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ImmutableUserRegistrationRequestDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void copyOfTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    ImmutableUserRegistrationRequest.copyOf(new ImmutableUserRegistrationRequest.Json());
  }
  @Test
  public void fromJsonTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUserRegistrationRequest.fromJson(new ImmutableUserRegistrationRequest.Json());
  }
  @Test
  public void passwordTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUserRegistrationRequest.Json()).password();
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ImmutableUserRegistrationRequest.Json actualJson = new ImmutableUserRegistrationRequest.Json();

    // Assert
    assertNull(actualJson.password);
    assertNull(actualJson.userName);
  }
  @Test
  public void userNameTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new ImmutableUserRegistrationRequest.Json()).userName();
  }
  @Test
  public void setPasswordTest() {
    // Arrange
    ImmutableUserRegistrationRequest.Json json = new ImmutableUserRegistrationRequest.Json();

    // Act
    json.setPassword("Password123");

    // Assert
    assertEquals("Password123", json.password);
  }
  @Test
  public void setUserNameTest() {
    // Arrange
    ImmutableUserRegistrationRequest.Json json = new ImmutableUserRegistrationRequest.Json();

    // Act
    json.setUserName("username");

    // Assert
    assertEquals("username", json.userName);
  }
  @Test
  public void buildTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    ImmutableUserRegistrationRequest.builder().build();
  }
  @Test
  public void fromTest() {
    // Arrange
    ImmutableUserRegistrationRequest.Builder builderResult = ImmutableUserRegistrationRequest.builder();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    builderResult.from(new ImmutableUserRegistrationRequest.Json());
  }
}

